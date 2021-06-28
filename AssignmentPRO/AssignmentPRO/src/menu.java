
import java.util.Scanner;

public class menu{

     public static void main (String[] args) {
        Dog call1 = new Dog();
        PetDog call= new PetDog();
        boolean check=true;
        Scanner in=new Scanner(System.in);
        while (check) {
            System.out.println("1. TC = 1 - List PetDogs");
            System.out.println("2. TC = 2 - add new PetDog");
            System.out.println("3. TC = 3 - remove PetDog by ID");
            System.out.println("4. TC = 4 - Save PetDogs to petdog.txt file");
            System.out.println("5. TC = 5 - List all Dogs ");
            System.out.println("6. TC = 6 - Add new Dog");
            System.out.println("7. TC = 7 - Remove a Dog by ID");
            System.out.println("8. TC = 8 - Update a dog based on its ID");
            System.out.println("9. TC = 9 - Save Dogs to dog.txt file");
            System.out.println("10. TC = 10 - Liet ke tat ca cho theo thu tu tang dan cua ten");
            System.out.println("11. TC = 11 - Liet ke tat ca cho theo thu tu tang dan cua gia ");
            System.out.println("12. TC = 12 - Tim kiem cho dua tren mau sac");
            System.out.println("13. TC = 13 - Tim kiem cho dua tren gia");
            System.out.println("0. Thoat");

            System.out.print("TC: ");
            int choice;
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    call.listAll();
                    break;
                case 2:
                    call.addPet();
                    break;
                case 3:
                    call.removePet();
                    break;
                case 4:
                    call.saveFile();
                    break;
                case 5:
                    call1.listAll();
                    break;
                case 6:
                    call1.addPet();
                    break;
                case 7:
                    call1.removePet();
                    break;
                case 8:
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    call1.updateById(id);
                    call.updateById(id);
                    break;
                case 9:
                    call1.saveFile();
                    break;
                case 10:
                    DogListUtility.ListByName(call1.getList());
                    break;
                case 11:
                    DogListUtility.ListByPrice(call1.getList());
                    break;
                case 12:
                    System.out.printf("Enter the color: ");
                    String color=sc.nextLine();
                    DogListUtility.FingByColor(call1.getList(), color);
                    break;    
                case 13:
                    System.out.println("Enter price range");
                    System.out.print("From: ");
                    double pr1=Double.parseDouble(sc.nextLine());
                    System.out.print("To: ");
                    double pr2=Double.parseDouble(sc.nextLine());
                    DogListUtility.FingByPrice(call1.getList(), pr1, pr2);
                    
                    break;
                case 0: 
                    check=false;
                    break;
                default:
                    System.out.println("only enter number 1->13");
                    break;
            }
        }
     }
    
}
