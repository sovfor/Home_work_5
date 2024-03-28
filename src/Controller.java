import java.util.Scanner;

public class Controller {

    EducationalGroupModel model = new EducationalGroupModel();
    EducationalGroupView view = new EducationalGroupView();
    Scanner scanner = new Scanner(System.in);

    Integer teachersId = 0;

    boolean isWork = true;

    private Integer options(){
        System.out.println("Введите 1, что бы создать/пересоздать учебную группу");
        System.out.println("Введите 2, что бы увидеть учителя группы");
        System.out.println("Введите 3, что бы увидеть список учеников группы");
        System.out.println("Введите 0, что бы выйти");

        return scanner.nextInt();
    }
    public void work(){
        while (isWork) {
            switch (options()) {
                case 1:
                    model.addGroup(view.addTeacher(teachersId), view.addStudentList());
                    break;
                case 2:
                    view.printTeacher(model.getTeacher());
                    break;
                case 3:
                    view.printStudentList(model.getStudentList());
                    break;
                case 0:
                    isWork = false;
                    break;
            }
        }
    }
}
