package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils.resources.IconsConst;

public class Map {
	
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("zones")
	@Expose
	private List<Zone> zones = null;

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
	
	public String printMapResources(){
		
		String response = getName() + System.lineSeparator();
		String resourcesPrinted = "";
		for (Zone zone : zones) {
			resourcesPrinted += zone.getName() + ": ";
			for (Resource res : zone.getResources()) {
				resourcesPrinted += IconsConst.returnIcon(res.getName()) + " x " + res.getQuantity() + " ";
			}
			resourcesPrinted += System.lineSeparator();
		}
		response += resourcesPrinted;
		return response;
		
	}
	
}
