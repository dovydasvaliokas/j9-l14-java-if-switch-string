public class StringKintamieji {
    public static void main(String[] args) {
        String s1 = "namas";
        String s2 = "mūrinis";

        // String kintamųjų sudėjimas
        String sujungtas1 = s2 + " " + s1;
        System.out.println("sujungtas1 = " + sujungtas1);
        System.out.println(s1 + " " + s2);

        // Atskiros raidės gavimas iš String kintamojo
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(1 + 4);         // charAt(5)

        // String ilgis
        System.out.println("s2.length() = " + s2.length());

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // String kintamųjų lyginimas
        String s3 = "tekstas";
        String s4 = "tekstas";
        String s5 = "TEKStas";
        String s6 = "tekstilė";

        if (s3.equals(s4)) {
            System.out.println("lygūs");
        }

        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("Lygūs ignoruojant didžiąsias mažąsias");
        }

        System.out.println(s3.compareTo(s6));
        palyginaStringPagalAbeceleIrIsveda(s3, s6);
        palyginaStringPagalAbeceleIrIsveda(s5, s6);
        palyginaStringPagalAbeceleIrIsveda(s4, s5);

        // Paieška žodyje
        String s7 = "Kažkoks žodis su kitais žodžiais";
        System.out.println("s7.contains(\"žodis\") = " + s7.contains("žodis"));

    }

    public static void palyginaStringPagalAbeceleIrIsveda(String s1, String s2) {
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("Pirmas žodis " + s1 + " yra artimesnis pagal abėcėlę, nei antras žodis " + s2);
        } else if(s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("Antras žodis " + s2 + " yra artimesnis pagal abėcėlę, nei pirmas žodis " + s1);
        } else {
            System.out.println("Žodžiai yra vienodi");
        }
    }
}
