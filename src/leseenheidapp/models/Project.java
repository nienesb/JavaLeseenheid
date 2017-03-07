/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package leseenheidapp.models;

public class Project extends LesEenheid {
    
    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;
    
    public Project (String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.productCijfer = -1;
        this.procesCijfer = -1;
        this.methodenEnTechniekenCijfer = -1;
    }
    
    public Project (String naam, int ects, int studiejaar,
            double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer) {
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }
    
    public double setProductCijfer () {
        return this.productCijfer;
    }
    
    public double setProcesCijfer () {
        return this.procesCijfer;
    }
    
    public double setMethodenEnTechniekenCijferr () {
        return this.methodenEnTechniekenCijfer;
    }
    
    public boolean isAfgerond () {
        return (productCijfer >= 5.5 &&
                procesCijfer >= 5.5 &&
                methodenEnTechniekenCijfer >= 5.5); 
    }
    
    @Override
    public String toString() {
        return super.toString() +
        " (" + this.productCijfer + 
        ", " + this.procesCijfer +
        ", " + this.methodenEnTechniekenCijfer +
        ")";
    }
}
