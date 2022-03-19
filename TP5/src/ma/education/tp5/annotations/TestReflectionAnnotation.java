package ma.education.tp5.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Class c = Calculatrice.class;
			Programmer programmer = (Programmer)
			c.getDeclaredAnnotation(Programmer.class);
			System.out.println(programmer.id()+":"+programmer.name());
		

		
		

	}

}
