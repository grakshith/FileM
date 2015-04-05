package FileM;

import java.nio.file.*;
import java.io.*;
public class Delete
{
    int directories,directories2;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void doDelete(Path p)throws Exception
    {
        
        File file = new File(p.toString());
        String a[] = file.list();
       
        for(int i=0;i<a.length;i++)
        {
            if(new File(p.resolve(a[i]).toString()).isDirectory())
            {
               
                directories++;
                directories2=directories;
            }
            if(!Files.isDirectory(p.resolve(a[i])))                                     
            {
               
                Files.delete(p.resolve(a[i]));
            }            
        }
        directories=0;
        if(directories2!=0)
        {
                                  
            for(int j=0;j<a.length;j++)
            {
                if(new File(p.resolve(a[j]).toString()).isDirectory()==true)
                {
                        
                        doDelete(p.resolve(a[j]));
                        Files.delete(p.resolve(a[j]));
                }
            }                           
        }
        
        System.out.println("Successfully deleted the folder at "+p.toString());
    }
    public void dl_file()throws Exception
    {
        System.out.println("Please enter the path where you want to delete the file\nEg:C:\\....\\filename.extension");
        String path=br.readLine();
        Path p1=Paths.get(path);
        Files.deleteIfExists(p1);
        System.out.println("Successfully deleted the file at "+p1.toString());
    }
    public static void main()throws Exception
    {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Delete:\n1.Files or \n2.Directories(Folders)");
        String s=br1.readLine();
        Delete obj=new Delete();
        if(s.equalsIgnoreCase("1"))
        obj.dl_file();
        if(s.equalsIgnoreCase("2"))
        {
            System.out.println("Please enter the path where you want to delete the folder\nEg:C:\\....\\folder");
            String path=br1.readLine();
            Path temp=Paths.get(path);
            obj.doDelete(temp);
            Files.delete(temp);
        }
        System.out.println("What do you want to do?\n1.Delete files or folders\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(br1.readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
}