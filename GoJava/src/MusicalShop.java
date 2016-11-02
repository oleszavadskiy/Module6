/**
 * Created by Олесь on 02.11.2016.
 */


import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{"+getType()+"}";


    }
}
class Piano extends MusicalInstrument {
    @Override
    public String getType() {
        return "Piano";

    }
}
class Guitar extends MusicalInstrument {
    @Override
    public String getType() {
        return "Guitar";
    }
}

class Trumpet extends MusicalInstrument {
    @Override
    public String getType(){
        return "Trumpet";
    }
}

class MusicalShop {
    int pianos;
    int guitars;
    int trumpets;

    public int getPianos() {
        return pianos;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public int getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    @Override
    public String toString() {
        return "MusicalShop{" +
                "pianos=" + pianos +
                ", guitars=" + guitars +
                ", trumpets=" + trumpets +
                '}';
    }

}



