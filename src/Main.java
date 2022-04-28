import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        students[0] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.DECEMBER, 18), "Football");
        students[1] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.JULY, 18), "Football");
        students[2] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.AUGUST, 18), "Football");
        students[3] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.SEPTEMBER, 18), "Tourism");
        students[4] = new Student("Krutova", "Lena", new GregorianCalendar(2002, GregorianCalendar.JULY, 18), "Tourism");
        students[5] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.OCTOBER, 18), "Tourism");
        students[6] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.FEBRUARY, 18), "Tourism");
        students[7] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.SEPTEMBER, 18), "Game");
        students[8] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.AUGUST, 18), "Tourism");
        students[9] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.DECEMBER, 18), "Game");
        students[10] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.MAY, 18), "Football");
        students[11] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.JULY, 18), "Football");
        students[12] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.AUGUST, 18), "Football");
        students[13] = new Student("Krutov", "Dmitry", new GregorianCalendar(2003, GregorianCalendar.SEPTEMBER, 18), "Tourism");
        students[14] = new Student("Krutova", "Lena", new GregorianCalendar(2002, GregorianCalendar.JULY, 18), "Tourism");
        students[15] = new Student("Krutov", "Dmitry", new GregorianCalendar(2001, GregorianCalendar.OCTOBER, 18), "Tourism");
        students[16] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.FEBRUARY, 18), "Tourism");
        students[17] = new Student("Krutov", "Dmitry", new GregorianCalendar(2002, GregorianCalendar.SEPTEMBER, 18), "Game");
        students[18] = new Student("Krutov", "Dmitry", new GregorianCalendar(2003, GregorianCalendar.AUGUST, 18), "Tourism");
        students[19] = new Student("Krutov", "Dmitry", new GregorianCalendar(2001, GregorianCalendar.DECEMBER, 18), "Game");
        print(students);
        System.out.println();
        linearSearch(students);
        System.out.println("Відсортовано: ");
        print(students);
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
            System.out.println();
            j++;
        }
        System.out.println("Отже студентів "+j);
    }
}