import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EducationalGroupView {
    Scanner scanner = new Scanner(System.in);



    public Teacher addTeacher(Integer id){

        Teacher teacher = new Teacher(id);
        System.out.println("Введите имя учителя: \n");
        teacher.addName(scanner.nextLine());

        System.out.println("Введите возраст учителя: \n");
        teacher.addAge(scanner.nextInt());

        System.out.println("Введите зарплату учителя: \n");
        teacher.addSalary(scanner.nextInt());

        return teacher;
    }

    private Student addStudent(Integer id){
        Student student = new Student(id);
        System.out.println("Введите имя ученика: \n");
        student.addName(scanner.next());

        System.out.println("Введите возраст ученика: \n");
        student.addAge(scanner.nextInt());

        return student;
    }
    public List<Student> addStudentList(){
        List<Student> studentList = new ArrayList<>();
        int count = 0;

        while(true){

            studentList.add(addStudent(count++));
            System.out.println("Если хотите завершить ввод учеников, нажмите 1, иначе нажмите 0");
            if(scanner.nextInt() == 1){
                break;
            }


        }
        return studentList;

    }

    public void printTeacher(Teacher teacher){
        System.out.println(String.format("%d %s %d %d",teacher.getId(),teacher.getName(),teacher.getAge(),teacher.getSalary()));
    }

    public void printStudentList(List<Student> studentList){
        Iterator<List<Student>> iterator = new Iterator<List<Student>>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public List<Student> next() {
                return null;
            }
        };

        for(Student student: studentList){
            System.out.println(String.format("%d %s %d",student.getId(),student.getName(),student.getAge()));
        }
    }




}
