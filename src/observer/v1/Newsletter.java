package observer.v1;

public class Newsletter extends Observable {

    private String newsText;

    public Newsletter(){
        this.newsText = "Hello";
    }

    public void setNewsText(String txt) {
            this.newsText = txt;
            notifyListeners(newsText);
    }

}
