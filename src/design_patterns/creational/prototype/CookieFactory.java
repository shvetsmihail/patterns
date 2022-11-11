package design_patterns.creational.prototype;

public class CookieFactory {
    private Cookie prototype;

    public CookieFactory(Cookie prototype) {
        this.prototype = prototype;
    }

    public Cookie getCookie() {
        return prototype.copy();
    }
}
