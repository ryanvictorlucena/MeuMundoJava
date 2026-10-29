# Classes Internas

Classes internas em Java são classes declaradas dentro de outra classe. Elas são usadas para organizar melhor o código e permitir que uma classe tenha acesso aos membros da classe externa, inclusive os privados.

Tipos de classes internas

- Classe interna comum: É declarada diretamente dentro da classe externa.

    class Externa {
        class Interna {
            void metodo() {
                System.out.println("Classe interna");
            }
        }
    }

- Classe interna estática: Usa a palvra-chave static.

    class Externa {
        static class InternaEstatica {
            void metodo() {
                System.out.println("Classe interna estática");
            }
        }
    }

- Classe local: declarada dentro de um método.

    class Externa {
        void executar() {
            class Local {
                void mostrar() {
                    System.out.println("Classe local");
                }
            }

            Local local = new Local();
            local.mostrar();
        }
    }
