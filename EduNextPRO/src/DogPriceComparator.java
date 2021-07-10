import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phong Linh
 */
public class DogPriceComparator implements Comparator<DogData> {

    @Override
    public int compare(DogData t, DogData t1) {
        if(t.getPrice() > t1.getPrice()){
            return 1;
        }else if(t.getPrice() > t1.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
    
}