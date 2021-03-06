package engineer.anastasiou.delta;

import java.util.ArrayList;
import java.util.List;

public class Konto{
    private String inhaber;
    private String kontonummer;
    private String blz;
    private String iban;
    private String bic;
    private Geld saldo;
    private String passwort;
    private List<String> umsaetze;

    public Konto(){
        saldo = new Geld(0);
        umsaetze = new ArrayList<>();
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Geld getSaldo() {
        return saldo;
    }

    public void setSaldo(Geld saldo) {
        this.saldo = saldo;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public List<String> getUmsaetze() {
        return umsaetze;
    }

    public void setUmsaetze(List<String> umsaetze) {
        this.umsaetze = umsaetze;
    }
}
