
public class Circle extends Shape{
    private Point p;
    private double r;

    public Circle(){

    }

    public Circle(Point p,double r){
        this.p=p;
        this.r=r;
    }

    @Override
    public double getArea(){
        return Math.PI*r*r;
    }

    @Override
    public boolean isContains(int x,int y){
        int dx=x-p.getX();
		int dy=y-p.getY();
		double s=Math.sqrt(dx * dx + dy * dy);
		if(s>r)
			return false;
		else
			return true;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
}