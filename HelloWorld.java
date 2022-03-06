package helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //Első óra
        //1. Írd ki a konzolra egy sorba a „Hello Világ!” szöveget!
        System.out.println("Helló Világ");
        //2. Írd ki egymás mellé a Helló és Világ szót két paranccsal (szóköz legyen közöttük)! Használd a System.out.print() utasítást a feladat megoldására!
        System.out.println("Helló\tVilág");
        //3. Írd ki saját publikus adataid a konzolra egy sorban! (Név, Szak, évfolyam stb.)
        System.out.println("Tóth Péter Barnabás\tGazdaságinformatika\t2. Félév");
        //4. Írd ki saját publikus adataid a konzolra, három sorban! (Név, Szak, évfolyam stb.)
        System.out.println("Tóth Péter Barnabás\nGazdaságinformatika\n2. Félév");
        //5. Írd ki a konzolra kedvenc versed első néhány versszakát! Az első sor a vers címe, az utolsó sor a költő neve legyen, a versszakok között legyen üres sor!
        System.out.println("\nHat jó játék kisbabáknak\n\nJó játék a cicafarok,\nszélte pont egy babamarok.\nÉn húztam meg, mit akarok?\nJó játék a cicafarok.\n\nJó játék a mobilteló,\nfogalmam sincs, mire való.\nLenyálazom, aztán heló,\njó játék a mobilteló.\n\nJó játék a laptopkábel,\nfőleg, ha még nem lopták el.\nNégy fogaddal hipp-hopp rágd el,\njó játék a laptopkábel.\n\nJó játék a lapát,\nazzal ütjük apát.\nOrrot, fület lapít,\njó játék a lapát.\n\nJó játék a verseskötet,\nvan rajta egy teljes köpet.\nÁtnyálaztam, még egy jöhet,\njó játék a verseskötet.\n\nJó játék a konektor,\nén jöttem rá magamtól.\nBeledugom, hol egy toll?\nJó játék a konektor.\n\nVarró Dániel");
        //6. Készítsd el órarendedet! Használd a  \t tabulátor escape szekvenciát!
        System.out.println("\t\tHétfő\t\t\t\tKedd\t\t\t\tSzerda\t\t\t\tCsütörtök\t\t\t\tPéntek\n8:00-9:30\t\t\t\t\tProgramozás alapjai 1\t\t\t\t\t\tSzámítógép- és hálózati architekróra\n9:40-11:10\t\t\t\t\t\t\t\t\tMatematika alapok 2\t\tProgramozás alapjai 1\n11:20-12:50\t\t\t\t\tGazdaságpolitika\t\t\t\t\t\tTevékenységek Számvitele és a Beszámoló\n13:00-14:30\t\t\t\t\tSzámítógép és hátózati architektúra\t\t\t\tAdatbáziskezelés\n14:40-16:10\t\t\t\t\tMatematika alapok 2\n16:20-17:50\t\t\t\t\tPénzügyek informatikusoknak");
        System.out.println("\u001B[33m\u001B[41mHelló Világ"); //Sárga szín és Piros Háttér. //30-asok előtér, azaz szöveg, 40-esek a hátterek. Fekete:0 Piros:1 Zöld:2 Sárga:3 Kék:4 Magenta:5 Cián:6 Fehér:7

        //Második óra
        System.out.println(9 + 5);
        System.out.println(9 - 5);
        System.out.println(9 * 5);
        System.out.println(9 / 5);
        System.out.println(9 % 5); //Maradék osztás
        System.out.println(9 / 5.0);
        System.out.println("9 * 5 = " + 9 * 5); // + az a Konkatenálás
        System.out.println("9.3 + 5 = " + 9.3 + 5); // A precedencia miatt és a balról jobbra szabály miatt, először a "9.3 + 5 = " + 9.3-at hajtja végre ami "9.3 + 5 = 9.3"-lesz konkatenálás miatt. Ezután a "9.3 + 5 = 9.3" + 5-öt hajtja végre, ami "9.3 + 5 = 9.35"-lesz még egy konkatenálás miatt.
        System.out.println("9.3 + 5 = " + (9.3 + 5)); // A precedencia matematika elvén múködik.
        System.out.println(9 * ((5 + 8) + 7)); // Az összetetteb zárójeleket nem {[()]} formályában, hanem ((())) formályában kell megvalósítani.
        System.out.println("9 - 5 = " + (9 - 5)); // A ("9 - 5 = " + 9 - 5) NEM ÉRTELMEZHETŐ! Mert balról jobbra haladva először konkatenálást végzi el: ("9 - 5 = 9" - 5). Majd a "9 - 5 = 9", ami egy SZÖVEG, nem lehet kivonni az 5-öt. (Szöveg-5 matematikában sem értelmes.)(A - jel nem takar a kivonásnál itt több értelmet, nem úgy mint a +, am összeadás ÉS Konkatenálást is jelent.)
        System.out.println(1 * 2 + 3 * 5 % 4);
        System.out.println(1 + 8 % 3 * 2 - 9);
        double a = 9.3;
        int b = 5;
        int c = 9;
        double d = 5.0;
        System.out.println(a + b);
        System.out.println(c - b);
        System.out.println(c * b);
        System.out.println(c / d);
        System.out.println(c % b);
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Kérem adja meg a p valós szám változó értékét:");
        double w = scan.nextDouble(); // 9,3-at kell a konzolba írni, nem 9.3-at!
        int q = 5;
        int r = 9;
        double s = 5.0;
        System.out.println(w + q);
        System.out.println(r - q);
        System.out.println(r * q);
        System.out.println(r / s);
        System.out.println(r % q);
        System.out.println("Kérem adja meg az e valós szám változó értékét:");
        double e = scan.nextDouble(); // 9,3-at kell a konzolba írni, nem 9.3-at!
        System.out.println("Kérem adja meg az f egész szám változó értékét:");
        int f = scan.nextInt();
        System.out.println("Kérem adja meg a g egész szám változó értékét:");
        int g = scan.nextInt();
        System.out.println("Kérem adja meg a h valós szám változó értékét:");
        double h = scan.nextDouble();
        System.out.println(e + f);
        System.out.println(g - f);
        System.out.println(g * f);
        System.out.println(g / h);
        System.out.println(g % f);
        System.out.println(g + " % " + f + " = " + g % f);
        int x;
        int p;
        int n;
        Scanner scan = new Scanner (System.in); // Egyszer már meg van adva. Ez a sor elött álló "//" maradjon.
        System.out.println("Kérem a kezdőtőke értékét"); //Rányomni a sorszámra, majd a fejlétcnél a Debug-ra rányomni és a Debug Projectre(Ctrl-F5). Majd a step over(F8)-al tovább haladni. Miután felvettük a változókat az egér ráhúzásával kimutatja az értékeket. Egy szakasz értékét is megmutatja, mint pl: p / 100 -nál 0-t mutat, a p / 100.0-nál 0.2 -t ha p az 20.
        x = scan.nextInt();
        System.out.println("Kérem a kamatlábat");
        p = scan.nextInt();
        System.out.println("Kérem a futamidőt években");
        n = scan.nextInt();
        double jovoertek = x * Math.pow(1 + p / 100.0, n); //Ha p / 100-at írunk akkor az egész szám / egész szám(int/int) egész számot(int-et) ad ebben az esetekben 0-át. Míg a p / 100.0 az egész szám / valós szám(int/double), így az erednémy valós szám(double).
        System.out.println(jovoertek);
        //*/
        System.out.println((5 >= 4) && (3 <= 9) || !(7 > 4));
        System.out.println(!((5 >= 4) || (3 <= 2) || (7 > 4)));
        System.out.println(7 / 3 + 13 / 5 + 2 * (20 - 17) / 2);
        System.out.println(7 % 3 + 13 / 5 + 2 * (20 - 17) / 2);
        //-1. Deklarálj egy egész típusú változót és egy újabb paranccsal adj értéket a változónak
        int z;
        z = 7;
        System.out.println(z);
        //-2. Egy egész típusú változónak létrehozáskor add meg az értékét, majd változtasd meg
        int u = 7;
        u++;
        u--;
        u += 3;
        u -= 3;
        u *= 1;
        System.out.println(u);
        //3. Végeztesd el az alábbi számításokat! Az eredményt írd ki a konzolra! A műveletet is írja ki a program. Pl.: 9-2=7 9 – 2 9 * 2.5  9 / 2  9 / -2  9 % 2  9 % -2  -9 % 2  2*9+2*3%2 9 / -2.0  9 + 2 * 5  (2 + 3) * 9+2 2*9+(3+2)/2
        System.out.println("9 - 2 = " + (9 - 2));
        System.out.println("9 % 2 = " + 9 % 2);
        System.out.println("9 / 2.0 = " + 9 / 2.0);
        System.out.println("9 * 2.5 = " + 9 * 2.5);
        System.out.println("9 % -2 = " + 9 % -2);// A -2-őt nem kell külön zárójelbe tenni.
        System.out.println("9 + 2 * 5 = " + (9 + 2 * 5));
        System.out.println("9 / 2 = " + 9 / 2);
        System.out.println("-9 % 2 = " + -9 % 2);
        System.out.println("(2 + 3) * 9 + 2 = " + ((2 + 3) * 9 + 2));
        System.out.println("9 / -2 = " + 9 / -2);
        System.out.println("2 * 9 + 2 * 3 % 2 = " + (2 * 9 + 2 * 3 % 2));
        System.out.println("2 * 9 + (3 + 2) / 2 = " + (2 * 9 + (3 + 2) / 2));
        //4. Add meg a változók értékeit: a=9, b=2, d=2,5; Írasd ki a következő képletet és az értékét: z=a*b+a/b+(a+3)
        int i = 9;
        int o = 2;
        double ő = 2.5;
        System.out.println(i * o + i / o + ((i + 3)));
        //5. Hozz létre egy egyész típusú változót BruttoAr néven és egy valós típusú változót AFA néven. Add meg a kezdőértékeket. Számold ki a nettó árat és írd ki a konzolra.
        /*
        System.out.println("Add meg a Bruttó Árat.");
        int BruttoAr = scan.nextInt();
        System.out.println("Add meg az Áfát.");
        double AFA = scan.nextDouble();
        System.out.println(BruttoAr/(100.0+AFA)*100);
        //*/
        //6. Írd ki a felhasználó által megadott százalékalap és százalékláb ismeretében a százalékértéket! 
        /*
        System.out.println("Add meg a százalékalapot.");
        int szazalekalap = scan.nextInt();
        System.out.println("Add meg a százaléklábaz.");
        double szazaleklab = scan.nextDouble();
        System.out.println("Százalékérték = " + szazalekalap/100.0*szazaleklab);
        //*/
        //7. Kérj be egy egész számot. A program írja ki a konzolra: „Kérek egy egész számot.” Írd ki a szám négyzetét, négyzetgyökét, köbét és köbgyökét.
        /*
        System.out.println("Kérek egy egész számot.");
        double ú = scan.nextInt();
        System.out.println(Math.pow(ú,2));
        System.out.println(Math.sqrt(ú));
        System.out.println(Math.pow(ú,3));
        System.out.println(Math.pow(ú,(1.0/3)));
        //*/
        //8. Kérj be két egész számot. A program mindig írja ki a konzolra, hogy mit vár. Pl.: Kérek egy egész számot. Kérek egy másik egész számot. Írd ki a négy alapműveletet rajtuk! (*, /, +, -): Pl. 12 + 3 = 15
        /*
        System.out.println("Kérek egy egész számot.");
        int ö = scan.nextInt();
        System.out.println("Kérek egy másik egész számot.");
        int ü = scan.nextInt();
        System.out.println(ö+ü);
        System.out.println(ö-ü);
        System.out.println(ö*ü);
        System.out.println(ö/ü);
        //*/
        //9. Kérd be a termék nettó árát, az ÁFA értéket (valós szám legyen), majd írd ki a bruttó árat
        /*
        System.out.println("Nettó Ár:");
        int nettóár = scan.nextInt();
        System.out.println("Áfa:");
        double ÁFA = scan.nextDouble();
        System.out.println(nettóár/100*(100+ÁFA));
        //*/
        //10. Kérd be a mértani alakzatok (téglalap, kör, háromszög) adatait, majd írd ki az alakzatok kerületét, területét. (A háromszög területét Héron képlettel számíthatod ki.)
        /*
        System.out.println("Téglalap a oldala:");
        double teglalapa = scan.nextDouble();
        System.out.println("Téglalap b oldala:");
        double teglalapb = scan.nextDouble();
        System.out.println("Kör sugara:");
        double Korr = scan.nextDouble();
        System.out.println("Háromszög a oldal:");
        double haromszoga = scan.nextDouble();
        System.out.println("Háromszög b oldala:");
        double haromszogb = scan.nextDouble();
        System.out.println("Háromszög c oldala:");
        double haromszogc = scan.nextDouble();
        System.out.println("Téglalap kerülete: " + (2*teglalapa+2*teglalapb));
        System.out.println("Téglalap területe: " + teglalapa*teglalapb);
        System.out.println("Kör kerülete: " + 2*Korr*Math.PI);
        System.out.println("Kör területe: " + Math.PI * Math.pow(Korr,2));
        System.out.println("Háromszög kerülete: " + (haromszoga+haromszogb+haromszogc));
        double haromszogs = (haromszoga+haromszogb+haromszogc)/2;
        System.out.println("Háromszög területe: " + (Math.sqrt(haromszogs*(haromszogs-haromszoga)*(haromszogs-haromszogb)*(haromszogs-haromszogc))));
        //*/
        //11. Kérd be a gömb sugarát, majd írd ki a térfogatát. V=(4*R3*PI/3)
        /*
        System.out.println("Gömb sugara:");
        double gombr = scan.nextDouble();
        System.out.println(4*Math.pow(gombr,3)*Math.PI/3);
        //*/
        //12. Számítsd ki egy bankbetét kamatos kamattal növelt értékét! A felhasználónak meg kelljen adnia a betétet, a futamidőt évben és az éves kamatlábat
        /*
        System.out.println("Kérem a kezdőtőke értékét"); 
        int betet = scan.nextInt();
        System.out.println("Kérem a kamatlábat");
        int kamatlab = scan.nextInt();
        System.out.println("Kérem a futamidőt években");
        int futamido = scan.nextInt();
        double jovoertek112 = betet * Math.pow(1 + kamatlab / 100.0, futamido);
        System.out.println(jovoertek112);
        //*/
        //Harmadik óra
        int j3 = -5;
        if (j3 > 0) { //Debugnál arra a sorra ugrik, amelyik feltétel teljesül.
            System.out.println("A j értéke nagyobb, mint nulla.");
        } else {
            System.out.println("A j értéke egyenlő 0-val, vagy kisebb 0-nál.");
        }
        System.out.println("Vége a programnak");
        int k = 0;
        if (k == 0) {
            System.out.println("A k értéke egyenlő 0-val");
        } else if (k < 0) {
            System.out.println("A k egy negatív szám");
        } else {
            System.out.println("A k pozitív szám");
        }
        System.out.println("Vége a programnak");
        int l = 8;
        if (l >= 5) { //Ez a rossz hosszú és jobban leterhelő kódsor!
            if (l <= 10) {
                if (l % 2 == 0) {
                    System.out.println("A szám 5 és 10 között van és osztható 2-vel");
                }
            }
        }
        if (l >= 5 && l <= 10 && l % 2 == 0) { //Ez a helyes kód.
            System.out.println("A szám 5 és 10 között van és osztható 2-vel");
        }
        int é = 12;
        if (é <= 4 || é >= 16) { // A || a logikai vagy, a && a logikai és.
            System.out.println("é nem 5 és 15 között van");
        } else {
            System.out.println("é 5 és 15 között van");
        }
        if (!(é >= 4 && é <= 16)) { //A ! a tagadás jele. 
            System.out.println("é nem 5 és 15 között van");
        } else {
            System.out.println("é 5 és 15 között van");
        }
        int á = 17;
        if (!(á >= 5 && á <= 10) && á % 2 != 0) {
            System.out.println(á + "értéke az 5 és 10 intervallum kivülre esik és páratlan");
        }
                int ev = 2000;
        int honap = 3;
        switch (honap) {
            case 1:
            case 3:
            case 5:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 8:
                System.out.println("30");
                break;
            case 2:
                if ((ev % 4 == 0 && ev % 100 != 0) || ev % 400 == 0) {
                    System.out.println("29");
                    break;
                } else {
                    System.out.println("28");
                    break;
                }
        }
        
        String szoveg = "Egy kis ilyen";
        int kszam = 0;
        for (int msz = 0; msz < szoveg.length(); msz++) {
            System.out.println(szoveg.charAt(msz));
            if (szoveg.charAt(i) != k){
                continue;
            }
             kszam++;
        }
        System.out.println(kszam);
        //1. Oldd meg a következő egyenleteket: Az egyenlet kiszámításához szükséges adatokat a billentyűzetről olvasd be! a5/c+PIa/(b+c) a+b⋅√(b/d) √((sin(n)/b∗c) (a⋅√(b+c))/(c*d)
        /*
        System.out.println("Adj meg egy a értéket");
        double a31 = scan.nextDouble();
        System.out.println("Adj meg egy b értéket");
        double b31 = scan.nextDouble();
        System.out.println("Adj meg egy c értéket");
        double c31 = scan.nextDouble();
        System.out.println("Adj meg egy d értéket");
        double d31 = scan.nextDouble();
        System.out.println("Adj meg egy n értéket");
        double n31 = scan.nextDouble();
        System.out.println(Math.pow(a31, 5) / c31 + Math.PI * 3 / (b31+c31));
        System.out.println(a31+b31*Math.sqrt(b31/d31));
        System.out.println(Math.sqrt(Math.sin(n31)/(b31*c31)));
        System.out.println(a31*Math.sqrt(b31+c31)/c31*d31);
        //*/
        //2. Oldd meg a fenti egyenleteket úgy, hogy megvizsgálod, hogy az egyenletek megoldhatóak-e. Pl. egy osztásban az osztó nem lehet 0, vagy a négyzetgyök alatt nem lehet negatív szám! Ha valamelyik állapot fennáll, akkor adj hibaüzenetet a hiba okáról! Ilyenkor a számítást nem szabad elvégezni!
        /*
        if (b31/d31 >= 0 && b31+c31 >= 0 && c31 != 0 && b31+c31 != 0 && b31 != 0 && d31 != 0 && Math.sin(n31)/(b31*c31) >= 0 ){
        System.out.println(Math.pow(a31, 5) / c31 + Math.PI * 3 / (b31+c31));
        System.out.println(a31+b31*Math.sqrt(b31/d31));
        System.out.println(Math.sqrt(Math.sin(n31)/(b31*c31)));
        System.out.println(a31*Math.sqrt(b31+c31)/(c31*d31));
        }else{
        System.out.println("Nem végezhető el 0-val való osztás miatt vagy a négyzzetgyök alatt negatív van.");//A radiános sinusz megoldás is lehet negatív, viszont a maradékos osztás abszolút értéket ad, emiatt valószínűleg for ciklussal kell majd megoldani. !!
        }
        //*/
        //3. Oldd meg az egyenleteket úgy, hogy a feltételt úgy állítod be, hogy akkor oldja meg a feladatot, ha az egyenlet változói megfelelőek, azaz a feltételes elágazás igaz ágában oldod számítod ki az eredményt és a hamis ágában adsz hibaüzenetet. Oldd meg úgy is az egyenleteket, hogy a feltételes elágazás hamis ágában oldod meg az egyenletet és az igaz ágában adsz hibaüzenetet!
        //a. része
        /*
        if (b31/d31 >= 0 && b31+c31 >= 0 && c31 != 0 && b31+c31 != 0 && b31 != 0 && d31 != 0 && Math.sin(n31)/(b31*c31) >= 0 ){
        System.out.println(Math.pow(a31, 5) / c31 + Math.PI * 3 / (b31+c31));
        System.out.println(a31+b31*Math.sqrt(b31/d31));
        System.out.println(Math.sqrt(Math.sin(n31)/(b31*c31)));
        System.out.println(a31*Math.sqrt(b31+c31)/(c31*d31));
        }else{
        System.out.println("Nem végezhető el 0-val való osztás miatt vagy a négyzzetgyök alatt negatív van.");
        }
        //*/
        //b része
        /*
        if (!(b31/d31 >= 0 && b31+c31 >= 0 && c31 != 0 && b31+c31 != 0 && b31 != 0 && d31 != 0 && Math.sin(n31)/(b31*c31) >= 0 )){
        System.out.println("Nem végezhető el 0-val való osztás miatt vagy a négyzzetgyök alatt negatív van.");
        }else{
        System.out.println(Math.pow(a31, 5) / c31 + Math.PI * 3 / (b31+c31));
        System.out.println(a31+b31*Math.sqrt(b31/d31));
        System.out.println(Math.sqrt(Math.sin(n31)/(b31*c31)));
        System.out.println(a31*Math.sqrt(b31+c31)/(c31*d31));
        }
        //*/
        //4. Adj részletes hibaüzenetet abban az esetben, ha az egyenlet nem oldható meg. Azaz írd ki az összes hibalehetőséget, ami fennáll, ha az egyenlet nem oldható meg! Pl. c értéke nem lehet 0, a négyzetgyök alatt nem lehet negatív érték!
        /*
        if (!(b31/d31 >= 0 && b31+c31 >= 0 && c31 != 0 && b31+c31 != 0 && b31 != 0 && d31 != 0 && Math.sin(n31)/(b31*c31) >= 0 )){
        System.out.println("Vagy a b és d hányadosa negatív, vagy a b és c összege negatív, vagy a c értéke 0-a, vagy a b és c összege 0, vagy a b értéke 0-a, vagy a d értéke 0-a, vagy a sin(n)/b*c értéke negatív.");
        }
        //*/
        //Negyedik óra
        for (int ia = 1; ia <= 5; ia = ia + 1) {
            System.out.println(ia);
        }

        /*
        System.out.println("Kérek egy számot:");
        int nb4 = scan.nextInt();
        System.out.println(nb4 + "osztói");
        System.out.println(1);
        for (int ib = 2; ib <= nb4 / 2; ib++) {
        if (nb4 % ib == 0) {
        System.out.println(ib);
        }
        }
        System.out.println(nb4);
        System.out.println("Kérek egy páratlan számot:");
        int nc4 = scan.nextInt();
        while (nc4 % 2 == 0) {
        System.out.println("A szám páros kérek egy páratlan számot!");
        nc4 = scan.nextInt();
        }
        System.out.println(nc4 * 2);
        //*/
        Random rnd = new Random();
        /*
        int velSzam4;
        do {
            velSzam4 = rnd.nextInt(20) + 1;
        } while (velSzam4 % 2 != 0);
        System.out.println(velSzam4);
        //*/
        /*
        int velszam4 = rnd.nextInt(5) + 1;
        int tipp;
        for (int ic4 = 1; ic4 <= 10; ic4++) {
            System.out.println("Add meg a (z)" + ic4 + ". tipped:");
            tipp = scan.nextInt();
            if (tipp == velszam4) {
                System.out.println("Gratulálok kitaláltad a számot!");
                break;
            }  
        }
        for (int id4 = 1; id4 <= 10; id4++) {
            System.out.println("Add meg a (z)" + id4 + ". tipped:");
            tipp = scan.nextInt();
            if (tipp != velszam4) {
                continue;
            }
            System.out.println("Gratulálok kitaláltad a számot!");
            break;
        }
        //*/
        //1. Írd ki a számokat 1 -től 10 -ig egyesével.
        for (int a41 = 1; a41 <= 10; a41++) {
            System.out.println(a41);
        }
        //2. Írd ki a számokat -15-től 30-ig kettesével.
        for (int a42 = -15; a42 <= 30; a42++) {
            if (a42 % 2 == 0) {
                System.out.println(a42);
            }

        }
        //3. Írd ki a páros számokat 10 - 30 között úgy, hogy a ciklus fejében nem használsz if-et.
        for (int a43 = 5; a43 <= 15; a43++) {
            System.out.println(a43 * 2);

        }
        //4. Írd ki a számokat 10 -től -10 -ig visszafelé egyesével.
        for (int a44 = 10; a44 >= -10; a44--) {
            System.out.println(a44);

        }
        //5. Írd ki a számokat 0- tól 10 -ig egynegyedes lépésközzel.
        for (double a45 = 0; a45 <= 10; a45 += 0.25) {
            System.out.println(a45);

        }
        //6. A felhasználótól kérj be egy intervallumot A és B, egy lépésközt N, majd ezen intervallumon belül írd ki a megadott lépésközzel a számokat.
        /*
        System.out.println("Adj meg egy számot:");
        double a46 = scan.nextDouble();
        System.out.println("Adj meg egy másik számot:");
        double b46 = scan.nextDouble();
        System.out.println("Adj meg egy lépéközt:");
        double n46 = scan.nextDouble(); //Ha nem egészt számat adunk meg akkor szétcsúszik a megoldás!!
        for (double i46 = a46; i46 <= b46; i46+=n46) {
        System.out.println(i46);
        }
        //*/
        //7. Oldd meg, azt, ha a felhasználó az intervallumot "fordítva" adja meg, Tehát A > B, akkor a program csökkenő sorrendben, ha "normál" módon B > A akkor növekvő sorrendben írja a növekménynek megfelelően a számokat.
        /*
        System.out.println("Adj meg egy egész számot:");
        int a47 = scan.nextInt();
        System.out.println("Adj meg egy másik egész számot:");
        int b47 = scan.nextInt();
        if (a47 > b47) {
            for (int i47 = a47; i47 >= b47; i47--) {
                System.out.println(i47);
            }
        } else {
            for (int i471 = a47; i471 <= b47; i471++) {
                System.out.println(i471);
            }
        }
        //*/
        //8. Oldd meg azt, ha a felhasználó "fordítva", vagy "normál" adja meg a számokat, akkor a program mindig növekvően írja ki a számokat!
        /*
        System.out.println("Adj meg egy egész számot:");
        int a48 = scan.nextInt();
        System.out.println("Adj meg egy másik egész számot:");
        int b48 = scan.nextInt();
        if (a48 < b48) {
            for (int i481 = a48; i481 <= b48; i481++) {
                System.out.println(i481);
            }
        } else {
            for (int i48 = b48; i48 <= a48; i48++) {
                System.out.println(i48);
            }
        }
        //*/
        //9. Írj ki 10 db. véletlenszámot a 20 és 80 közötti intervallumban.
        /*
        int velSzam49;
        for (int i49 = 1; i49 <= 10; i49++) {
            velSzam49 = rnd.nextInt(60) + 20;
            System.out.println(velSzam49);

        }
        //*/
        //10. Kérj be egy egész számot, majd írj ki ennyi csillag jelet egymás mellé!
        /*
        System.out.println("Kérek egy egész számot!");
        int a410 = scan.nextInt();
        for (int i410 = 1; i410 <= a410; i410++) {
            System.out.print("*");
        }
        System.out.println(" ");
        //*/
        //11. Írj lotto programot. A 13+1 tippet 1,2,X eredménnyel add meg. Pl. 1. tipp -> 2, 2. tipp -> X,...
        /*
        int velszam411 = rnd.nextInt(13) + 1;
        int tipp;
        for (int ia411 = 1; ia411 <= 13; ia411++) {
            System.out.println("Add meg a (z)" + ia411 + ". tipped:");
            tipp = scan.nextInt();
            System.out.println("1. tipp -> " + tipp);
            if (tipp == velszam411) {
                System.out.println("Gratulálok kitaláltad a számot!");
                break;
            }
        }
        //*/
        
        //12. Kérj be 10 számot, majd minden egyes lépésben írd ki az adott szám négyzetét.
        /*
        for (int m = 1; m <= 10; m++) {
            System.out.println("Kérek egy számot");
            int a412 = scan.nextInt();
            System.out.println(Math.pow(a412, 2));
        }
        //*/
        //13. Kérj be 10 számot, majd minden egyes lépésben írd ki a szám szinuszát. Vigyázz, a Math.sin() függvény radiánban várja az adatot. A Math.toRadians() függvény a fokban megadott értéket átszámítja radiánba.
        /*
        for (int m = 1; m <= 10; m++) {
            System.out.println("Kérek egy számot");
            int a413 = scan.nextInt();
            System.out.println(Math.toRadians(a413));
            
        }
        //*/
        //14. Egy kockával 10-szer dobunk. Írd ki a kockadobás eredményeit számokkal. A dobások értékeit véletlenszám generálással oldd meg.
        for (int m = 1; m <= 10; m++) {
            int a414 = rnd.nextInt(5)+1;
            System.out.println(a414);
            
        }
        
        //15. Kérj be egy számot, majd írd ki az osztóit, osztóinak darabszámát! Az osztók darabszáma alapján döntsd el, hogy a szám prímszám-e!
        /*
        System.out.println("Kérek egy számot");
        int a415 = scan.nextInt();
        int oszt415 = 0;
        for (int m = 1; m <= a415; m++) {
            if(m%a415 == 0){
                oszt415++;
                System.out.println(m);
            }
            
        }
        if (oszt415 == 2) {
            System.out.println("A szám páros");
            
        }
        //*/
        
        //16. Kérj be egy számot n, majd írd ki n! értékét.
        /*
        System.out.println("kérek egy számot");
        int a416 = scan.nextInt();
        int b416 = 1;
        for (int m = a416; m >= 1; m--) {
            b416 = b416*a416;
            a416--;
        }
        System.out.println(b416);
        //*/
        //17. Kérj be a felhasználótól egy páros számot! A program addig ne menjen tovább, amíg a felhasználó által megadott szám nem páros!
        /*
        System.out.println("Kérek egy páros számot");
        int a417 = scan.nextInt();
        while(a417%2 != 0){
            System.out.println("Egy Páros számot kérek");
            a417 = scan.nextInt();
        }
        //*/
        //18. Állíts elő egy véletlen páros számot a 20 és 80 intervallumban.
        int a418 = (rnd.nextInt(30)+11)*2;
        System.out.println(a418);
        
        //19. Készíts számkitalálós programot! A program állítson elő egy véletlenszámot, amit a felhasználónak ki kell találnia. A program kérje be a felhasználó tippjeit. Ha a tipp kisebb, mint a program által előállított, akkor a program írja ki, hogy az én számom nagyobb, ha kisebb, akkor azt, hogy az én számom nagyobb. A program a végén írja ki, hogy hány lépésben sikerült kitalálni a számot!
        /*
        int a419 = rnd.nextInt(10)+1;
        System.out.println("Kérek egy számot");
        int tipp419 = scan.nextInt();
        int b419 = 1;
        while(a419 != tipp419){
            if(tipp419 < a419){
                System.out.println("A szám nagyobb, adj meg egy újat");
                tipp419 = scan.nextInt();
                b419++;
            } else {
                System.out.println("A szám kisebb, adj meg egy új számot");
                tipp419 = scan.nextInt();
                b419++;
            }
        }
        System.out.println("Gratulálok eltaláltad a számot " + b419 + " lépésből!");
        //*/
        //20. Állítsd elő a szorzótáblát táblázatos formában, az alábbi módon. Hogy hányszor hányas szorzótábla legyen, azt a felhasználótól kérd be
        /*
        System.out.println("Kérek egy számot"); //Szépség hibás de jó!
        int a420 = scan.nextInt();
        for (int m = 0; m <= a420; m++) {
            System.out.print(m);
        }
        System.out.println("");
        for (int m = 1; m <= a420; m++) {
            System.out.print(m);
            for (int n = 1; n <= a420; n++) {
                System.out.print(m*n);
            }
            System.out.println("");
        }
        //*/
        //21. Írd ki a Fibonacci számsort a felhasználótól bekért határig.
        /*
        int a421 = 0;
        int b421 = 1;
        int c421;
        System.out.println("Kérek egy számot");
        int d421 = scan.nextInt();
        System.out.println(a421);
        System.out.println(b421);
        for (int m = 1; m <= d421; m++) {
            c421 = a421+b421;
            System.out.println(c421);
            a421 = b421;
            b421 = c421;
            
        }
        //*/
        //22. Kérj be a felhasználótól egy számot, majd írd ki a számnál nagyobb első prímszámot / tökéletes számot.
        /*
        System.out.println("Kérek egy számot:"); // Tökéletes számmal nincs megcsinálva, míg ez a megoldott feladat.
        int n422 = scan.nextInt();
        int n4221 = n422; // megjegyezzük, hogy a végén ki tudjuk írni
        boolean primE;
        do {
            primE = true;
            for (int m = 2; m <= n422 / 2; m++) {
                if(n422 % m == 0){
                    primE = false;
                    n422++;
                    break;
                }
            }            
        } while (!primE);
        System.out.println(n4221 + " számhoz jobbról legközelebb eső prímszám : " + n422);
        //*/
        //23.  Kérj be a felhasználótól egy számot, majd írd ki a számnál kisebb első prímszámot / tökéletes számot.
        /*
        System.out.println("Kérek egy számot:");
        int n423 = scan.nextInt();
        int n4231 = n423; 
        boolean prime423;
        do {
            prime423 = true;
            for (int m = n423 / 2; m >= 2; m--) {
                if(n423 % m == 0){
                    prime423 = false;
                    n423--;
                    break;
                }
            }            
        } while (!prime423);
        System.out.println(n4231 + " számhoz balról legközelebb eső prímszám : " + n423);
        //*/
        //24.  Kérj be a felhasználótól egy számot, majd írd ki a számhoz legközelebb álló, kisebb, vagy nagyobb prímszámot / tökéletes számot.
        /*
        System.out.println("Kérek egy számot:"); // Tökéletes számmal nincs megcsinálva, míg ez a megoldott feladat.
        int n424 = scan.nextInt();
        int n4241 = n424; // megjegyezzük, hogy a végén ki tudjuk írni
        int n4242 = n424;
        boolean prime424;
        do {
            prime424 = true;
            for (int m = 2; m <= n424 / 2; m++) {
                if(n424 % m == 0){
                    prime424 = false;
                    n424++;
                    break;
                }
            }            
        } while (!prime424);
        do {
            prime424 = true;
            for (int m = n4242 / 2; m >= 2; m--) {
                if(n4242 % m == 0){
                    prime424 = false;
                    n4242--;
                    break;
                }
            }            
        } while (!prime424);
        if(n424-n4241 < n4241-n4242){
            System.out.println(n4241 + " számhoz jobbról legközelebb eső prímszám : " + n424);
        } else if (n424-n4241 > n4241-n4242) {
            System.out.println(n4241 + " számhoz balról legközelebbi eső prímszám : " + n4242);
        } else {
            System.out.println(n4241 + "számhoz ugyan olyan közel eső prímszámok : " + n4242 + " és " + n424);
        }
        //*/
        //25. Állítsd elő a szinus, cosinus táblázatot a fenti szorzótáblához hasonlóan 0.5-ös lépésközzel.
        /*
        System.out.println("Kérek egy számot");
        int a425 = scan.nextInt();
        for (double m = 0; m <= a425; m += 0.5) {
            System.out.print(m);
        }
        System.out.println("");
        System.out.print("Sin:");
        for (double m = 1; m <= a425; m += 0.5) {
            System.out.print(Math.sin(m));
        }
        System.out.println("");
        System.out.print("Cos:");
        for (double m = 1; m <= a425; m += 0.5) {
            System.out.print(Math.cos(m));
        }
        System.out.println("");
        //*/
        //26. Kérj be a felhasználótól 10 db. páros számot! Ha a felhasználó által megadott szám páralan, akkor figyelmeztesd és úrja kérd be a számot. A program írja ki, hogy éppen hányadik szám beolvasásánál tart. Oldd meg a feladatot egy ciklus alkalmazásával is!
        /*
        int co426 = 0;
        int con426 = 0;
        int a426;
        while(co426 != 10) {
            System.out.println("Kérek egy páros számot");
            a426 = scan.nextInt();
            con426++;
            System.out.println(con426 + ". szám beolvasva");
            if (a426%2 == 0){
                co426++;
            } else {
                System.out.print("A szám páratlan! ");
            }
        }
        //*/
        //27. Állíts elő 10 db. páratlan véletlenszámot! A számokat a program egymás mellett vesszővel elválasztva írja ki! Oldd meg a feladatot egy ciklus alkalmazásával is!
        int a427 = ((rnd.nextInt(10)+1)*2)-1;
        System.out.print(a427);
        for (int m = 1; m <= 9; m++) {
            a427 = ((rnd.nextInt(10)+1)*2)-1;
            System.out.print(","+a427);
        }
        System.out.println("");
        
        
        //Ötödik óra
        int[] nums5 = {0, 2, 4, 6, 8};
        System.out.println("Elemek: " + Arrays.toString(nums5));
        
        int[] szamok5 = new int[15];
        szamok5[3] = 27; //Ez a negyedik számnak írja, mert 0-val kezdődik.
        szamok5[szamok5.length - 1] = 27;
        System.out.println(szamok5);//Tömb referencia azonosítója
        System.out.println(Arrays.toString(szamok5));
        
        int[] szam5 = new int[10];
        for (int j = 0; j < szam5.length; j++) {
            szam5[j] = rnd.nextInt(100)+1;    
        }
        System.out.println(Arrays.toString(szam5));
        
        /*
        double[] homersekletek = new double[5];
        for (int j = 0; j < homersekletek.length; j++) {
            System.out.println("Kérem adja meg " + (j+1) +" hőmérsékletet");
            homersekletek[j] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(homersekletek));
        //*/
        
        int[] szamok5a = new int[10];
        for (int j = 0; j < szamok5a.length; j++) {
            szamok5a[j] = rnd.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(szamok5a));
        for (int j = 0; j < szamok5a.length; j++) {
            if(szamok5a[j] < 50){
                System.out.print(szamok5a[j] +", ");
            }
        }
        System.out.println("");
        for (int szam : szamok5a) { //fore -> for each.
            if(szam % 2 == 0){
                System.out.print(szam + ", ");
        }
        }
        
        //1. Hozz létre egy 10 elemű egész számokat tartalmazni képes tömböt, majd írd ki az elemeit vesszővel elválasztva egy sorba! Állítsd át a tömb minden elemét 22-re, majd ismét írd ki!
        int[] a51 = new int[10];
        System.out.println(Arrays.toString(a51));// Nem biztos, hogy ezt kérde, de ez is megoldás!!
        Arrays.fill(a51, 22);
        System.out.println(Arrays.toString(a51));
        
        //2. Tölts fel egy tömböt a természetes számok négyzeteivel 1-től 100-ig! Listázd ki a tömb elemeit!
        int[] a52 = new int[100];
        for (int j = 1; j <= a52.length; j++) {
            a52[j-1] = j*j;
        }
        System.out.println(Arrays.toString(a52));
        
        //3. Hozz létre egy tömböt, akkora méretűt, amekkorát a felhasználó igényel. Töltsd fel a felhasználótól bekért egész számokkal, majd írd ki a tömböt.
        /*
        System.out.println("Kérem a tömb nagyságát: ");
        int a53 = scan.nextInt();
        int[] b53 = new int[a53];
        System.out.println("Kérem az elemeit: ");
        for (int j = 0; j < b53.length; j++) {
            b53[j]= scan.nextInt();
        }
        System.out.println(Arrays.toString(b53));
        //*/
        //4. Kérdezd meg a felhasználótól, hogy milyen típusú adatot szeretne tárolni! (egész számokat, valós számokat, vagy szövegeket)! Kérdezd meg, hogy hány ilyen adatot kíván tárolni, majd kérd be tőle az adatokat és írd ki egymás alá!
        /*
        System.out.println("Vállasszon egy számot milyen adatokat akar eltárolni: 1 : egész szám; 2 : valós szám; 3 : szövegek");
        int a54 = scan.nextInt();
        while(a54 != 1 && a54 != 2 && a54 != 3){
            System.out.println("A megkapott érték nem megfelelő! Vállasszon egy számot milyen adatokat akar eltárolni: 1 : egész szám; 2 : valós szám; 3 : szövegek");
            a54 = scan.nextInt();            
        }
        if(a54 == 1) { //Ugyan ezt megoldani Switch és Case-ekben!!
            System.out.println("Mennyi adatok akar eltárolni?");
            int b54 = scan.nextInt();
            int[] c54 = new int[b54];
            for (int j = 0; j < c54.length; j++) {
                System.out.println("Kérem az következő adatot");
                c54[j] = scan.nextInt();
            }
            for (int j = 0; j < c54.length; j++) {
                System.out.println(c54[j]);
            }
        }else if (a54 == 2) {
            System.out.println("Mennyi adatok akar eltárolni?");
            int b54 = scan.nextInt();
            double[] c54 = new double[b54];
            for (int j = 0; j < c54.length; j++) {
                System.out.println("Kérem az következő adatot");
                c54[j] = scan.nextDouble();                
            }
            for (int j = 0; j < c54.length; j++) {
                System.out.println(c54[j]);
            }            
        }else if (a54 == 3) {
            System.out.println("Mennyi adatok akar eltárolni?");
            int b54 = scan.nextInt();
            String[] c54 = new String[b54];
            for (int j = 0; j < c54.length; j++) {
                System.out.println("Kérem a következő adatot");
                c54[j] = scan.next();
            }
            for (int j = 0; j < c54.length; j++) {
                System.out.println(c54[j]);
            }
        }
        //*/
        //5. Állíts elő egy 10 elemű tömböt, amely egész számokat tartalmazhat!
        int a55[] = new int[10];
        //a. Töltsd fel az 50..100 közötti intervallumból véletlenszámokkal! 
        for (int j = 0; j < a55.length; j++) {
            a55[j] = rnd.nextInt(50)+51;
        }
        //b. Írd ki a tömb elemeit vesszővel elválasztva egy sorba!
        for (int j = 0; j < a55.length; j++) {
            System.out.print(a55[j] + ", ");
        }
        System.out.println("");
        //c. Írd ki a tömböt azon a módon, ahogy az Arrays.toString() metódus teszi. Pl. [54, 23, 45, 7, 8, 46, 81, 9, 10]
        System.out.println(Arrays.toString(a55));
        //d. Írd ki a tömböt visszafelé.
        for (int j = a55.length-1; j >= 0; j--) {
            System.out.print(a55[j] + ", ");
        }
        System.out.println("");
        //e. Írd ki a tömböt a következőképpen: Az [1] és [10], a [2] és [9],.., végül az [5] és a [6] elemek különbségét.
        for (int j = 0; j < a55.length/2; j++) {
            System.out.println(a55[j] - a55[9-j]);
        }
        //f. Írd ki a tömb egymás melletti elemeinek különbségét.
        for (int j = 0; j < a55.length-1; j++) {
            System.out.println(a55[j]-a55[j+1]);
        }
        //g. Írd ki a tömbben található páros/páratlan számokat, az 50-nél kisebb, vagy 70-nél nagyobb számokat.
        for (int j = 0; j < a55.length; j++) {
            if(a55[j] % 2 == 0){
                System.out.println(a55[j] + " páros szám");
            }else{
                System.out.println(a55[j] + " páratlan");
            }
            if(a55[j] > 70){
                System.out.println(a55[j] + " 70-nél nagyobb szám");
            }   
        }
        //6. Hozz létre egy igaz-hamis értékeket tárolni képes 15 elemű tömböt. Töltsd fel véletlen logikai értékekkel. (rnd.nextBoolean() függvény használatával). Listázd ki a tömböt a következőképpen:1. Sikeres vizsga (ha true az érték)2. Sikertelen vizsga (ha false az érték)
        boolean[] a56 = new boolean[15];
        for (int j = 0; j < a56.length; j++) {
            a56[j] = rnd.nextBoolean();
            if(a56[j] == true){
                System.out.println(a56[j] + " sikeres vizsga");
            }else{
                System.out.println(a56[j] + " sikertelen vizsga");
            }
        }
        //7. Hozz létre egy hónapneveket tartalmazó tömböt, a tömb értékeit a létrehozáskor inicializáld! Írd ki az alábbiak szerint a tartalmát: 1. hónap: január 2. hónap: február 3. …
        String[] a57 = {"január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december"};
        int co57 = 1;
        for (int j = 0; j < a57.length; j++) {
            System.out.println(co57 + ". hónap: " + a57[j]);
            co57++;
        }
        /*
        //8. Készíts tömböt, amely 5 sztringet tartalmazhat!
        String[] a58 = new String[5];
        //a. Kérj be a felhasználótól 5 nevet!
        for (int j = 0; j < a58.length; j++) {
            System.out.println("Kérem a nevet: ");
            a58[j] = scan.next();
        }
        //b. Rendezd a tömböt az Arrays.sort() metódussal! 
        Arrays.sort(a58);
        //c. Írd ki a neveket nagybetűs formátumban!
        System.out.println(Arrays.toString(a58).toUpperCase());
        //d. Írd ki a nevek hosszát! Pl. 1. Pisti -> 5 2. Lali -> 4
        for (int j = 0; j < a58.length; j++) {
            System.out.println(a58[j] + " -> " + a58[j].length());
        }
        //e. Döntsd el, hogy egy adott név szerepel-e a tömbben! Használd az Arrays.binarySearch() metódust a feladat megoldására!
        System.out.println("írj be egy nevet, hogy szerepel-e");
        String b58 = scan.next();
        if(Arrays.binarySearch(a58, b58) > 0){
            System.out.println("A név szerepel");
        } else {
            System.out.println("A név nem szerepel");
        }
        //*/
        //9. Készíts két tömböt, töltsd fel őket létrehozáskor kezdőértékekkel. Döntsd el, hogy a tömbök egyenlők-e, azaz elemeik rendről –rendre megegyeznek-e! Használd az Arrays.equals() metódust a feladat elvégzésére.
        int[] a59 = {3, 2, 1};
        int[] b59 = {1, 2, 3};
        System.out.println(Arrays.equals(a59, b59));
        
        //10. Hozz létre egy 10 elemű, egész számokat tartalmazó tömböt, majd töltsd fel véletlenszámokkal az 1 és 20 intervallumban!
        /*
        int[] a510 = new int[10];
        for (int j = 0; j < a510.length; j++) {
            a510[j] = rnd.nextInt(19)+1;
        }
        //a. Írd ki a tömb elemeit egy sorba, egymástól vesszővel elválasztva!
        System.out.println(Arrays.toString(a510));
        //b. Kérj be a felhasználótól egy számot és mondd meg, hogy az adott szám melyik indexen- (indexeken, ha ismétlődő) helyezkedik el. Ha nincs ilyen szám a tömbben, akkor jelezd.
        System.out.println("Kérek egy számot 1 és 20 között");
        int b510 = scan.nextInt();
        int co510 = 0;
        for (int j = 0; j < a510.length; j++) {
            if(a510[j] == b510){
                System.out.println(j+1);
                co510++;
            }
        }
        if(co510 == 0){
            System.out.println("A szám nem szerepel");
        }
        //*/
        //11. Állíts elő egy 10 elemű tömböt, amely egész számokat tartalmazhat!
        /*
        int[] a511 = new int[10];
        //c. Töltsd fel a felhasználótól bekért számokkal a tömböt! 
        for (int j = 0; j < a511.length; j++) {
            System.out.println("Kérek egy számot");
            a511[j] = scan.nextInt();
        }
        System.out.println(Arrays.toString(a511));
        
        //d. Töltsd fel a felhasználótól bekért páros számokkal a tömböt. A nem páros számokat ne fogadja el a program, azonban mind a 10 szám legyen meg a bekérés végén!
        int[] b511 = new int[10];
        int co511 = 0;
        int c511;
        do {
            System.out.println("Kérek egy számot");
            c511 = scan.nextInt();
            if(c511%2 == 0){
                b511[co511] = c511;
                co511++;
            }else{
                System.out.println("A szám nem páros!");
            }
        } while (co511 != 10);
        System.out.println(Arrays.toString(b511));
        //*/
        //12. Egy 5 elemű tömbben az értékek 1 és 5 közötti véletlenszámok. Készítshisztogramot: jeleníts meg annyi csillagot, amekkorák az egyes értékek a tömbben. Pl. [4, 3, 5, 2, 1] **** *** ***** ** *
        int[] a512 = new int[5];
        for (int j = 0; j < a512.length; j++) {
            a512[j] = rnd.nextInt(4)+1;
            for (int m = 1; m <= a512[j]; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //13. Véletlenszerűen dobjunk 100-szor egy szabályos kockával, majd írd ki, hogy hányszor dobtunk 1-est, 2-est stb.! A kockadobásokat egy 6 elemű tömbben számláld!
        int[] a513 = new int[100]; //valószínűleg nem így!!
        for (int j = 0; j < a513.length; j++) {
            a513[j] = rnd.nextInt(5)+1;
        }
        int co5131 = 0;
        int co5132 = 0;
        int co5133 = 0;
        int co5134 = 0;
        int co5135 = 0;
        int co5136 = 0;
        for (int j = 0; j < a513.length; j++) {
            if(a513[j] == 1){
                co5131++;
            }else if(a513[j] == 2){
                co5132++;
            }else if(a513[j] == 3){
                co5133++;
            }else if(a513[j] == 4){
                co5134++;
            }else if(a513[j] == 5){
                co5135++;
            }else{
                co5136++;
            }
        }
        int[] b513 ={co5131, co5132, co5133, co5134, co5135, co5136};
        System.out.println(Arrays.toString(b513));
        
        //14. Hozz létre egy tömböt, amit létrehozáskor valós számokkal töltesz fel. Döntsd el, hogy a tömb növekvően rendezett-e. A program írja ki, hogy a tömb rendezett, vagy nem rendezett.
        double[] a514 = {0.1, 1.1, 2.3}; 
        boolean boo514 = false;
        int co514 = 0;
        for (int j = 0; j < a514.length-1; j++) {
            if(a514[j] < a514[j+1]){
                co514++;
            }  
        }
        if(co514 == 2){
            boo514 = true;
        }
        if(boo514){
            System.out.println("A tömb rendezett");
        }else{
            System.out.println("A tömb nem rendezett");
        }
        //15. Hozz létre két 10 elemű egész számokat tartalmazni képes tömböt A és B tömb. Az egyiket A töltsd fel 0-9- intervallumban véletlenszámokkal, a másikat B 1-100 közötti véletlenszámokkal. Írd ki a B tömb elemeit az A tömbben létrehozott számok sorrendjében! Tehát, ha az A-ban pl. 2,5,8.. van, akkor a B tömb 2., 5., és 8… elemeit írd ki egymás után
        int[] a515 = new int[10];
        int[] b515 = new int[10];
        for (int j = 0; j < a515.length; j++) {
            a515[j] = rnd.nextInt(10);
        }
        for (int j = 0; j < b515.length; j++) {
            b515[j] = rnd.nextInt(99)+1;
        }
        for (int j = 0; j < b515.length; j++) {
            System.out.println(b515[a515[j]]);
        }
        
        //16. Tölts fel egy 20 elemű tömböt véletlenszámokkal a 10 és 30 intervallumban.
        int[] a516 = new int[20];
        for (int j = 0; j < a516.length; j++) {
            a516[j] = rnd.nextInt(20)+11;
        }
        //e. Határozd meg, hogy van –e olyan számpár a tömbben, ami a 42-őt adja eredményül. Ha igen, írd ki ezt a számpárt, majd állítsd le a programot.Megengedett, hogy egy tömbbéli elem adja ki a számot. Pl. 21.
        int b516;
        for (int j = 0; j < a516.length; j++) {
            for (int m = 0; m < a516.length; m++) {
                b516 = a516[j] + a516[m];
                if(b516 == 42){
                    System.out.println("Az " + j + ". és a " + m + ".");
                }
            }
        }
        //17. Tölts fel egy 10 elemű egész számokat tartalmazó tömböt kezdőértékekkel. Egy másik, 3 elemű tömböt is tölts fel a felhasználótól bekért egész számokkal. Döntsd el, hogy a bekért számok szekvenciája megtalálható-e a tömbben!
        /*
        int[] a517 ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b517 = new int[3];
        for (int j = 0; j < b517.length; j++) {
            System.out.println("Kérek egy számot");
            b517[j] = scan.nextInt();
        }
        boolean boo517 = false;
        for (int j = 0; j < a517.length-2; j++) {
            int[] c517 = {a517[j], a517[j+1], a517[j+2]};
            if(Arrays.equals(b517, c517)){
                boo517 = true;
            }
        }
        if(boo517){
            System.out.println("A sor metalálható");
        }else{
            System.out.println("A sor nem található meg");
        }
        //*/
        //18. Cseréld meg egy tömb két elemét! Hogy melyik két elemet cserélje fel, azt a felhasználótól kérd be!
        int[] a518 = {1, 2, 3, 4, 5};
        int b518 = a518[4];
        a518[4] = a518[2];
        a518[2] = b518;
        System.out.println(Arrays.toString(a518));
        //19. Cseréld fel egy tömb egymás mellett lévő elemeit a következőképpen. 1-2, 3-4, 4-5…9-10 elemeket.
        int[] a519 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b519;
        for (int j = 0; j < a519.length; j+=2) {
            b519 = a519[j];
            a519[j] = a519[j+1];
            a519[j+1] = b519;
        }
        System.out.println(Arrays.toString(a519));
        //20. Tölts fel egy tömböt 5 véletlenszámmal. Cseréld fel két véletlenszerűen kiválasztott elemét! Ezt addig ismételd, ameddig a tömb rendezett nem lesz.
        int[] a520 = new int[5];
        for (int j = 0; j < a520.length; j++) {
            a520[j] = rnd.nextInt(5);
        }
        System.out.println(Arrays.toString(a520));
        int b520;
        int rn520;
        int ra520;
        int co520;
        boolean boo520 = true;
        do {
            co520 = 0;
            rn520 = rnd.nextInt(5);
            ra520 =rnd.nextInt(5);
            b520 = a520[rn520];
            a520[rn520] = a520[ra520];
            for (int j = 0; j < a520.length-1; j++) {
                if(a520[j]<a520[j+1] || a520[j]==a520[j+1]){
                    co520++;
                }
                
            }
            if(co520 == 4){
                boo520 = false;
            }
        } while (boo520);
        System.out.println(Arrays.toString(a520));
    }
}
