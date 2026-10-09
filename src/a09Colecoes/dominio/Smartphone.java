package a09Colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    } 

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /* Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null.
     Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true.
     Transitividade: para x, y, z diferentes sde null, se x.equals(y) == true, e x.equals(z) == true, então y.equals(z) == true.
     para x diferente de null, x.equals(null) tem que retornar false. */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber); 
    }
}
