import java.util.Scanner;

import javax.security.auth.login.LoginException;

import listeners.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Bot {

	public static JDA jda;
	
	private static final String BOT_TOKEN = "Mjg0NDYzNTc4Njc5ODY5NDQw.C5EDig.E1UP7BdKupcnIakkhqjDoJyAvQc";
	
public static void main(String[] args) {
		
	JDABuilder builder = new JDABuilder(AccountType.BOT);
	
//---------------------- Listeners ----------------------
	
	builder.setToken(BOT_TOKEN);
	builder.addListener(new ReadyListener());
	builder.addListener(new MessageListener());
	builder.addListener(new ReconnectListener());
	builder.addListener(new DisconnectListener());
	builder.addListener(new ResumeListener());
	
	try {
		jda = builder.buildBlocking();
	} catch (LoginException e) {
		e.printStackTrace();
		
	} catch (IllegalArgumentException e) {
		e.printStackTrace();
		
	} catch (InterruptedException e) {
		e.printStackTrace();
		
	} catch (RateLimitedException e) {
		e.printStackTrace();
		
	}//close try/catch
		
	
	Scanner cmnd = new Scanner(System.in);
	
	System.out.println("Enter 0 to quit");
	
	if(cmnd.nextInt() == 0){
		System.out.println("Shutting Down");
		jda.getTextChannelById("254027186644713472").sendMessage("I think it's time for a cat nap\nSee you later Everyone!").queue();
		jda.shutdown();
		//System.exit(0);
	}
	
//	Runtime.getRuntime().addShutdownHook(new Thread()
//	{
//	    @Override
//	    public void run()
//	    {
//	    	System.out.println("Shutting down");
//	    }
//	});
		
	}//close main

}
