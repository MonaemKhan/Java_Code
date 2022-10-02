
class User {
    private String name,rank,phn,address,unit,region;
    
    public User(String name,String rank,String phn,String address,String unit,String region){
        this.name = name;
        this.rank = rank;
        this.phn = phn;
        this.address = address;
        this.unit = unit;
        this.region = region;
    }

    User(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getname(){
        return name;
    }
    
    public String getrank(){
        return rank;
    }
    
    public String getphn(){
        return phn;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getunit(){
        return unit;
    }
    
    public String getregion(){
        return region;
    }
}
