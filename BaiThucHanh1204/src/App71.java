import coordinates.Hinhtron;

public class App71 {
    public static void main(String[] args) throws Exception {
        //khoi tao doi tuong hinh tron tu lop hinh tron
        Hinhtron hinhtron=new Hinhtron();
        //set ban kinh cho hinh tron thong qua phuwong thuc setter
        hinhtron.setBanKinh(10);
        //cac tinh toan khac
        float chuvi=hinhtron.tinhchuvi();
        float dientich=hinhtron.tinhdientich();
        System.out.println("chu vi hinh tron: " +chuvi+";va dien tich"+dientich);
    }
}