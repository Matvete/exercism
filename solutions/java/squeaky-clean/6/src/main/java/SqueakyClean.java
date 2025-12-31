

class SqueakyClean {
    static String clean(String identifier) {

//      Initializing variables
        char[] letters = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean camelCaseMode = false;

        for (char c : letters) {

            switch (c) {
                //replacing whitespace characters to underscore
                case char t when Character.isWhitespace(t):
                    builder.append("_");
                    break;

                // detecting kebab-case
                case '-':
                    camelCaseMode = true;
                    break;

                // changing digits to letters
                case '4':
                    builder.append('a');     // 4 -> a
                    break;
                case '3':
                    builder.append('e');    // 3 -> e
                    break;
                case '0':
                    builder.append('o');    // 0 -> o
                    break;
                case '1':
                    builder.append('l');    // 1 -> l
                    break;
                case '7':
                    builder.append('t');    // 7 -> t
                    break;

                default:

                    if (Character.isLetter(c)) // omitting any non-letter characters
                    {
                        if (camelCaseMode) // changing kebab-case to camelCase
                        {
                            builder.append(Character.toUpperCase(c));
                            camelCaseMode = false;
                            break;
                        }
                        builder.append(c); // rest without changes
                    }


                    break;
            }
        }

        return builder.toString();
    }
}
