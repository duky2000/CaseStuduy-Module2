package Module2CaseStudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static User user;
    public static List<User> userList = IO.readFile();
    static Scanner sc = new Scanner(System.in);
    public static void login() throws Exception {
        while (true) {
            System.out.println("*******************************************************");
            System.out.println("*---------< CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN >----------*");
            System.out.println("*- - - - - - - - - - - - - - - - - - - - - - - - - - -*");
            System.out.println("*- - - - - - - - - 1. Đăng nhập - - - - - - - - - - - *");
            System.out.println("*- - - -  - - - -  2. Đăng ký - - - - - - - - - - - - *");
            System.out.println("*- - - - - - - - - 3. Thoát - - - - - - - - - - - - - *");
            System.out.println("*******************************************************");
            System.out.println("===> Nhấn để tiếp tục :");
            int choice =100;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    System.out.println("**********************************************");
                    System.out.println("Tài Khoản :");
                    String username = sc.nextLine();
                    System.out.println("Mật khẩu");
                    String password = sc.nextLine();
                    boolean login = false;
                    for (User us : userList) {
                        if (us.getUserName().equalsIgnoreCase(username) && us.getPassWord().equals(password)) {
                            login = true;
                            user = us;
                        }
                    }
                    if (login) {
                        Menu.menu();
                    } else {
                        System.err.println("Sai tài khoản hoặc mật khẩu"+"\n"+"Đăng nhập lại");
                    }
                    break;
                case 2:
                    System.out.println("************************************************");
                    System.out.println("Đăng ký người dùng mới");
                    String user = getUserName();
                    String pass = getPassword();
                    userList.add(new User(user, pass));
                    IO.writeFile();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Nhập không đúng mời nhập lại");
            }
        }
    }
    private static String getUserName() {
        while (true) {
            try{
                System.out.println("Tài khoản");
                String username = sc.nextLine();
                if (RegexUserPass.check(username)) {
                    boolean check = false;
                    for (User user : userList) {
                        if (user.getUserName().equalsIgnoreCase(username)) {
                            System.err.println("Tài khoản đã tồn tại");
                            check = true;
                        }
                    }
                    if (!check) {
                        return username;
                    }
                }else throw new Exception();
            }catch (Exception e) {
                System.err.println("Tài khoản phải có ít nhất 1 ký tự");
            }
        }
    }
    private static String getPassword() {
        while (true) {
            try {
                System.out.println("Mật khẩu");
                String password = sc.nextLine();
                if (RegexUserPass.check(password)) {
                    return password;
                }else throw new Exception();
            }catch (Exception e) {
                System.err.println("Mật khẩu phải có ít nhất 1 ký tự");
            }
        }
    }

}
