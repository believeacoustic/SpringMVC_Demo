package domain;

import java.util.Date;

public class Order {
    private String oid;
    private String uname;
    private Date otime;

    public Order() {
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", uname='" + uname + '\'' +
                ", otime=" + otime +
                '}';
    }
}
