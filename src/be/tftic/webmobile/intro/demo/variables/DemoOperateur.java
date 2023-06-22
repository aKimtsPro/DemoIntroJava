package be.tftic.webmobile.intro.demo.variables;

public class DemoOperateur {

    public static void main(String[] args) {

        // Operateurs arithmétiques:
        int a = 7, b = 3;
        double rslt;

        rslt = a + b;           // 10
        rslt = a - b;           // 4
        rslt = a * b;           // 21
        rslt = a / b;           // 2
        rslt = (double)a / b;   // 2.3333333333333335
        rslt = a % b;           // 1

        // Operateurs affectations:
        rslt = 7;

        rslt = rslt + 1;
        rslt += 3;
        rslt -= 6;
        rslt *= 3;
        rslt /= 2;
        rslt %= 10;

        int incDec = 0;
        // incDec = 0

        System.out.println( incDec++ );   // 0 - V
        System.out.println( ++incDec );   // 2 - V
        System.out.println( incDec-- );   // 2 - V
        System.out.println( --incDec );   // 0 - V

        System.out.println( incDec );     // 0

        int A = 3;
        System.out.println( A ); // 3
        int B = A = 5;
        System.out.println( A ); // 5
        System.out.println( B ); // 5

        // opération de comparaison
        System.out.println( a == b );
        System.out.println( a != b );
        // uniquement des nombres
        System.out.println( a <  b );
        System.out.println( a <= b );
        System.out.println( a >  b );
        System.out.println( a >= b );

        // parenthèse: Les String c'est bizarre
        String s1 = "salut";
        String s2 = "salut";
        String s3 = "sa"+"lut";
        String s4 = new String("salut");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false // Le new String(...) force la création d'un nouvel objet => adresse diff.
        // C'est à cause de la StringPool

        // Opérateurs logiques

        // AND - &&
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        // OR - ||
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false ||false);  // false

        // NOT - !
        System.out.println(!true);          // false
        System.out.println(!false);         // true

        // XOR - ^
        System.out.println(true ^ true);   // false
        System.out.println(true ^ false);  // true
        System.out.println(false ^ true);  // true
        System.out.println(false ^ false);  // false

        // Loi de De Morgan
        boolean estBleu = true, estLigne = true;

        // mon sac n'est pas et ligné et bleu
        System.out.println( !(estLigne && estBleu) );
        // mon sac n'est pas ligné ou n'est pas bleu
        System.out.println( !estLigne || ! estBleu );


        // Mon sac n'est pas ou ligné ou bleu
        System.out.println( !(estLigne || estBleu) );
        // Mon sac est pas ligné et pas bleu
        System.out.println( !estLigne && !estBleu );

        // !(a && b) <=> !a || !b
        // !(a || b) <=> !a && !b










    }

}
