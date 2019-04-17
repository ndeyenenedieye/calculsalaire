package salaire;

public class CalculeSalaire implements IVisitorsociete {
	   private double salaire;
	   
     public CalculeSalaire () {
    	 super();
    	 this.salaire=0;
     }

     public void setsalaire(double salaire) {
    	 this.salaire=salaire;
     }
	@Override
	public void VisitorDirecteur(Directeur d) {
		// TODO Auto-generated method stub
		this.setsalaire(d.getsalaireDirecteur());
		
	}

	@Override
	public void VisitorManager(Manager m) {
		// TODO Auto-generated method stub
		this.setsalaire(m.getsalaireManager());
		
	}

	@Override
	public void visitorCommerciaux(Commerciaux c) {
		// TODO Auto-generated method stub
		this.setsalaire(c.getsalaireCommerciaux());

	}

	@Override
	public void VisitorOuvrier(Ouvrier o) {
		// TODO Auto-generated method stub
		this.setsalaire(o.getsalaireOuvrier());
	}

}
