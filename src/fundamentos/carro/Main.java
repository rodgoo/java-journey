package carro;

public class Main {
    public static void main(String[] args) {

        // 2 carros com construtores completos
        Carro carro1 = new Carro("Fiat","Uno", 2012);
        Carro carro2 = new Carro("Ferrari", "C3", 2026);

        // ligar
        carro1.ligar();
        carro2.ligar();


    }
}
