package listeners;


import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Random;

import helperFuntions.Search;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent e){
		Search search = new Search(e.getMessage().getRawContent());
		//System.out.println(e.getMessage().getRawContent().equalsIgnoreCase("286604459822284800"));
		//System.out.println(e.getAuthor().toString().equalsIgnoreCase("U:Pusheen(284463578679869440)"));
		/* Quick escape to check if pusheen sent the message*/
		if(e.getAuthor().toString().equalsIgnoreCase("U:Pusheen(284463578679869440)")){
			//System.out.println("I sent this message");
			return;
		}//close self message check
		
//------------------------------ Utility ------------------------------
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+help") || e.getMessage().getRawContent().equalsIgnoreCase("+cmnds")){
			
			System.out.println("Message Recieved");

			e.getChannel().sendMessage("Looks like you need help "+e.getAuthor().getAsMention()+"!\nYou can tell me what to do, my commands are: ```"
					+ "+hello  --A friendly greeting\n"
					+ "+goodnight  --Someone cares <3\n"
					+ "+bacon  --Summons forth Bacon Pancakes!\n"
					+ "+one  --How to be a villian\n"
					+ "+bad  --UNACCEPTABLE\n"
					+ "+star  --You might see a shooting star"
					+ "```Check back for new commands\nIf you want me to do something special tell Ross to teach me").queue();
		}//close help
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("<@284463578679869440>")){
			
			System.out.println("Message Recieved");

			e.getChannel().sendMessage("Is there something you need "+e.getAuthor().getAsMention()+"?\nI will tell you my commands if you send```+help or +cmnds```").queue();
		}//close help
		
		/*Used for testing sent messages*/
		else if (e.getMessage().getRawContent().equalsIgnoreCase("+test")){
			//e.getChannel().sendMessage("this is a one time test, @here").queue();
		}//close test

//------------------------------ Conversation ------------------------------
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+hello") || e.getMessage().getRawContent().equalsIgnoreCase("hello") || search.wordExists("hello everyone") || search.wordExists("hello all")){
			
			e.getChannel().sendMessage("Hello "+ e.getAuthor().getAsMention()).queue();
			
			System.out.println("Message Recieved");
			
		}//close hello
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+speak")){
			
			MessageBuilder message = new MessageBuilder();
			Message msg = message.append("Do I look like a dog to you! :pouting_cat:").setTTS(true).build();
			
			
			e.getChannel().sendMessage(msg).queue();
		}//close speak
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+work") || search.wordExists("at work")){
			e.getChannel().sendMessage("Get back to work "+e.getMember().getAsMention()+"!").queue();
		}//close work
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+you are a robot") || e.getMessage().getRawContent().equalsIgnoreCase("+you are a bot") || e.getMessage().getRawContent().equalsIgnoreCase("+you're a robot") || e.getMessage().getRawContent().equalsIgnoreCase("+you're a bot") || e.getMessage().getRawContent().equalsIgnoreCase("+youre a robot") || e.getMessage().getRawContent().equalsIgnoreCase("+youre a bot") || e.getMessage().getRawContent().equalsIgnoreCase("+your a robot") || e.getMessage().getRawContent().equalsIgnoreCase("+your a bot")){
			
			e.getChannel().sendMessage("You wanna piece of me! "+ e.getAuthor().getAsMention()).queue();
			
			System.out.println("Message Recieved");	
		}//close you bot
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+goodnight") || search.wordExists("goodnight")){
			
			e.getChannel().sendMessage("Goodnight "+ e.getAuthor().getAsMention()+", sleep well :3").queue();
			
			System.out.println("Message Recieved");
			
		}//close Goodnight
		
//------------------------------ Video Links ------------------------------
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+bacon")){
			
			e.getChannel().sendMessage("I'm makin bacon pancakes\nhttps://www.youtube.com/watch?v=cUYSGojUuAU").queue();
			
			System.out.println("Message Recieved");
			
		}//close bacon
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+one")){
			
			e.getChannel().sendMessage("We are number one!\nhttps://www.youtube.com/watch?v=bfLIhiNWtsI").queue();
			
			System.out.println("Message Recieved");
			
		}//close bacon
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+unacceptable") || e.getMessage().getRawContent().equalsIgnoreCase("+bad") || e.getMessage().getRawContent().equalsIgnoreCase(":angry:")){
			
			e.getChannel().sendMessage("UNACCEPTABLE!!!\n\nhttps://www.youtube.com/watch?v=07So_lJQyqw").queue();
			
			System.out.println("Message Recieved");
			
		}//close unacceptable
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+star")){
			
			Random rand = new Random();
			String[] vids = new String[]{
					"https://www.youtube.com/watch?v=cbKmm_xAEro",
					"https://www.youtube.com/watch?v=dsPF8SPAy7E",
					"https://www.youtube.com/watch?v=uIAbVQodLuQ",
					"https://www.youtube.com/watch?v=GoKlsCoFekI",
					"https://www.youtube.com/watch?v=_XWomD6TazQ",
					"https://www.youtube.com/watch?v=3EuzHaKysKk",
					"https://www.youtube.com/watch?v=ntnarC4ii1s",
					"https://www.youtube.com/watch?v=OmYWGemNl8o",
					"https://www.youtube.com/watch?v=LV9oib2leLU",
					"https://www.youtube.com/watch?v=t3fRCmsnm3k",
					"https://www.youtube.com/watch?v=eBgaMSEY_0Y",
					"https://www.youtube.com/watch?v=jsDToLObtpE",
					"https://www.youtube.com/watch?v=XgsbsERieBk",
					"https://www.youtube.com/watch?v=2YfzXzy229Q",
					"https://www.youtube.com/watch?v=aVWBvDE97Gs",
					"https://www.youtube.com/watch?v=mnOZ_KdwVCI",
					"https://www.youtube.com/watch?v=AfloY-2Ysdc",
					"https://www.youtube.com/watch?v=GQbgEL-_1Lk",
					"https://www.youtube.com/watch?v=SEni9Lb7Vh0",
					"They be killin Krillin\nhttps://www.youtube.com/watch?v=8Ov9puNLiTw",
					"https://www.youtube.com/watch?v=7dwLCHNdqWw",
					"https://www.youtube.com/watch?v=feA64wXhbjo"
			};
			int vid = rand.nextInt(vids.length);
			
			e.getChannel().sendMessage("I'm in love with a shooting star...\n"+vids[vid]).queue();
			
			System.out.println("Message Recieved");
			
		}//close star
		
	}//close onMessageRecieved
	
}//close class
