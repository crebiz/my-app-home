package com.community.crebiz.home.polls.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChoiceRequest {
	@NotBlank
	@Size(max = 40)
	private String text;
}
