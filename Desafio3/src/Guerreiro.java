import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

    List<String> habilidade = new ArrayList<>();
    Random random = new Random();
    int randomInt = random.nextInt(300);

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        qtde += 1;

    }

    public void attack(){
        int total = (getForca() * getLevel()) + randomInt;
        System.out.println("O ataque foi de " + total);
        setXp(getXp()+5);

    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setForca(getForca()+50);
        setMana(getMana()+15);
        setInteligencia(getInteligencia()+15);
        setVida(getVida()+70);

    }

    public void aprenderHabilidade(String habilidades){
        habilidade.add(habilidades);
        Iterator<String> it = habilidade.iterator();
        while(it.hasNext()){
            String ability = it.next();
            System.out.println(ability);

    }}

    public void listaGuerreiro(){
        System.out.println("----GUERREIRO----");
        System.out.println("Nome: " + getNome());
        System.out.println("Level: " + getLevel());
        System.out.println("Vida: " + getVida());
        System.out.println("XP: " + getXp());
        System.out.println("Mana: " + getMana());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Força: " + getForca());
    }

}
