package domain;

public class GoodCatory {
    private String catory;//类别id
    private String catoryname;

    public GoodCatory() {
    }

    public String getCatory() {
        return catory;
    }

    public void setCatory(String catory) {
        this.catory = catory;
    }

    public String getCatoryname() {
        return catoryname;
    }

    public void setCatoryname(String catoryname) {
        this.catoryname = catoryname;
    }

    @Override
    public String toString() {
        return "GoodCatory{" +
                "catory='" + catory + '\'' +
                ", catoryname='" + catoryname + '\'' +
                '}';
    }
}
