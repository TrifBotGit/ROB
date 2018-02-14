package bot.discord;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.RequestBuffer;

public class BotUtils {
	
	static String TOKEN = "NDEzMjg5NjAxNTQxNjAzMzMw.DWXuJw.qIWJpH5nB-41ikMM6wsUeNPAoUA";
	static String BOT_PREFIX = "!";
	
	static IDiscordClient getBuiltDiscordClient(String token){
		
		 return new ClientBuilder()
	                .withToken(token)
	                .build();
		
	}
	
	static void sendMessage(IChannel channel, String message){

        // This might look weird but it'll be explained in another page.
        RequestBuffer.request(() -> {
            try{
                channel.sendMessage(message);
            } catch (DiscordException e){
                System.err.println("Message could not be sent with error: ");
                e.printStackTrace();
            }
        });
	}

}
