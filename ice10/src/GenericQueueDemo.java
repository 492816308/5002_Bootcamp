
public class GenericQueueDemo
{
    public static void main(String [] arg)
    {
        GenericQueue<String> queueObj = new GenericQueue<String>();
        queueObj.enqueue("Abc");
        queueObj.enqueue("def");
        System.out.println(queueObj);
        GenericQueue<String> queueObj2 = queueObj.deepCopy();
        String s= queueObj2.dequeue();
        System.out.println("S is " + s + "Queue= " + queueObj2);
        // Call the new function "appendAndCreateNewQueue" Prove that it works.
        //GenericQueue<String> queueObj3 = (New function you are coding)
        //System.out.println(queueObj3);
    }
}
