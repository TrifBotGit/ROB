package bot.trifulca.TrifulBot.Utils.CommandHandling.lolcommands;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import bot.trifulca.TrifulBot.Utils.CommandHandling.Command;

public class LeagueHandling {
	
	private final String GGAPITOKEN = "f4acd1426c67115e9ec9cf73615bdaa9";
	public List<LolChampion> championList;
	
	public String handleLolCommand(Command command) throws IOException{
		printChampion("1");
		return null;
	}
	
	public void printChampion(String champ) throws IOException{
		URL url = new URL("api.champion.gg/v2/champions/1?elo=SILVER&limit=200&champData=kda,damage,averageGames,totalHeal,killingSpree,minions,gold,positions,normalized,groupedWins,trinkets,runes,firstitems,summoners,skills,finalitems,masteries,maxMins,matchups&api_key="+GGAPITOKEN);
		InputStreamReader reader = new InputStreamReader(url.openStream());
		System.out.println(reader.toString());
	}
	
	public static List<LolChampion> loadChampions(){
		return null;
	}

}
