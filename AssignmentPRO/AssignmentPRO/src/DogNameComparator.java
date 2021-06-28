
import java.util.Comparator;

public class DogNameComparator implements Comparator<DogData> {

    @Override
    public int compare(DogData t, DogData t1) {
        return t.getDogName().compareTo(t1.getDogName());
    }
    
}
