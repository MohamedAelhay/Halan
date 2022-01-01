public class StringCompressionSolution {
    public String runLengthEncode(String word) {
        int count = 1;
        int length = word.length();
        StringBuilder encodedString = new StringBuilder();

        for (int i = 1; i < length; i++) {
            if(word.charAt(i) == word.charAt(i - 1)){
                count++;
            } else {
                encodedString.append(word.charAt(i - 1));
                encodedString.append(count);
                count = 1;
            }
        }
        if(length > 1) {
            if(count == 1) {
                encodedString.append(word.charAt(length - 1));
                encodedString.append(count);
            }
        }

        return encodedString.toString();
    }

    public String runLengthDecode(String word) {
        int letterIndex;
        Boolean numericFlag;
        int length = word.length();
        StringBuilder countBuilder = new StringBuilder();
        StringBuilder decodedString = new StringBuilder();

        for (int i = 1; i < length; i++) {
            letterIndex = i - 1;
            numericFlag = Character.isDigit(word.charAt(i));
            if(numericFlag){
                countBuilder.append(word.charAt(i));
                while (numericFlag){
                    i++;
                    if(i < length){
                        numericFlag = Character.isDigit(word.charAt(i));
                        if(numericFlag){
                            countBuilder.append(word.charAt(i));
                        }
                    } else {
                        numericFlag = false;
                    }
                }
                i--;
                for (int j = 0; j < Integer.parseInt(countBuilder.toString()); j++){
                    decodedString.append(word.charAt(letterIndex));
                }
                countBuilder = new StringBuilder();
            }
        }

        return decodedString.toString();
    }
}
