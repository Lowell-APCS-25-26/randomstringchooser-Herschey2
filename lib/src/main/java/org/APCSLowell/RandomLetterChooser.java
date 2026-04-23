package org.APCSLowell;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }
    public static String[] getSingleLetters(String str){
        return str.split("");
    }

}