/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodinhtuyen_59132992_bt1;

/**
 *
 * @author My PC
 */
public abstract class CaNhan {
    
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String hienThiTT() {
        return "Họ tên:"+hoTen+"\n"+"Tuổi:"+tuoi+"\n"+"Địa chỉ:"+diaChi+"\n"+"Sđt:"+sdt;
    }

    public String getHoTen() {
        return hoTen;
    }
    
}
