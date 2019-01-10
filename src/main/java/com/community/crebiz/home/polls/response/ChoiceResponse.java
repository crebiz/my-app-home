package com.community.crebiz.home.polls.response;

import lombok.Data;

@Data
public class ChoiceResponse {
	private long id;
	private String text;
	private long voteCount;
}
