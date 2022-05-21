public class Person {
    public String Name;
    public Int Age;
    Public String getName(){
        return Name;
    }
    public void setName(String Name) {
        if(Name==null){
            this.Name="khong co"
        }else{
            this.Name=Name;
        }
    }
    Public Int getAge(){
        return Age;
    }
    public void setAge(Int Age) {
        this.Age=Age;
}
