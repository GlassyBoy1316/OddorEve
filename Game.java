import java.util.*;
public class Game {
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);
        int playvar = 0;
        int compvar = 0;
        int playscore = 0;
        int compscore = 0;
        int playballs = 0;
        int compballs = 0;
        int maxballs;
        int beatballs;
        int toss;
        int itsan;
        int choose;
        String oddoreven;
        String itsanactual;
	Random random = new Random();
	Set<Integer> numberSet = new HashSet<>();
	numberSet.add(0);
	numberSet.add(1);
	numberSet.add(2);
	numberSet.add(3);
	numberSet.add(4);
	numberSet.add(5);
	numberSet.add(6);
	numberSet.add(7);
	numberSet.add(8);
	numberSet.add(9);
	numberSet.add(10);
	numberSet.add(20);
	List<Integer> numberList = new ArrayList<>(numberSet);
        System.out.print("Enter no. of overs:\n");
        maxballs = 6*(input.nextInt());
        System.out.print("Choose odd or even:\n");
        oddoreven = input.next();
        System.out.print("You chose "+oddoreven+"\n");
        System.out.print("Enter a number (for toss):\n");
        playvar = input.nextInt();
        compvar = numberList.get(random.nextInt(numberList.size()));
        toss = playvar+compvar;
        if(toss%2==0)
        {
            itsan = 2;
            System.out.println("its an eve");
            itsanactual = "even";
        }
        else
        {
            itsan = 1;
            System.out.println("Its an odd");
            itsanactual = "odd";
        }
        if( oddoreven.equals(itsanactual) )
        {
            System.out.println("You won the toss. \n1 to bat and 2 to bowl \n");
            choose = input.nextInt();
            if (choose == 1)
            {
                System.out.println("you chose to bat");
            }
            if (choose == 2)
            {
                System.out.println("you chose to bowl");
            }
        }
        else
        {
            System.out.println("You lost the toss.");
            choose = 1 + (int)(Math.random() * 2);
            if (choose == 1)
            {
                System.out.println("Computer chose to bowl");
            }
            if (choose == 2)
            {
                System.out.println("Computer chose to bat");
            }
        }
        playballs = 0;
        compballs = 0;
        if (choose == 1)
        {
         do {
            System.out.print("Enter a number:\n");
            playvar = input.nextInt();

            if (!numberSet.contains(playvar)) 
            {
                System.out.println("Sorry, invalid input. Please try again.");
                System.exit(0);
            }
            else
            {
                compvar = numberList.get(random.nextInt(numberList.size()));
                if (playvar==compvar)
                {
                    playballs++;
                    break;
                }
                playscore = playscore + playvar;
                playballs++;
                System.out.println("score: " +playscore);
                System.out.println("balls: " +playballs);
            }
        } while (playballs<maxballs);
        System.out.println("Your score is: " +playscore+ " in " +(playballs/6)+ "."+(playballs%6)+" overs.");
        System.out.println("COMPUTER INNINGS");
        do {
            System.out.print("Enter a number:\n");
            playvar = input.nextInt();
            
            if (!numberSet.contains(playvar)) 
            {
                System.out.println("Sorry, invalid input. Please try again.");
                System.exit(0);
            }
            else
            {
                compvar = numberList.get(random.nextInt(numberList.size()));
                if(playvar==compvar)
                {
                    if (compscore<playscore)
                    {
                    System.out.println("you won");
                    System.exit(0);
                    }
                    else
                    {
                        if (compscore==playscore)
                        {
                            System.out.println ("It's a draw");
                            System.exit(0);
                        }
                        System.out.println("computer won");
                        System.exit(0);
                    }
                }
                compscore = compscore + compvar;
                compballs++;
                System.out.println("score: " +compscore);
                System.out.println("balls: " +compballs);
            }
        } while ( compballs<maxballs && compscore<playscore);
    }
    if (choose ==2)
        {
         do {
            System.out.print("Enter a number:\n");
            playvar = input.nextInt();

            if (!numberSet.contains(playvar)) 
            {
                System.out.println("Sorry, invalid input. Please try again.");
                System.exit(0);
            }
            else
            {
                compvar = numberList.get(random.nextInt(numberList.size()));
                if (playvar==compvar)
                {
                    playballs++;
                    break;
                }
                compscore = compscore + compvar;
                compballs++;
                System.out.println("score: " +compscore);
                System.out.println("balls: " +compballs);
            }
        } while (compballs<maxballs);
        System.out.println("Computer score is: " +compscore+ " in " +(compballs/6)+ "."+(compballs%6)+ " overs.");
        System.out.println("YOUR INNINGS");
        playballs=0;
        do {
            System.out.print("Enter a number:\n");
            playvar = input.nextInt();
            
            if (!numberSet.contains(playvar)) 
            {
                System.out.println("Sorry, invalid input. Please try again.");
                System.exit(0);
            }
            else
            {
                compvar = numberList.get(random.nextInt(numberList.size()));
                if(playvar==compvar)
                {
                    if (compscore<playscore)
                    {
                    System.out.println("you won");
                    System.exit(0);
                    }
                    else
                    {
                        if (compscore==playscore)
                        {
                            System.out.println ("It's a draw");
                            System.exit(0);
                        }
                        System.out.println("computer won");
                        System.exit(0);
                    }
                }
                playscore = playscore + playvar;
                playballs++;
                System.out.println("score: " +playscore);
                System.out.println("balls: " +playballs);
            }
        } while ( playballs<maxballs && playscore<compscore);
    }
        if (compscore>playscore)
        {
            beatballs = playballs-compballs;
            System.out.println("computer won ");
        }
        else
        {
            System.out.println("you won");
        }
    }
}