package design_patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Cookie cookie = new Cookie(100);
        CookieFactory cookieFactory = new CookieFactory(cookie);
        Cookie copy = cookieFactory.getCookie();

        System.out.println(cookie);
        System.out.println(copy);
    }

}
