package design_patterns.structural.adapter;

public class EuUsaSocketAdapter extends AmericanPlug implements EUSocket{

    @Override
    public void plugEUSocket() {
        plugUSASocket();
    }
}
