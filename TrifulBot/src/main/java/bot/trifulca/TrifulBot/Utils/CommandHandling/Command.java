package bot.trifulca.TrifulBot.Utils.CommandHandling;

import java.util.Arrays;

public class Command {
	
	private String commandType;
	private String[] commandArgs;
	
	private Command() {
		commandType = null;
		commandArgs = null;
	}
	
	private Command(String commandText) {
		String[] commandSplitted = commandText.split(" ");
		commandType = commandSplitted[0];
		commandArgs = Arrays.copyOfRange(commandSplitted, 1, commandSplitted.length);
	}
	
	public Command buildCommand(String message) {
		return new Command(message);
	}

}
