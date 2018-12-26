package com.morethanair.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Detail {
	private String busRouteId;
	private String busRouteNm;
	private String seq;
	private String section;
	private String station;
	private String arsId;
	private String stationNm;
	private String gpsX;
	private String gpsY;
	private String posX;
	private String posY;
	private String fullSectDist;
	private String direction;
	private String stationNo;
	private String routeType;
	private String beginTm;
	private String lastTm;
	private String trnstnid;
	private String sectSpd;
	private String transYn;
	private String detourAt;
}
