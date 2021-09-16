public class Cat {

    private static Cat cat = new Cat();
    private Cat(){

    }

    public static Cat getCat(){
        return cat;
    }

    public void getColor(){
        System.out.println("Brown");
    }

}
