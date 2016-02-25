
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class NameGenerator
{

    // The Fields
    private String firstName;
    private String lastName;
    private String motherMaidenName;
    private String cityOfBirth;

    public NameGenerator(String NameGeneratorfirstName, String NameGeneratorlastName,
    String NameGeneratormotherMaidenName, String NameGeneratorcityOfBirth) {

        firstName = NameGeneratorfirstName.substring(0,2);
        lastName = NameGeneratorlastName.substring(0,3);
        motherMaidenName = NameGeneratormotherMaidenName.substring(0,2);
        cityOfBirth = NameGeneratorcityOfBirth.substring(0,3);

       
    }

    public void printSWName()
    {
        System.out.println ( "Your Star Wars Name is " + "'" + lastName + firstName 
            + " " + motherMaidenName + cityOfBirth + "'");
    }
    //String swFirstname = lastname.substring(0,3) + firstName.substring(0,2);
    //String swLastName = mothersMaidenName.substring(0,2) + cityOfBirth.substring(0,3);
    //System.out.println(swFirstName + " " + swLastName);  
}