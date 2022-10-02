package javaap2;

import javax.swing.JOptionPane;

public class JavaAp2 {

    public static void main(String[] args) {

        String s = "M0N@3MKH@N";

        for (int i = 0; i <= 3; i++) {

            if (i == 3) {
                JOptionPane.showMessageDialog(null, "Suspecious Warning You Are Blocked !", "Unkhown User", 2);
                break;
            }

            String s1 = JOptionPane.showInputDialog(null, "Enter Your Pasword", "input", 1);

            if (s1.equals(s)) {
                JOptionPane.showConfirmDialog(null, "WOW Fuck", "Matched", JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_OPTION);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Oh! No fuck", "Warning", JOptionPane.ERROR_MESSAGE);

                int c = JOptionPane.showConfirmDialog(null, "Do u Want to Try Again ?", "Warning", JOptionPane.YES_NO_OPTION);

                if (c == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Thank You");
                    break;
                }
            }

        }
    }
}
