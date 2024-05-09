
class cylinder {
    private int radius;
    private int height;

    public void setradius(int r) {
        radius = r;
    }

    public int getradius() {
        return radius;
    }

    public void setheight(int h) {
        height = h;
    }

    public int getheight() {
        return height;
    }

    public double vol(int r, int h) {
        double v = Math.PI * r * r * h;
        return v;
    }

}

public class ques {
    public static void main(String[] args){
        cylinder cyl1 = new cylinder();
        cyl1.setheight(7);
        cyl1.setradius(4);

        int r = cyl1.getradius();
        int h = cyl1.getheight();
        System.out.println(r);
        System.out.println(h);
        System.out.println(cyl1.vol(r,h));
    }
}
