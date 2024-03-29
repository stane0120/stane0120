package com.kh.test.user.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

	private int userNo;
	private String userId;
	private String userName;
	private String userAge;
}
