/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package leseenheidapp.models;

public class ProfessionalSkills extends LesEenheid {
    
    private boolean gehaald;
    
    public ProfessionalSkills (String naam, int ects, int studiejaar) {
        super(naam, studiejaar, ects);
        this.gehaald = false;
    }
    
    public ProfessionalSkills (String naam, int ects, int studiejaar, boolean gehaald) {
        super(naam, studiejaar, ects);
        this.gehaald = gehaald;
    }
    
    public boolean setGehaald () {
        return this.gehaald;
    }
    
    public boolean isAfgerond () {
        return this.gehaald;

    }
    
    @Override
    public String toString() {
        return "Gehaald: "+ this.gehaald + super.toString();
    }
}
