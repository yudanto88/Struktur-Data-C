import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<konsumsi> listKonsumsi = new ArrayList<>();
        konsumsi<makanan, minuman> breakfast = new konsumsi<>();
        konsumsi<makanan, minuman> lunch = new konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("Roti Tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        makanan nasi = new makanan();
        nasi.setNamaHidangan("Nasi Putih");
        minuman air = new minuman();

        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch );

        System.out.println("Menu konsumsi");
        for(konsumsi<makanan, minuman> konsumsi : listKonsumsi){
            makanan makanan = konsumsi.getM();
            minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
    
}