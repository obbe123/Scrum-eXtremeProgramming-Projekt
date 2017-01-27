

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
    private String ovrigt;
    private String losenord;
    
    public Person(int id, String fNamn, String eNamn, int pNummer, int telefon, String email, boolean admin, String beskrivning, String ovrigt, String losenord){
        this.id = id;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.pNummer = pNummer;
        this.telefon = telefon;
        this.email = email;
        this.admin = admin;
        this.beskrivning = beskrivning;
        this.ovrigt = ovrigt;
        this.losenord = losenord;
    }
    public int getId() {
    return id;
    }
    public String getFNamn(){
        return fNamn;
    }
    
    public String getENamn(){
        return eNamn;
    }
    
    public int getTelefon(){
        return telefon;
    }

    
    public String getEmail(){
        return email;
    }
    
    public String getLosenord(){
        return losenord;
    }
}
