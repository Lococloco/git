
import java.util.ArrayList;

public class Player {
    private String firstName;
    private String LastName;
    private int jerseyNumber;

    private ArrayList<Player> squad = new ArrayList<Player>();
    @Override
    public  String toString(){
        String msg = "["+LastName+", "+firstName+" "+jerseyNumber+"]";
        for (Player player : squad) {
            int i = 0;
            msg += "\t" + squad.get(i) + "\n";
            i++;
        }
        return msg;
    }

    public Player(String playerFirstName, String playerLastName, int playerjerseyNumber) {
		firstName = playerFirstName;
		LastName = playerLastName;
		jerseyNumber = playerjerseyNumber;
	}
	public int getjn() {
    	return jerseyNumber;
    }
    public String getFN() {
    	return firstName;
    }
    public String getLN() {
    	return LastName;
    }
}
