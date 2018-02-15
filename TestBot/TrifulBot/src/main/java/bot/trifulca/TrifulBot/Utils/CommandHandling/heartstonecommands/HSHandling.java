package bot.trifulca.TrifulBot.Utils.CommandHandling.heartstonecommands;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class HSHandling {

	public String handleCommand(Command command) throws UnirestException{
		
		if(command.getCommandArgs().get(0).equals("card")){
			HSCard card = buildCard(command);
			String response = createResponse(card);
			return response;
		}else{
			return "Arguments are incorrect (Try !HS card <CardName>)";
		}
		
	}
	
	public String createResponse(HSCard card){
		
		String response = "";
		
		if(card.getName().equals("Not a valid card")){
			response = "This card does not exist";
		}else{
			switch (card.getCardType()) {
			case "Minion":
				response = "Name: " + card.getName() + " (" + card.getRace() + ")" + System.lineSeparator() +
				"Cost: " + card.getCost() + " - Attack: " + card.getAttack() + " - Health: " + card.getHealth() + System.lineSeparator() +
				"Description: " + card.getDescription().replace("<b>", "").replace("</b>", "");
				break;
			
			case "Spell":
				response = "Name: " + card.getName() + System.lineSeparator() +
						"Cost: " + card.getCost() + System.lineSeparator() +
						"Description: " + card.getDescription().replace("<b>", "").replace("</b>", "");
				break;
			default:
				break;
			}
		}
		
		return response;
	}
	
	public HSCard buildCard(Command command) throws UnirestException{
		
		HttpResponse<JsonNode> response = Unirest.get(HSAPIData.URL+command.getCommandArgs().get(1))
    			.header("X-Mashape-Key", HSAPIData.APIKEY)
    			.header("Accept", "application/json")
    			.asJson();
		
		HSCard card = null;
		
		JSONObject cardJson = response.getBody().getObject();
		if(validateCard(cardJson)){
			Gson gson = new Gson();
	    	card = gson.fromJson(cardJson.toString(), HSCard.class);
	    	return card;
		}else{
			card = new HSCard();
			card.setName("Not a valid card");
			return card;
		}
		
	}
	
	public boolean validateCard(JSONObject result){
		
		String[] names = JSONObject.getNames(result);
		if (names[0].equals("error")) {
			return false;
		}else{
			return true;
		}
		
	}
	
}
