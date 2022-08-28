package Entity;

public class CongNhan {

    protected String hoTen;
    protected String diaChi;
    protected String sdt;



    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    public String toString(){
        return "entity.Congnhan{" +

                ", hoTen='"+this.hoTen+'\''+
                ", diaChi='"+this.diaChi+'\''+
                ", sdt='"+this.sdt+'\''+
                '}';
    }
}
