package com.morethanair.starcraft.dto.unit;

import com.morethanair.starcraft.dto.Location;

public class TerranUnit extends Unit {

	public TerranUnit(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		// TODO Auto-generated constructor stub
	}

	public TerranUnit(Unit unit) {
		super(unit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TerranUnit [toString()=").append(super.toString()).append("]");
		return builder.toString();
	}

}
