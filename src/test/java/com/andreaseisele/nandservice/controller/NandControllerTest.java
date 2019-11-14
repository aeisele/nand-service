package com.andreaseisele.nandservice.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NandControllerTest {

    @Test
    void testNAND() {
        NandController controller = new NandController();

        assertTrue(controller.nand(false, false));
        assertTrue(controller.nand(true, false));
        assertTrue(controller.nand(false, true));
        assertFalse(controller.nand(true, true));
    }

}