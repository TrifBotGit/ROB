package bot.trifulca.TrifulBot.Utils;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class MyEvents {
	
	@EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event){
        if(event.getMessage().getContent().startsWith(BotUtils.BOT_PREFIX)&&!event.getAuthor().isBot())
            BotUtils.sendMessage(event.getChannel(), "I am sending a message from an EventSubscriber listener");
    }

}
