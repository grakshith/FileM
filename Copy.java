package FileM;

import java.nio.file.*;
import java.io.*;
public class Copy
{
    int directories,directories2;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void doCopy(Path path,Path p)throws Exception
    {
        
        File file = new File(path.toString());
        String a[] = file.list();
        if(!Files.exists(p))
        Files.createDirectory(p);
        for(int i=0;i<a.length;i++)
        {
            if(new File(path.resolve(a[i]).toString()).isDirectory())
            {
                Files.createDirectory(p.resolve(a[i]));
                directories++;
                directories2=directories;
            }
            if(!Files.isDirectory(path.resolve(a[i])))                                     
            {
                Files.copy(path.resolve(a[i]),p.resolve(a[i]));
            }   
          
        }
        directories=0;
        if(directories2!=0)
        {
            for(int j=0;j<a.length;j++)
            {
                if(new File(path.resolve(a[j]).toString()).isDirectory()==true)
                {
                        doCopy(path.resolve(a[j]),p.resolve(a[j]));
                }
            }                           
        }
    }
    public void co_file()throws Exception
    {
        System.out.println("Please enter the path of the file to be copied\nEg:C:\\....\\filename.extension");
        String path=br.readLine();
        Path p1 = Paths.get(path);
        System.out.println("Please enter the path where you want to copy file\nEg:C:\\....\\filename.extension");
        String path1=br.readLine();
        Path p2 = Paths.get(path1);
        System.out.println("Please wait while the file is copied");
        if(!Files.exists(p2))
        Files.createDirectory(p2);
        Files.copy(p1, p2.resolve(p1.getFileName()));     
        System.out.println("Successfully copied the folder at "+p2.toString());
    }
    public static void main()throws Exception
    {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Copy:\n1.Files or \n2.Directories(Folders)");
        String s=br1.readLine();
        Copy obj = new Copy();

        if(s.equalsIgnoreCase("1"))
        {
            
            obj.co_file();
                        
        }
        if(s.equalsIgnoreCase("2"))
        {   System.out.println("Please enter the path of the folder to be copied\nEg:C:\\....\\folder");
            Path path = Paths.get(br1.readLine());  
            System.out.println("Please enter the path where you want to copy the folder\nEg:C:\\....\\folder");
            Path p=Paths.get(br1.readLine());
            
            System.out.println("Please wait while the folder is copied");
            obj.doCopy(path,p);
            System.out.println("Successfully copied the folder at "+p.toString());
        }
        
        System.out.println("What do you want to do?\n1.Copy files or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(br1.readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}