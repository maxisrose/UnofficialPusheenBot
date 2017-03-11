package listeners;

import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {

	@Override
	public void onReady(ReadyEvent e) {
		super.onReady(e);
		//System.out.println(e.getJDA().getSelfUser().getName());
		//System.out.println(e.getJDA().getTextChannels());
		System.out.println("I am online");
		//e.getChannel().sendMessage("Hello "+ e.getAuthor().getAsMention()).queue();
		//e.getJDA().getTextChannelById("254027186644713472").sendMessage("*yawn* that was a good cat nap, I'm back ;3").queue();
		//System.out.println(e.getJDA().getUsers());

		System.out.println();
	}
	
}