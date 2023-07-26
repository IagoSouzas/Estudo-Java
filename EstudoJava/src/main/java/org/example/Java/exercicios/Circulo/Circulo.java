package org.example.exercicios.Circulo;

public class Circulo {

    double raio;
    double area;
    double perimetro;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void calcularRaio() {
        area = Math.PI * raio * raio;
    }

    public void calcularPerimetro(){
        perimetro = 2 * Math.PI * raio;
    }

    public String getCalculos() {
        calcularRaio();
        calcularPerimetro();
        return "O resultado dos cálculos são:\nÁrea: " + area + "\nPerímetro: " + perimetro;
    }




}
