public static String encryptThis(String text) {
        if (text.equals("")) return "";
        StringBuilder result = new StringBuilder();
        for (String s : text.split(" ")) {
            result.append(encryptWord(s)).append(" ");
        }
        return result.toString().trim();
    }

    public static String encryptWord(String word) {
        StringBuilder result = new StringBuilder("" + (int) word.charAt(0));
        if (word.length() == 1) return result.toString();
        if (word.length() == 2) return (result.toString() + word.charAt(1));

        result.append(word.charAt(word.length() - 1));
        for (int i = 2; i < word.toCharArray().length-1; i++) {
            result.append(word.charAt(i));
        }
        result.append(word.charAt(1));
        return result.toString();
    }
