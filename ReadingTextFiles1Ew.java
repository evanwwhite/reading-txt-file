//Evan White
import java.util.Scanner;
import java.io.*;
public class ReadingTextFiles1Ew {

	public static void main (String[] args) throws IOException
	 {
	 String name = "", idNum = "";
	 double gpa = 0.0;
	 int grade = 0;
	 Scanner in = new Scanner(new File ("students2 (1).txt"));
	 while(in.hasNext()) //in.hasNext() returns true or false
	 {
	 name = in.nextLine();
	 idNum = in.nextLine();
	 gpa = Double.parseDouble(in.nextLine());
	 grade = Integer.parseInt(in.nextLine());

	 if(gpa >= 4.0)
	 System.out.println(name + " " + idNum);

	 String blankLine = in.nextLine(); //absolutely necessary!!!
	 }
	 }
	}