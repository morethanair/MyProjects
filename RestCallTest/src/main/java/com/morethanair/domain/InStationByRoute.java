package com.morethanair.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InStationByRoute {
	private ComMsgHeader comMsgHeader;
	private MsgHeader msgHeader;
	private String busRouteId;
}
