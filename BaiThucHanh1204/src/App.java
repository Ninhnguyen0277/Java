import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;
public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron hinhtron=new Hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapBanKinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();
        Hinhtru hinhtru=new Hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();
        Hinhchunhat hinhchunhat=new Hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();
        Hinhvuong hinhvuong=new Hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();
    }
}
