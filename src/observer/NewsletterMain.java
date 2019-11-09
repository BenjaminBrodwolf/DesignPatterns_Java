package observer;

public class NewsletterMain {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        newsletter.addSubscriber(new ConsoleMessageObserver());

        Subscriber s1 = new Subscriber("Sub1");
        Subscriber s2 = new Subscriber("Sub2");

        newsletter.addSubscriber(s1);
        newsletter.addSubscriber(s2);

        newsletter.setNewsText("Erste News");

        newsletter.removeListener(s1);

        newsletter.setNewsText("Zweite News");
        newsletter.setNewsText("Zweite News");

    }
}
