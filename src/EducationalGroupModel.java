import java.util.List;
public class EducationalGroupModel {
    EducationalGroup group = new EducationalGroup();
    public EducationalGroupModel(){

    }

    public void addGroup(Teacher teacher,List<Student> studentList){


        group.addTeacher(teacher);
        group.addStudentList(studentList);
    }

    public Teacher getTeacher(){
        return group.getTeacher();
    }
    public List<Student> getStudentList(){
        return group.getStudentList();
    }
}
