import java.util.ArrayList;
public class AppArr {
    private int manhanvien;
    private String Hotennhanvien;
    private String Diachi;
    public int getmanhanvien() {
        return manhanvien;
    }
    public void setmanhanvien(int manhanvien) {
        this.manhanvien=manhanvien;
    }
    public String getDiachi() {
        return Diachi;
    }
    public void setDiachi(String Diachi) {
        this.Diachi=Diachi;
    }
    public String getHotennhanvien() {
        return Hotennhanvien;
    }
    public void setHotennhanvien(String Hotennhanvien) {
        this.Hotennhanvien=Hotennhanvien;
    }
    public static void main(String[] arg) {
        ArrayList<String> hotenArrayList=new ArrayList<>();
        hotenArrayList.add("nguyen van a");
        hotenArrayList.add("nguyen van b");
        hotenArrayList.add("nguyen van c");
        System.out.println();
        for(int i=0;i<hotenArrayList.size();i++){
            System.out.println(hotenArrayList.get(i));
        }
    }
}
