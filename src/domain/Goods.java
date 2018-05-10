package domain;

public class Goods {
    private String gid;
    private String gname;
    private double price;
    private String img;
    private String catory;

    public Goods() {
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCatory() {
        return catory;
    }

    public void setCatory(String catory) {
        this.catory = catory;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid='" + gid + '\'' +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", catory='" + catory + '\'' +
                '}';
    }
}
