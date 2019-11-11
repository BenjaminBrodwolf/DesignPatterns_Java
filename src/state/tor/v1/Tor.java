package state.tor.v1;

public class Tor {

    private Zustand zustand = new Oeffen(this);

    public void setZustand(Zustand zustand){
        this.zustand = zustand;
    }

    public void oeffnen(){
        zustand.oeffnen();
    }

    public void schliessen(){
        this.zustand.schliessen();
    }

    public void abschliessen(){
        this.zustand.abschliessen();
    }

    public void aufschliessen(){
        this.zustand.aufschliessen();
    }

}
