public class Gerente extends Funcionario{

    double bonus = 10000;

    public Gerente() {
    }

    @Override
    public double bonificação() {

        return (this.getSalario() + bonus);
    }

         public void listaGerente(){
         System.out.println("----Gerente----");
         System.out.println("Nome: " +  this.getNome() + " idade: " + this.getIdade() + ",sua bonificação é de: R$ " +  this.bonificação());
    }



}
