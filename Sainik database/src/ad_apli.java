
class ad_apli {

    private String name, fr, id, reason, tto,date,dis,rank,unit,appli;

    public ad_apli(String appli,String id, String name, String fr, String reason, String tto,String date,String dis,String rank,String unit) {
        this.name = name;
        this.id = id;
        this.fr = fr;
        this.tto = tto;
        this.reason = reason;
        this.date = date;
        this.dis = dis;
        this.rank = rank;
        this.unit = unit;
        this.appli = appli;
    }



    public String getname() {
        return name;
    }
    public String getappli() {
        return appli;
    }
    public String getrank() {
        return rank;
    }
    
    public String getunit() {
        return unit;
    }
    
    public String getfr() {
        return fr;
    }

    public String getid() {
        return id;
    }

    public String getreason() {
        return reason;
    }

    public String gettto() {
        return tto;
    }
    
    public String getdate() {
        return date;
    }
    public String getdis() {
        return dis;
    }
}

