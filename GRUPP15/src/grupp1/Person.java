package grupp1;

public class Person {

    private int id;
    private String fNamn;
    private String eNamn;
    private int pNummer;
    private int telefon;
    private String email;
    private boolean admin;
    private String beskrivning;
    private String ovrigInfo;
    private String losenord;
    private String titel;
    private String org;

    public Person(int id, String fNamn, String eNamn, int pNummer, int telefon, String email,
            boolean admin, String beskrivning, String ovrigt, String losenord, String titel, String organisation) {

        this.id = id;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.pNummer = pNummer;
        this.telefon = telefon;
        this.email = email;
        this.admin = admin;
        this.beskrivning = beskrivning;
        this.ovrigInfo = ovrigt;
        this.losenord = losenord;
        this.titel = titel;
        this.org = organisation;
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

    public int getTelefon() {
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
    public String getOvrigInfo() {
        return ovrigInfo;
    }
}
