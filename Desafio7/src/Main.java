public class Main {
    public static void main(String[] args) {


        Gerente g1 = new Gerente();
        g1.setNome("Joao");
        g1.setIdade(21);;
        g1.setSalario(15000);
        g1.listaGerente();

        Supervisor s1 = new Supervisor();
        s1.setNome("Raquel");
        s1.setIdade(45);
        s1.setSalario(10000);
        s1.listaSupervisor();

        Vendedor v1 = new Vendedor();
        v1.setNome("Miranda");
        v1.setIdade(24);
        v1.setSalario(5000);
        v1.listaVendedor();



    }
}