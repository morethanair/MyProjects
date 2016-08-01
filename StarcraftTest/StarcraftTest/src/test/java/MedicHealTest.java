import org.junit.Assert;
import org.junit.Test;

import com.morethanair.starcraft.dto.Location;
import com.morethanair.starcraft.dto.unit.terran.Marine;
import com.morethanair.starcraft.dto.unit.terran.Medic;


public class MedicHealTest {
	
	@Test
	public void test() {
		Medic medic = new Medic("medic",100,100,10,new Location(0,0),0,10,10,0,0,10);
		Marine marine=new Marine("marine",100,80,10,new Location(0,0),10,10,10,10,10,10);
		
		System.out.println("Marine HP"+marine.getHp());
		System.out.println("****************************");
		System.out.println("Medic healing...");
		System.out.println("****************************");
		medic.repair(marine);
		System.out.println("Marine HP"+marine.getHp());
		Assert.assertEquals(90, marine.getHp(),0);
	}

}
