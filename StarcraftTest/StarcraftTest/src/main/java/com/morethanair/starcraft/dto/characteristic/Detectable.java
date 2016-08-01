package com.morethanair.starcraft.dto.characteristic;

import com.morethanair.starcraft.dto.Location;

public interface Detectable {
	public void detect();

	public void detect(Location location);
}
