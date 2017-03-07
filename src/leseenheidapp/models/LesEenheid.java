/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package leseenheidapp.models;

public class LesEenheid {
    
    private String naam;
    private int ects;
    private int studiejaar;
    
    public LesEenheid (String naam, int ects, int studiejaar) {
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
    }

    public String toString() {
        return "Naam: " + this.naam + ", " + this.ects + " ects " 
                + ", studiejaar: " + this.studiejaar;
    }
}
