import students.Sinhvien;

public class App72 {
    public static void main(String[] args) throws Exception {
        Sinhvien sinhvien1=new Sinhvien();
        Sinhvien sinhvien2=new Sinhvien();
        sinhvien1.setTen("");
        sinhvien1.setTuoi(23);
        sinhvien2.setTen("peter");
        sinhvien2.setTuoi(17);
        System.out.println("Sinh vien 1 co ten la:"+sinhvien1.getTen()+",tuoi:"+sinhvien1.getTuoi());
        System.out.println("Sinh vien 2 co ten la:"+sinhvien2.getTen()+",tuoi:"+sinhvien2.getTuoi());
    }
}
