package Module2CaseStudy;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void menu() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************************************************************");
            System.out.println("*** CHÀO MỪNG BẠN ĐÃ ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ***");
            System.out.println("* - 1.Thêm sinh viên - - - - - - - - - - - - - - - - - - - - -*");
            System.out.println("* - 2.Sửa sinh viên - - - - - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 3.Xóa sinh viên - - - - - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 4.Sắp xếp sinh viên - - - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 5.Tìm sinh viên theo id - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 6.Tìm sinh viên gần đúng theo tên - - - - - - - - - - - - *");
            System.out.println("* - 7.Ghi - - - - - - - - - - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 8.Đọc - - - - - - - - - - - - - - - - - - - - - - - - - - *");
            System.out.println("* - 9.Hiển thị - - - - - - - - - - - - - - - - - - - - - - - -*");
            System.out.println("* - 10.Điểm trung bình sinh viên - - - - - - - - - - - - - - -*");
            System.out.println("* - 11.Học lực của sinh viên - - - - - - - - - - - - - - - - -*");
            System.out.println("* - 12.Exit  - - - - - - - - - - - - - - - - - - - - - - - - -*");
            System.out.println("***************************************************************");
            System.out.println("===> MỜI BẠN NHẬP XUỐNG ĐÂY : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("--- HÃY CHỌN SINH VIÊN THEO KHỐI BẠN MONG MUỐN ---");
                        System.out.println("--- 1.Khối A -------------------------------------");
                        System.out.println("--- 2.Khối B -------------------------------------");
                        System.out.println("--- 3.Exit ---------------------------------------");
                        int choose = Integer.parseInt(scanner.nextLine());
                        if (choose == 3) {
                            break;
                        }
                        switch (choose) {
                            case 1:
                                Manager.addA();
                                break;
                            case 2:
                                Manager.addC();
                                break;
                        }
                    }
                    break;
                case 2:
                    Manager.edit();
                    Manager.write();
                    break;
                case 3:
                    Manager.remove();
                    Manager.write();
                    break;
                case 4:
                    Manager.sort();
                    Manager.write();
                    break;
                case 5:
                    Manager.search();
                    break;
                case 6:
                    Manager.searchName();
                    break;
                case 7:
                    Manager.write();

                    break;
                case 8:
                    Manager.read();

                    break;
                case 9:
                    Manager.show();
                    break;
                case 10:
                    Manager.pointTB();
                    break;
                case 11:
                    Manager.academicAbility();
                    break;
                case 12:
                    System.exit(0);
            }
        }
    }
}

