import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Lunatone("Покемон 1", 1);//полиморфизм
        Pokemon p2 = new Eevee("Покемон 2", 1);
        Pokemon p3 = new Jolteon("Покемон 3", 1);
        Pokemon p4 = new Trapinch("Покемон 4", 1);
        Pokemon p5 = new Vibrava("Покемон 5", 1);
        Pokemon p6 = new Flygon("Покемон 6", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}