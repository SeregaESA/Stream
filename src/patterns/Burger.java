package patterns;

public class Burger {

    private String bulka;
    private String cotleta;
    private String sous;
    private String componenty;

    public Burger(String bulka, String cotleta, String sous, String componenty) {
        this.bulka = bulka;
        this.cotleta = cotleta;
        this.sous = sous;
        this.componenty = componenty;
    }

    public String getBulka() {
        return bulka;
    }

    public void setBulka(String bulka) {
        this.bulka = bulka;
    }

    public String getCotleta() {
        return cotleta;
    }

    public void setCotleta(String cotleta) {
        this.cotleta = cotleta;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public String getComponenty() {
        return componenty;
    }

    public void setComponenty(String componenty) {
        this.componenty = componenty;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bulka='" + bulka + '\'' +
                ", cotleta='" + cotleta + '\'' +
                ", sous='" + sous + '\'' +
                ", componenty='" + componenty + '\'' +
                '}';
    }
}
