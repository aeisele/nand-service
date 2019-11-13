package com.andreaseisele.nandservice;

import com.andreaseisele.nandservice.controller.NandController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class NandServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testNAND() {
        NandController controller = new NandController();

        assertTrue(controller.nand(false, false));
        assertTrue(controller.nand(true, false));
        assertTrue(controller.nand(false, true));
        assertFalse(controller.nand(true, true));
    }

}
