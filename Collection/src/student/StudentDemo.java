package student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
    int rollno;
    String name;

    Student() {
        this.rollno = 0;
        this.name = "not";
    }

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    
    public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
        return "\nRollNo: " + rollno + "\nName: " + name;
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student s = (Student) o;
        return this.rollno == s.rollno;
        
        
    }
    */
	  @Override
	    public boolean equals(Object o)
	  {
		  System.out.println("equals called");
		  Student s2 = (Student) o;
		  if(this.rollno==s2.rollno)  
			  return true;
		  else
			  return false;
		  
	  }
	
	
		@Override
		public int compareTo(Student s2)
		{
			 System.out.println("campareTo called");
			// TODO Auto-generated method stub
		//	Student s2 = (Student)o;  // downcasting
			return this.rollno-s2.rollno;
		}

		
		
		public int hashCode()
		{
		 System.out.println("inside hashcode");
		
			return this.rollno;
		}


}
public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student(10, "Sachin");
        Student s2 = new Student(7, "Dhoni");
        Student s3 = new Student(18, "Virat");

        
        // List internally called equals method
        ArrayList<Student> sList = new ArrayList<>();

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        System.out.println(sList);

        Student search = new Student(7, "Dhoni");

        if (sList.contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
       
        
        
    }
    
    
    public static void main2(String[] args) {

        Student s1 = new Student(10, "Sachin");
        Student s2 = new Student(7, "Dhoni");
        Student s3 = new Student(18, "Virat");

        
        /* TreeSet internally called compareTo method but firstly you  make class(Student) comparable 
        means implements Comparable
        
        */
        TreeSet<Student> ts = new TreeSet<>();

       ts.add(s1);
       ts.add(s2);
       ts.add(s3);

        System.out.println(ts);

       
        if (ts.contains(new Student(7, "Dhoni")))
        {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    
        
    
}
    
    
    
    public static void main1(String[] args) {

        Student s1 = new Student(10, "Sachin");
        Student s2 = new Student(7, "Dhoni");
        Student s3 = new Student(18, "Virat");
        Student s4 = new Student(45, "Rohit");
        Student s5 = new Student(333, "Khris");

        // HashSet internally called equals method and compareTo method
        HashSet<Student> hs = new HashSet<>();

       hs.add(s1);
       hs.add(s2);
       hs.add(s3);
       hs.add(s4);
       hs.add(s5);

        System.out.println(hs);

        if (hs.contains(new Student(7, "Dhoni")))
        {
            System.out.println("Found");
        } else
        {
            System.out.println("Not Found");
        }
       

    }
}
