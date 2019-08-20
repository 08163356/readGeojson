import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        String fileName = "a.txt";
        File file = new File(fileName);
        try{
            file.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
