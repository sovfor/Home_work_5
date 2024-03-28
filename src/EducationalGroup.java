import java.util.List;

public class EducationalGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public EducationalGroup(){

    }

    public void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public void addStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    public Teacher getTeacher(){
        return teacher;

    }
    public List<Student> getStudentList(){
        return studentList;
    }
}
