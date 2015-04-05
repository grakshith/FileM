package FileM;

import java.io.*;
import java.nio.file.*;
public class Edit
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void run()throws Exception
    {
        System.out.println("Please enter the path of the file to edit.\n Example: C:\\...\\filename.extension");
        String s=br.readLine();
        Runtime.getRuntime().exec("notepad.exe "+s);
    }
    public static void main()throws Exception
    {
        Edit obj=new Edit();
        obj.run();
        System.out.println("What do you want to do?\n1.Edit files or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}