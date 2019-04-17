package salaire;

public class Ouvrier implements Isociete {
	 private double salairehoraire;
	 private double nbheure;
	 private double salaireOuvrier=0;
	 
  public Ouvrier(double salairehoraire,double nbheure) {
	    this.salairehoraire= salairehoraire;
	    this.nbheure=nbheure;
 }

	@Override
  public void accept(IVisitorsociete v) {
		// TODO Auto-generated method stub
		v.VisitorOuvrier(this);	
	}
 public double getsalaireOuvrier() {
	return salairehoraire*nbheure+5000;
 }	  
 
}


