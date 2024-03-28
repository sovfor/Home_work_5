public abstract class People {
    protected Integer id;
    protected String name;

    protected Integer age;

    public People(){

    }

    public  void addId(Integer id){
        this.id = id;
    }
    public void addName(String name){
        this.name = name;
    }
    public void  addAge(Integer age){
        this.age = age;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return  age;
    }

}
