package a09Colecoes.dominio;

public class Manga implements Comparable<Manga> {
    private String nome;
    private Long id;
    private double valor;
    
    public Manga(String nome, Long id, double valor) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Manga (nome = " + nome + ", id = " + id + ", valor = " + valor + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Manga o) {
        //negativo se o this < o
        //0 se o this == o
        //positivo se o this > o
        
        /*if (this.id < o.getId())
            return -1;
        else if (this.id == o.getId())
            return 0;
        else 
            return 1;*/

        //return this.nome.compareTo(o.getNome());
        //return Double.compare(valor, o.getValor());
        return id.compareTo(o.getId());
    }

    
}
