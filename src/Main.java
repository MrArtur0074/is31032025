import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main (String[] args){
        FactoryStudent fs = new FactoryStudent();
        Povtas adilet = (Povtas) fs.createPovtasStudent(5423, "Adilet");
        Povtas adilet2 = adilet.copy();

        System.out.println(adilet2);
        System.out.println(adilet);
    }
}