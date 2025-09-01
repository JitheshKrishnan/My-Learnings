class Hello{
    public static void main(String a[]){
        byte by = 9;
        short num = 4;
        int num1 = 670;
        long l = 5583l;
        float f = 5.9f;
        double d = 7.3;
        char c = 'k';
        boolean b = true;

        // literals;
        int aa = 0x7E;
        int ab = 100_00_000;
        double ac = 12e10;
        char ad = 'a';
        ad++;
        System.out.println(ad);

        int r = num++;
        System.out.println(r);
        System.out.println(r);

        // Switch statements (new technique, without break;)

        String day = "Sunday";
        String result = "";

        switch(day){
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        //Switch with return

        String res = switch(day){
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            // case "Monday" : yield "8am"; (Another way)
            default -> "7am";
        };
        System.out.println(res);
    }
}