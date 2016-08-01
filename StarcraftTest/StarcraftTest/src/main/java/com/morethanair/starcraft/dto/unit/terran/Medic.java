package com.morethanair.starcraft.dto.unit.terran;

import org.springframework.core.convert.ConversionException;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.StarcraftObject;
import com.morethanair.starcraft.dto.characteristic.Recoverable;
import com.morethanair.starcraft.dto.characteristic.Repairable;
import com.morethanair.starcraft.dto.unit.TerranUnit;
import com.morethanair.starcraft.dto.unit.Unit;

public class Medic extends TerranUnit implements Repairable {
	private static final double hpRecover = 10;

	public Medic(String name, double maxHp, double hp, double buildTime, Location location, double attackPoint,
			double defensePoint, double velocity, double attackVelocity, double attackRange, double sightRange) {
		super(name, maxHp, hp, buildTime, location, attackPoint, defensePoint, velocity, attackVelocity, attackRange,
				sightRange);
		// TODO Auto-generated constructor stub
	}

	public Medic(Unit unit) {
		super(unit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void repair(StarcraftObject starcraftObject) {
		// TODO Auto-generated method stub
		TerranUnit terranUnit = null;
		try {
			terranUnit = (TerranUnit) starcraftObject;
		} catch (ConversionException ce) {
			System.out.println("Cannot be converted");
		}
		if (terranUnit instanceof Recoverable) {
			terranUnit.setHp(terranUnit.getHp() + hpRecover);
		} else {
			System.out.println("Only heal bio units");
		}
	}

}
