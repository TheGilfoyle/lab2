import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Lunatone("Lunatone", 8);//полиморфизм
        Pokemon p2 = new Flygon("Flygon", 4);
        Pokemon p3 = new Jolteon("Jolteon", 7);
        Pokemon p4 = new Trapinch("Trapinch", 6);
        Pokemon p5 = new Vibrava("Vibrava", 5);
        Pokemon p6 = new Flygon("Flygon", 7);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}