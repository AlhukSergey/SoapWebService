package by.teachmeskills.soapwebservice.repository;

import by.teachmeskills.soapwebservice.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void initData() {

        Student student = new Student();
        student.setName("Ivan");
        student.setCourse(1);
        student.setAddress("Minsk");
        students.add(student);

        Student student2 = new Student();
        student.setName("Maksim");
        student.setCourse(2);
        student.setAddress("Grodno");
        students.add(student2);

        Student student3 = new Student();
        student.setName("Vlad");
        student.setCourse(4);
        student.setAddress("Gomel");
        students.add(student3);
    }

    public Student findStudent(String name) {
        Student student = null;
        for (Student s: students
             ) {
            if (name.equals(s.getName())) {
                student = s;
            }
        }

        return student;
//        return students.stream().filter(student -> student.getName().equals(name)).findAny().orElse(null);
    }
}
