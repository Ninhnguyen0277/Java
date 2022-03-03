import java.util.Scanner;
public class App03 {
    public static void main(String[] args) throws Exception {
    	Scanner sc =new Scanner(System.in);
    	System.out.print("nhap ten cua ban:");
    	String ten=sc.next();
    	System.out.print("nhap nam sinh cua ban:");
    	int ns= sc.nextInt();
    	int c = 2020 - ns;
    	if(c < 16) {
    		System.out.print("Ban " +ten+ " o do tuoi vi thanh nien");
    	}else if(c >= 16 && c <18){
    		System.out.print("Ban " +ten+ " o do tuoi truong thanh");
    	}else if(c >= 18){
    		System.out.print("Ban " +ten+ " da gia");
    	}
    	sc.close();
    }

}