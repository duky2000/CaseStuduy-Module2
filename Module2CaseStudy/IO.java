package Module2CaseStudy;

import baitap4.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO {
    static File file = new File("User.csv");
    public static void writeFile() {

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String something = "User,Password";
            bufferedWriter.write(something);
            for (User user : Login.userList) {
                bufferedWriter.newLine();
                bufferedWriter.write(user.disPlay());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public static ArrayList<User> readFile() {
        ArrayList<User> list = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            FileReader  fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new User(arr[0], arr[1]));
            }
        } catch (Exception e) {
            System.err.println("Tài khoản không tồn tại");
        }
        return list;
    }


}


