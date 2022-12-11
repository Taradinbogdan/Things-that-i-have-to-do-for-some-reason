import java.util.Arrays;
public class Main5 {
    String name;
    String job;
    String mail;
    String pnumber;
    int salary;
    int age;
    public Main5(String name, String job, String mail, String pnumber, int salary, int age) {
        this.name = name;//да не забудут эти строки моих мучений
        this.job = job;
        this.mail = mail;
        this.pnumber = pnumber;
        this.salary = salary;
        this.age = age;
    }
    @Override//овадрайву блин
    public String toString(){
        return String.format("Name: " + name + "\n" + "Job: " + job + "\n" + "Email: " + mail + "\n"+ "Phone number: " + pnumber + "\n" + "Salary: " + salary + "\n" + "Age: " + age + "\n" );
    }
    public void print(){//удобно но сам бы я хрен догодался
        System.out.println(this);
    }
    public static void main(String[] args) {
        Main5[] DrewStudio = new Main5[5];
        DrewStudio[0]  = new Main5("Joey Drew", "The founder", "drawyourlive@gmail.com", "999 728 42 11", 8000, 48);
        DrewStudio[1]  = new Main5("Sammy Lawrence", "Music director", "singthesong@gmail.com", "985 612 82 37", 6000, 32);
        DrewStudio[2]  = new Main5("Allison Pendle", "Voice actress", "letitbe@gmail.com", "972 387 42 84", 5000, 24);
        DrewStudio[3]  = new Main5("Abigail Lambert", "Animator, Art director", "itisinspired@gmail.com", "995 523 98 50", 6000, 30);
        DrewStudio[4]  = new Main5("Henry Stein", "Animator", "makeyourstep@gmail.com", "977 239 28 74", 4000, 29);
        for (int i=0; i < DrewStudio.length; i++) {
            if (DrewStudio[i].age > 40) {
                DrewStudio[i].print();
            }
        }
    }
}