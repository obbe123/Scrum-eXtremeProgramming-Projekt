

package grupp1;


public class Person {
    
    private String fNamn;
    private String eNamn;
    private int telefon;
    
    private String email;
    private String losenord;
    
    public Person(String fNamn, String eNamn, int telefon, String email, String losenord){
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.telefon = telefon;
        
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

    
    public String getEmail(){
        return email;
    }
    
    public String getLosenord(){
        return losenord;
    }
}
