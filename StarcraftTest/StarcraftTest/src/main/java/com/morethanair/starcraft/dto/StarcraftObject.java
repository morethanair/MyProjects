package com.morethanair.starcraft.dto;

public abstract class StarcraftObject {
	private String name;
	private double maxHp;
	private double hp;
	private double buildTime;
	private Location location;

	public StarcraftObject(String name, double maxHp,double hp, double buildTime, Location location) {
		super();
		this.name = name;
		this.maxHp = maxHp;
		this.hp = hp;
		this.buildTime = buildTime;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(double buildTime) {
		this.buildTime = buildTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StarcraftObject [name=").append(name).append(", maxHp=").append(maxHp).append(", hp=")
				.append(hp).append(", buildTime=").append(buildTime).append(", location=").append(location).append("]");
		return builder.toString();
	}

	
}
