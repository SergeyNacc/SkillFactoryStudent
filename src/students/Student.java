package students;

public class Student {

    private String name;
    private String surname;
    private int age;

    private int group;
    private int completedTask;
    private int completedModule;
    private boolean experience;


    public Student(String name, String surname, int age) {
        this(name, surname, age, 0, 0, 0, false);
    }

    public Student(String name, String surname, int age,
                   int group, int completedTask, int completedModule, boolean experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.completedTask = completedTask;
        this.completedModule = completedModule;
        this.experience = experience;
    }
}
