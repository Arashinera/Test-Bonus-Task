package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BonusServiceRoundValueTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @DisplayName("Test For Get Right Result Of Round Value")
    @Test
    void test_Get_Result_Round_Value_Right() {
        assertEquals("10,00", service.getRes(100));
    }

    @DisplayName("Test For Get Wrong Result Of Round Value")
    @Test
    void test_Get_Result_Round_Value_Wrong() {
        assertNotEquals("10,00", service.getRes(10));
    }

    @DisplayName("Test For Get Right Exception Result Of Round Value")
    @Test
    void test_Get_Result_Round_Value_Exception_Right() {
        assertEquals("Incorrect value!", service.getRes(-14));
    }

    @DisplayName("Test For Get Right Exception Result Of Round Value")
    @Test
    void test_Get_Result_Round_Value_Exception_Wrong() {
        assertNotEquals("Incorrect value!", service.getRes(32));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}