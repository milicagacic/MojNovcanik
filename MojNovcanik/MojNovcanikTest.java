package MojNovcanik;

import java.util.Scanner;

public class MojNovcanikTest {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite ime i prezime:");
        String ime=sc.next(),prezime= sc.next();
        System.out.println("Unesite dan,mesec i godinu rodjenja:");
        int dan=sc.nextInt(),mesec= sc.nextInt(),godina= sc.nextInt();
        System.out.println("Unesite vas id broj:");
        int id= sc.nextInt();
        System.out.println("Unesite vas broj telefona:");
        int brojTelefona= sc.nextInt();
        System.out.println("Unesite vas mail:");
        String mail=sc.next();
        System.out.println("Unesite lozinku:");
        String lozinka=sc.next();

        Logovanje log=new Logovanje(ime,prezime,dan,mesec,godina,id,brojTelefona,mail,lozinka);

        int novac=0;

        System.out.println("Trenutno imate 0 dinara na racunu,da li zelite da dodate novac?");
        String daNe=sc.next();
        if(daNe.equals("da")){
            System.out.println("Dodajte novac");
            novac= sc.nextInt();
        } else{
            System.out.println("Dobro.");
        }
        //korisnik moze da napravi novi racun u nekoj banci, ukine racun, da moze da pristupi nekom racunu kako da doda novac na njega,
        //tako i da skine neku sumu sa njega, promeni valutu ...
        System.out.println("Jel zelite novi racun u nekoj banci?");
        daNe= sc.next();
        if(daNe.equals("da")){
            System.out.println("Unesite ime i prezime:");
            String ime2=sc.next(),prezime2= sc.next();
            System.out.println("Unesite dan,mesec i godinu rodjenja:");
            int dan2=sc.nextInt(),mesec2= sc.nextInt(),godina2= sc.nextInt();
            System.out.println("Unesite vas id broj:");
            int id2= sc.nextInt();
            System.out.println("Unesite vas broj telefona:");
            int brojTelefona2= sc.nextInt();
            System.out.println("Unesite vas mail:");
            String mail2=sc.next();
            System.out.println("Unesite lozinku:");
            String lozinka2=sc.next();

            Logovanje log2=new Logovanje(ime2,prezime2,dan2,mesec2,godina2,id2,brojTelefona2,mail2,lozinka2);



        } else{
            System.out.println("Dobro.");
        }
        System.out.println("Zelite da skinete pare sa racuna?");
        daNe= sc.next();
        if(daNe.equals("da")){
            System.out.println("Koliko novca zelite?");
            int novac2= sc.nextInt();
            int tr=novac-novac2;
            System.out.println("Trenutno stanje na racunu je "+tr);
        } else{
            System.out.println("Dobro.");
        }
        System.out.println("Zelite da promenite valutu?");
        daNe= sc.next();
        if(daNe.equals("da")){
            System.out.println("Ok imamo samo eure.");
            System.out.println("Trenutno stanje na racunu je "+(novac/117));
        } else{
            System.out.println("Dobro.");
        }

        //Aplikacija treba da omogucava da korisnik moze da koristi svoje racune da placa razne stvari: kupuje odecu,
        //plati gorivo na pumpi, plati infostan ....

        System.out.println("Aplikacija omogucava koriscenje vasih racuna za razne stvari,medjutim,vi imate samo dinare i eure,a u ovoj drzavi se koriste dolari.");

        // Aplikacija se zavrsava samo tako sto korisnik PREKO KONZOLE joj kaze da izadje
        System.out.println("Pretpostavljam da zelite posle ove informacije da izadjete iz aplikacije jer je beskorisna u Vasem slucaju,jel da?");
        daNe= sc.next();
        if(daNe.equals("da")){
            System.out.println("Ok,cao");
        } else{
            System.out.println("Dobro.");
        }

        //Dokle god aplikacija prati generalnu pricu projekta, mozete da je pravite kako god,


    }
}
