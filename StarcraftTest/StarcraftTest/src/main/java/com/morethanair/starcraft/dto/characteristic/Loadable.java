package com.morethanair.starcraft.dto.characteristic;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.unit.Unit;

public interface Loadable {
	public void load(Unit unit);

	public void unload(Location location);

	public void unload(int position);
}
