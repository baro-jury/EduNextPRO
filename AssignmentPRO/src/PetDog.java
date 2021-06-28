import java.io.IOException;
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
public class PetDog implements IPet<PetDogData> {
    
    private List<PetDogData> _list;
    
    public List<PetDogData> getList() {
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
        String id, petName;
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter petname: ");
        petName = sc.nextLine();
        
        PetDogData petdog = new PetDogData(Integer.parseInt(id), petName);
        
        for (PetDogData d : _list) {
            if (d.getID() == petdog.getID()) {
                System.out.println("Dog already existed!");
                return;
            }
        }
        if (_list.contains(petdog)) {
            System.out.println("Dog already existed!");
            return;
        }
        _list.add(petdog);
    }

    public void removePet() {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        boolean check=false;
        for (PetDogData d : _list) {
            if (d.getID() == Integer.parseInt(id)) {
                _list.remove(d);
                check=true;
                break;
            }
        }
        if (!check) System.out.println("PetDog already existed!");
        else System.out.println("Removed");
    }
    

    @Override
    public void saveFile() {
        String out_ = "";
        for (PetDogData d : _list) {
            out_ += d.toString() + "\n\n";
        }
        Path file = Paths.get("petdog.txt");
        try {
            Files.write(file, out_.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Write completed!");
    }

    public PetDog() {
        this._list = new ArrayList<>();
    }

    @Override
    public void addPet(PetDogData dog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePet(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}