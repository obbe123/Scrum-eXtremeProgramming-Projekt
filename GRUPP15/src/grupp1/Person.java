

package grupp1;


public class Person {
    private String lul;
    private String fNamn;
    private String eNamn;
    private int telefon;
    private String admin;
    private String email;
    private String losenord;
    
    public Person(String fNamn, String eNamn, int telefon, String admin, String email, String losenord){
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.telefon = telefon;
        this.admin = admin;
        this.email = email;
        this.losenord = losenord;
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
    
    public String getAdmin(){
        return admin;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getlosenord(){
        return losenord;
    }
}
