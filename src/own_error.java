import java.net.PasswordAuthentication;
import java.util.Random;

public class InsecureRandom {

    public void test() throws Exception {

        Random ranGen = new Random();
        byte[] bytes = new byte[20];
        ranGen.nextBytes(bytes);

        PasswordAuthentication pa = new PasswordAuthentication("username", // Defect here.
            new String(bytes).toCharArray());
    }
}
