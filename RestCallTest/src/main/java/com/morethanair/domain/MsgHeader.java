package com.morethanair.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MsgHeader {
	private String headerMsg;
	private String headerCd;
	private int itemCount;
}
