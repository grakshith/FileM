package FileM;

import java.io.*;
import java.nio.file.*;
import java.nio.*;
import static java.nio.file.StandardCopyOption.*;

public class Create
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void cr_file()throws Exception//To create a file
    {
        System.out.println("Please enter the path where you want to create the file\nEg:C:\\....\\filename.extension");
        String path=br.readLine();
        if(!path.equalsIgnoreCase("exit"))
        {File f1=new File(path);
        f1.createNewFile();}
    }
    public void cr_dir()throws Exception//To create a directory
    {
        System.out.println("Please enter the path where you want to create the folder\nEg: C:\\...\\folder name");
        String dir1=br.readLine();
        if(!dir1.equalsIgnoreCase("exit"))
        new File(dir1).mkdir();
    }
    public static void main()throws Exception//The method that is invoked by the main funtion of Main_Menu class
    {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Create:\n1.Files or \n2.Directories(Folders)");
        String s=br1.readLine();
        Create obj=new Create();
        if(s.equalsIgnoreCase("1"))
        obj.cr_file();
        if(s.equalsIgnoreCase("2"))
        obj.cr_dir();
        System.out.println("What do you want to do?\n1.Create files or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(br1.readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}