package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
	
	double surface;
	
//----------Methods---------
	public abstract double calculerSurface();
	
	public void afficherSurface() 
	{
		System.out.println(this.surface);
	}

	
	

}
