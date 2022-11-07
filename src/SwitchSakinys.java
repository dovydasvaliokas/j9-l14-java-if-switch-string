public class SwitchSakinys {
    public static void main(String[] args) {
        System.out.println("savaitesDiena(5) = " + savaitesDiena(25));
    }

    public static String savaitesDiena(int savaitesDienosSkaicius) {
        String diena;
        switch (savaitesDienosSkaicius) {
            case 1:
                diena = "Pirmadienis";
                break;
            case 2:
                diena = "Antradienis";
                break;
            case 3:
                diena = "Trečiadienis";
                break;
            case 4:
                diena = "Ketvirtadienis";
                break;
            case 5:
                diena = "Penktadienis";
                break;
            case 6:
                diena = "Šeštadienis";
                break;
            case 7:
                diena = "Sekmadienis";
                break;
            default:
                diena = "Neteisingas dienos skaičius";
                break;
        }
        return diena;
    }
}
