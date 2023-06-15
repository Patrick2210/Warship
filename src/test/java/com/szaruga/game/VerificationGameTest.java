package com.szaruga.game;

import com.szaruga.enums.Strings;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static com.szaruga.game.VerificationGame.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class VerificationGameTest {
    @Test
    public void whenACapitalLetterIs_A_ThenExpectZero() {
        char letter = 'A';
        int result = verificationChar(letter);
        assertEquals(0, result);
    }

    @Test
    public void whenACapitalLetterIs_B_ThenExpectZero() {
        char letter = 'B';
        int result = verificationChar(letter);
        assertEquals(1, result);
    }

    @Test
    public void whenACapitalLetterIs_C_ThenExpectZero() {
        char letter = 'C';
        int result = verificationChar(letter);
        assertEquals(2, result);
    }

    @Test
    public void whenACapitalLetterIs_D_ThenExpectZero() {
        char letter = 'D';
        int result = verificationChar(letter);
        assertEquals(3, result);
    }

    @Test
    public void whenACapitalLetterIs_E_ThenExpectZero() {
        char letter = 'E';
        int result = verificationChar(letter);
        assertEquals(4, result);
    }

    @Test
    public void whenACapitalLetterIs_F_ThenExpectZero() {
        char letter = 'F';
        int result = verificationChar(letter);
        assertEquals(5, result);
    }

    @Test
    public void whenACapitalLetterIs_G_ThenExpectZero() {
        char letter = 'G';
        int result = verificationChar(letter);
        assertEquals(6, result);
    }

    @Test
    public void whenACapitalLetterIs_H_ThenExpectZero() {
        char letter = 'H';
        int result = verificationChar(letter);
        assertEquals(7, result);
    }

    @Test
    public void whenACapitalLetterIs_I_ThenExpectZero() {
        char letter = 'I';
        int result = verificationChar(letter);
        assertEquals(8, result);
    }

    @Test
    public void whenACapitalLetterIs_J_ThenExpectZero() {
        char letter = 'J';
        int result = verificationChar(letter);
        assertEquals(9, result);
    }

    @Test
    public void whenACapitalLetterIs_K_ThenExpectZero() {
        char letter = 'K';
        int result = verificationChar(letter);
        assertEquals(10, result);
    }

    @Test
    public void whenACapitalLetterIs_L_ThenExpectZero() {
        char letter = 'L';
        int result = verificationChar(letter);
        assertEquals(11, result);
    }

    @Test
    public void whenACapitalLetterIs_M_ThenExpectZero() {
        char letter = 'M';
        int result = verificationChar(letter);
        assertEquals(12, result);
    }

    @Test
    public void whenACapitalLetterIs_N_ThenExpectZero() {
        char letter = 'N';
        int result = verificationChar(letter);
        assertEquals(13, result);
    }

    @Test
    public void whenACapitalLetterIs_O_ThenExpectZero() {
        char letter = 'O';
        int result = verificationChar(letter);
        assertEquals(14, result);
    }

    @Test
    public void whenACapitalLetterIs_P_ThenExpectZero() {
        char letter = 'P';
        int result = verificationChar(letter);
        assertEquals(15, result);
    }

    @Test
    public void whenACapitalLetterIs_Q_ThenExpectZero() {
        char letter = 'Q';
        int result = verificationChar(letter);
        assertEquals(16, result);
    }

    @Test
    public void whenACapitalLetterIs_R_ThenExpectZero() {
        char letter = 'R';
        int result = verificationChar(letter);
        assertEquals(17, result);
    }

    @Test
    public void whenACapitalLetterIs_S_ThenExpectZero() {
        char letter = 'S';
        int result = verificationChar(letter);
        assertEquals(18, result);
    }

    @Test
    public void whenACapitalLetterIs_T_ThenExpectZero() {
        char letter = 'T';
        int result = verificationChar(letter);
        assertEquals(19, result);
    }

    @Test
    public void whenACapitalLetterIs_U_ThenExpectZero() {
        char letter = 'U';
        int result = verificationChar(letter);
        assertEquals(20, result);
    }

    @Test
    public void whenACapitalLetterIs_V_ThenExpectZero() {
        char letter = 'V';
        int result = verificationChar(letter);
        assertEquals(21, result);
    }

    @Test
    public void whenACapitalLetterIs_W_ThenExpectZero() {
        char letter = 'W';
        int result = verificationChar(letter);
        assertEquals(22, result);
    }

    @Test
    public void whenACapitalLetterIs_X_ThenExpectZero() {
        char letter = 'X';
        int result = verificationChar(letter);
        assertEquals(23, result);
    }

    @Test
    public void whenACapitalLetterIs_Y_ThenExpectZero() {
        char letter = 'Y';
        int result = verificationChar(letter);
        assertEquals(24, result);
    }

    @Test
    public void whenACapitalLetterIs_Z_ThenExpectZero() {
        char letter = 'Z';
        int result = verificationChar(letter);
        assertEquals(25, result);
    }

    @Test
    public void whenALetterIsLowerCase_a_ThenExpectZero() {
        char letter = 'a';
        int result = verificationChar(letter);
        assertEquals(0, result);
    }

    @Test
    public void whenALetterIsLowerCase_b_ThenExpectZero() {
        char letter = 'b';
        int result = verificationChar(letter);
        assertEquals(1, result);
    }

    @Test
    public void whenALetterIsLowerCase_c_ThenExpectZero() {
        char letter = 'c';
        int result = verificationChar(letter);
        assertEquals(2, result);
    }

    @Test
    public void whenALetterIsLowerCase_d_ThenExpectZero() {
        char letter = 'd';
        int result = verificationChar(letter);
        assertEquals(3, result);
    }

    @Test
    public void whenALetterIsLowerCase_e_ThenExpectZero() {
        char letter = 'e';
        int result = verificationChar(letter);
        assertEquals(4, result);
    }

    @Test
    public void whenALetterIsLowerCase_f_ThenExpectZero() {
        char letter = 'f';
        int result = verificationChar(letter);
        assertEquals(5, result);
    }

    @Test
    public void whenALetterIsLowerCase_g_ThenExpectZero() {
        char letter = 'g';
        int result = verificationChar(letter);
        assertEquals(6, result);
    }

    @Test
    public void whenALetterIsLowerCase_h_ThenExpectZero() {
        char letter = 'h';
        int result = verificationChar(letter);
        assertEquals(7, result);
    }

    @Test
    public void whenALetterIsLowerCase_i_ThenExpectZero() {
        char letter = 'i';
        int result = verificationChar(letter);
        assertEquals(8, result);
    }

    @Test
    public void whenALetterIsLowerCase_j_ThenExpectZero() {
        char letter = 'j';
        int result = verificationChar(letter);
        assertEquals(9, result);
    }

    @Test
    public void whenALetterIsLowerCase_k_ThenExpectZero() {
        char letter = 'k';
        int result = verificationChar(letter);
        assertEquals(10, result);
    }

    @Test
    public void whenALetterIsLowerCase_l_ThenExpectZero() {
        char letter = 'l';
        int result = verificationChar(letter);
        assertEquals(11, result);
    }

    @Test
    public void whenALetterIsLowerCase_m_ThenExpectZero() {
        char letter = 'm';
        int result = verificationChar(letter);
        assertEquals(12, result);
    }

    @Test
    public void whenALetterIsLowerCase_n_ThenExpectZero() {
        char letter = 'n';
        int result = verificationChar(letter);
        assertEquals(13, result);
    }

    @Test
    public void whenALetterIsLowerCase_o_ThenExpectZero() {
        char letter = 'o';
        int result = verificationChar(letter);
        assertEquals(14, result);
    }

    @Test
    public void whenALetterIsLowerCase_p_ThenExpectZero() {
        char letter = 'p';
        int result = verificationChar(letter);
        assertEquals(15, result);
    }

    @Test
    public void whenALetterIsLowerCase_q_ThenExpectZero() {
        char letter = 'q';
        int result = verificationChar(letter);
        assertEquals(16, result);
    }

    @Test
    public void whenALetterIsLowerCase_r_ThenExpectZero() {
        char letter = 'r';
        int result = verificationChar(letter);
        assertEquals(17, result);
    }

    @Test
    public void whenALetterIsLowerCase_s_ThenExpectZero() {
        char letter = 's';
        int result = verificationChar(letter);
        assertEquals(18, result);
    }

    @Test
    public void whenALetterIsLowerCase_t_ThenExpectZero() {
        char letter = 't';
        int result = verificationChar(letter);
        assertEquals(19, result);
    }

    @Test
    public void whenALetterIsLowerCase_u_ThenExpectZero() {
        char letter = 'u';
        int result = verificationChar(letter);
        assertEquals(20, result);
    }

    @Test
    public void whenALetterIsLowerCase_v_ThenExpectZero() {
        char letter = 'v';
        int result = verificationChar(letter);
        assertEquals(21, result);
    }

    @Test
    public void whenALetterIsLowerCase_w_ThenExpectZero() {
        char letter = 'w';
        int result = verificationChar(letter);
        assertEquals(22, result);
    }

    @Test
    public void whenALetterIsLowerCase_x_ThenExpectZero() {
        char letter = 'x';
        int result = verificationChar(letter);
        assertEquals(23, result);
    }

    @Test
    public void whenALetterIsLowerCase_y_ThenExpectZero() {
        char letter = 'y';
        int result = verificationChar(letter);
        assertEquals(24, result);
    }

    @Test
    public void whenALetterIsLowerCase_z_ThenExpectZero() {
        char letter = 'z';
        int result = verificationChar(letter);
        assertEquals(25, result);
    }

    @Test
    public void whenTotalMapIs25SquaresReturnPlayerShips() {
        int totalMapSquare = 25;
        int result = verificationPlayerShips(totalMapSquare);
        assertEquals(5, result);
    }

    @Test
    public void whenTotalMapIs676SquaresReturnPlayerShips() {
        int totalMapSquare = 676;
        int result = verificationPlayerShips(totalMapSquare);
        assertEquals(135, result);
    }

    @Test
    public void whenTotalMapIs0Squares() {
        int totalMapSquare = 0;
        int result = verificationPlayerShips(totalMapSquare);
        assertEquals(0, result);
    }
}