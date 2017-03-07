/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package leseenheidapp.models;

public class Vak extends LesEenheid{
    
    private double cijfer;
    
    public Vak (String naam, int ects, int studiejaar) {
        super(naam, studiejaar, ects);
        this.cijfer = -1;
    }
    
    public Vak (String naam, int ects, int studiejaar, double cijfer) {
        super(naam, studiejaar, ects);
        this.cijfer = cijfer;
    }
    
    public double setCijfer () {
        return this.cijfer = 0;
    }
    
    public boolean isAfgerond () {
        return (cijfer >= 5.5); 
    }
    
    @Override
    public String toString() {
        return "cijfer" + this.cijfer + super.toString();
    }
}
