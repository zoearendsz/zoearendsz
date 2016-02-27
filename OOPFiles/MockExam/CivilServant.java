import java.util.*;

public class CivilServant {
    private boolean snel;
    private ArrayList<Service> canPerform;
    public static final int MAX_NUMBER_OF_SERVICES = 3;

    public CivilServant(boolean fast) {
        this.snel = fast;
        this.canPerform = new ArrayList<Service>();
    }

    public void addService(Service service) {
        // no more than MAX_NUMBER_OF_SERVICES
        // the service to add should not be null
        if(canPerform.size()<MAX_NUMBER_OF_SERVICES && service != null) {
            this.canPerform.add(service);
        }

    }

    private Service findService(String serviceName) {
        
        for(Service service :canPerform){

            if(service.getName().equals(serviceName))
            {
                return service;
            }

        }
        
            // ...
        return null;
    }

    public boolean canPerform(String serviceName) {
        return findService(serviceName) != null;
    }

    public int performService(String serviceName) {
        // ...
        return 0;
    }
}
