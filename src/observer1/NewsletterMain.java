package observer1;

public class NewsletterMain {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

//        ConsoleMessageObserver cm = new ConsoleMessageObserver();
//        newsletter.addListener(cm);
        newsletter.addSubscriber(new ConsoleMessageObserver());
        Subscriber s1 = new Subscriber("Sub1");
        Subscriber s2 = new Subscriber("Sub2");

        // variante den Observable direkt den Observer übergeben und dort abspeichern/registrieren
//        newsletter.addListener(new ConsoleMessageObserver(newsletter));
//        Subscriber s1 = new Subscriber("Sub1", newsletter);
//        Subscriber s2 = new Subscriber("Sub2", newsletter);

        newsletter.addSubscriber(s1);
        newsletter.addSubscriber(s2);

        newsletter.setNewsText("Erste News");

        newsletter.removeListener(s1);

        newsletter.setNewsText("Zweite News");
        newsletter.setNewsText("Zweite News");

    }
}
