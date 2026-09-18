package p1;

public class BST
{
	
	Node root;
	
	public BST()
	{
		
		root=null;
		// TODO Auto-generated constructor stub
	}
	
	
	void insert(int ele)
	{
	    Node x = new Node(ele);

	    if(root == null)
	    {
	        root = x;
	        return;
	    }

	    Node p = root;

	    while(true)
	    {
	     
	        if(p.getData() > ele && p.left != null)
	        {
	            p = p.left;
	        }

	        if(p.getData() > ele && p.left == null)
	        {
	            p.left = x;
	            break;
	        }

	     
	        if(p.getData() <ele && p.right != null)
	        {
	            p = p.right;
	        }

	
	        if(p.getData() < ele && p.right == null)
	        {
	            p.right = x;
	            break;
	        }
	    }
	}

	
	
	
	void inorder(Node p)
	{
	    if(p == null)
	        return;

	    inorder(p.getLeft());
	    System.out.print(p.getData() + " ");
	    inorder(p.getRight());
	}

	void displayIn()
	{
	    if(root == null)
	    {
	        System.out.println("Tree is empty");
	        return;
	    }

	    inorder(root);
	}

	
	
	
	void preorder(Node p)
	{
	    if(p == null)
	        return;

	    System.out.print(p.getData() + " ");
	    preorder(p.getLeft());
	    preorder(p.getRight());
	}

	void displayPre()
	{
	    if(root == null)
	    {
	        System.out.println("Tree is empty");
	        return;
	    }

	    preorder(root);
	}

	
	
	void postorder(Node p)
	{
	    if(p == null)
	        return;

	    postorder(p.getLeft());
	    postorder(p.getRight());
	    System.out.print(p.getData() + " ");
	}

	void displayPost()
	{
	    if(root == null)
	    {
	        System.out.println("Tree is empty");
	        return;
	    }

	    postorder(root);
	}

	
	
	void displayAll()
	{
	    if(root == null)
	    {
	        System.out.println("Tree is empty");
	        return;
	    }

	    System.out.print("Inorder: ");
	    displayIn();
	    System.out.println();

	    System.out.print("Preorder: ");
	    displayPre();
	    System.out.println();

	    System.out.print("Postorder: ");
	    displayPost();
	    System.out.println();
	}

	
	
	
	Node delete(Node p, int ele)
	{
	    if (p == null)
	        return p;

	    // Left side
	    if (p.getData() > ele)
	    {
	        p.left = delete(p.getLeft(), ele);
	        return p;
	    }

	    // Right side
	    if (p.getData() < ele)
	    {
	        p.right = delete(p.getRight(), ele);
	        return p;
	    }

	    // Node Found

	    // No child
	    if (p.getLeft() == null && p.getRight() == null)
	        return null;

	    // Only Right child
	    if (p.getLeft() == null)
	        return p.getRight();

	    // Only Left child
	    if (p.getRight() == null)
	        return p.getLeft();

	   
	 // Two children
	    else
	    {
	        Node x = p.getRight();

	        while (x.getLeft() != null)
	        {
	            x = x.getLeft();
	        }

	        p.data = x.getData();

	        p.right = delete(p.getRight(), x.getData());

	        return p;
	    }

	}

	
	
	void deleteNode(int ele)
	{
	    if (root == null)
	    {
	        System.out.println("Tree is empty");
	        return;
	    }

	    root = delete(root, ele);
	}

	
		
		
	}
	
	
	


