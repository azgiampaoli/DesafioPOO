public class Main {
    public static void main(String[] args) {

        Mago mago = new Mago("Presto", 350,500, 3, 800, 150, 3);
        Guerreiro guerreiro = new Guerreiro("Bobby", 500, 150,3, 350, 500, 3);


        mago.attack();
        mago.levelUp();
        mago.listaMago();

        guerreiro.attack();
        guerreiro.levelUp();
        guerreiro.listaGuerreiro();

        System.out.println("--------------------------");
        mago.aprenderMagia("Tirar coelho da cartola");
        System.out.println("--------------------------");
        mago.aprenderMagia("Fazer nuvem de fumaça");



        System.out.println("--------------------------");
        guerreiro.aprenderHabilidade("Bater tacape no chão");
        System.out.println("--------------------------");
        guerreiro.aprenderHabilidade("Quebrar pedras");

        System.out.println("Quantidades de personagens criados: ");
        mago.quantidade();

        Mago mago1 = new Mago("Anivia", 600, 350, 2,200,50,2);
        mago1.attack();
        mago1.levelUp();
        mago1.aprenderMagia("Levantar parede de gelo");
        mago1.aprenderMagia("Atirar stalactite de gelo");

        System.out.println("Quantidades de personagens criados: ");
        guerreiro.quantidade();


    }
}
