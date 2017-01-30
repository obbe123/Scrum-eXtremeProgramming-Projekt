package grupp1;

public class Person {

    private int id;
    private String fNamn;
    private String eNamn;
    private int pNummer;
    private String telefon;
    private String email;
    private boolean admin;
    private String beskrivning;
    private String losenord;
    private String titel;
    private String org;
    private String rum;

    public Person(int id, String fNamn, String eNamn, int pNummer, String email,
            boolean admin, String beskrivning, String losenord, String titel, String organisation, String telefon, String rum) {

        this.id = id;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.pNummer = pNummer;
        this.telefon = telefon;
        this.email = email;
        this.admin = admin;
        this.beskrivning = beskrivning;
        this.losenord = losenord;
        this.titel = titel;
        this.org = organisation;
        this.rum = rum;
    }

    public int getId() {
        return id;
    }

    public String getFNamn() {
        return fNamn;
    }

    public String getENamn() {
        return eNamn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getLosenord() {
        return losenord;
    }
    public String getTitel() {
        return titel;
    }
    public String getOrg() {
        return org;
    }
    public String getBeskrivning() {
        return beskrivning;
    }
    public String getKontorsRum() {
        return rum;
    }
}
