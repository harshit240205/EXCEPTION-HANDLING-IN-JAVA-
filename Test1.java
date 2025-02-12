public class Test1 {
    public static void main(String[] args) {
        level1();
//        try {
//            level1();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
    }
// after running this try catch block we have only one line exception
// but if we exclude that it will give us 'stack trace' detailed info about method calls that led do exception
    // We can also print this by using o.getStackTrace()
    public static void level3(){
        int [] array = new int[5]; //exception will come at index 5
        array[5] = 10;
    }

    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
