/**
 * Class to hold the contents of a black and white raster screen.
 * Screen is a series of 60 raster lines.
 * Each raster line is a series of brightness levels, from 0 to 255 (0 is black, 255 is the brightest white).
 *
 * A screen is displayed by getting all the pixels in a particular order that matches the location of the
 * electron gun as it moves back and forth across the screen--it goes side to side quickly while at the same time
 * going from top to bottom slowly. By the time it has gotten to the bottom it has drawn every other line onto
 * the screen. So then it goes back to the top and draws in all the lines that were missed in the first pass.
 *
 * So a raster scan is a queue of pixel brightness levels, done pixel by pixel within each raster line, where
 * the raster lines are traversed as line 0, line 2, line 4, ..., then line 1, line 3, line 5, etc.
 */
public class Raster {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    public static final int ROWS = 60;
    public static final int PIXELS_PER_ROW = 132;

    /**
     * Each raster line is represented as a linked list of pixels.
     */
    private class Node {
        public int brightness;
        public Node next;

        public Node(int brightness, Node next) {
            this.brightness = brightness;
            this.next = next;
        }
    }

    /*
     * We keep an array of all the raster lines
     * (by holding on to the head of the linked list for that line)
     * rows[0] is the top-most raster line
     * rows[ROWS-1] is the bottom-most raster line
     */
    private Node[] rows;

    /**
     * Construct a screen that starts out totally black.
     */
    public Raster() {
        rows = new Node[ROWS];
        for (int r = 0; r < ROWS; r++) {
            Node head = null;
            for (int c = 0; c < PIXELS_PER_ROW; c++)
                head = new Node(BLACK, head);
            rows[r] = head;
        }
    }

    /**
     * Set the brightness level for a particular pixel on the screen.
     *
     * @param row        which scan line row on the screen, 0 for top, 59 for bottom
     * @param col        which pixel within the row, 0 for leftmost, 131 for rightmost
     * @param brightness desired brightness level for that pixel
     */
    public void setPixel(int row, int col, int brightness) {
        if (brightness < BLACK || brightness > WHITE)
            throw new IllegalArgumentException("brightness levels are from black " + BLACK + " to white " + WHITE);
        Node head = rows[row];
        Node p = head;
        for (int c = 0; c < col; c++)
            p = p.next;
        p.brightness = brightness;
    }

    /**
     * Get the entire screen in the order needed by the electron gun,
     * i.e. all the pixels from line 0, then all the pixels from line 2,
     * then from line 4, ..., up to line 58, then all the pixels from line 1, line 3, etc.
     *
     * (Assume Queue is equivalent of yours from Lab8.)
     *
     * @return queue of all the brightness levels in gun traversal order
     */
    public Queue<Integer> getScan() {
        Queue<Integer> scan = new Queue<>();
        for (int start = 0; start < 2; start++) {
            for (int r = start; r < rows.length; r += 2) {
                for (Node q = rows[r]; q != null; q = q.next) {
                    scan.enqueue(q.brightness);
                }
            }
        }
        return scan;
    }
}
