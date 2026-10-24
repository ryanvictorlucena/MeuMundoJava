package a10Generics.test;

import a10Generics.dominio.Carro;
import a10Generics.service.CarroRentavelService;

public class CarroTest {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
