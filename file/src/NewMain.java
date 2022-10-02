
import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        File file = new File("Students.txt");

        try {

            file.createNewFile();

            Formatter form = new Formatter("E:/3rd Semi/NetBeansProjects/file/Student.txt");

            /*System.out.print("Enter Total Number Of Student : ");
            int num = scan.nextInt();*/

            for (int i = 1; i <= 3; i++) {

                String name = JOptionPane.showInputDialog(null, "Enter Your Full Name ", "Studemt[" + i + "]", -1);

                String id = JOptionPane.showInputDialog(null, "Enter Your Class Roll Number ", "Studemt[" + i + "]", -1);

                String reg = JOptionPane.showInputDialog(null, "Enter Your Registration Number ", "Studemt[" + i + "]", -1);

                form.format(i + ".\r\nName : %s\r\nRoll : %s\r\nReg : %s\r\n\r\n\n", name, id, reg);
            }

            form.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, file);
    }

}
