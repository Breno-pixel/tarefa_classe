public class Test {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Preto");


        meuCarro.ligar();
        meuCarro.acelerar(20);
        meuCarro.acelerar(30);
        meuCarro.frear(10);
        meuCarro.desligar();
        meuCarro.frear(10);
    }
}
