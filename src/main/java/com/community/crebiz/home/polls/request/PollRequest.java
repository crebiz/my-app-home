package com.community.crebiz.home.polls.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PollRequest {
	@NotBlank
	@Size(max = 140)
	private String question;
	
	@NotNull
	@Size(min = 2, max = 12)
	@Valid
	private List<ChoiceRequest> choices;
	
	@NotNull
	@Valid
	private PollLength pollLength;
	
	public PollRequest() {}
}
