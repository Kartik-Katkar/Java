// create a file 

// create a class test 
// import java.io;
// import java.io.File;  
// import java.io.IOException;
// public class testtheory{
     

// public static void main(String[] args)   
// {     
// File file = new File("D:\\demo\\music.txt"); //initialize File object and passing path as argument  
// boolean result;  
// try   
// {  
// result = file.createNewFile();  //creates a new file  
// if(result)      // test if successfully created a new file  
// {  
// System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
// }  
// else  
// {  
// System.out.println("File already exist at location: "+file.getCanonicalPath());  
// }  
// }   
// catch (IOException e)   
// {  
// e.printStackTrace();    //prints exception if any  
// }         
// }  

// }

// Buffer stage optimizes the input by using native API
// I/O from the command line describes the standard stream and object console
// In i/o stream data stream handles binary io of primitive data type and stream values
// Object stream handles binary I/O of object 
// An I/o source represents the input source or the io destination
// A stream represents many kind of source and destination like disc file devices and memory arrays 

// Source -> data stream (101001) -> Program I/p stream


// create a directory 

// //Import file class  
// import java.io.File;  
// //Import Scanner class   
// import java.util.Scanner;  
// public class CreateFolder {  
//     //Main() method start  
//     public static void main(String args[]) {        
//       //Using Scanner class to get the path from the user where he wants to create a folder.  
//       System.out.println("Enter the path where you want to create a folder: ");  
//       Scanner sc = new Scanner(System.in);  
//       String path = sc.next();  
//       //Using Scanner class to get the folder name from the user  
//       System.out.println("Enter the name of the desired a directory: ");  
//       path = path+sc.next();  
//       //Instantiate the File class   
//       File f1 = new File(path);  
//       //Creating a folder using mkdir() method  
//       boolean bool = f1.mkdir();  
//       if(bool){  
//          System.out.println("Folder is created successfully");  
//       }else{  
//          System.out.println("Error Found!");  
//       }  
//    }  
// }  

// byte oriented channel creation 

