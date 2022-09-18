import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

    private List<String> magia = new ArrayList<>();
    Random random = new Random();
    int randomInt = random.nextInt(300);

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        qtde += 1;
    }

    public void aprenderMagia(String magias){
        magia.add(magias);
        Iterator<String> it = magia.iterator();
        while(it.hasNext()){
            String magic = it.next();
            System.out.println(magic);
        }

    }

    public int attack(){
        int total = (this.getInteligencia()*this.getLevel()) + randomInt;
        System.out.println("O ataque foi no valor de: " + total);
        setXp(getXp()+5);
        return total;
    }

    public void listaMago(){
        System.out.println("----MAGO----");
        System.out.println("Nome: " + getNome());
        System.out.println("Level: " + getLevel());
        System.out.println("Vida: " + getVida());
        System.out.println("XP: " + getXp());
        System.out.println("Mana: " + getMana());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Força: " + getForca());
        //for (String magic: magia) {
          //  System.out.println(magia);

        //}
    }


    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setMana(getMana()+50);
        setForca(getForca()+15);
        setInteligencia(getInteligencia()+30);
        setVida(getVida()+50);

    }


    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }
}
