package salaire;

public class Directeur implements Isociete {
	 private int indice;
	 private double salairedebase;
	 private double bonus;
	 private double salaireDirecteur=0;
	 
   public Directeur(int indice,double salairedebase,double bonus) {
	    this.indice=indice;
	    this.salairedebase=salairedebase;
	    this.bonus=bonus;  
  }

	@Override
   public void accept(IVisitorsociete v) {
		// TODO Auto-generated method stub
		v.VisitorDirecteur(this);	
	}
  public double getsalaireDirecteur() {
	return indice*salairedebase+bonus;
  }	  
  
}
