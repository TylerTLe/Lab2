package comparableVsComparator;
// Exercise 1
public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	@Override
	public int compareTo(Student that)
	{
		if( this.age > that.age )
		{
			return 1;
		}
		else if( this.age < that.age )
		{
			return -1;
		}
		else // this.ID == that.ID
		{
			return 0;
		}
	}
	
}