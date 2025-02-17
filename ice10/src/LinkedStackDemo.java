/** 
   This class demonstrates the use of the 
   LinkedStack class.
*/

public class LinkedStackDemo 
{
   public static void main(String [ ] args)   
   {
       LinkedStack st = new LinkedStack();
       LinkedQueueInt queue = new LinkedQueueInt();
       queue.enqueue(10);
       queue.enqueue(28);
       queue.enqueue(49);
       queue.enqueue(-8);

       System.out.println(queue);
       System.out.println("Maximum: " + queue.max() + "\n");

       System.out.println("Pushing: Amy Bob Chuck");
       System.out.println("Contents of Stack:");
       st.push("Amy");
       st.push("Bob");
       st.push("Chuck");
       System.out.println(st);   
       String name = st.pop();
       System.out.println("Popped: " + name);
       System.out.println("Contents of Stack:");
       System.out.println(st);        
   }    
}