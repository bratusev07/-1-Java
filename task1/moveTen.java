public static String moveTen(String s) {
    StringBuilder str = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c + 10 > 'z') {
            char tmp = (char) ('a' + (c + 10 - 'z') - 1);
            str.append(tmp);
        } else str.append((char) (c + 10));
    }
    return str.toString();
}
