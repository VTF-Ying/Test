package com.vtf.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8NewFeature {

    public static void main(String[] args) throws Exception {
        List<Person> javaProgrammers = new ArrayList<>();
        javaProgrammers.add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
        javaProgrammers.add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
        javaProgrammers.add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
        javaProgrammers.add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
        javaProgrammers.add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
        javaProgrammers.add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
        javaProgrammers.add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
        javaProgrammers.add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
        javaProgrammers.add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
        javaProgrammers.add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
        List<Person> phpProgrammers = new ArrayList<Person>();
        phpProgrammers.add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
        phpProgrammers.add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
        phpProgrammers.add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
        phpProgrammers.add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
        phpProgrammers.add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
        phpProgrammers.add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
        phpProgrammers.add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
        phpProgrammers.add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
        phpProgrammers.add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
        phpProgrammers.add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));



        System.out.println("给程序员加薪 5% :");
        Consumer<Person> consumer = e -> e.setSalary(e.getSalary()/100*5+e.getSalary());
        javaProgrammers.forEach(consumer);
        phpProgrammers.forEach(consumer);



        System.out.println("下面是月薪超过 $1,400 的PHP程序员:") ;
        Predicate<Person> predicate = e -> e.getSalary() > 1400;
        phpProgrammers.stream().filter(predicate).forEach(p -> {System.out.printf("%s %s;",p.getLastName(),p.getFirstName());});
        System.out.println();


        System.out.println("下面是年龄大于 24岁且月薪在$1,400以上的女PHP程序员:");
        Predicate<Person> ageFilter = e -> e.getAge()>24;
        Predicate<Person> salaryFilter = e -> e.getSalary()>1400;
        Predicate<Person> genderFilter = e -> "female".equals(e.getGender());
        phpProgrammers.stream().filter(ageFilter).filter(salaryFilter).filter(genderFilter).forEach(p -> {System.out.printf("%s %s;", p.getLastName(),p.getFirstName());System.out.println();});


        // 重用filters
        System.out.println("年龄大于 24岁的女性 Java programmers:");
        javaProgrammers.stream().filter(ageFilter).filter(genderFilter).forEach(p -> {System.out.printf("%s %s;", p.getLastName(),p.getFirstName());System.out.println();});


        System.out.println("最前面的3个 Java programmers:");
        Consumer<Person> fConsumer = e -> {System.out.printf("%s %s;",e.getLastName(),e.getFirstName());System.out.println();};
        javaProgrammers.stream().limit(3).forEach(fConsumer);
        System.out.println("最前面的3个女性 Java programmers:");
        javaProgrammers.stream().filter(genderFilter).limit(3).forEach(fConsumer);


        System.out.println("根据 name 排序,并显示前5个 Java programmers:");
        javaProgrammers
                .stream().sorted((p,p2) -> (p.getFirstName().compareTo(p2.getFirstName())))
                .limit(5)
                .forEach(fConsumer);


        System.out.println("根据 salary 排序 Java programmers:");
        javaProgrammers.stream()
                .sorted((p,p2) -> (p.getSalary() - p2.getSalary()))
                .forEach(fConsumer);


        System.out.println("工资最低的 Java programmer:");
        Person pers = javaProgrammers.stream()
                .min((p,p2) -> (p.getSalary() - p2.getSalary()))
                .get();
        System.out.printf("Name: %s %s; Salary: $%,d.\n", pers.getFirstName(), pers.getLastName(), pers.getSalary()) ;
        System.out.println("工资最高的 Java programmer:");
        Person person = javaProgrammers
                .stream()
                .max((p, p2) -> (p.getSalary() - p2.getSalary()))
                .get();

        System.out.printf("Name: %s %s; Salary: $%,d.\n", person.getFirstName(), person.getLastName(), person.getSalary());



        System.out.println("将 PHP programmers 的 first name 拼接成字符串:");
        String nameStr = phpProgrammers.stream().map(Person :: getFirstName)
                .collect(Collectors.joining(" ; "));
        System.out.println(nameStr);


        System.out.println("将 Java programmers 的 first name 存放到 Set:");
        javaProgrammers.stream().map(Person :: getFirstName).collect(Collectors.toSet()).forEach(p ->System.out.println(p));


        System.out.println("将 Java programmers 的 first name 存放到 TreeSet:");
        TreeSet<String> javaDevLastName = javaProgrammers
                .stream()
                .map(Person::getLastName)
                .collect(Collectors.toCollection(TreeSet :: new));
        javaDevLastName.forEach(p -> {System.out.println(p);});


        System.out.println("计算付给 Java programmers 的所有money:");
        System.out.println(javaProgrammers.parallelStream().mapToInt(p -> p.getSalary()).sum());


        //计算 count, min, max, sum, and average for numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> (x)).summaryStatistics();
        System.out.println("List中最大的数字 : " + stats.getMax());
        System.out.println("List中最小的数字 : " + stats.getMin());
        System.out.println("所有数字的总和   : " + stats.getSum());
        System.out.println("所有数字的平均值 : " + stats.getAverage());

        //先把java的工资转为list
        IntSummaryStatistics summaryStatistics = javaProgrammers.stream().map(Person :: getSalary).collect(Collectors.toList()).stream().mapToInt(s ->(s)).summaryStatistics();
        System.out.println("最高的工资："+summaryStatistics.getMax());
        System.out.println("最低的工资："+summaryStatistics.getMin());
        System.out.println("所有数字的总和"+summaryStatistics.getSum());
        System.out.println("所有数字的平均值"+summaryStatistics.getAverage());
        System.out.println("所有数字的个数："+summaryStatistics.getCount());

        //list转map 某个字段为key 重复了怎么取值
        /**
         * id为key，apple对象为value，可以这么做：

         /**
         * List -> Map
         * 需要注意的是：
         * toMap 如果集合对象有重复的key，会报错Duplicate key ....
         *  apple1,apple12的id都为1。
         *  可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2
         Map<Integer, Apple> appleMap = appleList.stream().collect(Collectors.toMap(Apple::getId, a -> a,(k1,k2)->k1));
         打印appleMap
         {1=Apple{id=1, name='苹果1', money=3.25, num=10}, 2=Apple{id=2, name='香蕉', money=2.89, num=30}, 3=Apple{id=3, name='荔枝', money=9.99, num=40}}
         */
        Map<Integer, Person> map = phpProgrammers.stream().collect(Collectors.toMap(Person :: getAge, p -> p, (k1,k2) -> k2));
        map.forEach((k,v) -> {System.out.println(k+"   "+v);});

        /**list去重*/
        List<Integer> numList = Arrays.asList(1,2,3,3,4,4,8,6);
        System.out.println(numList.stream().distinct().collect(Collectors.toList()));

        /**分组*/
        List<Boolean> booleans = Arrays.asList(true,false,true,false,true,true,false);
        Map<Boolean, List<Boolean>> collect = booleans.stream().collect(Collectors.groupingBy(x -> x == true, Collectors.toList()));
        System.out.println(collect);

        Map<String, List<Person>> collect2 = javaProgrammers.stream().collect(Collectors.groupingBy(Person :: getGender, Collectors.toList()));
        System.out.println(collect2);

        /**BigDecimal求和  add方法可以指定参数*/
        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal(10),new BigDecimal(20), new BigDecimal(30));
        BigDecimal reduce = bigDecimals.stream().reduce(BigDecimal.ZERO, BigDecimal :: add);
        System.out.println(reduce);

        /**Date类型从小到大排序*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> dates = Arrays.asList(format.parse("2020-01-01"),format.parse("2020-01-09"),format.parse("2020-01-05"));
        dates.stream().sorted((p,p2) -> p.compareTo(p2)).forEach(x -> System.out.println(x));
    }

}

class Person{
    private String firstName, lastName, job, gender;
    private int salary, age;
    public Person() {};
    public Person(String firstName, String lastName, String job,
                  String gender, int age, int salary)       {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", job=" + job + ", gender=" + gender
                + ", salary=" + salary + ", age=" + age + "]";
    }

}
