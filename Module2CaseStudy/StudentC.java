package Module2CaseStudy;

public class StudentC extends Student {
    private double van;
    private double su;
    private double dia;
private double vung;
    public StudentC() {

    }

    public StudentC(double van, double su, double dia, double vung) {
        this.van = van;
        this.su = su;
        this.dia = dia;
        this.vung = vung;
    }

    public StudentC(int id, String name, int age, String gender, String address, String email, double van, double su, double dia, double vung) {
        super(id, name, age, gender, address, email);
        this.van = van;
        this.su = su;
        this.dia = dia;
        this.vung = vung;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getVung() {
        return vung;
    }

    public void setVung(double vung) {
        this.vung = vung;
    }

    public String show() {
        return"Khối C"+","+"id = "+getId()+","+"name = "+
                getName()+","+"age = "+
                getAge()+","+"gender = "+
                getGender()+","+"address = "+
                getAddress()+","+"email = "+
                getEmail()+","+ "văn = "+
                van+","+"sử = "+
                su+","+"địa = "+
                dia+","+ "vùng ="+
                vung+"\n";
    }

}

