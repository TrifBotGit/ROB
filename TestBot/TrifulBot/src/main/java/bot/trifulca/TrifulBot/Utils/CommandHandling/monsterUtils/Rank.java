package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

public class Rank {
	
	public String name;
	
	public List<Map> maps;
	
	public Rank(String name, List<Map> maps){
		this.name = name;
		this.maps = maps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map> getMaps() {
		return maps;
	}

	public void setMaps(List<Map> maps) {
		this.maps = maps;
	}
	
	

}
