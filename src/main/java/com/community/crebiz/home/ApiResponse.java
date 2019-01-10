package com.community.crebiz.home;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
	private Boolean success;
	private String message;
}
