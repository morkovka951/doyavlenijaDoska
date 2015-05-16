package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by M-Book on 16.05.2015.
 */
public class WalcomePage {
    public void showPage () throws IOException {
        System.out.println("Enter user name");
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = reader.readLine();
            if (str.length()>4&&str.length()<20){
                return;
            }else {
                System.out.println("Incorrect enter user name");
            }

        }
    }
}
