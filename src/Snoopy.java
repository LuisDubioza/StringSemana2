public class Snoopy {
    public static void main(String[] args) {
        System.out.println("Snoopy original");
        String snoopy = 
            "                             -+::::::++:::            \n" +
            "                          +:-*@@@@@@@@--::        \n" +
            "                       :::*@@@@@@@@@@@@@@-:-      \n" +
            "            +:::*******#@@@@@@@@@@@@@@@@@@%::     \n" +
            "          -:-*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*::    \n" +
            "         ::%@@@@@@@@@@@@@@@@@@@@@@@@@@@----@-:    \n" +
            "        :-#@@@@@@@@@@@@@@@@@@@@@@@@**-:::+:-*:    \n" +
            "       -+*@@@@@@@@@@@@@@@@@@@@@@@@*--:*::::-*+    \n" +
            "    :+**-@@@@@@@@@@@@@@@@@@@@@@@@@:*:::::::-*+    \n" +
            "   +-%*-+*@@@@@@@@@@@@@@@@@@@@@@@*-*:::::::*-:    \n" +
            "    +-+::+*@@@@@@@@@@@@@@@@@@@@@@*-*::::::@*::    \n" +
            "         :::**@@@@@@@@@@@@@@@@@@@%:*+::+-*-:+     \n" +
            "              @@@@@@@@@@@@@@@@@*:+:+*%#-::        \n" +
            "                      +::-#@@#:+     ++           \n" +
            "                         ::**-:                   \n" +
            "                        +:+-#-:                   \n" +
            "                        :-@@@*:                   \n" +
            "                       +*@@@@@-:                  \n" +
            "                      :%@@@@@@@*:-                \n" +
            "                     :*@@@@%*#@@-:                \n" +
            "                     :*@@@@#-@@#-:+               \n" +
            "                     :*@@@@#-@@@*-:               \n" +
            "                     -:*%@@%-*%**+:++:::          \n" +
            "                       :::++-**-:::-*@@%*-:       \n" +
            "                 +:+:-***-%@**@*:    -:           \n" +
            "              -:*@@-+*@@@@@@@@@@@@#-:+            \n" +
            "              :*-%-**-@**@@@@@@@@@**-+            \n" +
            "                 ::++::::::::::+::                ";

        System.out.println(snoopy);

        System.out.println("Snoopy modificado"); //69 hasta la 4ta linea + 12 -1 = 80
        StringBuilder SnoopyModificado = new StringBuilder(snoopy);
        SnoopyModificado.setCharAt(80, '*');
        SnoopyModificado.setCharAt(81, '-');
        SnoopyModificado.setCharAt(82, '%'); //82 + 25 = 107 = 106
        SnoopyModificado.setCharAt(105, '*');
        SnoopyModificado.setCharAt(106, '-');
        SnoopyModificado.setCharAt(107, '@'); //107 + 24 + 25 + 18 = 174
        SnoopyModificado.setCharAt(171, '*');
        SnoopyModificado.setCharAt(172, '-'); // 172 + 3 + 17 = 192
        SnoopyModificado.setCharAt(192, '*');
        SnoopyModificado.setCharAt(193, '*'); //193 + 3 + 11 = 207
        SnoopyModificado.setCharAt(207, '%');
        SnoopyModificado.setCharAt(208, '*'); 
        SnoopyModificado.setCharAt(209, '*');

    System.out.println( "Snoopy Modificado:\n" );
    System.out.println(SnoopyModificado.toString());
    }
}