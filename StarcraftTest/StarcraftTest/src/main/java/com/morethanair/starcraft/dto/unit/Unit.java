package com.morethanair.starcraft.dto.unit;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.StarcraftObject;
import com.morethanair.starcraft.dto.characteristic.Movable;

public class Unit extends StarcraftObject implements Movable {
	private double attackPoint;
	private double defensePoint;
	private double velocity;
	private double attackVelocity;
	private double attackRange;
	private double sightRange;
	
	public Unit(String name, double maxHp,double hp, double buildTime, Location location, double attackPoint, double defensePoint,
			double velocity, double attackVelocity, double attackRange, double sightRange) {
		super(name, maxHp, hp, buildTime, location);
		this.attackPoint = attackPoint;
		this.defensePoint = defensePoint;
		this.velocity = velocity;
		this.attackVelocity = attackVelocity;
		this.attackRange = attackRange;
		this.sightRange = sightRange;
	}

	public Unit(Unit unit) {
		super(unit.getName(),unit.getMaxHp(),unit.getHp(),unit.getBuildTime(),unit.getLocation());
		this.attackPoint = unit.getAttackPoint();
		this.defensePoint = unit.getDefensePoint();
		this.velocity = unit.getVelocity();
		this.attackVelocity = unit.getAttackVelocity();
		this.attackRange = unit.getAttackRange();
		this.sightRange = unit.getSightRange();
	}
	
	public double getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(double attackPoint) {
		this.attackPoint = attackPoint;
	}

	public double getDefensePoint() {
		return defensePoint;
	}

	public void setDefensePoint(double defensePoint) {
		this.defensePoint = defensePoint;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getAttackVelocity() {
		return attackVelocity;
	}

	public void setAttackVelocity(double attackVelocity) {
		this.attackVelocity = attackVelocity;
	}

	public double getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(double attackRange) {
		this.attackRange = attackRange;
	}

	public double getSightRange() {
		return sightRange;
	}

	public void setSightRange(double sightRange) {
		this.sightRange = sightRange;
	}

	@Override
	public void move(Location location) {
		super.getLocation().setX(location.getX());
		super.getLocation().setY(location.getY());
		return;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Unit [attackPoint=").append(attackPoint).append(", defensePoint=").append(defensePoint)
				.append(", velocity=").append(velocity).append(", attackVelocity=").append(attackVelocity)
				.append(", attackRange=").append(attackRange).append(", sightRange=").append(sightRange).append("]");
		return builder.toString();
	}

	
	
}
