import java.util.Scanner;

public class App40 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ngay");
        int ngay=sc.nextInt();
        switch(ngay){
            case 2:System.out.println("thu hai");
            break;
            case 3:System.out.println("thu ba");
            break;
            case 4:System.out.println("thu tu");
            break;
            case 5:System.out.println("thu nam");
            break;
            case 6:System.out.println("thu sau");
            break;
            case 7:System.out.println("thu bay");
            break;
            case 0:System.out.println("chu nhat");
            break;
            default:System.out.println("So ngay co trong tuan la");
        }
        sc.close();
    }
}