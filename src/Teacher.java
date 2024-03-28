public class Teacher extends People {

    private Integer salary;

    public Teacher(Integer id){
        super.id = id;
    }

    public void addSalary(Integer salary){
        this.salary = salary;
    }

    public Integer getSalary(){
        return salary;
    }
}
