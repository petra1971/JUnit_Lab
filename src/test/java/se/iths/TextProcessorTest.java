package se.iths;
/* TextProcessor.java ska kunna returnera en inmatad sträng i versaler, gemener
        eller baklänges (tips: använd StringBuilder för att “vända” på en sträng)
        assertEquals eller assertNotEquals
        assertTrue eller assertFalse
        assertNull eller assertNotNull*/

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    TextProcessor textProcessor = new TextProcessor();

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before test");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("After all tests");
    }

    @Test @DisplayName("Test - convert String To Upper Case")
    public void testStringToUpperCase() {
        String lowerString = "abujde";
        assertNotEquals("ABUjDE", textProcessor.stringToUpperCase(lowerString));
    }

    @Test @DisplayName("test - Convert String To LowerCase")
    public void testStringToLowerCase() {
        String upperString = "ABUJDE";
        assertEquals("abujde", textProcessor.stringToLowerCase(upperString));
    }

    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Test - Reverse String")
    public void testReverseString() {
        String string = "Andreasson";
        assertEquals("nossaerdnA", textProcessor.reverseString(string));
    }

    @Test @DisplayName("Test - if Strings are Equal")
    public void testIfStringsEqual() {
        String string1 = "Jtev#69*";
        String string2 = "Jtev#69*";
        assertTrue(textProcessor.stringsEqual(string1, string2));
    }

    @Test
    public void testIfNull() {
        assertNotNull(textProcessor.firstName);
    }

    @Disabled
    public void testNotNull() {
        assertNull(textProcessor.lastName);
    }
}
