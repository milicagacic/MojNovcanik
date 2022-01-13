package MojNovcanik;

public  class Logovanje{
    private String ime;
    private String prezime;
    private int danRodjenja;
    private int mesecRodjenja;
    private int godinaRodjenja;
    private int id;
    private int brojTelefona;
    private String mail;
    private String lozinka;


    public Logovanje(String ime, String prezime, int danRodjenja, int mesecRodjenja, int godinaRodjenja, int id, int brojTelefona, String mail, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.danRodjenja = danRodjenja;
        this.mesecRodjenja = mesecRodjenja;
        this.godinaRodjenja = godinaRodjenja;
        this.id = id;
        this.brojTelefona = brojTelefona;
        this.mail = mail;
        this.lozinka = lozinka;
    }
    public String getIme() {
        return this.ime;
    }

    // Ime ne sme biti null i mora da ima bar jedan karakter ili nece biti poslato


    public void setIme(String ime) {
        if (ime != null && ime.length() > 0) {

            this.ime = ime;
        }
    }
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public int getDanRodjenja() {
        return danRodjenja;
    }

    public void setDanRodjenja(int danRodjenja) {
        this.danRodjenja = danRodjenja;
    }

    public int getMesecRodjenja() {
        return mesecRodjenja;
    }

    public void setMesecRodjenja(int mesecRodjenja) {
        this.mesecRodjenja = mesecRodjenja;
    }
    public int getGodinaRodjenja() {
        return this.godinaRodjenja;
    }

    //godine korisnika,mora biti punoletan


    public void setGodinaRodjenja(int godinaRodjenja) {
        if (godinaRodjenja < 2004) {

            this.godinaRodjenja = godinaRodjenja;
        } else {
            System.out.println("Korisnik mora biti punoletan.");
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }



}
