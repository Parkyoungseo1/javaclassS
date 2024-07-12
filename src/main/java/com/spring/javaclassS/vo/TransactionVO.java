package com.spring.javaclassS.vo;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("deprecation")
//@Data
@Setter
@Getter
@ToString
public class TransactionVO {
	private int idx;
	
	@NotEmpty
	//@Size(min=1, max=4)
	private String mid;
	
	private String name;
	private int age;
	private String address;
	
	// user2테이블에서의 필드 추가
	private String job;
}
