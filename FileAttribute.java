package FileM;

import java.nio.file.*;
import java.io.*;
public class FileAttribute
{
    String readonly,hidden,system,archive;
    public void getAttrib(Path p)throws Exception
    {
        System.out.println("Read Only : "+(Boolean)Files.getAttribute(p,readonly));
        System.out.println("Hidden : "+(Boolean)Files.getAttribute(p,hidden));
        System.out.println("System File : "+(Boolean)Files.getAttribute(p,system));
        System.out.println("Archive : "+(Boolean)Files.getAttribute(p,archive));
    }
    public void setAttrib(Path p, String attribute, boolean t)throws Exception
    {
        Files.setAttribute(p,attribute,t);
    }
    public static void main()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the path where you want to view/edit the file attribute");
        String path = br.readLine();
        Path p = Paths.get(path);
        System.out.println("1.View the file attributes\n2.Edit the file attributes");
        int choice = Integer.parseInt(br.readLine());
        FileAttribute obj = new FileAttribute();
        switch(choice)
        {
            case 1:obj.getAttrib(p);
                    break;
            case 2:System.out.println("Available attributes are "+obj.readonly+"\n"+obj.hidden+"\n"+obj.system+"\n"+obj.archive);
                    System.out.println("Enter 'true' to set the attribute or 'false' to erase the attribute");
                    System.out.println("Enter your choice");
                    String c = br.readLine();
                    boolean t =Boolean.parseBoolean(br.readLine());
                    obj.setAttrib(p,c,t);
        }
        System.out.println("What do you want to do?\n1.View file or folder attributes\n2.Return to Main menu\n3.Exit");
        switch(Integer.parseInt(br.readLine()))
        {   
            case 1: main();break;
            case 2: String args[]=null;
                Main_Menu.main(args);break;
            case 3:System.exit(0);
        }
    }
    public FileAttribute()
    {
        readonly = "dos:readonly";
        hidden = "dos:hidden";
        system = "dos:system";
        archive = "dos:archive";
    }
}