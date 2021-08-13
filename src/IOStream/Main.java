package IOStream;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MyFileFilter myFF = new MyFileFilter("docx", "pdf");
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Misha\\Misha\\Резюме");
        File folder = new File("C:\\Users\\Lenovo\\Desktop\\Folder" + file.getName());
        File[] array = file.listFiles(myFF);
        for (File each : array) {
            try {
                MyFileFilter.copyFiles(each, "C:\\Users\\Lenovo\\Desktop\\Folder\\Folder" + each.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file1 = new File("C:\\Users\\Lenovo\\Desktop\\Folder\\One.txt");
        File file2 = new File("C:\\Users\\Lenovo\\Desktop\\Folder\\Two.txt");
        File file3 = new File("C:\\Users\\Lenovo\\Desktop\\Folder\\Third.txt");

        try {
            CreateThirdFile.createThirdFile(file1, file2, file3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
