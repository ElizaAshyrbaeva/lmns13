import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass= new MyClass("Eliza","Ashyrbaeva",18,"Plov",new  String[]{"Java-8,Soft Skills","English"});
        MyClass myClass1= new MyClass("Muratova","Nuriza",18,new String[]{"Java-8","Soft Skills,English "});

        System.out.println(myClass.getName( ) + "\n"+ myClass.getSurname() +"\n" + myClass.getAge()+"\n" + Arrays.toString(myClass.getCourse())+myClass.getFavoriteFoot());
       System.out.println(myClass1.getSurname() +"\n" +myClass1.getName()+"\n" + myClass1.getAge() +"\n" + Arrays.toString(myClass1.getCourse()));

    }
}