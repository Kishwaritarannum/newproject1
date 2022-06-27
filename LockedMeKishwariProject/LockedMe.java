package simplilearnKishwariProject;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{ static final String ProjectFilesPath=("D:\\Day9projects\\LockedMeKishwariProject");
/** This method will display the menu for end users.
 * 
 */
	public static void displayMenu()
	{
		System.out.println("*********************************************************");
		System.out.println("\twelcome to LockedMe.com Secure app");
		System.out.println("\tDeveloped by: Kishwari Tarannum");
		System.out.println("**********************************************************");
		System.out.println("\t1.Display all files");
		System.out.println("\t2.Add a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search file");
		System.out.println("\t5.Exit");
		System.out.println("*********************************************************");
	

	}
	/** This method will retrieve all the files.
	 * 
	 */
     public static void getAllFiles()
     {
       File folder=new File(ProjectFilesPath);
       File[] listOfFile=folder.listFiles();
       
       if(listOfFile.length>0)
       {
    	 System.out.println("FILES LIST IS BELOW:\n");
    	 for(var l:listOfFile)
    	 {
    	  System.out.println(l.getName());
    	 }
       }
       else
       {
    	   System.out.println("The folder is empty");
       }
     }
     
     /** This method will read file details from user 
      *  and create files.
      */
     public static void createFiles()
     {
    	 try
    	 {
    		 Scanner obj=new Scanner (System.in);
    		 String fileName;
    		 System.out.println("Enter file name:");
    		 fileName=obj.nextLine();
    		 
    		 int linesCount;
    		 System.out.println("Enter how many lines in the files:");
    		 linesCount=Integer.parseInt(obj.nextLine());
    		 
    		 FileWriter fw=new FileWriter(ProjectFilesPath+"\\"+fileName+".txt");
    		 //Read line by line from user
    		 for(int i=1;i<=linesCount;i++)
    		 {
    			 System.out.println("Enter file line:");
    			 fw.write(obj.nextLine()+"\n");
    		 }
    		 System.out.println("File Created Successfully");
    		 fw.close();
    	 }
    		 catch(Exception Ex)
    	 {
	}
     }
     public static void deleteFiles()
     {
    	 try
    	 {
    		 Scanner obj=new Scanner(System.in);
    		 String fileName;
    		 System.out.println("Enter file name to be deleted:");
    		 fileName=obj.nextLine();
    //Get all files names into a list
    ArrayList<String> allFilesNames=new ArrayList<String>();
    File folder=new File(ProjectFilesPath);
    File[] listOfFiles=folder.listFiles();
    if(listOfFiles.length>0)
    {
    	System.out.println("FILES LIST IS BELOW:\n");
    	for(var l:listOfFiles)
    	{
    		allFilesNames.add(l.getName());
    	}
    }
     
     File f=new File(ProjectFilesPath+"\\"+fileName);
     if(allFilesNames.contains(fileName))
     {
    	 f.delete();
    	 System.out.println("File deleted Successfully");
     }
     else
     {
    	 System.out.println("File doesnot exists");
     }
     }
    	 catch(Exception Ex)
    	 {
    		 System.out.println("unable to delete file please contact:admin@test.com");
    	 }
     }
     
    	
       public static void searchFiles()
     {
    	 try
    	 {
    		 Scanner obj= new Scanner(System.in);
    		 String fileName;
    		 System.out.println("Enter the file name to be searched:");
    		 fileName=obj.nextLine();
    		//Get all files names into a list
    	     ArrayList<String> allFilesNames=new ArrayList<String>();
    	     File folder=new File(ProjectFilesPath);
    	     
    	     File[] listOfFiles=folder.listFiles();
    	     if(listOfFiles.length>0)
    	     {
    	    	 System.out.println("FILES LIST IS BELOW:\n");
    	    	 for (var l:listOfFiles)
    	    	 {
    	    		 allFilesNames.add(l.getName());
    	    	 }
    	     }
    	     
    	     File f=new File(ProjectFilesPath+"\\"+fileName+".txt");
    	     if(allFilesNames.contains(fileName))
    	    	
    		{
    	    	 System.out.println("file is available");
    	     }
    	     else
    	     {
    	    	 System.out.println("file is not available");
    	     }
    	     
    	 }
    	 catch(Exception Ex)
    	 {
    		 
    	 }
    	 }
     
}

