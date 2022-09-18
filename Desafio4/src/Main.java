import java.util.*;

public class Main {
    public static void main(String[] args) {

        int idadeAux =0;
        String nomeAux =null;

        Pessoas p1 = new Pessoas("Joao", 15);
        Pessoas p2 = new Pessoas("Leandro", 21);
        Pessoas p3 = new Pessoas("Paulo", 17);
        Pessoas p4 = new Pessoas("Jessica", 18);

        List<Pessoas> pessoa = new ArrayList<>();
        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);
        pessoa.add(p4);

        //Desafio4
        System.out.println("Desafio 4");
        System.out.println("");
        for (Pessoas pe : pessoa ) {

            if(idadeAux< pe.getIdade()){
                idadeAux = pe.getIdade();
                nomeAux = pe.getNome();
            }
        }

        System.out.println("Nome da pessoa mais velha: " + nomeAux );



        //Desafio5
        System.out.println("Desafio 5");

        System.out.println("");
        System.out.println("Antes de remover");
        int qtde=0;
        for(Pessoas pe : pessoa){
            System.out.println(" Nome: " + pe.getNome() + " Idade: " + pe.getIdade());
            qtde++;
        }
        System.out.println("Quantidade de pessoas na lista: " + qtde);


        Iterator<Pessoas> it = pessoa.iterator();
        idadeAux = 18;
        while(it.hasNext()){
            Pessoas pe = it.next();
            if(pe.getIdade()<idadeAux){
                it.remove();
            }
        }

        int qtde1 =0;
        System.out.println("");
        System.out.println("Depois de remover");
        for(Pessoas pe : pessoa){
            System.out.println("Nome: " + pe.getNome() + " Idade: " + pe.getIdade());
            qtde1++;
        }
        System.out.println("Quantidade de pessoas na lista: " + qtde1);

        System.out.println("");

    //Desafio 6
        System.out.println("Desafio 6");
        System.out.println("");
        Iterator<Pessoas> itr = pessoa.iterator();
        while(itr.hasNext()) {
            Pessoas pe = itr.next();
            if (pe.getNome().contains("Jessica")){
                System.out.println("Tem Jessica na lista ");
            }

        }



        }





        }





