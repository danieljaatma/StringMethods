public class Main {
    public static void main(String[] args) {

        String playerName = "Lionel Messi";
        String playerName2 = "Lionel Messi";
        boolean areEqual = playerName.equals(playerName2); // Võrdleb kaht muutujat
        int playerNameLength = playerName.length(); // toob 12 tähte
        char charAt = playerName.charAt(4); // toob viienda tähe
        int indeks = playerName.indexOf("e"); // otsib õige indeksi
        String subString = playerName.substring(2, 5); // Võtab nende vahel oleva teksti.

        System.out.println(areEqual);
        System.out.println(playerNameLength);
        System.out.println(charAt);
        System.out.println(indeks);
        System.out.println(subString);

    }
}

