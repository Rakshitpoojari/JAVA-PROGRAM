interface A 
{
 void mymethod();
}
class B
{
    public void mymethod()
    {
        System.out.println("My method");
    }
}
class C extends B implements A
{

}
class Main 
{
    public static void main(String[] args) {
        A a=new C();
        a.mymethod();
    }
}
