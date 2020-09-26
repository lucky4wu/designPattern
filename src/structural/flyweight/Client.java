package structural.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));

        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("jack"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("smith"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("king"));

        System.out.println(factory.getWebSiteCount());

    }
}
