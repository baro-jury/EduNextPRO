import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Dog implements IPet<DogData> {

    private List<DogData> _list;
    
    public List<DogData> getList() {
        return _list;
    }

    @Override
    public void listAll() {
        _list.forEach((_dog) -> {
            System.out.println(_dog.toString());
        });
    }

    public void addPet() {
        Scanner sc = new Scanner(System.in);
        String id, petID, dogName, dogColor, describe;
        boolean dogGender;
        double price;
        
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter pet ID: ");
        petID = sc.nextLine();
        System.out.print("Enter dog name: ");
        dogName = sc.nextLine();
        System.out.print("Enter dog color: ");
        dogColor = sc.nextLine();
        System.out.print("Enter dog gender (true/false) (true = female) : ");
        dogGender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter describe: ");
        describe = sc.nextLine();
        
        DogData dog = new DogData(id, petID, dogName, dogColor, dogGender, price, describe);
        
        for (DogData d : _list) {
            if (d.getID().equalsIgnoreCase(dog.getID())) {
                System.out.println("Dog already existed!");
                return;
            }
        }
        if (_list.contains(dog)) {
            System.out.println("Dog already existed!");
            return;
        }
        _list.add(dog);
    }

    public void removePet() {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        boolean check=false;
        for (DogData d : _list) {
            if (d.getID().equalsIgnoreCase(id)) {
                _list.remove(d);
                check=true;
                break;
            }
        }
        if (!check) System.out.println("Dog already existed!");
        else System.out.println("Removed");
    }

    @Override
    public void saveFile() {
        String out_ = "";
        for (DogData d : _list) {
            out_ += d.toString() + "\n\n";
        }
        Path file = Paths.get("src/dog.txt");
        try {
            Files.write(file, out_.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Write completed!");
    }
    
    public Dog() {
        this._list = new ArrayList<>();
    }
    
    @Override
    public void updateById(String id){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).getID().equalsIgnoreCase(id)) {
                _list.remove(i);

                String petID, dogName, dogColor, describe;
                boolean dogGender;
                double price;
        
                System.out.print("Enter pet ID: ");
                petID = sc.nextLine();
                System.out.print("Enter dog name: ");
                dogName = sc.nextLine();
                System.out.print("Enter dog color: ");
                dogColor = sc.nextLine();
                System.out.print("Enter dog gender (true/false) (true = female) : ");
                dogGender = Boolean.parseBoolean(sc.nextLine());
                System.out.print("Enter price: ");
                price = Double.parseDouble(sc.nextLine());
                System.out.print("Enter describe: ");
                describe = sc.nextLine();

                _list.add(new DogData(id, petID, dogName, dogColor, dogGender, price, describe));
                System.out.println("----------------");
                System.out.println("Update successfully!");
                System.out.println();
                break;
            }
        }
    }

    @Override
    public void addPet(DogData dog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePet(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
