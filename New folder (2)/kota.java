public class kota <E> {
    private E element;    

    public kota (E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        kota<Integer> jumKota  = new kota<Integer>(9);
        kota<String> namKota = new kota<String>("Malang");
        System.out.println("Jumlah kota di jawa timur : "+ jumKota.getElement() + "Kota");
        System.out.println("Salah satu kota di jawa timur : kota "+ namKota.getElement());
    }
}
