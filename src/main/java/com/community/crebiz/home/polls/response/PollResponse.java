package com.community.crebiz.home.polls.response;

import java.time.Instant;
import java.util.List;

import com.community.crebiz.home.users.UserSummary;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class PollResponse {
	private Long id;
	private String question;
	private List<ChoiceResponse> choices;
	private UserSummary createdBy;
	private Instant creationDateTime;
	private Instant expirationDateTime;
	private Boolean isExpired;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long selectedChoice;
	private Long totalVotes;
}
