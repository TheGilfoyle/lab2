package pokemons;

import moves.Bulldoze;
import moves.DoubleTeam;
import moves.Facade;
import moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lunatone extends Pokemon {
    public Lunatone(String name, int level) {
        super(name, level);
        this.setType(Type.ROCK, Type.PSYCHIC);
        this.setStats(90, 55, 65, 95, 85, 70);
//        this.setMove(new moves.Facade(Type.NORMAL, 70, 1), new moves.Bulldoze(Type.GROUND, 60, 1));
        this.setMove(new Facade(), new Bulldoze(), new DoubleTeam(), new ShadowBall());
    }
}
