package listeners;

import net.dv8tion.jda.core.events.ReconnectedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReconnectListener extends ListenerAdapter {

	@Override
	public void onReconnect(ReconnectedEvent e){
		//e.getJDA().getTextChannelById("254027186644713472").sendMessage("I'm Back! >:)").queue();
		System.out.println("I have reconnected to the server");
	}
}
