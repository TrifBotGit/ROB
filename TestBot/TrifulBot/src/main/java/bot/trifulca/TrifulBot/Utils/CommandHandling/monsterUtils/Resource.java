package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

public class Resource {
	
	public String type;
	
	public int quantity;
	
	public Resource(String type, int quantity){
		this.type = type;
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
