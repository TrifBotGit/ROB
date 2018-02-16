package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class MonsterHandling {
	
	public static List<Monster> monsterList = null;
	
	public String commandHandler(Command command){
		
		String petition = command.getCommandArgs()[0];
		String[] arguments = Arrays.copyOfRange(command.getCommandArgs(), 1, command.getCommandArgs().length);
		MHCommand mhPetition = new MHCommand(petition, arguments);
		String response = "";
		switch(mhPetition.getPetition()){
			case "monster":
				response = buildMonsterResponse(mhPetition);
				break;
			default:
				response = "Not a valid command or unimplemented feature";
		}
		return response;
		
	}
	
	public String buildMonsterResponse(MHCommand command){
		
		for (Monster monster : monsterList) {
			if(command.getArgument().equals(monster.getName())){
				return monster.toString();
			}
		}
		
		return "The monster does not exist";
		
	}
	
	public static List<Monster> loadMonsterList() throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		
		Gson gson = new Gson();
		Monster[] monsters = gson.fromJson(new FileReader("monsters3u.json"), Monster[].class);
		List<Monster> monsterList = Arrays.asList(monsters);
		return monsterList;
		
	}

}
