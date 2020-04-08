
public class Rectangle extends Shape {
    private Point p;
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(Point p,int width,int height){
        this.width=width;
        this.height=height;
        this.p=p;
    }

    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public boolean isContains(int x,int y){
        if(x>p.getX()&&x<p.getX()+width&&y<p.getY()&&y>p.getY()-height)
        return true;
        else
        return false;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    

}