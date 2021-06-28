import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class IOFile {
    //doc file
    public static <T> List<T> read(String file){
        List<T> list=new ArrayList<>();
        try{
            ObjectInputStream o=new ObjectInputStream(
                    new FileInputStream(file));
            list=(List<T>)o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    //ghi vao file
    public static<T> void write(String file,List<T> arr){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void writeString(String file, String content){
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.write(content.getBytes());
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}