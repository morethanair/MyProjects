package com.morethanair.starcraft.dto.unit;

import com.morethanair.starcraft.dto.Location;

public class ZergUnit extends Unit {
	private double recoveryTime;

	public ZergUnit(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange,
			double recoveryTime) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		this.recoveryTime = recoveryTime;
	}

	public double getRecoveryTime() {
		return recoveryTime;
	}

	public void setRecoveryTime(double recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ZergUnit [recoveryTime=").append(recoveryTime).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}

}
