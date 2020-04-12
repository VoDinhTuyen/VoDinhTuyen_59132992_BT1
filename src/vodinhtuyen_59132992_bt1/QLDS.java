/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodinhtuyen_59132992_bt1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class QLDS implements IQLDS{
    
    private List<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public void themCaNhan(CaNhan caNhan) {
        dsCaNhan.add(caNhan);
    }

    @Override
    public void xoa(String ten) {
        for(CaNhan caNhan: dsCaNhan) {
            if(caNhan.getHoTen().equals(ten)) {
                dsCaNhan.remove(caNhan);
            }
        }
    }

    @Override
    public void inDS() {
       for(CaNhan caNhan: dsCaNhan) {
           caNhan.hienThiTT();
       }
    }
    
}
