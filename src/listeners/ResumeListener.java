package listeners;

import net.dv8tion.jda.core.events.ResumedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ResumeListener extends ListenerAdapter {

	public void onResume(ResumedEvent e){
		e.getJDA().getTextChannelById("254027186644713472").sendMessage("I'm Back! >:)").queue();
		System.out.println("I have Resumed the session");
	}
}
