package IOStream;

import java.io.*;

public class MyFileFilter implements FileFilter {
    private String[] string;

    public MyFileFilter(String... string) {
        this.string = string;
    }

    private boolean check(String str) {
        for (String each : string) {
            if (str.equals(each)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int index = pathname.getName().lastIndexOf(".");
        if (index == -1) {
            return false;
        }
        String str = pathname.getName().substring(index + 1);
        return check(str);
    }

    public static void copyFiles(File in, String out) throws IOException {
        try (FileInputStream fis = new FileInputStream(in);
             FileOutputStream fos = new FileOutputStream(out)) {
            int amount = 0;
            byte[] array = new byte[10_000_00];
            for (int i = 0; i < fis.available(); i++) {
                amount = fis.read(array);
                fos.write(array, 0, amount);
            }
        } catch (IOException e) {

            throw e;
        }
    }
}
