package Module2CaseStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("CaseStudy.csv");

    public Manager() {

    }

    public static void addA() throws Exception {
        int id = importId();
        String name = importName();
        int age = importAge();
        String gender = importGender();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        String email = importEmail();
        double toan = importToan();
        double ly = importLy();
        double hoa = importHoa();
        double nghe = importNghe();
        students.add(new StudentA(id, name, age, gender, address, email, toan, ly, hoa, nghe));
        write();
    }


    public static void addC() throws Exception {
        int id = importId();
        String name = importName();
        int age = importAge();
        String gender = importGender();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        String email = importEmail();
        double van = importVan();
        double su = importSu();
        double dia = importDia();
        double vung = importVung();
        students.add(new StudentC(id, name, age, gender, address, email, van, su, dia, vung));
    }

    private static int importId() {
        while (true) {
            try {
                System.out.println("nhập id ");
                int id = Integer.parseInt(scanner.nextLine());
                boolean check = true;
                if (check) {
                    return id;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("id phải là số ");
            }
        }
    }

    private static String importName() {
        while (true) {
            try {
                System.out.println("nhập tên : ");
                String name = scanner.nextLine();
                if (RegexName.check(name)) {
                    return name;
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("tên phải là chữ");

            }
        }
    }

    private static int importAge() {
        while (true) {
            try {
                System.out.println("Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 18 ) {
                    throw new Exception();
                } else
                    return age;
            } catch (Exception age) {
                System.err.println("Tuổi phải trên 18  ");

            }
        }
    }

    private static String importGender() {
        while (true) {
            try {
                System.out.println("Nhập giới tính : ");
                String gender = scanner.nextLine();
                if (RegexGender.check(gender)) {
                    return gender;
                } else throw new Exception();

            } catch (Exception e) {
                System.err.println("Giới tính phải là nam hoặc nữ");
            }
        }
    }

    private static String importEmail() {
        while (true) {
            try {
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                if (RegexEmail.check(email)) {
                    boolean checkMail = true;
                    for (Student sv : students) {
                        if (sv.getEmail().equals(email)) {
                            checkMail = false;
                            break;
                        }
                    }
                    if (checkMail) {
                        return email;
                    } else {
                        System.err.println("Email đã được sử dụng vui lòng nhập lại ");
                    }
                } else {
                    throw new Exception();

                }

            } catch (Exception e) {
                System.err.println("Email bắt buộc phải viết đúng quy định");
            }
        }

    }

    private static double importToan() {
        while (true) {
            try {
                System.out.println("Nhập điểm toán");
                double toan = Double.parseDouble(scanner.nextLine());
                if (toan > 10 ) {
                    throw new Exception();
                } else
                    return toan;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importLy() {
        while (true) {
            try {
                System.out.println("Nhập điểm lý");
                double ly = Double.parseDouble(scanner.nextLine());
                if (ly > 10 ) {
                    throw new Exception();
                } else
                    return ly;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importHoa() {
        while (true) {
            try {
                System.out.println("Nhập điểm hóa");
                double hoa = Double.parseDouble(scanner.nextLine());
                if (hoa > 10) {
                    throw new Exception();
                } else
                    return hoa;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importNghe() {
        while (true) {
            try {
                System.out.println("Nhập điểm nghề");
                double nghe = Double.parseDouble(scanner.nextLine());
                if (nghe > 3 ) {
                    throw new Exception();
                } else
                    return nghe;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 2");

            }
        }
    }

    private static double importVan() {
        while (true) {
            try {
                System.out.println("Nhập điểm văn");
                double van = Double.parseDouble(scanner.nextLine());
                if (van > 10 ) {
                    throw new Exception();
                } else
                    return van;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importSu() {
        while (true) {
            try {
                System.out.println("Nhập điểm sử");
                double su = Double.parseDouble(scanner.nextLine());
                if (su > 10) {
                    throw new Exception();
                } else
                    return su;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importDia() {
        while (true) {
            try {
                System.out.println("Nhập điểm địa");
                double dia = Double.parseDouble(scanner.nextLine());
                if (dia > 10 ) {
                    throw new Exception();
                } else
                    return dia;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 10");
                ;
            }
        }
    }

    private static double importVung() {
        while (true) {
            try {
                System.out.println("Nhập điểm vùng");
                double vung = Double.parseDouble(scanner.nextLine());
                if (vung > 2 ) {
                    throw new Exception();
                } else
                    return vung;
            } catch (Exception e) {
                System.err.println("Điểm phải nhỏ hơn 2");

            }
        }
    }

    public static void edit() {
        System.out.println("Nhập id muốn sửa ");
        int checkId = Integer.parseInt(scanner.nextLine());
        int id = importId();
        String name = importName();
        int age = importAge();
        String gender = importGender();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        String email = importEmail();
        Student student = new Student();

        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == checkId) {
                student = students.get(i);
                index = i;
            }
        }
        if (index >= 0) {

            if (student instanceof StudentA) {

                double toan = importToan();
                double ly = importLy();
                double hoa = importHoa();
                double nghe = importNghe();
                StudentA studentA = new StudentA(id, name, age, gender, address, email, toan, ly, hoa, nghe);
                students.set(index, studentA);
            } else if (student instanceof StudentC) {
                double van = importVan();
                double su = importSu();
                double dia = importDia();
                double vung = importVung();
                StudentC studentC = new StudentC(id, name, age, gender, address, email, van, su, dia, vung);
                students.set(index, studentC);
            }

        } else {
            System.err.println("Không có sinh viên");
        }
    }

    public static void remove() {
        System.out.println("Nhập id muốn xóa ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                index = i;
                System.out.println("Bạn có chắc muốn xóa không ? ");
                System.out.println("1. Không");
                System.err.println("2. Có");
                int check = Integer.parseInt(scanner.nextLine());
                if (check >= 0) {
                    students.remove(index);

                }

            }
        }
        if (index == -1) {
            System.err.println("Id không hợp lệ");
        }
    }

    public static void sort() {
        students.sort(Comparator.comparing(Student::getId));
    }

    public static void search() {
        System.out.println("Nhập id sinh viên muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Student sv : students) {
            if (sv.getId() == id) {
                check = true;
                System.out.println(sv.show());
                break;
            }
        }
        if (check) {
            return;
        } else
            System.err.println("Id không hợp lệ");
    }

    public static void searchName() {
        System.out.println("Nhập tên sinh viên muốn tìm gần đúng");
        String name = scanner.nextLine();
        boolean check = false;
        for (Student sv : students) {
            if (sv.getName().contains(name)) {
                check = true;
                System.out.println(sv.show());
            }
        }
        if (check) {
            return;
        } else
            System.err.println("Không có tên bạn muốn tìm");
    }

    public static void write() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
    }


    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Student> arrayList = (ArrayList<Student>) objectInputStream.readObject();
        for (Student sv : arrayList) {
            System.out.println(sv.show());
        }
        objectInputStream.close();
    }

    public static void pointTB() {
        System.out.println("Nhập id sinh viên bạn muốn tính điểm trung bình ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Student sv : students) {
            if (sv.getId() == id) {
                check = true;
                if (sv instanceof StudentA) {
                    System.out.println("Điểm sinh viên khối A là : " + (((StudentA) sv).getToan() + ((StudentA) sv).getLy() + ((StudentA) sv).getHoa() + ((StudentA) sv).getNghe()) / 3);
                }
                if (sv instanceof StudentC) {
                    System.out.println("Điểm sinh viên khối C là : " + (((StudentC) sv).getVan() + ((StudentC) sv).getSu() + ((StudentC) sv).getDia() + ((StudentC) sv).getVung()) / 3);
                }
            }
        }
        if (check == false) {
            System.err.println("Không có id sinh viên bạn muốn tính điểm trung bình");
        }

    }

    public static void academicAbility() {
        System.out.println("Nhập id sinh viên bạn muốn tính học lực ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Student sv : students) {
            if (sv.getId() == id) {
                check = true;
                if (sv instanceof StudentA) {
                    double b = (((StudentA) sv).getToan() + ((StudentA) sv).getLy() + ((StudentA) sv).getHoa() + ((StudentA) sv).getNghe()) / 3;
                    if (b > 0 && b < 5) {
                        System.out.println("Sinh viên khối A có học lực yếu");
                    } else if (b >= 5 && b <= 6.5) {
                        System.out.println("Sinh viên khối A có học lực trung bình");
                    } else if (b > 6.5 && b <= 8) {
                        System.out.println("Sinh viên khối A có học lực khá ");
                    } else System.out.println("Sinh viên khối A có học lực giỏi");

                } else if (sv instanceof StudentC) {
                    double c = (((StudentC) sv).getVan() + ((StudentC) sv).getSu() + ((StudentC) sv).getDia() + ((StudentC) sv).getVung()) / 3;
                    if (c > 0 && c < 5) {
                        System.out.println("Sinh viên khối C có học lực yếu");
                    } else if (c >= 5 && c <= 6.5) {
                        System.out.println("Sinh viên khối C có học lực trung bình");
                    } else if (c > 6.5 && c <= 8) {
                        System.out.println("Sinh viên khối C  có học lực khá ");
                    } else System.out.println("Sinh viên khối C có học lực giỏi");

                }
            }

        }
        if (check == false) {
            System.err.println("Không có id sinh viên bạn muốn tính học lực ");
        }
    }


    public static void show()throws Exception {
        read();
    }


}
