import java.util.Random;
/**
 * Write a description of class Match here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Match
{
    // instance variables - replace the example below with your own
    private Team team1;
    private Team team2;
    private int score;
    private Team[] teams;

    /**
     * Constructor for objects of class Match
     */
    public Match()
    {
        // initialise instance variables
        team1= randomTeam();
        team2= randomTeam();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Team randomTeam()
    {
        // put your code here
        Random rand=new Random();
        int teamIndex= rand.nextInt(4);
       
       for (int i = teamIndex; i < teams.length - 1; i++) {
            teams[i] = teams[i + 1];
        }
        return teams[teamIndex];
    }
}
