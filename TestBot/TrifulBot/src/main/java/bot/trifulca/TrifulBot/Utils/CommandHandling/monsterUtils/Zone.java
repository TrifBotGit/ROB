package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

public class Zone {
	
	public String name;
	
	public List<Resource> resources;
	
	public Zone(String name, List<Resource> resources){
		this.name = name;
		this.resources = resources;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
