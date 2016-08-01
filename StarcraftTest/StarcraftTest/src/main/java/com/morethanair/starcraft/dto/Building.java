package com.morethanair.starcraft.dto;

public class Building extends StarcraftObject {

	public Building(String name, double maxHp, double hp, double buildTime, Location location) {
		super(name, maxHp, hp, buildTime, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Building [toString()=").append(super.toString()).append("]");
		return builder.toString();
	}

}
