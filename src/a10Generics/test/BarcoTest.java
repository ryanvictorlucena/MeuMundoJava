package a10Generics.test;

import a10Generics.dominio.Barco;
import a10Generics.service.BarcoRentavelService;

public class BarcoTest {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o Barco por um mês...");
        BarcoRentavelService.retornarBarcoAlugado(barco);
    }
}