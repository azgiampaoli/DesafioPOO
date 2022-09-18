public class Vendedor extends Funcionario{

    double bonus = 3000;

    @Override
    public double bonificação() {

        return (this.getSalario() + bonus);
    }

    public void listaVendedor(){
        System.out.println("----Vendedor----");
        System.out.println("Nome: " +  this.getNome() + " idade: " + this.getIdade() + ",sua bonificação é de: R$ " +  this.bonificação());
    }

}
