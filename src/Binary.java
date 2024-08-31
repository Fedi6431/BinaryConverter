public class Binary {
    public void StringToBinary(String inputString) {
        StringBuilder binaryString = new StringBuilder();

        // Loop through each character and convert to binary
        for (char character : inputString.toCharArray()) {
            String binaryChar = String.format("%8s", Integer.toBinaryString(character)).replace(' ', '0');
            binaryString.append(binaryChar).append(" ");
        }

        System.out.println("Binary message: " + binaryString.toString().trim());
    }

    public void BinaryToString(String inputString) {
        // Split the input by spaces to get individual binary codes
        String[] binaryCodes = inputString.split(" ");

        // Mapping of binary codes to their respective characters
        String[][] replacements = {
                {"01100001", "a"}, {"01100010", "b"}, {"01100011", "c"},
                {"01100100", "d"}, {"01100101", "e"}, {"01100110", "f"},
                {"01100111", "g"}, {"01101000", "h"}, {"01101001", "i"},
                {"01101010", "j"}, {"01101011", "k"}, {"01101100", "l"},
                {"01101101", "m"}, {"01101110", "n"}, {"01101111", "o"},
                {"01110000", "p"}, {"01110001", "q"}, {"01110010", "r"},
                {"01110011", "s"}, {"01110100", "t"}, {"01110101", "u"},
                {"01110110", "v"}, {"01110111", "w"}, {"01111000", "x"},
                {"01111001", "y"}, {"01111010", "z"}
        };

        // Initialize an empty string to store the decoded message
        StringBuilder decodedMessage = new StringBuilder();

        // Loop through each binary code and find its corresponding character
        for (String binaryCode : binaryCodes) {
            for (String[] replacement : replacements) {
                if (binaryCode.equals(replacement[0])) {
                    decodedMessage.append(replacement[1]);
                    break;
                }
            }
        }

        // Output the decoded message
        System.out.println("String message: " + decodedMessage.toString());
    }
}