package POO;

public class OverrideOverload {

    // Classe base
    static class Animal {
        void emiteSom() {
            System.out.println("Som genérico");
        }
    }

    // Subclasse que SOBRESCREVE (override) o método da classe pai
    static class Cachorro extends Animal {
        @Override
        void emiteSom() {
            System.out.println("Latido");
        }

        // SOBRECARGA (overload) do método emiteSom
        void emiteSom(String intensidade) {
            System.out.println("Latido " + intensidade);
        }
    }

    public static void main(String[] args) {
        
        // -------- OVERRIDE --------
        Animal a = new Cachorro(); // polimorfismo: tipo genérico, objeto específico
        a.emiteSom(); // Executa "Latido" → método sobrescrito na subclasse

        // -------- OVERLOAD --------
        Cachorro c = new Cachorro();
        c.emiteSom(); // Executa "Latido" (override do pai)
        c.emiteSom("alto"); // Executa "Latido alto" (overload com parâmetro extra)
    }
}
