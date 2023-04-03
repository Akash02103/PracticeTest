class Person
{
    String name;
    int age;
    public void speak()
    {
        System.out.println("This is speak method");
    }
}
class Student extends Person //child class of person
{
    String grade;
    public void study()
    {
        System.out.println("this is study method");
    }
}

class Usestudent //main class
{
    public static void main(String args[])
    {
        Student obj=new Student(); //creating a object
        obj.name="Abc";
        obj.age=21;
        obj.grade="A";

        obj.speak(); //call method using object
        obj.study();

    }
}