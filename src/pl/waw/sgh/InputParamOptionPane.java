package pl.waw.sgh;

import javax.swing.*;

public class InputParamOptionPane {
    public static void main(String[] args) {
        int i = 0;
        // null says we have no object there
        JOptionPane.showMessageDialog(null, "Hello there!");
        String name =
                JOptionPane.showInputDialog(null, "What's your name?");
        String ageStr = JOptionPane.showInputDialog(null, "How old are you?");
        int age = Integer.parseInt(ageStr);
        JOptionPane.showMessageDialog(null, "You are: " + (age - 10));
        // this saves input as int
        int decision =
                JOptionPane.showInternalConfirmDialog(null, "Are you sure? " + name);
        JOptionPane.showMessageDialog(null, "You chose" + decision);
    }
}
