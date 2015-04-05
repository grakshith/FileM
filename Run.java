package FileM;

import java.io.*;
import java.nio.file.*;
public class Run
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void run()throws Exception
    {
        System.out.println("Please enter the path of the file to be opened.\n Example: C:\\...\\filename.extension");
        String s=br.readLine();
        if(Files.exists(Paths.get(s)))
        Runtime.getRuntime().exec("cmd.exe & start cmd.exe /k \""+s+"\"");
        else
        throw new FileNotFoundException("The system cannot find the path specified");
    }
    public static void main()throws Exception
    {
        Run obj=new Run();
        obj.run();
        System.out.println("What do you want to do?\n1.Open files\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
        
    }
}