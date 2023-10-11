package comparableVsComparator;
import java.util.Comparator;

public class AgeCompare implements Comparator<Student>
{

	@Override
	public int compare(Student stud1, Student stud2)
	{
		if( stud1.getAge() > stud2.getAge())
		{
			return 100;
		}
		else if( stud1.getAge() < stud2.getAge())
		{
			return -100;
		}
		else
			return 0;
		}
}