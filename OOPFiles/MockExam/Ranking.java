import java.util.*;

public class Ranking {
    private HashMap<String, TownHall> ranking;

    public Ranking() {
       this.ranking = new HashMap<>();
    }

    public void addTownHall(String name, TownHall townHall) {
        ranking.put(name, townHall);
    }

    public void printAverageDurationForService(String serviceName) {
        Iterator<String> it = ranking.keySet().iterator();
        System.out.println("The ranking for service: " + serviceName);
        while(it.hasNext()) {
            //
        }
    }

}
