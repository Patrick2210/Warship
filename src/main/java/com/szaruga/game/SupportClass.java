package com.szaruga.game;

import static com.szaruga.enums.CapitalLetters.*;

public class SupportClass {

    // to jest dobrze ale można zrobić prostszy kod
    // zobacz sobie jakie enum ma metody i jak to możesz wykorzystać
    protected Integer rowConverter(String letter) {
        if (letter.equals(A.letter)) {
            return 0;
        }
        if (letter.equals(B.letter)) {
            return 1;
        }
        if (letter.equals(C.letter)) {
            return 2;
        }
        if (letter.equals(D.letter)) {
            return 3;
        }
        if (letter.equals(E.letter)) {
            return 4;
        }
        if (letter.equals(F.letter)) {
            return 5;
        }
        if (letter.equals(G.letter)) {
            return 6;
        }
        if (letter.equals(H.letter)) {
            return 7;
        }
        if (letter.equals(I.letter)) {
            return 8;
        }
        if (letter.equals(J.letter)) {
            return 9;
        }
        if (letter.equals(K.letter)) {
            return 10;
        }
        if (letter.equals(L.letter)) {
            return 11;
        }
        if (letter.equals(M.letter)) {
            return 12;
        }
        if (letter.equals(N.letter)) {
            return 13;
        }
        if (letter.equals(O.letter)) {
            return 14;
        }
        if (letter.equals(P.letter)) {
            return 15;
        }
        if (letter.equals(Q.letter)) {
            return 16;
        }
        if (letter.equals(R.letter)) {
            return 17;
        }
        if (letter.equals(S.letter)) {
            return 18;
        }
        if (letter.equals(T.letter)) {
            return 19;
        }
        if (letter.equals(U.letter)) {
            return 20;
        }
        if (letter.equals(V.letter)) {
            return 21;
        }
        if (letter.equals(W.letter)) {
            return 22;
        }
        if (letter.equals(X.letter)) {
            return 23;
        }
        if (letter.equals(Y.letter)) {
            return 24;
        } else if (letter.equals(Z.letter)) {
            return 25;
        }
        return 0;
    }
}
