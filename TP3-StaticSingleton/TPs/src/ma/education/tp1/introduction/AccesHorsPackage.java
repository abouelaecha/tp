package ma.education.tp1.introduction;

public class AccesHorsPackage extends Salle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salle s =new Salle();
		Salle s2 =new Salle(2,"Salle B");
		System.out.println(s2.id+" "+s2.nom);
		
		
		s.afficher(s2);
		

	}
	
	

}
