package xwang10_midtermReview;
public class Volume {
    int height;
    int width;
    int depth;
    static int totalVolume=0;
    public Volume(int height, int width, int depth)
    {
        this.height=height;
        this.width=width;
        this.depth=depth;
        totalVolume += (height*width*depth);
    }

    public void rotate()
    {
        int temp=this.height;
        this.height=this.width;
        this.width=this.depth;
        this.depth = temp;
    }
    public String toString()
    {
        return ("Height: "+height+", Width: "+width+", Depth: "+depth  + ", Volume: " + height*width*depth) ;
    }

    public int getTotalVolume() {
        return this.totalVolume;
    }
}
