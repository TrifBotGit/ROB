package bot.trifulca.TrifulBot.Utils.CommandHandling.heartstonecommands;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HSCard {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("cost")
	@Expose
	private Integer cost;
	@SerializedName("attack")
	@Expose
	private Integer attack;
	@SerializedName("health")
	@Expose
	private Integer health;
	@SerializedName("durability")
	@Expose
	private Object durability;
	@SerializedName("race")
	@Expose
	private String race;
	@SerializedName("card_class")
	@Expose
	private Object cardClass;
	@SerializedName("card_type")
	@Expose
	private String cardType;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("set")
	@Expose
	private String set;
	@SerializedName("rarity")
	@Expose
	private String rarity;
	@SerializedName("artist")
	@Expose
	private String artist;
	@SerializedName("flavour_text")
	@Expose
	private String flavourText;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Integer getCost() {
	return cost;
	}

	public void setCost(Integer cost) {
	this.cost = cost;
	}

	public Integer getAttack() {
	return attack;
	}

	public void setAttack(Integer attack) {
	this.attack = attack;
	}

	public Integer getHealth() {
	return health;
	}

	public void setHealth(Integer health) {
	this.health = health;
	}

	public Object getDurability() {
	return durability;
	}

	public void setDurability(Object durability) {
	this.durability = durability;
	}

	public String getRace() {
	return race;
	}

	public void setRace(String race) {
	this.race = race;
	}

	public Object getCardClass() {
	return cardClass;
	}

	public void setCardClass(Object cardClass) {
	this.cardClass = cardClass;
	}

	public String getCardType() {
	return cardType;
	}

	public void setCardType(String cardType) {
	this.cardType = cardType;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getSet() {
	return set;
	}

	public void setSet(String set) {
	this.set = set;
	}

	public String getRarity() {
	return rarity;
	}

	public void setRarity(String rarity) {
	this.rarity = rarity;
	}

	public String getArtist() {
	return artist;
	}

	public void setArtist(String artist) {
	this.artist = artist;
	}

	public String getFlavourText() {
	return flavourText;
	}

	public void setFlavourText(String flavourText) {
	this.flavourText = flavourText;
	}
	
	@Override
	public String toString() {
	return new ToStringBuilder(this).append("name", name).append("cost", cost).append("attack", attack).append("health", health).append("durability", durability).append("race", race).append("cardClass", cardClass).append("cardType", cardType).append("description", description).append("set", set).append("rarity", rarity).append("artist", artist).append("flavourText", flavourText).toString();
	}
	
}
