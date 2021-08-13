package IOStream.ThirdTask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        try {
            Group.saveGroupIntoFile(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
