
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phong Linh
 */
public class DogListUtility {
    public static void ListByName(List<DogData> list) {
        Collections.sort(list, new DogNameComparator());
        list.forEach((_dog) -> {
            System.out.println(_dog.toString());
        });
    }
    public static void ListByPrice(List<DogData> list) {
        Collections.sort(list, new DogPriceComparator());
        list.forEach((_dog) -> {
            System.out.println(_dog.toString());
        });
    }
    public static DogData FingByColor (List<DogData> list, String color) {
        for (DogData d : list) {
            if (d.getDogColor().equals(color)) {
                return d;
            }
        }
        System.out.println("There's no " + color + " dog");
        return null;
    }
    public static DogData FingByPrice (List<DogData> list, int price) {
        for (DogData d : list) {
            if (d.getPrice() == price) {
                return d;
            }
        }
        System.out.println("There's no dog cost " + price);
        return null;
    }
    public static List<DogData> FingByPrice (List<DogData> list, double FromPrice, double ToPrice) {
        List<DogData> out_ = new ArrayList<>();
        for (DogData d : list) {
            if (d.getPrice() <= ToPrice && d.getPrice() >= FromPrice) {
                out_.add(d);
            }
        }
        if (out_.size() > 0) {
            return out_;
        }
        System.out.println("There's no dog cost from " + FromPrice + " to " + ToPrice);
        return null;
    }
}
