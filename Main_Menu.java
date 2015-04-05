package FileM;

import java.io.*;

public class Main_Menu
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[])throws Exception/*To call the other methods based on the user's input*/
    {

System.out.println("           ***********************************          *******         *******                                 ****************************");
System.out.println("           ***********************************          *******         *******                                 ****************************");
System.out.println("           ***********************************          *******         *******                                 ****************************");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 ***********************");
System.out.println("           *********************                        *******         *******                                 ***********************");
System.out.println("           *********************                        *******         *******                                 *******");
System.out.println("           *********************                        *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         *******                                 *******");
System.out.println("           *******                                      *******         ***********************************     ****************************");
System.out.println("           *******                                      *******         ***********************************     ****************************");
System.out.println("           *******                                      *******         ***********************************     ****************************");
        
        System.out.println();
        
        
System.out.println("           **************                     **************               ***********                     *******             ******                ***********              ");           
System.out.println("           ***************                   ***************              *************                    ********            ******               *************             ");         
System.out.println("           ****************                 ****************             ******* *******                   *********           ******              ******* *******            ");         
System.out.println("           *****************               *****************            *******   *******                  **********          ******             *******   *******           ");         
System.out.println("           ******************             ******************           *******     *******                 ****** ****         ******            *******     *******          ");         
System.out.println("           ************** ****           **** **************          *******       *******                ******  ****        ******           *******       *******           ");       
System.out.println("           **************  ****         ****  **************         *******         *******               ******   ****       ******          *******         *******         ");        
System.out.println("           **************   ****       ****   **************        *************************              ******    ****      ******         *************************       ");         
System.out.println("           **************    ****     ****    **************       ***************************             ******     ****     ******        ***************************       ");        
System.out.println("           **************     ****   ****     **************      *******               *******            ******      ****    ******       *******               *******     ");        
System.out.println("           **************      *********      **************     *******                 *******           ******       ****   ******      *******                 *******    ");         
System.out.println("           **************                     **************    *******                   *******          ******        ****  ******     *******                   *******   ");         
System.out.println("           **************                     **************   *******                     *******         ******         **** ******    *******                     *******  ");         
System.out.println("           **************                     **************  *******                       *******        ******          **********   *******                       *******");          

      
      

System.out.println("                                    ********************             ******************          ************");
System.out.println("                                    ********************             ******************          *************");
System.out.println("                                    ****            ****             ****                        ***        ***");
System.out.println("                                    ****            ****             ****                        ***        ***");
System.out.println("                                    ****            ****             ****                        ***         **");
System.out.println("                                    ****            ****             ****                        ***         **");
System.out.println("                     ********       ****                             ****                        ***        ***");
System.out.println("                     ********       ****                             ************                ***       ***");
System.out.println("                                    ****    ************             ****                        ************");
System.out.println("                                    ****    ************             ****                        ******");
System.out.println("                                    ****            ****             ****                        ***   **");
System.out.println("                                    ****            ****             ****                        ***     **");
System.out.println("                                    ********************             ******************          ***       **");   
System.out.println("                                    ********************             ******************          ***         **");



System.out.println("                                                         Version 1.0.0");
        
        for(int i=-99999999;i<999999999;i++);for(int i=-99999999;i<999999999;i++);for(int i=-99999999;i<999999999;i++);
        //System.out.println("\f");
        System.out.println("Select an option:");
        System.out.println("1.Create\n2.Delete\n3.Copy\n4.Move\n5.Rename\n6.List of directory\n7.Run\n8.View/Edit File Attributes\n9.Edit\n10.Exit");
        String s =br.readLine();
        int a=Integer.parseInt(s);
        switch(a)
        {
            case 1:Create.main();break;                   
            case 2:Delete.main();break;
            case 3:Copy.main();break;
            case 4:Move.main();break;
            case 5:Rename.main();break;
            case 6:Directory_List.main();break;
            case 7:Run.main();break;
            case 8:FileAttribute.main();break;
            case 9:Edit.main();break;
            case 10:System.exit(0);
            default: System.err.println("Wrong input");
            main(args);
        }
    }
}
                   
                   