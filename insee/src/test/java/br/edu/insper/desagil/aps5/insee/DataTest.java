package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data a;
    @BeforeEach
    void SetUp () {a = new  Data();}

    @Test
    void controi(){
        assertEquals(1970, a.getAno());
        assertEquals(1, a.getMes());
        assertEquals(1, a.getDia());
    }
    @Test
    void naoatulizamenor(){
        a.atualiza(1969,0,0);
        assertEquals(1970, a.getAno());
        assertEquals(1, a.getMes());
        assertEquals(1, a.getDia());
    }
    @Test
    void atualizamaior(){
        a.atualiza(2024,13,32);
        assertEquals(2024, a.getAno());
        assertEquals(12, a.getMes());
        assertEquals(31, a.getDia());

    }
    @Test
    void atualiza(){
        a.atualiza(2024,9,26);
        assertEquals(2024, a.getAno());
        assertEquals(9, a.getMes());
        assertEquals(26, a.getDia());

    }
    @Test
    void comzero(){
        a.atualiza(1970,1,1);
        assertEquals(0, a.comoInteiro());

    }
    @Test
    void comoagora(){
        a.atualiza(2024,9,26);
        assertEquals(19978, a.comoInteiro());
    }

}
