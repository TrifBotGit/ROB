package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {
	
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("maps")
	@Expose
	private List<Map> maps = null;
	
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
