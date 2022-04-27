public class Point{
    private String Tendiem;
    private float x;
    private float y;
    public void getTendiem(){
        return Tendiem;
    }
    public void setTendiem(String Tendiem){
        this.Tendiem=Tendiem;
    }
    public float getx(){
        return x;
    }
    public void setx(Float x){
        this.x=x;
    }
    public float gety(){
        return y;
    }
    public void sety(Float y){
        this.y=y;
    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getLength(Point a,Point b){
        return Math.sqrt(Math.pow(b.getx()-a.getx(),2)+Math.pow(b.gety()-a.gety(), 2));
    }
}