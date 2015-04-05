package FileM;

import java.util.*;
import java.nio.file.*;
import java.io.*;
public class Directory_List
{
    int files,directories;
    long fileSize;
    public void showDir(Path path)
    {
        try
        {
            String a[]=new File(path.toString()).list();
            System.out.println("Last Modified                     Name                              Size");
            System.out.println("========================================================================");
            for(int i=0;i<a.length;i++)
            {
                Path p=Paths.get(path.toString()+"\\"+a[i]);
                String p1 = p.toString();                
                System.out.print(Files.getLastModifiedTime(p).toString().substring(0,10)+" "+Files.getLastModifiedTime(p).toString().substring(11,19));                            
                if(new File(p1).isDirectory())
                {
                    System.out.print("   DIR");
                    directories++;
                    System.out.print("    "+a[i]);
                }                
                if(!(new File(p1).isDirectory()))
                {
                    System.out.print("          "+a[i]);
                    fileSize+=Files.size(p);
                    for(int j =0;j<(33-a[i].length());j++)
                    System.out.print(" ");
                    
                    System.out.print(Files.size(p)+" bytes");
                    files++;
                }            
                System.out.println();
            }
            System.out.println("\t"+"\t"+files+" Files           "+fileSize+" bytes");
            System.out.println("\t"+"\t"+directories+" Directories     "+new File(path.toString()).getUsableSpace()+" bytes free");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path whose sub-directories and files you wish to display\nEg:C:\\foldername\\...");
        String p = br.readLine();
        Directory_List obj = new Directory_List();
        obj.showDir(Paths.get(p));
        System.out.println("What do you want to do?\n1.View the list offiles or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(br.readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}