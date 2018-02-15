package bot.trifulca.TrifulBot.Utils.CommandHandling;

public class CommandHandler {
	
	public static String handleCommand(String message) {
		
		Command command = Command.buildCommand(message);
		String response = "";
		
		switch (command.getCommandType()) {
		case "!HS":
			
			break;

		default:
			response = "Not a valid command";
			break;
		}
		
		return response;
		
	}

}
