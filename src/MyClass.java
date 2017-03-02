/**
 * Created by My Laptop on 3/2/2017.
 */
public class MyClass{
    public static void main(String args[]){
        MyClass m=new MyClass();
    Person p1=new Person();
    p1.setName("Nimal");
    p1.setEmail("aaaaaafd");
        System.out.println(m.saveperson(p1));
    }
    public Person saveperson(Person p){

        if (p==null){
            throw new IllegalArgumentException();
        }else{
            p.setId("123");
            return p;
        }
    }
}