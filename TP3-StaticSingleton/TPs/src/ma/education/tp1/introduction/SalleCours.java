package ma.education.tp1.introduction;

public class SalleCours extends Salle{
	
	protected byte nb_places;
	
	public SalleCours(long id, String nom, byte nb_places) {
		super(id, nom);
		this.nb_places = nb_places;
	}


}
