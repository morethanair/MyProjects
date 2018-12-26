package com.morethanair.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OutStationByRoute {
	ComMsgHeader comMsgHeader;
	MsgHeader msgHeader;
	MsgBody msgBody;
}
