
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IODog {
    public static<T> void read(String file){
        List<DogData> dog=new ArrayList<>();
        BufferedReader br;
        try{
           br=new BufferedReader(new FileReader(file));
           String line="";
           while((line=br.readLine())!=null){
                String[] s=line.split(";");
                boolean dogGender = Boolean.parseBoolean(s[4].trim());
                double price = Double.parseDouble(s[5].trim());
                DogData d = new DogData(s[0], s[1].trim(), s[2].trim(), 
                       s[3].trim(), dogGender, price, s[6].trim());
                dog.add(d);
           }
           br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
        
        dog.forEach((i) -> {
            System.out.println(i);
        });
        
    }
    
    public static<T> void write(String file,List<T> arr){
        Scanner sc = new Scanner(System.in);
        List<DogData> d=new ArrayList<>();
        
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
        System.out.print("Enter dog gender (true/false): ");
        dogGender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter describe: ");
        describe = sc.nextLine();
            
        d.add(new DogData(id, petID, dogName, dogColor, 
                dogGender, price, describe));
        
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            String line="";
            
            for(DogData i:d){
                line=i.getID()+"; "+i.getPetID()+"; "+i.getDogName()+"; "+
                    i.getDogColor()+"; "+i.isDogGender()+"; "+
                    i.getPrice()+"; "+i.getDesc();
                out.write(line+"\n");
            }
            
            out.close();
        }catch(FileNotFoundException | NumberFormatException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        List<Dog> dog=new ArrayList<>();
        String fileD ="src/dog.txt";
        
        IODog.write(fileD, dog);
        IODog.read(fileD);
        
    }
}
