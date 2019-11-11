package observer.v3;

public class Newsletter extends Observable {

    private String newsText;

    public Newsletter(){
        this.newsText = "Hello";
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
        notifyListeners();
    }

}
