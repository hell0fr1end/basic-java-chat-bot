//importing packages
import java.util.Scanner;
import java.util.Random;

public class Bot
{
   public static void main(String[] args)
   {
      //variables
      String botName = ("Dr. Bot");
      Scanner input = new Scanner(System.in);
      String command;
      boolean looper = true;
      int diceroll;
      Random rand = new Random();
      int randLow;
      int randHigh;
      int randomNumber;
      String ballQuestion;
      int ballAnswer;
      String prefix = "/"; // a one character symbol preferably but you could do something like a combo e.g. "j:command" defaults to a forwardslash
      
      //welcome message
      System.out.println("Hello! I am "+botName);
      System.out.println("To see a list of commands, type /help");
      System.out.println("Otherwise, enjoy!");
      System.out.println("");
      
      //loops prompt until bot is closed
      do{
         System.out.print("Enter a command: ");
         command = input.next();
        
         //stop command
         if(command.equals("/stop"))
         {
            looper = false;
         }
        
         //help command
         if(command.equals("/help"))
         {
            System.out.println("All commands for "+botName);
            System.out.println("");
            System.out.println("/help: displays this message");
            System.out.println("/diceroll: generates a random number from 1-6");
            System.out.println("/randomnumber: generates a random number between two given numbers");
            System.out.println("/stop: stops the bot");
            System.out.println("/8ball: starts the 8 ball feature");
            
            //spacing
            System.out.println("");
            System.out.println("End of help message");
            System.out.println("");
         }
        
         //diceroll command
         if(command.equals("/diceroll"))
         {
           diceroll = (int)rand.nextInt(6)+1;
           System.out.println(diceroll);
           System.out.println("");
         }
         //randomnumber command
         if(command.equals("/randomnumber"))
         {
            System.out.print("Enter first number: ");
            randLow = input.nextInt();
            System.out.println("");
            System.out.print("Enter second number: ");
            randHigh = input.nextInt();
            System.out.println("");
            randomNumber = rand.nextInt(randHigh) + randLow;
            System.out.println("Your number is " +randomNumber);
            System.out.println("");
         }
         
         //8ball command
         if(command.equals("/8ball"))
         {
            System.out.print("Ask me a question: ");
            ballQuestion = input.next();
            ballAnswer = rand.nextInt(20)+1;
            System.out.println("");
            
            switch(ballAnswer)
            {
               case 1: System.out.println("It is certain");
                       break;
               case 2: System.out.println("It is decidedly so");
                       break;
               case 3: System.out.println("Without a doubt");
                       break;
               case 4: System.out.println("Yes - definitely");
                       break;
               case 5: System.out.println("You may rely on it");
                       break;
               case 6: System.out.println("As I see it, yes");
                       break;
               case 7: System.out.println("Most likely");
                       break;
               case 8: System.out.println("Outlook good");
                       break;
               case 9: System.out.println("Yes");
                       break;
               case 10: System.out.println("Signs point to yes");
                       break;
               case 11: System.out.println("Reply hazy, try again");
                       break;
               case 12: System.out.println("Ask again later");
                       break;
               case 13: System.out.println("Better not tell you now");
                       break;
               case 14: System.out.println("Cannot predict now");
                       break;
               case 15: System.out.println("Concentrate and ask again");
                       break;
               case 16: System.out.println("Dont coumt on it");
                       break;
               case 17: System.out.println("My reply is no");
                       break;
               case 18: System.out.println("My sources say");
                       break;
               case 19: System.out.println("Outlook not so good");
                       break;
               case 20: System.out.println("Very doubtful");
                       break;
               default: System.out.println("Error");
               }
               
            System.out.println("");
         }
         
         
       }while(looper == true);
       System.out.println("Thank you for using "+botName+"!");   
   
   }

}