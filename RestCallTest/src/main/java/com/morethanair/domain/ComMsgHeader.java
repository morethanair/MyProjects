package com.morethanair.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ComMsgHeader {
	private String errMsg;
	private String requestMsgID;
	private String successYN;
	private String returnCode;
	private String responseTime;
	private String responseMsgID;
	
	private String serviceKey;
	private String requestTime;
	private String callBackURI;
}
