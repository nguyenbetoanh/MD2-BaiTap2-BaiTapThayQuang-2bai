
//. Thông tinh sinh viên bao gồm: mã sinh viên, tên sinh viên, năm sinh,
//        giới tính, phone, email, địa chỉ. Thực hiện các chức năng theo menu sau:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String student ="";
        String studentName ="";
        int studentAge =0;
        String studentMale ="";
        String studentEmail ="";
        int studentPhone =0;
        String studentAdress ="";

        do{
           System.out.println("*************MENU*****************");
           System.out.println("1. Nhập thông tin sinh viên ");
           System.out.println("2. Hiển thị thông tin sinh viên");
           System.out.println("3. Tính tuổi sinh viên");
           System.out.println("4. Thoát");

           System.out.println("Nhập  số bạn muốn ");
           int chose = Integer.parseInt(input.nextLine());
switch (chose){
    case 1:
        System.out.println("nhap ma hoc sinh!");
        student = input.nextLine();

        System.out.println("nhap ten hoc sinh!");
       studentName = input.nextLine();

        System.out.println("nhap tuoi hoc sinh!");
        studentAge = Integer.parseInt(input.nextLine());

        System.out.println("nhap gioi tinh hoc sinh!");
         studentMale = input.nextLine();

        System.out.println("nhap email hoc sinh!");
        studentEmail = input.nextLine();

        System.out.println("nhap phone hoc sinh!");
        studentPhone = Integer.parseInt(input.nextLine());

        System.out.println("nhap dia chi hoc sinh!");
        studentAdress = input.nextLine();


    case 2:
        System.out.printf("%-1s %-12s %-15s %-10s %1s %-1d \n","Student ID : ",student,"StudenName : ",studentName,"StudentAge: ",studentAge);
        System.out.printf("%-1s %-10b %15s %s %-1s %-15d \n","Student Male : ",studentMale,"Student Email: ",studentEmail,"Student phone: ",studentPhone);
        System.out.println("Address :"+studentAdress);
    case 3:
        System.out.println("tuoi sinh vien la :"+(2023-studentAge));
}
       }while (true);
    }
}