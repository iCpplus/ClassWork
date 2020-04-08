
public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public double getDistance(int x,int y){
        return Math.sqrt(x*x+y*y);
    }

    public int getDistanceOfX(int x,int y){
        return y;
    }

    public int getDistanceOfY(int x,int y){
        return x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}