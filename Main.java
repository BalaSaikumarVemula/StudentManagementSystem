import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
    		    System.out.print("Enter ID: ");
    		    String id = sc.nextLine();

    			// Check if ID already exists
    		    if (manager.isIdExists(id)) {
        	        System.out.println("A student with ID " + id + " already exists! Please use a different ID.");
        		break;
    		    }

    		    System.out.print("Enter Name: ");
    		    String name = sc.nextLine();
    		    System.out.print("Enter Age: ");
    		    int age = sc.nextInt(); sc.nextLine();
   		    System.out.print("Enter Course: ");
    		    String course = sc.nextLine();

    		    manager.addStudent(new Student(id, name, age, course));
    		    break;


                case 2:
                    manager.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Update: ");
    		    String updateId = sc.nextLine();

                    Student existingStudent = manager.findStudentById(updateId);
                    if (existingStudent == null) {
        	    	System.out.println("Student not found!");
        	    	break;
    		    }

    		    System.out.println("Current Details:");
    		    System.out.println(existingStudent);

    		    System.out.print("Enter New Name (leave blank to keep same): ");
    		    String newName = sc.nextLine();
    		    if (newName.isEmpty()) newName = existingStudent.getName();

    		    System.out.print("Enter New Age (or 0 to keep same): ");
    		    int newAge = sc.nextInt(); sc.nextLine();
    		    if (newAge == 0) newAge = existingStudent.getAge();

   		    System.out.print("Enter New Course (leave blank to keep same): ");
    		    String newCourse = sc.nextLine();
    		    if (newCourse.isEmpty()) newCourse = existingStudent.getCourse();

    		    manager.updateStudent(updateId, newName, newAge, newCourse);
    		    break;

                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    String deleteId = sc.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
