
/**
 * Write a description of class NameGenerator here.
 * 
 * @author Dennis Vrieling & Mark Dissel 
 * @version 24-02-2016
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String voornaam;
    private String achternaam;
    private String SWvoornaam;
    
   
    private String moeder;
    private String geboorteplaats;
    private String SWachternaam;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String achternaam, String voornaam, String moeder, String geboorteplaats)
    {
        this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.moeder = moeder;
        this.geboorteplaats = geboorteplaats;
    }

    //Deze methode maakt gebruik van de user generated input, om een star wars naam te genereren.
    public void generateStarWarsName()
    {
        String voornaamtolower = voornaam.toLowerCase();
        String geboorteplaatstolower = geboorteplaats.toLowerCase();
        SWvoornaam = achternaam.substring(0,3)+  voornaamtolower.substring(0,2);
        SWachternaam = moeder.substring(0,2) + geboorteplaatstolower.substring(0,3);
        
        System.out.println(SWvoornaam + " " + SWachternaam);
       
    }
    
    
}
