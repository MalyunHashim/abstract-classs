package abstractclassbank;

public class testBank {
    public static void main(String[] args) {

        bank b= new KCB();
        bank t= new Taaj();
        System.out.println(b.getrateofintrest());
        System.out.println(t.getrateofintrest());
    }
}
