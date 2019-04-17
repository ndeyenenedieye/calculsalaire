package salaire;

public class Test {
	public static void main(String args[]) {
		Directeur dir=new Directeur(52000, 13, 40000);
		CalculeSalaire Visitor1=new CalculeSalaire();
		dir.accept(Visitor1);
		System.out.println("salaire directeur" +dir.getsalaireDirecteur());

     
	Manager ma=new Manager(52000,15,65200,25555);
	CalculeSalaire Visitor2=new CalculeSalaire();
	ma.accept(Visitor2);
	System.out.println("salaire manager" +ma.getsalaireManager());
 
	Commerciaux co=new Commerciaux (52000);
	CalculeSalaire Visitor3=new CalculeSalaire();
	co.accept(Visitor3);
	System.out.println("salaire du commercial" +co.getsalaireCommerciaux());
	
	
	Ouvrier ou=new Ouvrier (1500,7);
	CalculeSalaire Visitor4=new CalculeSalaire();
	ou.accept(Visitor4);
	System.out.println("salaire de l'ouvrier" +ou.getsalaireOuvrier());


}
}