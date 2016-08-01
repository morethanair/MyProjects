package com.morethanair.starcraft.dto.characteristic;

import com.morethanair.starcraft.dto.StarcraftObject;

public interface Attackable {
	public void attack();

	public void attack(StarcraftObject starcraftObject);
}
