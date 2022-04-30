import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    String Surname;
    String Name;
    GregorianCalendar DateOfBirth;
    String Hobby;

    public Student(String Surname, String Name, GregorianCalendar DateOfBrith, String Hobby){
        this.Surname = Surname;
        this.Name = Name;
        this.DateOfBirth = DateOfBrith;
        this.Hobby = Hobby;
    }

    @Override
    public String toString(){
        return "Прізвище: "+Surname+"\tІм'я: "+Name+"\tДата народження: "+DateOfBirth.getTime()+"\tХоббі: "+Hobby;
    }
}
