package root;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
       try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("x")))
        {
            Double[] a = {-5.0, 3.0, -4.0, 3.0, -3.0, 3.0, -2.0, 2.0, 0.0, 0.0, 1.0, 1.0, 2.0, 2.0, 3.0, 3.0};
            for(int i = 0; i < a.length; i++)
            {
                dos.writeDouble(a[i]);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
