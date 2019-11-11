package observer.v3;

public class NewsletterMain {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        newsletter.addSub(source -> {
            System.out.println("\n------------------------");
            System.out.println("---> ich bin source: " + source);
            source.addSub(s -> System.out.println("-------> und bin INNER SOURCE " + s));
        });

        newsletter.setNewsText("Erste News");

        newsletter.setNewsText("Zweite News");

        newsletter.setNewsText("Dritte News");

        newsletter.setNewsText("Vierte News");
    }
}
