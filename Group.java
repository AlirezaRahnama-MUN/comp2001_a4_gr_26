
/**
 * Write a description of class Group here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Group
{
    // instance variables - replace the example below with your own
    private String name;
    private Team[] teams;
    private String[] groups;

    /**
     * Constructor for objects of class Group
     */
    public Group()
    {
        // initialise instance variables
        this.name=name; 
        this.teams=new Team[4];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Team[] worldCupSetup()
    {
        // put your code here
        String[] groups= {"A","B","C","D","E","F"};
        for(int j=0;j<6;j++){
            for(int i=0;i<4;i++){
                Team team= new Team();
                this.name=groups[j];
                teams[i]=team;
            }
                
            }
        return teams;    
            
        }
    }
