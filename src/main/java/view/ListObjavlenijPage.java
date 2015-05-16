package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by M-Book on 16.05.2015.
 */
public class ListObjavlenijPage extends AbstractPage{
    public void showPage () throws IOException {
        System.out.println("list list");

        while (true) {
            String str = readerInput();

            if (str.equals("Exit")){
               closeApp();
            }

            }
        }
    }


