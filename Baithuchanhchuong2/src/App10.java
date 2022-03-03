import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {
    	char kitu;
    	int count=0;
    	String chuoi;
    	Scanner sc= new Scanner(System.in);
    	do {
    		System.out.print("nhap chuoi");
    		chuoi = sc.nextLine();
    	}while(chuoi.length()>80);
    	System.out.println("nhap vao ki tu can dem so lan xuat hien:");
    	kitu= sc.next().charAt(0);
    	for(int i=1;i<=chuoi.length();i++) {
    		if(kitu ==chuoi.charAt(i)){
    			count++;
    		}
    	}
    	System.out.println("so lan xuat hien ki tu " +kitu+ " trong chuoi " + chuoi +" la " +count);
    	sc.close();
    }
    
    	

}
