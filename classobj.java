public class classobj {

    String name= " ";
    String processor = " ";
    int ram= 0;
    int price= 0;

    public static void main(String[]args){

        classobj lap1 = new classobj();
        lap1.name= "hp";
        lap1.processor="i5";
        lap1.ram = 6;
        lap1.price=40000;

        classobj lap2 = new classobj();
        lap2.name= "lenovo";
        lap2.processor="i7";
        lap2.ram= 8;
        lap2.price=50000;


        System.out.println("the price of hp laptop: "+lap1.price);
        System.out.println("the ram of lenovo laptop: "+lap2.ram);
    }

    
}
