import java.util.*;
public class inside
{
    public static int player(int target, boolean chase)
    {
        int playvar,compvar,score = 0;
        Scanner input = new Scanner(System.in);
        Random rmd = new Random();
        if (chase = true){
            do{
                playvar = input.nextInt();
                compvar = rmd.nextInt(11);
                if (playvar > -1 && playvar < 11){
                    score = score+playvar;
                }
                else {
                    System.exit(0);
                }
            }while (score<=target);
        }
        else if(chase = false) {
            do{
                playvar = input.nextInt();
                compvar = rmd.nextInt(11);
                score = score+playvar;
            }while (playvar!=compvar);
        }
        return score;
    }
}