package bot.trifulca.TrifulBot.Utils.CommandHandling;

public class CommandHandler {
	
	public static String handleCommand(String message) {
		
		Command command = Command.buildCommand(message);
		return "hey";
		
	}

}
