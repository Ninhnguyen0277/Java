import java.util.ArrayList;
public class App16 {
    public static void main(String[] args){
        ArrayList<String> arrListString= new ArrayList<>();
        arrListString.add("nam");
        arrListString.add("hang");
        arrListString.add("hong");
        arrListString.add("hanh");
        arrListString.add("duc");
        System.out.println("cac phan tu co trong arrlist la");
        for(int i=0;i<arrListString.size();i++){
            System.out.println(arrListString.get(i));
        }
    }
}
