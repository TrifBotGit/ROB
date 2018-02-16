package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.Arrays;

import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class MonsterHandling {
	
	public String commandHandler(Command command){
		
		String petition = command.getCommandArgs()[0];
		String[] arguments = Arrays.copyOfRange(command.getCommandArgs(), 1, command.getCommandArgs().length);
		MHCommand mhPetition = new MHCommand(petition, arguments);
		switch(mhPetition.getPetition()){
			case "monster":
				
				break;
			default:
				return "Not a valid command or unimplemented feature";
		}
		return null;
		
	}

}
