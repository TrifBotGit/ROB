package bot.trifulca.TrifulBot.Utils.CommandHandling.lolcommands;

import java.io.InputStreamReader;
import java.util.List;

import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class LeagueHandling {
	
	private final String GGAPITOKEN = "f4acd1426c67115e9ec9cf73615bdaa9";
	public List<LolChampion> championList;
	
	public String handleLolCommand(Command command){
		printChampion(command.getCommandArgs().get(1));
		return null;
	}
	
	public void printChampion(String champ){
		
	}
	
	public static List<LolChampion> loadChampions(){
		return null;
	}

}
