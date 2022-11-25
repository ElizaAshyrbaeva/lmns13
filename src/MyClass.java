import java.util.Arrays;

public class MyClass {
    private  String name,surname;
    private int age;
    private  String [] course;
    private String favoriteFoot;

    public MyClass(String name, String surname, int age,String favoriteFoot, String[] course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.surname=favoriteFoot;
    }

    public MyClass(String surname,String name,int age,String [] course) {
        this.surname=surname;
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public String getFavoriteFoot() {
        return favoriteFoot;
    }

    public void setFavoriteFoot(String favoriteFoot) {
        this.favoriteFoot = favoriteFoot;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + Arrays.toString(course) +
                ", favoriteFoot='" + favoriteFoot + '\'' +
                '}';
    }
}
