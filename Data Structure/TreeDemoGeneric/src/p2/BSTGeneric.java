package p2;

public class BSTGeneric<T extends Comparable<T>>
{
    Node<T> root;

    public BSTGeneric()
    {
        root = null;
    }

    void insert(T ele)
    {
        Node<T> x = new Node<>(ele);

        if(root == null)
        {
            root = x;
            return;
        }

        Node<T> p = root;

        while(true)
        {
            if(ele.compareTo(p.data) < 0 && p.left != null)
                p = p.left;

            if(ele.compareTo(p.data) < 0 && p.left == null)
            {
                p.left = x;
                break;
            }

            if(ele.compareTo(p.data) > 0 && p.right != null)
                p = p.right;

            if(ele.compareTo(p.data) > 0 && p.right == null)
            {
                p.right = x;
                break;
            }
        }
    }

    void inorder(Node<T> p)
    {
        if(p == null)
            return;

        inorder(p.left);
        System.out.println(p.data);
        inorder(p.right);
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

    void preorder(Node<T> p)
    {
        if(p == null)
            return;

        System.out.println(p.data);
        preorder(p.left);
        preorder(p.right);
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

    void postorder(Node<T> p)
    {
        if(p == null)
            return;

        postorder(p.left);
        postorder(p.right);
        System.out.println(p.data);
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

    Node<T> delete(Node<T> p, T ele)
    {
        if(p == null)
            return p;

        if(ele.compareTo(p.data) < 0)
        {
            p.left = delete(p.left, ele);
            return p;
        }

        if(ele.compareTo(p.data) > 0)
        {
            p.right = delete(p.right, ele);
            return p;
        }

        if(p.left == null && p.right == null)
            return null;

        if(p.left == null)
            return p.right;

        if(p.right == null)
            return p.left;

        Node<T> x = p.right;

        while(x.left != null)
            x = x.left;

        p.data = x.data;

        p.right = delete(p.right, x.data);

        return p;
    }

    void deleteNode(T ele)
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return;
        }

        root = delete(root, ele);
    }
}
