package listeners;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.dv8tion.jda.core.events.DisconnectEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class DisconnectListener extends ListenerAdapter {

	@Override
	public void onDisconnect(DisconnectEvent e){
		Date now = new Date();
		SimpleDateFormat hms = new SimpleDateFormat("hh:mm:ss");
		System.out.println("I have disconnected at "+hms.format(now));
		e.getJDA().getTextChannelById("254027186644713472").sendMessage("I seem to have connection issues!").queue();
	}
}
