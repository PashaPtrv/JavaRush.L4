public class Cat {

    /*Реализовать метод addNewCat,
     чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1.
      За количество котов отвечает переменная catsCount.
     */
    private static int catsCount = 0;
    public static void addNewCat() {
        catsCount++;
    }


    public static void main(String[] args){
        addNewCat();
        addNewCat();
        addNewCat();
        System.out.println(catsCount);

    }
}
