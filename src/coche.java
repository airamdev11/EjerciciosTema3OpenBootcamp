public class coche {

    public static void main(String args[]){
        auto carro1 = new auto(10);
        System.out.println( carro1.incrementarPuertas());

    }

}

class auto{
    public auto(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    public int numeroPuertas;

    public int incrementarPuertas(){
        return ++this.numeroPuertas;
    }
}
