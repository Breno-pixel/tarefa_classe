public class Carro {
    // Propriedades
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;
    private int velocidade;


    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false; // Estado inicial
        this.velocidade = 0; // Velocidade inicial
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro " + modelo + " está ligado.");
        } else {
            System.out.println("O carro " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("O carro " + modelo + " está desligado.");
        } else {
            System.out.println("O carro " + modelo + " já está desligado.");
        }
    }

    public void acelerar(int aumento) {
        if (ligado) {
            velocidade += aumento;
            System.out.println("O carro " + modelo + " acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("Você precisa ligar o carro " + modelo + " antes de acelerar.");
        }
    }

    public void frear(int reducao) {
        if (velocidade > 0) {
            velocidade -= reducao;
            if (velocidade < 0) velocidade = 0; //Velocidade negativa
            System.out.println("O carro " + modelo + " reduziu a velocidade para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro " + modelo + " já está parado.");
        }
    }
}
