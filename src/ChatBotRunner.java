import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class ChatBotRunner
{
	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	public static void main(String[] args)
	{
		TriviaBot1 chatbot1 = new TriviaBot1();
		TeachBot2 chatbot2 = new TeachBot2();
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the Sports Chatbot. Please type in the name of the chatbot you would like to access.");
		String statement = in.nextLine();
		if(statement.toLowerCase().equals("triviabot"))
		{
            while (!statement.equals("Bye")) {
                chatbot1.chatLoop(statement);
                statement = in.nextLine();
            }
        }
        else if(statement.toLowerCase().equals("teachbot"))
        {
            while (!statement.equals("Bye")) {
                chatbot1.chatLoop(statement);
                statement = in.nextLine();
            }
        }
	}

}
