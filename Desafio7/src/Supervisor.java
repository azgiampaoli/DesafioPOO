public class Supervisor extends Funcionario{

    double bonus = 5000;

    @Override
    public double bonificação() {

        return (this.getSalario() + bonus);
    }

    public void listaSupervisor(){
        System.out.println("----Supervisor----");
        System.out.println("Nome: " +  this.getNome() + " idade: " + this.getIdade() + ",sua bonificação é de: R$ " +  this.bonificação());
    }
}
