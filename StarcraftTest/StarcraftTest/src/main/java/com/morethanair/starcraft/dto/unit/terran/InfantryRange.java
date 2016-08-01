package com.morethanair.starcraft.dto.unit.terran;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.unit.TerranUnit;

public class InfantryRange extends TerranUnit {
	private static final double sightIncrease = 10;
	TerranUnit terranUnit;

	public InfantryRange(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		// TODO Auto-generated constructor stub
	}

	public InfantryRange(TerranUnit terranUnit) {
		super(terranUnit);
		this.terranUnit = terranUnit;

		this.terranUnit.setSightRange(this.terranUnit.getSightRange() + sightIncrease);
	}
}
