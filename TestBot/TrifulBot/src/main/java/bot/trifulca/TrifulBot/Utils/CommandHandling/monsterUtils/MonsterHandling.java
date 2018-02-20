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
		int aux = 0;
		String[] existingCommands = {"monster", "weak", "elements", "ailments", "specie", "weaksign", "resources"};
		for (String string : existingCommands) {
			if(mhPetition.getPetition().equals(string)){
				response = buildMonsterResponse(mhPetition);
				aux = 1;
			}
		}
		
		if(aux==1){
			return response;
		}else{
			return "Not valid command or unimplemented feature";
		}
	}
	
	public String buildMonsterResponse(MHCommand command){
		
		List<Monster> list = Controller.getList();
		int aux = 0;
		String response = "";
		switch(command.getPetition()){
			case "monster":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.toString();
						aux = 1;
					}
				}
				break;
			case "weak":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.getName() + System.lineSeparator() + "Debilidades:" + monster.printWeakness();
						aux = 1;
					}
				}
				break;
			case "elements":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.getName() + System.lineSeparator() + "Elementos:" + monster.printElements();
						aux = 1;
					}
				}
				break;
			case "ailments":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.getName() + System.lineSeparator() + "Estados:" + monster.printAilments();
						aux = 1;
					}
				}
				break;
			case "specie":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.getName() + System.lineSeparator() + "Especie:" + monster.getSpecie();
						aux = 1;
					}
				}
				break;
			case "weaksign":
				for (Monster monster : list) {
					if(command.getArgument().equals(monster.getName())){
						response = monster.getName() + System.lineSeparator() + "Especie:" + monster.getSpecie();
						aux = 1;
					}
				}
				break;
			case "resources":
				for (Map map : Controller.game.getMaps()) {
					if(command.getArgument().equals(map.getName())){
						response = map.printMapResources();
						aux = 1;
					}
				}
				break;
			default:
				response = "Something went wrong";
				aux = 1;
				break;
		}
		
		if(aux==1){
			return response;
		}else{
			return "The monster does not exist";
		}
	}
	
	public static void printMonsters() {
		System.out.println(System.getProperty("user.dir"));
	}

}
