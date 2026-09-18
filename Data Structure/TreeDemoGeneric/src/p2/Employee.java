package p2;

public class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e)
    {
       
        return this.id - e.id;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + " Name: " + name + " Salary: " + salary;
    }
}
