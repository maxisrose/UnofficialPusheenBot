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

			e.getChannel().sendMessage("Looks like you need help "+e.getAuthor().getAsMention()+"!\nI am Pusheen the Meme Machine\nYou can tell me what to do, my commands are: ```"
					+ "+hello  --A friendly greeting\n"
					+ "+goodnight  --Someone cares <3\n"
					+ "+morning  --Good Morning\n"
					+ "+bacon  --Summons forth Bacon Pancakes!\n"
					+ "+one  --How to be a villian\n"
					+ "+bad  --UNACCEPTABLE\n"
					+ "+star  --You might see a shooting star\n"
					+ "+men  --It's raining\n"
					+ "+hats  --They are worn\n"
					+ "+alive  --Still Alive\n"
					+ "+radio  --Do doot do doo doo\n"
					+ "+sad  --Aww\n"
					+ "\n----Post Pusheen Pictures----\n"
					+ "-sad\n"
					+ "-ded\n"
					+ "-like\n"
					+ "-tear\n"
					+ "-bored\n"
					+ "-dance"
					+ "```Check back for new commands\nIf you want me to do something special tell Ross to teach me").queue();
		}//close help
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("<@284463578679869440>")){
			
			System.out.println("Message Recieved");

			e.getChannel().sendMessage("You call upon Pusheen the Meme Machine, "+e.getAuthor().getAsMention()+"?\nI will tell you my commands if you send```+help or +cmnds```").queue();
		}//close help
		
		/*Used for testing sent messages*/
		else if (e.getMessage().getRawContent().equalsIgnoreCase("+test")){
			//e.getChannel().sendMessage("this is a one time test, @here").queue();
		}//close test

//------------------------------ Conversation ------------------------------
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+hello") || e.getMessage().getRawContent().equalsIgnoreCase("hello") || search.wordExists("hello everyone") || search.wordExists("hello all") || e.getMessage().getRawContent().equalsIgnoreCase("hello?")){
			/*
			Random rand = new Random();
			String[] his = new String[]{
					"http://scontent.cdninstagram.com/t51.2885-15/s480x480/e15/11055544_1408635222778336_2119058558_n.jpg?ig_cache_key=OTQxMDI0NTcwNjY4NTYyMTE3.2",
					""
			};
			int hi = rand.nextInt(his.length);
			*/
			
			e.getChannel().sendMessage("Hello "+ e.getAuthor().getAsMention()+"\nhttp://scontent.cdninstagram.com/t51.2885-15/s480x480/e15/11055544_1408635222778336_2119058558_n.jpg?ig_cache_key=OTQxMDI0NTcwNjY4NTYyMTE3.2").queue();
			
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
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+sad")){
			e.getChannel().sendMessage("Awwww, don't be sad, "+e.getAuthor().getAsMention()+"\nI love you :3").queue();
			System.out.println("Message Recieved");
		}//close sad
		
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
					"https://www.youtube.com/watch?v=feA64wXhbjo",
					"https://www.youtube.com/watch?v=d7qLCbA3wCA"
			};
			int vid = rand.nextInt(vids.length);
			
			e.getChannel().sendMessage("I'm in love with a shooting star...\n"+vids[vid]).queue();
			
			System.out.println("Message Recieved");
			
		}//close star
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+men")){
			e.getChannel().sendMessage("It's raining\nhttps://www.youtube.com/watch?v=NmJNSlN_OB4").queue();
			System.out.println("Message Recieved");
		}//close men
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+hats")){
			
			Random rand = new Random();
			String[] vids = new String[]{
					"https://www.youtube.com/watch?v=kZUPCB9533Y",
					"https://www.youtube.com/watch?v=ZpjyH-LkEAg",
					"https://www.youtube.com/watch?v=49j6_uk0g3k",
					"https://www.youtube.com/watch?v=SJixW2u4IvQ",
					"https://www.youtube.com/watch?v=71iZieJWmmk",
					"https://www.youtube.com/watch?v=kVzaBq4ycWg",
					"https://www.youtube.com/watch?v=4s9-sJwNz2c",
					"https://www.youtube.com/watch?v=kHDghTE7Llo",
					"https://www.youtube.com/watch?v=RYqBDTsHZsQ",
					"https://www.youtube.com/watch?v=cyv-gSJvWpU",
					"https://www.youtube.com/watch?v=C_-zC2qcx4M",
					"https://www.youtube.com/watch?v=QXI0u3qyFqA",
					"https://www.youtube.com/watch?v=jJOwdrTA8Gw"
			};
			int vid = rand.nextInt(vids.length);
			
			e.getChannel().sendMessage("Look! Llamas!\n"+vids[vid]).queue();
			
			System.out.println("Message Recieved");
			
		}//close hats
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+alive")){
			e.getChannel().sendMessage("He lives on... ;_; ...in our hearts\nhttps://www.youtube.com/watch?v=HauOgTszzz4").queue();
			System.out.println("Message Recieved");
		}//close alive
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+morning") || e.getMessage().getRawContent().equalsIgnoreCase("Good morning")){
			e.getChannel().sendMessage("Good Morning!\nhttps://www.youtube.com/watch?v=Xzsc785E27g").queue();
			System.out.println("Message Recieved");
		}//close morning
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("+radio")){
			e.getChannel().sendMessage("https://www.youtube.com/watch?v=qF1xinXOHXE").queue();
			System.out.println("Message Recieved");
		}
		
//------------------------------ Pusheen Pictures ------------------------------

		else if(e.getMessage().getRawContent().equalsIgnoreCase("-sad")){
			e.getChannel().sendMessage("https://kittybloger.files.wordpress.com/2012/01/2_sadness.gif").queue();
			System.out.println("Message Recieved");
		}//close sad
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("-ded")){
			e.getChannel().sendMessage("https://s-media-cache-ak0.pinimg.com/564x/41/28/ea/4128ea37c8a7a51c475e7a3dd0516be1.jpg").queue();
			System.out.println("Message Recieved");
		}//close ded
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("-like")){
			e.getChannel().sendMessage("https://s-media-cache-ak0.pinimg.com/236x/4c/7b/a7/4c7ba71c9f716854340abe5fb6caf53a.jpg").queue();
			System.out.println("Message Recieved");
		}//close like
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("-tear")){
			e.getChannel().sendMessage("https://scontent-amt2-1.cdninstagram.com/t51.2885-15/e35/13722008_580737315447857_210459553_n.jpg").queue();
			System.out.println("Message Recieved");
		}//close tear
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("-bored") || e.getMessage().getRawContent().equalsIgnoreCase("bored")){
			e.getChannel().sendMessage("https://lh5.googleusercontent.com/-Va0MFXnt5g4/UxzwIuRScuI/AAAAAAAAAKg/V9BH3q8dSXI/w960-h640/Pusheen%2Bcat%2Bupside%2Bdown.jpg").queue();
			System.out.println("Message Recieved");
		}//close bored
		
		else if(e.getMessage().getRawContent().equalsIgnoreCase("-dance")){
			e.getChannel().sendMessage("https://lh3.googleusercontent.com/-uNaExAzj2Xs/Vp9foiVBfKI/AAAAAAAAAPU/bKVays_KK3I/w350-h300-n/635690649303963453-11018521_pusheen%2Bdoing%2Bthe%2Bwave.gif").queue();
			//https://www.google.com/search?q=dont+be+sad+pusheen&rlz=1C1AVFC_enUS731US731&espv=2&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiO7oCQ_83SAhUFyGMKHSBUD-sQ_AUIBigB&biw=1440&bih=794#tbs=itp:animated&tbm=isch&q=pusheen+waves&*&imgrc=aLM0xnKo0VL-jM:
			System.out.println("Message Recieved");			
		}//close dance
		
	}//close onMessageRecieved
	
}//close class
