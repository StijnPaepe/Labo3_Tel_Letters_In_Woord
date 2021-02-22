package domain.model;

public class LetterCounter {

    public static int countLetters(String woord, char letter){
        int teller = 0;

        for(int i = 0; i < woord.length(); i++){
            if(woord.charAt(i) == letter){
                teller++;
            }
        }
        return teller;
    }
}
