package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by M-Book on 16.05.2015.
 */
public abstract class AbstractPage {
    public abstract void showPage() throws IOException;
    private static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

    public String readerInput() throws IOException {
        reader.readLine();
        return reader.readLine();
    }
    protected void closeApp(){
        if (reader!=null){
            try {
                reader.close();
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                System.exit(0);
            }
        }

    }
}
