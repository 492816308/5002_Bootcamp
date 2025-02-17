public class LinkedList0a
{
    /**
       The Node class represents a list node.
    */

    private class Node
    {
        int value;
        Node next;

        /**
           Constructor.
           @param val The element to store in this node.
           @param n The reference to the next node.
        */

        Node(int val, Node n)
        {
            value = val;
            next = n;
        }

        /**
           Constructor.
           @param val The element to store in this node.
        */

        Node(int val)
        {
            value = val;
            next = null;
        }
    }

    //Reference to the first node in the list
    private Node first = null;

	 /**
	    Constructor.
		 Builds a linked list.
	 */

	 public LinkedList0a()
    {
	   // Incrementally build the list
		// Chuck Debby Elaine Free
	   first = new Node(1);
		first.next = new Node(2);
      first.next.next = new Node (3);
      first = new Node (0, first);
      
      int [ ] numbers = {4, 5};
      
      // Use a loop to add all names in the array to the 
      // front of the linked list to build the list
      // Allan Bob Chuck Debby Elaine Fred  
      for (int n : numbers)
          first = new Node(n, first);
    } 
    
    /**
       The print method traverses the list 
       and prints all of its elements.
    */
    
    public void print()
    {
       Node ref = first;                     
       while (ref!= null)
       {
          System.out.print(ref.value + " ");
          ref = ref.next;
       }    
    }
    
    /**
       The main method creates the linked list 
       and invokes its print method.
    */
    
    public static void main(String [] args)
    {
       LinkedList0a ll = new LinkedList0a();
		 String str = "The contents of the list are:";
		 System.out.println(str);
       ll.print();
    }
}