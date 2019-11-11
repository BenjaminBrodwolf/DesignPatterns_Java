package state.tor.v2;

public class Tor {

    private Zustand OFFEN_ZUSTAND = new Oeffen(this);
    private Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen(this);
    private Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen(this);

    private Zustand zustand = new Oeffen(this);

    public void setOeffenZustand(){
        this.zustand = OFFEN_ZUSTAND;
    }

    public void setGeschlossenZustand(){
        this.zustand = GESCHLOSSEN_ZUSTAND;
    }

    public void setAbgeschlossenZustand(){
        this.zustand = ABGESCHLOSSEN_ZUSTAND;
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
