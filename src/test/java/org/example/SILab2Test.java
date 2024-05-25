package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<Item> make(Item... items){
        return new ArrayList<Item>(Arrays.asList(items));
    }
    @Test
    void multipleConditionTest() {
        // T T T
        assertTrue(SILab2.checkCart(make(new Item("unknown","0123",350,1.8f)),5000));
        // T T F
        assertFalse(SILab2.checkCart(make(new Item("unknown","1123",350,1.8f)),25));
        // T F X
        assertFalse(SILab2.checkCart(make(new Item("unknown","0123",350,-1f)),25));
        // F X X
        assertFalse(SILab2.checkCart(make(new Item("unknown","0123",250,0.8f)),25));
    }
}