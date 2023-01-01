public class task_7 {

    public static void main(String[] args)
    {
        Student<Integer> ob = new Student<>(45,"Ahmed",3.4);
        Student<Integer> ob1 = new Student<>(54,"Ali",4.1);
        System.out.println(ob);
        System.out.println(ob1);

    }
}
interface Person<T>
{
    //Abstract methods

    abstract <T> T work();
    abstract <T> T sleep();
}
class Student<T> implements Person
{
    //fields
    private T id;
    private String name;
    private double cgpa;

    //Setter and getters
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    //Constructor


    public Student(T id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public Student()
    {
        this.id = null;
        this.name = "kk";
        this.cgpa = 3.4;
    }

    //Methods
    @Override
    public Object work()
    {
        return "Working";
    }

    @Override
    public Object sleep()
    {
        return "slept";
    }

    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
