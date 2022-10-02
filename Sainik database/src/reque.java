
class reque {

    private String name, rank, id, msg, unit,date;

    public reque(String id, String name, String rank, String unit, String msg,String date) {
        this.name = name;
        this.rank = rank;
        this.id = id;
        this.msg = msg;
        this.unit = unit;
        this.date = date;
    }

    reque(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getname() {
        return name;
    }

    public String getrank() {
        return rank;
    }

    public String getid() {
        return id;
    }

    public String getmsg() {
        return msg;
    }

    public String getunit() {
        return unit;
    }
    
    public String getdate() {
        return date;
    }
}

