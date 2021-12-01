

import java.util.ArrayList;

public class FootballClub {
    private final String name;
    private final int maxSquadSize = 25;

    private static ArrayList<Player> squad = new ArrayList<Player>();

    public FootballClub(String TeamName) {
		name = TeamName;
	}
	@Override
    public  String toString(){
        String msg = "FootballClub Name: "+name+" Player Count: "+squad.size()+"\n";
        for (Player player : squad) {
            int i = 0;
            msg += "\t" + squad.get(i) + "\n";
            i++;
        }
        return msg;
    }
    public void addPlayer(Player a){
        squad.add(a);
    }
    public Player findPlayer(String F, int n) {

        int i;
        try {
            for (i = 0; squad.get(i) != null; i++) {
                if (squad.get(i).getjn() == n && (squad.get(i).getLN().equals(F) || squad.get(i).getFN().equals(F))) {
                    return squad.get(i);
                }

            }
        }catch (Exception e){

            return null;
        }
        return null;
    }
    public void removeAllPlayer() {
        int i;
        try {
            for (i = 0; i < squad.size();) {
                if (squad.get(i) != null) {
                    squad.remove(i);
                }

            }

        } catch (Exception e) {

        }
    }
}
