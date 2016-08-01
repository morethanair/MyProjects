package com.morethanair.starcraft.dto.unit.terran;

import com.morethanair.starcraft.dto.unit.TerranUnit;

public class SteamPack extends TerranUnit {
	private TerranUnit terranUnit;

	public SteamPack(TerranUnit terranUnit) {
		super(terranUnit);
		this.terranUnit = terranUnit;
	}

	public void useSteamPack() {

		terranUnit.setAttackVelocity(terranUnit.getAttackVelocity() + 50);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SteamPack [terranUnit=").append(terranUnit).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}

}
