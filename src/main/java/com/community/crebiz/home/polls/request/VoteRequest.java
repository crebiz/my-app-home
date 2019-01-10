package com.community.crebiz.home.polls.request;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class VoteRequest {
	@NotNull
	private Long choiceId;
}
