package bot.trifulca.TrifulBot.Utils.CommandHandling.heartstonecommands;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HSCard {

	@SerializedName("card_class")
	@Expose
	private Object cardClass;
	@SerializedName("cost")
	@Expose
	private Integer cost;
	@SerializedName("set")
	@Expose
	private String set;
	@SerializedName("race")
	@Expose
	private String race;
	@SerializedName("artist")
	@Expose
	private String artist;
	@SerializedName("durability")
	@Expose
	private Object durability;
	@SerializedName("health")
	@Expose
	private Integer health;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("card_type")
	@Expose
	private String cardType;
	@SerializedName("flavour_text")
	@Expose
	private String flavourText;
	@SerializedName("attack")
	@Expose
	private Integer attack;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("rarity")
	@Expose
	private String rarity;

	public Object getCardClass() {
	return cardClass;
	}

	public void setCardClass(Object cardClass) {
	this.cardClass = cardClass;
	}

	public Integer getCost() {
	return cost;
	}

	public void setCost(Integer cost) {
	this.cost = cost;
	}

	public String getSet() {
	return set;
	}

	public void setSet(String set) {
	this.set = set;
	}

	public String getRace() {
	return race;
	}

	public void setRace(String race) {
	this.race = race;
	}

	public String getArtist() {
	return artist;
	}

	public void setArtist(String artist) {
	this.artist = artist;
	}

	public Object getDurability() {
	return durability;
	}

	public void setDurability(Object durability) {
	this.durability = durability;
	}

	public Integer getHealth() {
	return health;
	}

	public void setHealth(Integer health) {
	this.health = health;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getCardType() {
	return cardType;
	}

	public void setCardType(String cardType) {
	this.cardType = cardType;
	}

	public String getFlavourText() {
	return flavourText;
	}

	public void setFlavourText(String flavourText) {
	this.flavourText = flavourText;
	}

	public Integer getAttack() {
	return attack;
	}

	public void setAttack(Integer attack) {
	this.attack = attack;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getRarity() {
	return rarity;
	}

	public void setRarity(String rarity) {
	this.rarity = rarity;
	}

	@Override
	public String toString() {
		
		return "Name: " + getName() + " (" + getRace() + ")" + System.lineSeparator() +
				"Cost: " + getCost() + " - Attack: " + getAttack() + " - Health: " + getHealth() + System.lineSeparator() +
				"Description: " + getDescription().replace("<b>", "").replace("</b>", "");
	}
	
}
