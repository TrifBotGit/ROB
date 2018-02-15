package bot.trifulca.TrifulBot.Utils.CommandHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
	
	private String commandType;
	private List<String> commandArgs;
	
	private Command() {
		commandType = null;
		commandArgs = null;
	}
	
	private Command(String commandText) {
		String[] commandSplitted = commandText.split(" ");
		commandType = commandSplitted[0];
		String [] preArgs = Arrays.copyOfRange(commandSplitted, 1, commandSplitted.length);
		commandArgs = Arrays.asList(preArgs);
	}
	
	public String getCommandType(){
		return commandType;
	}
	
	public List<String> getCommandArgs(){
		return commandArgs;
	}
	
	public static Command buildCommand(String message) {
		return new Command(message);
	}

}
