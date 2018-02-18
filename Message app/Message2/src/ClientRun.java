import javax.swing.*;

public class ClientRun {

    public static void main(String[] args) {
        Client hunor;
        hunor = new Client("127.0.0.1");
        hunor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hunor.startRunning();
    }
}
