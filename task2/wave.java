public static String[] wave(String str) {
        int length = str.replaceAll("\\s","").length();
        String[] newMass = new String[length];
        int pos=0;

        for (int i=0; i<str.length(); i++) {
            while (Character.toString(str.charAt(i)).equals(" ")) {
                if ((i+1)>=str.length()) return newMass;
                i++;
            }

            char[] tmp = str.toCharArray();
            tmp[i] = Character.toUpperCase(str.charAt(i));
            newMass[pos] = new String(tmp);
            pos++;
        }

        return newMass;
    }
