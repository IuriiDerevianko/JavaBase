package ua.itea.javabasic.practice.lesson15.credential;
public class ThirdCredential<L, P extends Number> {
    private L login;
    private P pin;

    public L getLogin() {
        return login;
    }

    public P getPin() {
        return pin;
    }

    public void setLogin(L login) {
        this.login = login;
    }

    public void setPin(P pin) {
        this.pin = pin;
    }
}
