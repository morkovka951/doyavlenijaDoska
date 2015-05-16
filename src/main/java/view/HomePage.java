package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by M-Book on 16.05.2015.
 */
public class HomePage extends AbstractPage{
        public void showPage  () throws IOException {
            System.out.println("1-  Objavlenie");
            System.out.println("2-  Objavlenie in rybrik");
            System.out.println("3-  Objavlenie avtora");
            System.out.println("4-  Create new Objavlenie");
            System.out.println("5-  Update you Objavlenie");
            System.out.println("6-  Delete you Objavlenie");
            System.out.println();
            System.out.println("Enter number");

            while (true) {
                String str = readerInput();
                //NaN
                int num = Integer.valueOf(str);
                switch (num){
                    case 1: new ListObjavlenijPage().showPage();
                        break;
                    case 2: ;
                        break;
                    case 3: ;
                        break;
                    case 4: ;
                        break;
                    case 5: ;
                        break;
                    case 6: ;
                        break;
                }


            }
        }
    }

