package salaire;

public class Manager  implements Isociete {
	 private int indice;
	 private double salairedebase;
	 private int prime;
	 private int impot;
	 private double salaireManager=0;
	 
  public Manager(int indice,double salairedebase,int prime,int impot) {
	     this.indice=indice;
	     this.salairedebase=salairedebase;
	     this.prime=prime;
	     this.impot=impot;
  }

	@Override
   public void accept(IVisitorsociete v) {
		// TODO Auto-generated method stub
		v.VisitorManager(this);	
	}
   public double getsalaireManager() {
    	return indice*salairedebase+prime-impot;
    	
    }
}
