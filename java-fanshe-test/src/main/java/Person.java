public class Person implements MyInterface,MyInfterface2 {

    private int id;
    private String name;
    private int age;
    public String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id) {
        this.id = id;
    }

    private void privateMethod(){
        System.out.println("private Method....");
    }
    private void privateMethod2(String name){
        System.out.println("private Method...."+name);
    }

    private Person(String name){
        this.name=name;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public static void staticMethod(){
        System.out.println("static method ...");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("infterfaceMethod .....");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("infterfaceMethod2 .....");
    }
}
