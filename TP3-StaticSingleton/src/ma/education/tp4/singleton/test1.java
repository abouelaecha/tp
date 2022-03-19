package ma.education.tp4.singleton;

public class test1 {

	private int number;
	private String content;
	
	@Override
	public boolean equals(Object o)
	{
		test1 row= (test1) o;
		return content.length() == row.content.length();
	}
	
	@Override
	public int hashCode()
	{
		return number+content.length();
	}
	
	public test1(int number,String content)
	{
		this.number = number;
		this.content=content;
	}
	
	@Override
	public String toString()
	{
		return "number = "+number+", content = "+content;
	}
	
	
}
