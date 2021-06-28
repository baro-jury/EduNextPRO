
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOPetDog{
    public static<T> void read(String file){
        List<PetDogData> petdog=new ArrayList<>();
        BufferedReader br;
        try{
           br=new BufferedReader(new FileReader(file));
           String line="";
           while((line=br.readLine())!=null){
                String[] s=line.split(";");
                PetDogData pd = new PetDogData(s[0], s[1].trim());
                petdog.add(pd);
           }
           br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
        
        petdog.forEach((i) -> {
            System.out.println(i);
        });
        
    }
    
    public static<T> void write(String file,List<T> arr){
        Scanner sc = new Scanner(System.in);
        List<PetDogData> pd=new ArrayList<>();
        
        String id, petName;
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter pet name: ");
        petName = sc.nextLine();
        
        pd.add(new PetDogData(id, petName));
        
        PrintWriter out;
        try{
            out=new PrintWriter(file);
            String line="";
            
            for(PetDogData i:pd){
                line=i.getID()+"; "+i.getPetName();
                out.write(line+"\n");
            }
            
            out.close();
        }catch(FileNotFoundException | NumberFormatException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        List<PetDog> petdog=new ArrayList<>();
        String filePD ="src/petdog.txt";
        
        IOPetDog.write(filePD, petdog);
        IOPetDog.read(filePD);
    }
}
