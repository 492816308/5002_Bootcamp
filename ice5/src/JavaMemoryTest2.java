public class JavaMemoryTest2
{
    static void box1(JavaMemory2 box1Mem)
    {
        int x=3;
        int x1=5;
        JavaMemory2 box1Memory= box1Mem;
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
        System.out.println("Done with box3");
        return;
    }

    static void box4()
    {
        int xyz = 5;
        System.out.println("Done with box4");
        return;
    }



    public static void main(String[] args)
    {
        int numArrayMulti[][] = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
        JavaMemory2 jMemory2 = new JavaMemory2();
        JavaMemory2 jMemory2b = new JavaMemory2();
        JavaMemory2 jMemory2c[] = new JavaMemory2[3];
        box1(jMemory2);
        jMemory2.calcJavaMemory();

        System.out.println("Done with main");
    }
}
