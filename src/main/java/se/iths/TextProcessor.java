package se.iths;
/*
TextProcessor.java ska kunna returnera en inmatad sträng i versaler, gemener
eller baklänges (tips: använd StringBuilder för att “vända” på en sträng)
(3 metoder).
Skapa en testklass för respektive klass
 */

public class TextProcessor {

    String firstName = "Petra";
    String lastName;
    int age;


    public boolean stringsEqual(String s1, String s2) {
        return s1.equals(s2);
    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public String stringToLowerCase(String str) {
        return str.toLowerCase();
    }

    public String stringToUpperCase(String str) {
        return str.toUpperCase();
    }
}
