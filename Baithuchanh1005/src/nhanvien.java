public class nhanvien {

    public String name;
    public String id;
    public String address;
    public NhanVien(){
        name="";
        id="";
        address="";
    }
    public NhanVien(String name, String id, String address){
        this.name = name;
        this.id = id;
        this.address=address;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}