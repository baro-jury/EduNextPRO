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
public class DogNameComparator implements Comparator<DogData> {

    @Override
    public int compare(DogData t, DogData t1) {
        return t.getDogName().compareTo(t1.getDogName());
    }
    
}
