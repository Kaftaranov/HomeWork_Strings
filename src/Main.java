public class Main {
    public static void main(String[] args)
    {
//Задача №1
        String name = "Ivan";
        String middleName = "Ivanovich";
        String surname = "Ivanov";
        String fullName = surname + " " + name + " " + middleName;
        System.out.println("Name of employee is " + fullName);
        System.out.println("-------------------------------------------------------");
//Задача №2
        System.out.println("Name of employee for the report: " + fullName.toUpperCase());
        System.out.println("-------------------------------------------------------");
//Задача №3
        name = "Semyon";
        middleName = "Semyonovich";
        surname = "Ivanov";
        fullName = surname + " " + name + " " + middleName;
        for (int i = 0; i < fullName.length(); i++) {fullName = fullName.replace("yo","e");}
        System.out.println("Full name of employee is " + fullName);
    }
}