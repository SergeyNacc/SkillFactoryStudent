package students;

public class Student {

    private String name;
    private String surname;
    private int age;

    private int group;
    private int completedTask;
    private int completedModule;
    private boolean experience;

    public static int taskCountForAll;
    public static final int MAX_MODULE_COUNT = 20;


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


    public void solveTask() {
        System.out.println("Задание решено!");
        completedTask++;
        taskCountForAll++;
    }


    public void passModule() {
        if(completedModule < MAX_MODULE_COUNT) {
            completedModule++;
            System.out.println("Модуль пройден!");
        } else {
            System.out.println("Все модули пройдены!");
        }
    }
}
