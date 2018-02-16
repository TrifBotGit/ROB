package bot.trifulca.TrifulBot.Utils.CommandHandling;

import bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils.MonsterHandling;

public class CommandHandler {
	
	public static String handleCommand(String message) {
		
		Command command = Command.buildCommand(message);
		String response = "";
		
		switch (command.getCommandType()) {
		case "!MH":
			MonsterHandling mhHandler = new MonsterHandling();
			response = mhHandler.commandHandler(command);
			break;

		default:
			response = "Not a valid command";
			break;
		}
		
		return response;
		
	}

}
