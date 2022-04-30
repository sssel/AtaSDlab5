import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        students[0] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.DECEMBER, 18), "Football");
        students[1] = new Student("Ivanov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.JULY, 18), "Football");
        students[2] = new Student("Sidorenko", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.AUGUST, 18), "Football");
        students[3] = new Student("Poroshenko", "Dmitry", new GregorianCalendar(9, GregorianCalendar.SEPTEMBER, 18), "Tourism");
        students[4] = new Student("Johnson", "Lena", new GregorianCalendar(2005, GregorianCalendar.JULY, 18), "Tourism");
        students[5] = new Student("Holmess", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.OCTOBER, 19), "Tourism");
        students[6] = new Student("Bukin", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.FEBRUARY, 18), "Tourism");
        students[7] = new Student("Voronin", "Dmitry", new GregorianCalendar(2008, GregorianCalendar.SEPTEMBER, 18), "Game");
        students[8] = new Student("Vasnecov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.AUGUST, 18), "Tourism");
        students[9] = new Student("Shihskin", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.DECEMBER, 18), "Game");
        students[10] = new Student("Levitan", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.MAY, 18), "Football");
        students[11] = new Student("Serov", "Dmitry", new GregorianCalendar(3005, GregorianCalendar.JULY, 18), "Football");
        students[12] = new Student("Ivanova", "Dmitry", new GregorianCalendar(3005, GregorianCalendar.AUGUST, 18), "Football");
        students[13] = new Student("Kubrik", "Dmitry", new GregorianCalendar(2003, GregorianCalendar.SEPTEMBER, 18), "Tourism");
        students[14] = new Student("Nabokov", "Lena", new GregorianCalendar(9, GregorianCalendar.JULY, 18), "Tourism");
        students[15] = new Student("Tarantino", "Dmitry", new GregorianCalendar(2001, GregorianCalendar.OCTOBER, 18), "Tourism");
        students[16] = new Student("Tarkovsky", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.FEBRUARY, 18), "Tourism");
        students[17] = new Student("Messing", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.SEPTEMBER, 18), "Game");
        students[18] = new Student("Paleno", "Dmitry", new GregorianCalendar(2003, GregorianCalendar.AUGUST, 18), "Tourism");
        students[19] = new Student("Krutov", "Dmitry", new GregorianCalendar(6666, GregorianCalendar.DECEMBER, 18), "Game");
        BST tree = new BST();
        for (int i = 0; i < students.length; i++) {
            tree.insert(students[i]);
        }
        print(students);
        linearSearch(students);
        System.out.println("Видалення студентів, що народилися влітку та захоплюються туризмом: ");
        print(students);
        System.out.println("Введіть ключ рік народження для пошуку: ");
        tree.find(new GregorianCalendar(new Scanner(System.in).nextInt(), GregorianCalendar.DECEMBER, 18));
    }
    public static void linearSearch (Student[] students){
        for (int i = 0; i <students.length; i++) {
                if (students[i] == null) continue;
                if ((students[i].DateOfBirth.get(GregorianCalendar.MONTH)==GregorianCalendar.JUNE||
                    students[i].DateOfBirth.get(GregorianCalendar.MONTH) == GregorianCalendar.JULY||
                    students[i].DateOfBirth.get(GregorianCalendar.MONTH) == GregorianCalendar.AUGUST)&&
                    students[i].Hobby == "Tourism"){
                    students[i] = null;
                }
        }
    }
    public static void print(Student[] students){
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) continue;
            System.out.println(students[i].toString());
            j++;
        }
        System.out.println("Отже студентів "+j);
    }
}