package be.intecbrussel.students;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Robert", "JAVA"));
        students.add(new Student("Jaques", "JAVA"));
        students.add(new Student("Luc", "JAVA"));
        students.add(new Student("Marie-Jeanne", "C#"));
        students.add(new Student("Bob", "C#"));
        students.add(new Student("Claude", "C#"));
        students.add(new Student("Julienne", "SUPPORT"));

        /*students.forEach(student -> System.out.println(student.getCourse()));
        for (Student student : students) {
            System.out.println(student.getName() + " follows " + student.getCourse());
        }

        students.sort((student1, student2) -> student1.getName().compareTo(student2.getName()));

        System.out.println(students);
        System.out.println(students.get(4));*/

        Map<String, Student> studentMap = new LinkedHashMap<>();
        studentMap.put("Robert", new Student("Robert", "JAVA"));
        studentMap.put("Jaques", new Student("Jaques", "JAVA"));
        studentMap.put("Luc", new Student("Luc", "JAVA"));
        studentMap.put("Marie-Jeanne", new Student("Marie-Jeanne", "C#"));
        studentMap.put("Bob", new Student("Bob", "C#"));
        studentMap.put("Claude", new Student("Claude", "C#"));
        studentMap.put("Julien", new Student("Julien Jean", "SUPPORT"));
        studentMap.put("Julien", new Student("Julien Bob", "JAVA"));

        //System.out.println(studentMap.get("Julien"));

        // studentMap.forEach((name, student) -> System.out.println(name + " follows " + student.getCourse()));


        for (String name : studentMap.keySet()) {

            System.out.println(name);
        }

        for (Student student : studentMap.values()) {
            System.out.println(student);
        }

        for (Map.Entry<String, Student> stringStudentEntry : studentMap.entrySet()) {
            System.out.println(stringStudentEntry.getKey() + " = " + stringStudentEntry.getValue().getCourse());
        }

        studentMap.replace("ghdfgf", new Student("htfgcf", "hgfy"));

    }
}
