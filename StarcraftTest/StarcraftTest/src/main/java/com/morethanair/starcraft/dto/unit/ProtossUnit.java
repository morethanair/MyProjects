package com.morethanair.starcraft.dto.unit;

import com.morethanair.starcraft.dto.Location;

public class ProtossUnit extends Unit {
	private double shield;
	private double recoveryTime;

	public ProtossUnit(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange,
			double shield, double recoveryTime) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		this.shield = shield;
		this.recoveryTime = recoveryTime;
	}

	public double getShield() {
		return shield;
	}

	public void setShield(double shield) {
		this.shield = shield;
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
		builder.append("ProtossUnit [shield=").append(shield).append(", recoveryTime=").append(recoveryTime)
				.append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}

}
