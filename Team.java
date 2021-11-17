import java.util.Random;
import java.util.*;
/**
 * this class creates an object of a Team of soccerwith instance variables of Country, 23 randpomly generated player names,
 * and a randomly generated coach name.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    protected String country;
    private Name[] players;
    private Name  coach;
     
    /**
     * Constructor for objects of class Team
     */
    public Team()
    {
        // initialise instance variables
        this.players= new Name[23];
        this.coach= new Name();
        this.country=setCountry();
        
        
    }

    /**
     *
     *
     * @param
     * @return generates a team consisted of 23 random names
     */
    public Name[] setTeam(){
        for(int i=0; i<23;i++){
            Name player= new Name();
            players[i]=player;
        }
        return players;
    }
    public String setCountry(){    
        String[] countries=new String[]{"Portugual","Spain","France","Argentina","Iceland","Peru","Croatia","Denmark",
            "Nigeria","CostaRica","Germany","Serbia","Mexico","Brazil","Sweden","Switzerland","South Korea","Belgium",
            "England","Panama","Colombia","Japan","Poland","Senegal"};
        Random rand= new Random();
        int index= rand.nextInt(countries.length);
        String country=countries[index];
        
        for (int i = index; i < countries.length - 1; i++) {
            countries[i] = countries[i + 1];
        }
        return country;

}
}