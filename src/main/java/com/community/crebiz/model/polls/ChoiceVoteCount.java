package com.community.crebiz.model.polls;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChoiceVoteCount {
	private Long choiceId;
	private Long voteCount;
}
