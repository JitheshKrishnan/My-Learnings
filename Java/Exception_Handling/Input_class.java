package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input_class {
    public static void main(String a[]) throws IOException{
        System.out.print("Enter a number: ");

        ///InputStreamReader in = new InputStreamReader(System.in);
        ///BufferedReader bf = new BufferedReader(in);

        ///int num = Integer.parseInt(bf.readLine());

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("The number is: " + num1);

        ///bf.close();  // Checked Exception // Close after using BefferedReader
    }
}
