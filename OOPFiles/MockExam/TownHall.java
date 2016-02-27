public class TownHall {
    private CivilServant[] civilServants;
    private int index;

    public TownHall(int numberOfCivilServants) {
        this.civilServants = new CivilServant[numberOfCivilServants];
        this.index = 0;
    }

    public void addCivilServant(CivilServant civilServant) {
        // ...
    }

    public void addService(Service service, int[] civilServantIndices) {
        // ...
    }

    public double averageDurationForService(String serviceName) {
        // ...
        return 0;
    }
}
