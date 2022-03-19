package ma.education.tp1.introduction;

public class Salle {
	protected long id;
	protected String nom;
	
   Salle()
	{ 
	}
	
	Salle(String nom)
	{
		this.nom= nom;
	}
	
	Salle(long id,String nom)
	{
		 this(nom);
		 this.id=id;
	}
	
	public void afficher(Salle s) {
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id );
		System.out.println(nom );
	}

}
