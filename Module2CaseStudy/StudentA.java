package Module2CaseStudy;

public class StudentA extends Student {
    private double toan;
    private double ly;
    private double hoa;
    private double nghe;

    public StudentA() {

    }

    public StudentA(double toan, double ly, double hoa, double nghe) {
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.nghe = nghe;
    }

    public StudentA(int id, String name, int age, String gender, String address, String email, double toan, double ly, double hoa, double nghe) {
        super(id, name, age, gender, address, email);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.nghe = nghe;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getNghe() {
        return nghe;
    }

    public void setNghe(double nghe) {
        this.nghe = nghe;
    }

    public StudentA(int id, String name, int age, String gender, String email, double van, double su, double dia) {
    }


    public String show() {
        return "Khối A" + "," + "id = " + getId() + "," + "name = " +
                getName() + "," + "age = " +
                getAge() + "," + "gender = " +
                getGender() + "," + "address = " +
                getAddress() + ","+"email = " +
                getEmail() + "," + "toán = " +
                toan + "," + "lý = " +
                ly + "," + "hóa = " +
                hoa + "," + "nghề = " +
                nghe + "\n";
    }
}
