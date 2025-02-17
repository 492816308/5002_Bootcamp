public class JavaMemoryTest
{
    static void box1()
    {
        int x=3;
        int x1=5;
        JavaMemory box1Memory= new JavaMemory();
        box2();
        System.out.println("Done with box1");
        return;
    }

    static void box2()
    {
        int y=3;
        int y1=4;
        box3();
        System.out.println("Done with box2");
        return;
    }

    static void box3()
    {
        int z=4;
        box4();
        // * PRINT JAVA MEMORY
        System.out.println("Done with box3");
        return;
    }

    static void box4()
    {
        System.out.println("Done with box4");
        return;
    }



    public static void main(String[] args)
    {
        int a=5;
        int numArray[]= new int[]{3,5,9};
        int numArrayMulti[][] = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
        JavaMemory jMemory = new JavaMemory();
        box1();
        jMemory.calcJavaMemory();
        System.out.println("Done with main");
    }
}
