/**
 * This is the service class
 * 
 * @author Zoe Arendsz 
 * @version Version 01 - February 26 2016
 */

public class Service {
    private String name;
    private int duration;

    /**
     * This is the constructor
     * 
     * @param       name the name of the service 
     * @return      duration duration in minutes 
     */
    
    public Service(String name, int duration) {
        setName(name);
        setDuration(duration);
    }

     /**
     * 
     * @return     the name of the service 
     */
    
    public String getName() {
        return name;
    }

     /**
     * 
     * @return     the duration of the service
     */
    
    public int getDuration() {
        return duration;
    }

     /**
     * sets the name of the service
     * 
     * @param  name   name of service
     */
    
    public void setName(String name) {
        this.name = name;
    }

    
     /**
     * sets the duration of the service in minutes
     * 
     * @param  duration   duration of the service in minutes
     */
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
