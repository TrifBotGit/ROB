package bot.trifulca.TrifulBot.Utils;

import bot.trifulca.TrifulBot.Utils.CommandHandling.CommandHandler;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class MyEvents {
	
	@EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event){
        if(event.getMessage().getContent().startsWith(BotUtils.BOT_PREFIX)&&!event.getAuthor().isBot()){
        	if(event.getMessage().getContent().startsWith("!game")){
        		gameCommandReceived(event);
        	}else{
        		musicCommandReceived(event);
        	}
        } 	
    }
	
	public void gameCommandReceived(MessageReceivedEvent event){
		String response = CommandHandler.handleCommand(event.getMessage().getContent());
		BotUtils.sendMessage(event.getChannel(), response);
	}
	
	public void musicCommandReceived(MessageReceivedEvent event){
		
	}

}
