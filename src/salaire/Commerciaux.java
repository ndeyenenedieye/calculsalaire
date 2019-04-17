package salaire;

public class Commerciaux implements Isociete {
	 private int primevente;
	 private double salaireCommerciaux=0;
	 
	 
      public Commerciaux( int primevente) {
    	   this.primevente=this.primevente;
      }

	@Override
  public void accept(IVisitorsociete v) {
		// TODO Auto-generated method stub
	     v.visitorCommerciaux(this);
	}
  public double getsalaireCommerciaux() {
   	return primevente+10000;
   	
   }
}


