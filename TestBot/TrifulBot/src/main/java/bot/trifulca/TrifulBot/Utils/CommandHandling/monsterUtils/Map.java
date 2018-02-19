package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

public class Map {
	
	public String name;
	
	public List<Zone> zones;
	
	public Map(String name, List<Zone> zones){
		this.name = name;
		this.zones = zones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
}
