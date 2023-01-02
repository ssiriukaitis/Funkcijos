public class Main {
    public static void main(String[] args) {

        System.out.println(sumInt(6, 7));
        System.out.println(PISq());
        System.out.println(multiInt(5, 10));
        System.out.println();
        int[] masyvas = {11, 15, 12};
        nums(masyvas);

        int[] rndArr = randomnumbers();
        for (int i = 0; i < rndArr.length; i++) {
            System.out.println(rndArr[i]);
        }

        int rez = sumP(rndArr);
        System.out.println("Suma yra " + rez);


        double rezultatas = dalyba(rndArr);
        System.out.println("Vidurkis yra " + rezultatas);


        staciakampis(10, 5);

        countText("Šiandien labai graži diena");


    }

    ////================= 1 funkcija uzduoti ===================
    public static int sumInt(int a, int b) {
        return a + b;
    }

    ///// ================== 2 funkcija uzduoti ====================
    public static double PISq() {
        return Math.PI * Math.PI;
    }

    //////====================== 3 funkcija uzduotis ====================
    public static int multiInt(int c, int d) {
        return c * d;
    }

    /////======================= 4 funkcija uzduotis ====================
    public static void nums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //////===================== 5 funkcija uzduotis ==========================
    public static int[] randomnumbers() {
        int[] randomfive = new int[5];
        for (int i = 0; i < 5; i++) {
            randomfive[i] = (int) Math.round(Math.random() * 7);
        }
        return randomfive;
    }

///=========================== 6 uzd ============

    public static int sumP(int[] randomfive) {
        int sum = 0;
        for (int i = 0; i < randomfive.length; i++) {
            sum += randomfive[i];
        }
        return sum;
    }

    ///// ================= 7 uzd =====================
    public static double dalyba(int[] randomfive) {

        double padalinus = 0;
        for (int i = 0; i < randomfive.length; i++) {
            padalinus += randomfive[i];
        }

        return padalinus / randomfive.length;
    }


////=============== 8 uzduotis ==============================

    public static void staciakampis(int ilgis, int aukstis) {

        //ciklas
        for (int i = 0; i < ilgis; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int c = 0; c < aukstis - 2; c++) {
            for (int k = 0; k < ilgis; k++) {
                if (k == 0 || k == ilgis -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < ilgis; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    //ciklas

//======================== 9 uzd ==========================
//    public static void countText(String text){
//        int txt = text.length();
//        int counText = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            if (Character.isLetter(text.charAt(i))){
//                counText++;
//            }
//        }
//        System.out.println("Tekste raidziu " + counText + "Tekste tarpu " + (txt - counText));
//    }
    public static void countText(String text) {
        int tekstassutarpais = text.length();
        int raides = text.replace(" ", "").length();

        System.out.println("Tekste raidziu yra " + raides + ". Tekste tarpu yra " + (tekstassutarpais - raides));

    }







}