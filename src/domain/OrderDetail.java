package domain;

public class OrderDetail {
    private String odid;
    private String oid;//订单号
    private String gid;//商品号
    private int num;

    public OrderDetail() {
    }

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "odid='" + odid + '\'' +
                ", oid='" + oid + '\'' +
                ", gid='" + gid + '\'' +
                ", num=" + num +
                '}';
    }
}
