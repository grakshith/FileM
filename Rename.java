package FileM;

import java.io.*;
public class Rename
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void re_file()throws Exception
    {
        System.out.println("Please enter the path where you want to rename the file\nEg:C:\\....\\filename.extension");
        String path1=br.readLine();
        File f1=new File(path1);
        System.out.println("Please enter new name including the path");
        String path2=br.readLine();
        File f2=new File(path2);
        boolean t=f1.renameTo(f2);
        System.out.println("Successfully renamed the file "+f1.toString()+" to "+f2.toString());
    }
    public static void main()throws Exception
    {
        Rename obj=new Rename();
        obj.re_file();
        System.out.println("What do you want to do?\n1.Rename files or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}
    