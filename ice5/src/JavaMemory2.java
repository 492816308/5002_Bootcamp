public class JavaMemory2
{
    static int j1=5;
    private int m_calcField;

    public JavaMemory2()
    {
        j1++;
        m_calcField=j1;
    }
    public void calcJavaMemory()
    {
        String strMemory="java Memory";
        double d1=5;
        m_calcField *=2;
    }

    public int getCalcField()
    {
        return m_calcField;
    }
}
