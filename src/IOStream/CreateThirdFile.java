package IOStream;

import java.io.*;
import java.util.Locale;

public class CreateThirdFile {
    public static void createThirdFile(File file1, File file2, File out) throws IOException {
        StringBuilder builderOne = new StringBuilder();
        StringBuilder builderTwo = new StringBuilder();
        String one = "";
        String two = "";
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            for (; (one = reader1.readLine()) != null; ) {
                builderOne.append(one);
            }
            for (; (two = reader2.readLine()) != null; ) {
                builderTwo.append(two);
            }
            one = builderOne.toString().toLowerCase(Locale.ROOT);
            two = builderTwo.toString().toLowerCase(Locale.ROOT);

            String[] arrayOne = one.split(" ");
            String[] ArrayTwo = two.split(" ");

            StringBuilder toFile = new StringBuilder();
            for (int i = 0; i < arrayOne.length; i++) {
                for (int j = 0; j < ArrayTwo.length; j++) {
                    if (arrayOne[i].equals(ArrayTwo[j])) {
                        toFile.append(arrayOne[i]).append(" ");
                    }
                }
            }
            writeInFile(toFile.toString(), out);
        }
    }

    public static void writeInFile(String string, File out) throws IOException {
        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println(string);
        }
    }
}
