package ma.education.tp1.introduction; 

public class TestHeritage {

	public static void main(String[] args) {
		
	//----------------SalleCours-------------------
		Salle s1=new SalleCours(1, "Salle 1",(byte) 20);
		SalleCours s2= new SalleCours(2, "Salle 2", (byte) 20);
		SalleCours s3=(SalleCours)s1;
		SalleCours s4=s2;
		
		System.out.println(s1.id+" "+ s1.nom );
		System.out.println(s2.id+" "+ s2.nom +" " +s2.nb_places);
		System.out.println(s3.id+" "+ s3.nom +" " +s3.nb_places);
		System.out.println(s4.id+" "+ s4.nom +" " +s4.nb_places);
		
		
	//----------------LaboraToire-------------------
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", (byte) 20);
	  //SalleCours s7 = s5; => Erreur_de_syntaxe_parce_que_la_declaration_doit_être_par_Salle_ou_Laboratoire
		SalleCours s8=s6;
		
		System.out.println(s5.id+" "+ s5.nom );
		System.out.println(s6.id+" "+ s6.nom +" " +s6.nb_places);
		System.out.println(s8.id+" "+ s8.nom +" " +s8.nb_places);
		
		
		
		
		
		
	}

}
