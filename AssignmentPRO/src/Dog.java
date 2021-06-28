import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        int price;
        
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
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Enter describe: ");
        describe = sc.nextLine();
        
        DogData dog = new DogData(Integer.parseInt(id), Integer.parseInt(petID), dogName, dogColor, dogGender, price, describe);
        
        for (DogData d : _list) {
            if (d.getID() == dog.getID()) {
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
            if (d.getID() == Integer.parseInt(id)) {
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
        IOFile.writeString("../dog.txt", out_);
        System.out.println("Write completed!");
    }
    
    public void searchColor(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entrer the color");
                    String color;
                    color= sc.nextLine();
                    for (DogData u : _list){
                        if (u.DogColor== color) System.out.println(u.toString());
                    }
    }
    
    public void searchByPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entrer the Price: ");
                    int Pr;
                    Pr = Integer.parseInt(sc.nextLine());
                    for (DogData u : _list){
                        if (u.Price== Pr) System.out.println(u.toString());
                    }
    }
    
    public Dog() {
        this._list = new ArrayList<>();
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
