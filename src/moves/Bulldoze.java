package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 1);
    }
    //Has a 100% chance to lower the target's Speed by one stage.

    protected void setMod(Stat stat, int level) {
        setMod(Stat.SPEED, -1);//???????????????????точно ли так???????????????????
//        System.out.println(stat(Stat.SPEED));
    }

    @Override
    protected String describe() {
        return "атакует атакой Bulldoze";
    }
}
