
import java.io.*;
import java.util.*;

class student {

    public int id;
    public String name;
    public double total_mark;
    private double phy_mark, che_mark, math_mark;

    student(int id_no, String stu_name, double p_mark, double c_mark, double m_mark) {

        this.id = id_no;
        this.name = stu_name;
        this.total_mark = p_mark + c_mark + m_mark;

    }
}

class studentcompare implements Comparator<student> {

    public int compare(student s1, student s2) {
        
        if (s1.total_mark == s2.total_mark) {
            return 0;
        } else if (s1.total_mark < s2.total_mark) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Student_Comparator {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String input_path = "C:\\Users\\khanm\\Desktop\\Java\\helloworld\\src\\input.txt";
        String output_path = "C:\\Users\\khanm\\Desktop\\Java\\helloworld\\src\\output.txt";

        int n = 0;
        int id = 0;
        String name = "";
        double p = 0.0, c = 0.0, m = 0.0;

        ArrayList<student> stu = new ArrayList<student>();

        File file = new File(input_path);
        Scanner read = new Scanner(file);

        int count = 0;
        while (read.hasNext()) {
            String reader = read.nextLine();
            if (count == 0) {
                count++;
            } else {
                String arr[] = reader.split(" ");

                id = Integer.parseInt(arr[0]);

                name = arr[1];

                p = Double.parseDouble(arr[2]);
                c = Double.parseDouble(arr[3]);
                m = Double.parseDouble(arr[4]);

                stu.add(new student(id, name, p, c, m));
            }

            System.out.println(reader);
        }

        Collections.sort(stu, new studentcompare());

        String w, filecontent= "";

        for (student STU : stu) {
            w = "StidentName: " + STU.name + " ID: " + STU.id + " Total_marks: " + STU.total_mark;

            filecontent = filecontent+ w + "\n";

            System.out.println(w);

        }
        
        FileWriter writer  = new FileWriter(output_path);
        writer.write(filecontent);
        writer.close();
    }

}
