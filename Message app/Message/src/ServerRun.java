import javax.swing.*;

public class ServerRun {

    public static void main(String[] args) {
        Server hunor = new Server();
        hunor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hunor.startRunning();
    }
}
