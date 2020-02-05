package exercise32;

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return   Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public double distance(int x, int y){
        return   Math.sqrt(x*x+this.y*y);
    }
    public double distance(Point another){
        return   Math.sqrt((another.getX()-this.x)*(another.getX()-this.x)+
                                (another.getY()-this.y)*(another.getY()-this.y));
    }

}