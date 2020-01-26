/**
 * @author kaustavmanna
 *
 */

import java.util.*;

class Student
{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCGPA()
    {
        return this.cgpa;
    }
}

class StudentComparator implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        if(a.getCGPA() < b.getCGPA())
            return 1;
        else if(a.getCGPA() > b.getCGPA())
            return -1;
        else
        {
        	if(a.getName().compareTo(b.getName()) == 0)
            {
                if(a.getID() > b.getID())
                    return 1;
                else if(a.getID() < b.getID())
                    return -1;
                else
                    return 0;
            }
            else
            	return a.getName().compareTo(b.getName());
        }
    }
}

class Priorities
{
    private PriorityQueue<Student> studentlist;

    public Priorities()
    {
        studentlist = new PriorityQueue<Student>(1, new StudentComparator());
    }

    public List<Student> getStudents(List<String> events)
    {
        for(int i = 0; i < events.size(); i++)
        {
            String command[] = events.get(i).split(" ");
            if(command[0].equals("ENTER"))
                studentlist.add(new Student(Integer.parseInt(command[3]), command[1], Double.valueOf(command[2])));
            
            else if(command[0].equals("SERVED"))
            {
            	if(!studentlist.isEmpty())
            		studentlist.poll();
            }
        }
        
        List<Student> slist = new ArrayList<Student>();

        while (!studentlist.isEmpty()) 
            slist.add(studentlist.poll()); 

        return slist;
    }
}

public class Problem_5
{
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();
	
	public static void main(String[] args)
	{
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();
		
		while (totalEvents-- != 0)
		{
			String event = scan.nextLine();
			events.add(event);
		}
		
		List<Student> students = priorities.getStudents(events);
		
		if (students.isEmpty())
			System.out.println("EMPTY");
		else
		{
			for(Student st: students)
				System.out.println(st.getName());
	    }
	}
}
