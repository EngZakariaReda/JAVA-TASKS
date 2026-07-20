public class NextAlphabet {
    public char firstChar ;

    NextAlphabet(char character){
        this.firstChar = character;
    }

    public void getNextChar(){
        if (firstChar < 97 && firstChar > 122){
            System.out.println("please enter lowercase character only");
        }

        char outputChar;
        if (firstChar == 122){
            outputChar = 'a';
        }else {
            outputChar = (char) (firstChar + 1) ;
        }
        System.out.println(outputChar);
    }
}
