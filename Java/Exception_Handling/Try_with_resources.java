package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_with_resources{
    public static void main(String a[]) throws IOException{
        int num = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }

        int num1;
        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))){
            num1 = Integer.parseInt(br1.readLine());
        }
    }
}