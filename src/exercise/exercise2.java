package exercise;

import java.util.Scanner;

import java.util.Arrays;
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum=0;

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum+=array[i];
        }
            double average= (double) sum/size;
        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("Gia tri nho nhat trong mang: " + min);
        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Trung binh cong cac phan tu trong mang: " + average);
        
        Arrays.sort(array);

        System.out.print("Cac phan tu trong mang sau khi sap xep tang dan: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
        
}
