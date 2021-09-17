public class SingletonTest {

    public static void main(String[] args) {

        //Cat cat1 = new Cat();
//        Cat cat2;
//        cat2 = cat1;

        Cat cat1 = Cat.getCat();
        System.out.println(cat1.hashCode());

        Cat cat2 = Cat.getCat();
        System.out.println(cat2.hashCode());

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        String str1 = "Way2Automation";
        String str2 = "Way2Automation";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
