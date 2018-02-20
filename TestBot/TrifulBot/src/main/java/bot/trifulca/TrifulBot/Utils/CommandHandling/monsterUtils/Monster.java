package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils.resources.IconsConst;

public class Monster {

	@SerializedName("Name")
	@Expose
	private String name;
	@SerializedName("Specie")
	@Expose
	private String specie;
	@SerializedName("Element")
	@Expose
	private List<String> element = null;
	@SerializedName("Ailments")
	@Expose
	private List<String> ailments = null;
	@SerializedName("Weakness")
	@Expose
	private List<String> weakness = null;
	@SerializedName("Weakness Sign")
	@Expose
	private String weaknessSign;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getSpecie() {
	return specie;
	}

	public void setSpecie(String specie) {
	this.specie = specie;
	}

	public List<String> getElement() {
	return element;
	}

	public void setElement(List<String> element) {
	this.element = element;
	}

	public List<String> getAilments() {
	return ailments;
	}

	public void setAilments(List<String> ailments) {
	this.ailments = ailments;
	}

	public List<String> getWeakness() {
	return weakness;
	}

	public void setWeakness(List<String> weakness) {
	this.weakness = weakness;
	}

	public String getWeaknessSign() {
	return weaknessSign;
	}

	public void setWeaknessSign(String weaknessSign) {
	this.weaknessSign = weaknessSign;
	}
	
	public String printElements() {
		String result = "";
		for (String string : element) {
			result += " " + IconsConst.returnIcon(string);
		}
		return result;
	}
	
	public String printAilments() {
		String result = "";
		for (String string : ailments) {
			result += " " + IconsConst.returnIcon(string);
		}
		return result;
	}
	
	public String printWeakness() {
		String result = "";
		for (String string : weakness) {
			result += " " + IconsConst.returnIcon(string);
		}
		return result;
	}
	
	public String toString(){
		String response = getName() + System.lineSeparator() + 
						  getSpecie() + System.lineSeparator() + 
						  "Elementos:" + printElements() + System.lineSeparator() +
						  "Estados alterados:" + printAilments() + System.lineSeparator() +
						  "Debilidades:" + printWeakness() + System.lineSeparator() +
						  "Signo de debilidad: " + getWeaknessSign();
		return response;
							
	}
	
}
