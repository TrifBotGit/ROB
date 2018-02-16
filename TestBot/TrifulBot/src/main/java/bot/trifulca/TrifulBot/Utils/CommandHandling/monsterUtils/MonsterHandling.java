package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.Arrays;
import java.util.List;

import bot.trifulca.TrifulBot.Controller;
import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class MonsterHandling {
	
	//public static List<Monster> monsterList = null;
	
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
				return "Not a valid command or unimplemented feature";
		}
		return response;
		
	}
	
	public String buildMonsterResponse(MHCommand command){
		
		List<Monster> list = Controller.getList();
		for (Monster monster : list) {
			if(command.getArgument().equals(monster.getName())){
				return monster.toString();
			}
		}
		
		return "The monster does not exist";
		
	}
	
	public static void printMonsters() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	/*public static List<Monster> loadMonsterList() throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		
		Gson gson = new Gson();
		Monster[] monsters = gson.fromJson(new FileReader("monsters3u.json"), Monster[].class);
		List<Monster> monsterList = Arrays.asList(monsters);
		return monsterList;
		
	}*/

}
