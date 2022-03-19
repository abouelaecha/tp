package ma.education.tp4.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Set<test1> t = new HashSet<>();
		t.add(new test1(3,"FIX"));
		t.add(new test1(2,"ISSUE"));
		t.add(new test1(2,"MERGE"));
		t.add(new test1(3,"PULL"));
		t.add(new test1(3,"IOS"));
		System.out.println(t);
		
	}
	
}


