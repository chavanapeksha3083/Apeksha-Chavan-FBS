package p1;

public class Stack 
{
	
	Node top;
	
	Stack()
			
	{
      top=null;
	}
	
	boolean isEmpty()
	{
		
		if (top==null)
			
			return true;
			
		else
			return false;
		
		
	}
	
	void push(int ele)
	
	{
		Node x = new Node(ele);
		
		if(top==null)
		{
			top=x;
			return;
		}
		x.next=top;
		top=x;
		
	}
	
	
	void pop()
	{
		
		if(top==null)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(top.data);
		top=top.next;
	}
	
	int peek()
	{
		if (top==null)
		{
			return -1;
		}
		return top.data;
		
	}
	
	void display()
	{
		
		Node temp= top;
		while(temp!=null)
		{
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	

}
