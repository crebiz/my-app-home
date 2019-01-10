package com.community.crebiz.model.polls;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="choices")
public class Choice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 40)
	private String text;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "poll_id", nullable = false)
	@Getter @Setter private Poll poll;

	public Choice() {}

	public Choice(String text){
		this.text = text;
	}
		
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Choice choice = (Choice) o;
		return Objects.equals(id, choice.id) &&
				Objects.equals(text, choice.text) &&
				Objects.equals(poll, choice.poll);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, text, poll);
	}
}
