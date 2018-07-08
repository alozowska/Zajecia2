public class Kolekcja {
    public static void main(String[] args) {
        Buty buty1= new Buty();
        Buty buty2= new Buty();

        buty1.marka= "badura";
        buty1.kolor= "czarny";
        buty1.obcas= 10;

        buty2.marka= "venezia";
        buty2.kolor= "czerwony";
        buty2.obcas= 8;

        System.out.println(buty1.marka+" "+buty1.kolor+" "+ buty1.obcas+"cm");
        System.out.println(buty2.marka+" "+buty2.kolor+" "+buty2.obcas+"cm");


    }
}
