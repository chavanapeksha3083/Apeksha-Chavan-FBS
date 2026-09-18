
package p1;
public class Node<Employee>
{
	Employee data;
    Node<Employee> next;

    public Node(Employee data) 
    {
        this.data = data;
        this.next = null;
    }
}
