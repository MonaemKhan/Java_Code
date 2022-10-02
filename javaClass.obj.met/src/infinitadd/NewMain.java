
package infinitadd;

class monaem{
    String Name;
    String ID;
    
    void print(){
        System.out.println("Student Name: "+this.Name+"\nID: "+this.ID);
    }
}

public class NewMain {

    public static void main(String[] args) {
        String Student = "Sakib";
        String ID = "2016";
        System.out.println("Student Name: "+Student+"\nID: "+ID);
        
        String Student1 = "Sourob";
        String ID1 = "2016-17";
        System.out.println("Student Name: "+Student1+"\nID: "+ID1);
        
        String Student2 = "Sourob";
        String ID2 = "2016-17";
        System.out.println("Student Name: "+Student2+"\nID: "+ID2);
        
        monaem a = new monaem();
        
        a.Name = "Sakib-obj";
        a.ID = "2016-obj";
        a.print();
        
        a.Name = "Sourob-obj";
        a.ID = "2016-17-obj";
        a.print();
        
        a.Name = "Sourob-obj";
        a.ID = "2016-17-obj";
        a.print();
    }
    
}
