public class SalyginisSakinys {
    public static void main(String[] args) {
        int x = -25;
        int y = 20;
        int z = 20;

        System.out.println("arNeigiamas(x) = " + arNeigiamas(x));
        System.out.println("padvigubintiLyginiSumazintiNelygini(x) = " + padvigubintiLyginiSumazintiNelygini(x));
        System.out.println("padvigubintiLyginiSumazintiNelygini(y) = " + padvigubintiLyginiSumazintiNelygini(y));

        System.out.println("palygintiDuSkaicius(x, y) = " + palygintiDuSkaicius(x, y));
        System.out.println("palygintiDuSkaicius(z, y) = " + palygintiDuSkaicius(z, y));

        isvestiZvaigzdutesArbaBruksniukus(true);
        isvestiZvaigzdutesArbaBruksniukus(false);
        isvestiZvaigzdutesArbaBruksniukus(true);

        int sk1 = 3;
        int sk2 = 11;
        int ipr = 4;
        int ipa = 10;

        System.out.println("veiksmaiSuSkaiciaisJeiIntervale(sk1, sk2, ipr, ipa) = " + veiksmaiSuSkaiciaisJeiIntervale(sk1, sk2, ipr, ipa));

        isvestiZvaigzdutesArbaBruksniukus(false);

        System.out.println("veiksmaiJeiZenklaiVienodi(10, 15) = " + veiksmaiJeiZenklaiVienodi(-10, 5));

    }

    public static boolean arNeigiamas(int skaicius) {
        //return skaicius < 0;
        if (skaicius < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double padvigubintiLyginiSumazintiNelygini(int skaicius) {
        if (skaicius % 2 == 0) {
            return skaicius * 2;
        }
        else {
            return (double)skaicius / 2;
        }
    }
    
    public static int palygintiDuSkaicius(int x, int y) {
        if (x > y) {
            return -1;
        } else if (x == y) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Funkcija išveda arba penkias žvaigždutes, arba penkis brūkšniukus priklausomai nuo gaunamos boolean reikšmės
     * @param kaIsvesti boolean reikšmė, jeigu true, tai išves žvaigždutes, jeigu false, tai išves brūkšniukus
     */
    public static void isvestiZvaigzdutesArbaBruksniukus(boolean kaIsvesti) {
        if (kaIsvesti) {      // kaIsvesti == true
            System.out.println("*****");
        }
        else {
            System.out.println("-----");
        }
    }

    /**
     * Funkcija atlieka veiksmus su skaičiais, jeigu tie skaičiai yra intervale.
     * Jeigu abu skaičiai yra intervale grąžina jų sumą
     * Jeigu tik vienas skaičius yra intervale, grąžina jų skirtumą
     * Jeigu nei vieno skaičiuas nėra intervale - grąžina jų sandaugą
     * @param x pirmas skaičius
     * @param y antras skaičius
     * @return double reikšmę, veiksmą tarp dviejų skaičių priklausomai nuo ar jie yra intervale
     */
    public static double veiksmaiSuSkaiciaisJeiIntervale(double x, double y, double intervaloPradzia, double intervaloPabaiga) {
        if (arIntervale(x, intervaloPradzia, intervaloPabaiga) && arIntervale(y, intervaloPradzia, intervaloPabaiga)) {
            return x + y;
        } else if (arIntervale(x, intervaloPradzia, intervaloPabaiga) || arIntervale(y, intervaloPradzia, intervaloPabaiga)) {
            return x - y;
        } else {
            return x * y;
        }
    }

    public static boolean arIntervale(double x, double intervaloPradzia, double intervaloPabaiga) {
        return x > intervaloPradzia && x < intervaloPabaiga;
    }

    /**
     * Funkcija palygina ar abu skaičiai yra tokio pat ženklo (abu neigiami, abu su pliusu).
     * Jeigu abu skaičiai yra tokio paties ženklo, tokiu atveju tuos skaičius sudaugina ir jeigu jų sandauga yra didesnė už 100, grąžina true, jeigu ne - grąžina false
     * Jeigu skaičiai nėra tokio paties ženklo, tokiu atveju apskaičiuoja jų skirtumą ir jei tas skirtumas yra teigiamas grąžina true, jeigu neigiamas grąžina false.
     * @param x pirmas skaičius
     * @param y antras skaičius
     * @return
     */
    public static boolean veiksmaiJeiZenklaiVienodi(int x, int y) {
        if (arVienodasZenklas(x, y)) {
            int sandauga = x * y;
            if (sandauga > 100) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            int skirtumas = x - y;
            if (skirtumas > 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }


    public static boolean arVienodasZenklas(int x, int y) {
        if (x < 0 && y < 0) {
            return true;
        } else if (x >= 0 && y >= 0) {
            return true;
        } else {
            return false;
        }
    }


}
