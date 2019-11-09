package observer1;

public class Newsletter extends Observable {

    private String newsText;

    public Newsletter(){
        this.newsText = "Hello";
    }

    public String getNews() {
        return newsText;
    }

    public void setNewsText(String txt) {
        if ( !this.newsText.equals(txt)) { //verhindert den Zyklus, falls das gleiche Geschickt wird
            this.newsText = txt;
            notifyListeners(newsText);
        }
    }


}
