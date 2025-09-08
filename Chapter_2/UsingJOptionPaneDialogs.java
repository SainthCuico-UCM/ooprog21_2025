import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String nameValue;
        int confirmationValue;

        while (true) {
            nameValue = JOptionPane.showInputDialog(null, "What is your name?");

            if (nameValue == null) {
                System.exit(0);
            }

            if (nameValue.trim().isEmpty()) {
                continue;
            }

            confirmationValue = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
                if (confirmationValue == 0) {
                    JOptionPane.showMessageDialog(null, "Hello, " + nameValue + "!");
                    break;
            } 
        }
    }
}
