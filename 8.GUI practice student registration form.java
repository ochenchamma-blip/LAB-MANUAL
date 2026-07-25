//7-Files I/O
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("student.txt");

        System.out.println("Enter Details of 3 Students\n");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            fw.write(roll + "," + name + "," + marks + "\n");
            System.out.println();
        }

        fw.close();

        System.out.println("Student records saved successfully.\n");

        System.out.println("----- Student Records -----");
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        System.out.print("\nEnter Roll Number to Search: ");
        int search = sc.nextInt();

        br = new BufferedReader(new FileReader("student.txt"));
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (Integer.parseInt(data[0]) == search) {
                found = true;
                System.out.println("\nStudent Found");
                System.out.println("Roll No : " + data[0]);
                System.out.println("Name    : " + data[1]);
                System.out.println("Marks   : " + data[2]);
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }

        br.close();
        sc.close();
    }
}

Program :

//swing applications
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("           STUDENT REGISTRATION FORM");
        System.out.println("----------------------------------------------------");

        System.out.print("USN          : ");
        String usn = sc.nextLine();

        System.out.print("Name         : ");
        String name = sc.nextLine();

        System.out.println("Branch       : [1] Computer Science  [2] Information Science");
        System.out.println("               [3] Electronics       [4] Mechanical");
        System.out.print("Select Branch (1-4): ");
        int branchChoice = Integer.parseInt(sc.nextLine());
        String branch;
        switch (branchChoice) {
            case 1: branch = "Computer Science"; break;
            case 2: branch = "Information Science"; break;
            case 3: branch = "Electronics"; break;
            case 4: branch = "Mechanical"; break;
            default: branch = "Not specified";
        }

        System.out.print("Gender       : (1) Male  (2) Female : ");
        int genderChoice = Integer.parseInt(sc.nextLine());
        String gender = (genderChoice == 1) ? "Male" : (genderChoice == 2) ? "Female" : "Not specified";

        System.out.print("Skills       : Java? (y/n) : ");
        boolean java = sc.nextLine().trim().equalsIgnoreCase("y");
        System.out.print("               Python? (y/n) : ");
        boolean python = sc.nextLine().trim().equalsIgnoreCase("y");

        StringBuilder skills = new StringBuilder();
        if (java) skills.append("Java ");
        if (python) skills.append("Python ");
        if (skills.length() == 0) skills.append("None");

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Student Details");
        System.out.println("----------------------------------------------------");
        System.out.println("USN     : " + usn);
        System.out.println("Name    : " + name);
        System.out.println("Branch  : " + branch);
        System.out.println("Gender  : " + gender);
        System.out.println("Skills  : " + skills.toString().trim());
        System.out.println("----------------------------------------------------");

        sc.close();
    }
}
 
