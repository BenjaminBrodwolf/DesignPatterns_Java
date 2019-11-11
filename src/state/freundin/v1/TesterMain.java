package state.freundin.v1;

public class TesterMain {
    public static void main(String[] args) {
        Freundin freundin = new Freundin();
        //Defaultzustand: Neutral

        freundin.unterhalten(); //Hallo!
        freundin.verärgern();   //Du spinnst wohl! Ich bin sauer! ;-(
        //Ab jetzt: Bockig
        freundin.unterhalten(); //Fahr jetzt nach Hause! Ich will nicht mit dir reden!
        freundin.unterhalten(); //Fahr jetzt nach Hause! Ich will nicht mit dir reden!
        freundin.kussGeben();   //Na gut! Hab dich wieder lieb.
        //Ab jetzt: Neutral
        freundin.kussGeben();   //Hihi :-)
        //Ab jetzt: Fröhlich
        freundin.unterhalten(); //Hihi, mir gehts super!
    }
}
