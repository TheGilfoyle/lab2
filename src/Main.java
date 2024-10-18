import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Lunatone("Lunatone", 8);//полиморфизм
        Flygon p2 = new Flygon("Flygon", 4);
        /*Pokemon p3 = new Jolteon("Покемон 3", 1);
        Pokemon p4 = new Trapinch("Покемон 4", 1);
        Pokemon p5 = new Vibrava("Покемон 5", 1);
        Pokemon p6 = new Flygon("Покемон 6", 1);
         */
        b.addAlly(p1);
        b.addFoe(p2);
        /*
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

         */
        Effect e = new Effect().condition(Status.BURN);
        p1.addEffect(e);
        b.go();
    }
}