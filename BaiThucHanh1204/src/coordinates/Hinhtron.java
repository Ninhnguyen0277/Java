package coordinates;

public class Hinhtron {
    private final float PI=3.14f;
    private float bankinh;
    public float getbanKinh(){
        return bankinh;
    }
    public void setBanKinh(float bankinh){
        this.bankinh=bankinh;
    }
    public float tinhchuvi(){
        return 2*PI*bankinh;
    }
    public float tinhdientich(){
        return bankinh*bankinh;
    }
}
