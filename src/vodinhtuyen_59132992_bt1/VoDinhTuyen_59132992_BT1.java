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
public class VoDinhTuyen_59132992_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LopHoc lopHoc = new LopHoc();
        HocSinh hocSinh1 = new HocSinh("12C", "game", "Nguyễn Văn A", 18, "Củ Chi", "091234555");
        HocSinh hocSinh2 = new HocSinh("12C", "gitar", "Nguyễn Văn B", 18, "Nguyễn Huân", "091234551");
        GiaoVien giaoVien1 = new GiaoVien("Toán", "Toán-Tin", "Trần Văn X", 30, "40 Nguyễn Khuyến", "012345678");
        GiaoVien giaoVien2 = new GiaoVien("Anh", "Ngoại Ngữ", "Trần Văn Y", 26, "10 Củ Chi", "012345678");
        
        lopHoc.themHocSinh(hocSinh1);
        lopHoc.themHocSinh(hocSinh2);
        lopHoc.themGVGD(giaoVien1);
        lopHoc.themGVGD(giaoVien2);
        
        lopHoc.inDSHS();
        lopHoc.inDSGVGD();
    }
    
}
