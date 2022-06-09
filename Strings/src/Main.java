public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        String mesaj2 = "Yaşasın!";
        /*
        System.out.println(mesaj);
        System.out.println("String teki harf sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" " + mesaj2));
        System.out.println(mesaj.startsWith("B")); // B ile başlıyorsa True yazar
        System.out.println(mesaj.endsWith("l")); // l ile bitiyorsa true yazar
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a")); // a harfinin kaçıncı indexte olduğunu yazar
        System.out.println(mesaj.lastIndexOf("a")); // sondan sayarak yazar
    */
        System.out.println(mesaj.replace(' ', '-')); // boşluk yerine - koydu
        System.out.println(mesaj.substring(2)); // 2. indexten itibaren yaz
        System.out.println(mesaj.substring(2,10)); // 2 ile 10 index arasını yaz
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); // büyük harfe çevirir
        System.out.println(mesaj.trim()); // başında ve sonundaki boşlukları siler




    }
}