package observerV3;

public class NewsletterMain {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        newsletter.addSubscriber(new ConsoleMessageObserver());


        newsletter.addSubscriber( source -> {
            System.out.println("HALLO");
            System.out.println("ich bin source: " + source);
            source.addSubscriber(s -> System.out.println("inner SOURCE" + s));
        });

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
