package main.autonomo.carro;

//Classe pública + atributos private
public class Carro {
    private String marca;
    private String modelo;
    private Integer anoModelo;


    // construtor vazio
    public Carro() {}

        // construtor completo (lombok faz automático)
        public Carro(String marca, String modelo, Integer anoModelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoModelo = anoModelo;
        }
        // metodo ligar (receita / instrução pra função ligar ser usada na outra parte do código)
        public void ligar() {
            System.out.println("Ligando o carro: " + marca + "modelo: " + modelo + "de ano: " + anoModelo );
        }
    }
