
class User {
    private int roll,phn;
    private String name,city;
    
    public User(int roll,String name,String city,int phn){
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.phn = phn;
    }

    User(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getroll(){
        return roll;
    }
    
    public String getname(){
        return name;
    }
    
    public String getcity(){
        return city;
    }
    
    public int getphn(){
        return phn;
    }
}
