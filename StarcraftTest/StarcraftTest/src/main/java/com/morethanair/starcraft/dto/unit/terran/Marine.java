package com.morethanair.starcraft.dto.unit.terran;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.StarcraftObject;
import com.morethanair.starcraft.dto.characteristic.Attackable;
import com.morethanair.starcraft.dto.characteristic.Movable;
import com.morethanair.starcraft.dto.characteristic.Recoverable;
import com.morethanair.starcraft.dto.unit.TerranUnit;
import com.morethanair.starcraft.dto.unit.Unit;

public class Marine extends TerranUnit implements Attackable, Movable, Recoverable {

	public Marine(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		// TODO Auto-generated constructor stub
	}

	public Marine(Unit unit) {
		super(unit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(StarcraftObject starcraftObject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recover() {
		// TODO Auto-generated method stub
		
	}

}
