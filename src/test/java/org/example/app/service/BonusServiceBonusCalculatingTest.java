package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceBonusCalculatingTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @DisplayName("Test For Right Bonus Calculating From Sales")
    @Test
    void test_Calculate_Bonus_From_Sales_Right() {
        assertEquals(20, service.calcBonus(200));
    }

    @DisplayName("Test For Wrong Bonus Calculating From Sales")
    @Test
    void test_Calculate_Bonus_From_Sales_Wrong() {
        assertNotEquals(13, service.calcBonus(350));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}