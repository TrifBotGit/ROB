package bot.trifulca.TrifulBot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import bot.trifulca.TrifulBot.Utils.BotUtils;
import bot.trifulca.TrifulBot.Utils.MyEvents;
import bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils.Monster;
import sx.blah.discord.api.IDiscordClient;

public class Controller 
{
	
	public static List<Monster> monsterList;
	
    public static void main( String[] args ) throws JsonSyntaxException, JsonIOException, FileNotFoundException
    {
    	if(args.length != 1){
            System.out.println("Please enter the bots token as the first argument e.g java -jar thisjar.jar tokenhere");
            return;
        }

        IDiscordClient cli = BotUtils.getBuiltDiscordClient(args[0]);

        /*
        // Commented out as you don't really want duplicate listeners unless you're intentionally writing your code 
        // like that.
        // Register a listener via the IListener interface
        cli.getDispatcher().registerListener(new IListener<MessageReceivedEvent>() {
            public void handle(MessageReceivedEvent event) {
                if(event.getMessage().getContent().startsWith(BotUtils.BOT_PREFIX + "test"))
                    BotUtils.sendMessage(event.getChannel(), "I am sending a message from an IListener listener");
            }
        });
        */

        // Register a listener via the EventSubscriber annotation which allows for organisation and delegation of events
        cli.getDispatcher().registerListener(new MyEvents());

        // Only login after all events are registered otherwise some may be missed.
        cli.login();
        
        loadMonsterList();

     
    }
    
    public static void loadMonsterList() throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		
    	monsterList = null;
		Gson gson = new Gson();
		Monster[] monsters = gson.fromJson(new FileReader("monsters3u.json"), Monster[].class);
		monsterList = Arrays.asList(monsters);
		
		
	}
    
    public static List<Monster> getList(){
    	return monsterList;
    }
}
