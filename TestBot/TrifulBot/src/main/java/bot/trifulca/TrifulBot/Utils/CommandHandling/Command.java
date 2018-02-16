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
		this.commandType = commandSplitted[0];
		this.commandArgs = Arrays.copyOfRange(commandSplitted, 1, commandSplitted.length);
	}
	
	public String getCommandType(){
		return commandType;
	}
	
	public String[] getCommandArgs(){
		return commandArgs;
	}
	
	public static Command buildCommand(String message) {
		return new Command(message);
	}

}
