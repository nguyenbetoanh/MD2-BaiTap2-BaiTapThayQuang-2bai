import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner chose = new Scanner(System.in);

        System.out.println("Nhap so muon kiem tra");
        int n = Integer.parseInt(chose.nextLine());

        do {
            System.out.println("**************MENU***************");
            System.out.println("1.In ra các số chẵn và tính tổng trong khoảng 0...n");
            System.out.println("2.In ra các số le và tính tổng trong khoảng 0...n");
            System.out.println("3.Kiểm tra n có phải số nguyên tố không");
            System.out.println("4.Kiểm tra n có phải số hoàn hảo không");
            System.out.println("5.In ra các số nguyên tố trong khoảng 0...n");
            System.out.println("6.In ra các ước số của n và tính tổng");
            System.out.println("7.thoat");

            System.out.println("Hãy nhập số bạn muốn");
            int luaChon = Integer.parseInt(chose.nextLine());
            boolean check;
            switch (luaChon) {
                case 1:
                    int tong = 0;
                    for (int i = 0; i <= n; i++) {
                        if (i % 2 == 0) {
                            tong += i;
                            System.out.println("các số chẵn là " + i);
                        }

                    }
                    System.out.println("tổng các số chẵn là " + tong);

                    break;
                case 2:
                    int tongLe = 0;
                    for (int j = 0; j <= n; j++) {
                        if (j % 2 == 1) {
                            tongLe += j;
                            System.out.println("các số lẻ là " + j);
                        }

                    }
                    System.out.println("tổng các số lẻ là " + tongLe);
                    break;
                case 3:
                    int count = 0;
                    if (n >= 2) {
                        for (int i = 1; i <= n; i++) {
                            if (n % i == 0) {
                                count++;
                            }
                        }
                        if (count == 2) {
                            System.out.println(n + "là số nguyên tố ");
                        } else
                            System.out.println(n + " k là số nguyên tố ");
                    } else
                        System.out.println("nhap 1 so lon hon hoac bang 2");
                    break;
                case 4:
                    int soTong = 0;
                    if (n >= 1) {
                        for (int i = 1; i < n; i++) {
                            if (n % i == 0) {
                                soTong += i;
                            }
                        }
                        if (soTong == n) {
                            System.out.println(n + "là số hoàn hảo ");
                        } else
                            System.out.println(n + " k là số hoàn hảo  ");
                    } else
                        System.out.println("nhap lai ");
                    break;
                case 5:
                    if (n >= 2) {
                        for (int i = 2; i <= n; i++) {
                             check = false;
                            for (int j = 2; j <= Math.sqrt(i); j++) {
                                if (i % j == 0) {
                                    check = true;
                                    break;
                                }
                            }if(!check){
                                System.out.println(i);
                        }
                    }
                        System.out.println("");
                    }

                    break;
                case 6:
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            System.out.println("Các số ước của " + n + "là" + i);
                            sum += 1;
                        }
                    }
                    System.out.println("Tổng các số ước là " + sum);

                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn lại ");
            }
        } while (true);

    }
}

