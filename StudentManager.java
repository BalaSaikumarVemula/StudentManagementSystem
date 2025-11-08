import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";
    private List<Student> students = new ArrayList<>();

    public StudentManager() {
        loadFromFile();
    }

    // CREATE
    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
        System.out.println("Student added successfully!");
    }

    // READ
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // UPDATE
    public void updateStudent(String id, String newName, int newAge, String newCourse) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                s.setName(newName);
                s.setAge(newAge);
                s.setCourse(newCourse);
                saveToFile();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // DELETE
    public void deleteStudent(String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getStudentId().equals(id)) {
                iterator.remove();
                saveToFile();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Load data from file
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    students.add(new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    // Save data to file
    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.getDetails());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    public Student findStudentById(String id) {
    	for (Student s : students) {
        	if (s.getStudentId().equals(id)) {
            		return s;
        	}
    	}
    	return null; // not found
    }

    public boolean isIdExists(String id) {
    for (Student s : students) {
        if (s.getStudentId().equals(id)) {
            return true;
        }
    }
    return false;
}


}
