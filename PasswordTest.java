/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author George Aziz
 */
public class PasswordTest {

    /**
     * Test of isNewLine method, of class Password.
     */
    @Test
    public void testIsNewLine() {
        System.out.println("isNewLine");
        String candidate = "Alice;inthe";
        boolean expResult = false;
        boolean result = Password.isNewLine(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isNewLine method, of class Password.
     */
    @Test
    public void testIsNewLine2() {
        System.out.println("isNewLine");
        String candidate = "\nWhitekingthe";
        boolean expResult = true;
        boolean result = Password.isNewLine(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSingle method, of class Password.
     */
    @Test
    public void testIsSingle() {
        System.out.println("isSingle");
        String[] candidate = {"in", "Tower\"", "king"};
        boolean expResult = false;
        boolean result = Password.isSingle(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isSingle method, of class Password.
     */
    @Test
    public void testIsSingle2() {
        System.out.println("isSingle");
        String[] candidate = {"Tower\"", "a", "king"};
        boolean expResult = true;
        boolean result = Password.isSingle(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isDifferentWord method, of class Password.
     */
    @Test
    public void testIsDifferentWord() {
        System.out.println("isDifferentWord");
        String[] candidate = {"the", "Alice;", "the"};
        boolean expResult = false;
        boolean result = Password.isDifferentWord(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isDifferentWord method, of class Password.
     */
    @Test
    public void testIsDifferentWord2() {
        System.out.println("isDifferentWord");
        String[] candidate = {"the", "Alice;", "just"};
        boolean expResult = true;
        boolean result = Password.isDifferentWord(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isGoodLength method, of class Password.
     */
    @Test
    public void testIsGoodLength() {
        System.out.println("isGoodLength");
        String candidate = "theAlice;just";
        boolean expResult = true;
        boolean result = Password.isGoodLength(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isGoodLength method, of class Password.
     */
    @Test
    public void testIsGoodLength2() {
        System.out.println("isGoodLength");
        String candidate = "thetoIn";
        boolean expResult = false;
        boolean result = Password.isGoodLength(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isGoodLength method, of class Password.
     */
    @Test
    public void testIsGoodLength3() {
        System.out.println("isGoodLength");
        String candidate = "AliceTowerSilence";
        boolean expResult = false;
        boolean result = Password.isGoodLength(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isUpper method, of class Password.
     */
    @Test
    public void testIsUpper() {
        System.out.println("isUpper");
        String candidate = "alicetowersilence";
        boolean expResult = false;
        boolean result = Password.isUpper(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isUpper method, of class Password.
     */
    @Test
    public void testIsUpper2() {
        System.out.println("isUpper");
        String candidate = "AlicetTowerSilence";
        boolean expResult = true;
        boolean result = Password.isUpper(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLower method, of class Password.
     */
    @Test
    public void testIsLower() {
        System.out.println("isLower");
        String candidate = "ALICETOWERKING";
        boolean expResult = false;
        boolean result = Password.isLower(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isLower method, of class Password.
     */
    @Test
    public void testIsLower2() {
        System.out.println("isLower");
        String candidate = "ALICETOWERKINg";
        boolean expResult = true;
        boolean result = Password.isLower(candidate);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSpecial method, of class Password.
     */
    @Test
    public void testIsSpecial() {
        System.out.println("isSpecial");
        String candidate = "Alice;justTo";
        boolean expResult = true;
        boolean result = Password.isSpecial(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isSpecial method, of class Password.
     */
    @Test
    public void testIsSpecial2() {
        System.out.println("isSpecial");
        String candidate = "Alice\"justTo";
        boolean expResult = true;
        boolean result = Password.isSpecial(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isSpecial method, of class Password.
     */
    @Test
    public void testIsSpecial3() {
        System.out.println("isSpecial");
        String candidate = "Alicedon'tTo";
        boolean expResult = true;
        boolean result = Password.isSpecial(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isSpecial method, of class Password.
     */
    @Test
    public void testIsSpecial4() {
        System.out.println("isSpecial");
        String candidate = "Alice.justTo";
        boolean expResult = true;
        boolean result = Password.isSpecial(candidate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isSpecial method, of class Password.
     */
    @Test
    public void testIsSpecial5() {
        System.out.println("isSpecial");
        String candidate = "AlicejustTo";
        boolean expResult = false;
        boolean result = Password.isSpecial(candidate);
        assertEquals(expResult, result);
    }
}
