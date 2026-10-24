package a10Generics.test;

import java.util.ArrayList;
import java.util.List;

import a10Generics.dominio.Barco;
import a10Generics.dominio.Carro;
import a10Generics.service.RentalService;

public class ClassGenericTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Porshe")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-----------------------------------");
        
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando Barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
