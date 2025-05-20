import java.util.*;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Name1", "Surname1", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Name2", "Surname2", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Name3", "Surname3", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Name4", "Surname4", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::calculateAverage));
        System.out.println("Student with highest average: " +
                topStudent.getFirstName() + " " + topStudent.getLastName() +
                " (" + topStudent.getIndexNumber() + ") - Average: " +
                String.format("%.2f", topStudent.calculateAverage()));

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("\nStudents sorted by surname:");
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() +
                    " (" + s.getIndexNumber() + ") - Average: " +
                    String.format("%.2f", s.calculateAverage()));
        }

        double totalAverage = students.stream()
                .mapToDouble(Student::calculateAverage)
                .average()
                .orElse(0.0);

        System.out.println("\nOverall average of all students: " + String.format("%.2f", totalAverage));
    }
}