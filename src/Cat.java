public class Cat {
    /*Реализовать метод setName, чтобы с его помощью можно было устанавливать значение
     переменной private String name равное переданному параметру String name.*/
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setName("Бублик");
        System.out.println(cat.name);
    }
}
