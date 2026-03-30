import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         ArrayList<Student> students = new ArrayList<>();
         try{
             System.out.print("How many students do you want to enter? ");
            int count = input.nextInt();
            input.nextLine();

            for (int i = 0; i < count; i++) {

                System.out.print("Enter student name: ");
                String name = input.nextLine();

                System.out.print("Enter student age: ");
                int age = input.nextInt();
                input.nextLine();

                students.add(new Student(name, age));
            }
             FileWriter writer = new FileWriter("students.txt");

            for (Student s : students) {
                writer.write(s.toFileString() + "\n");
            }

            writer.close();
            System.out.println("Data saved to file.");

            // ===== READ FROM FILE =====
            File file = new File("students.txt");
            Scanner reader = new Scanner(file);

            System.out.println("\n--- DATA FROM FILE ---");

            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                String[] data = line.split(",");

                String name = data[0];
                int age = Integer.parseInt(data[1]);

                Student s = new Student(name, age);
                s.displayStudent();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error occurred.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
