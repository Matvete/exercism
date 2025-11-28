class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ","_");
        identifier = toCamelCase(identifier);
        identifier = identifier
                .replace("4","a")
                .replace("3","e")
                .replace("0","o")
                .replace("1","l")
                .replace("7","t");

        StringBuilder builder = new StringBuilder();
        for(char c:identifier.toCharArray())
        {
            if(Character.isLetter(c) || c == '_')
            {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    private static String toCamelCase(String text)
    {
        StringBuilder builder = new StringBuilder();

        String[] words = text.split("-"); //splitting identifier to separate words
        builder.append(words[0]); //first word without changes

        for(int i = 1; i< words.length; i++)
        {
            char[] letters = words[i].toCharArray();
            letters[0] = Character.toUpperCase(letters[0]); //changing first letter to uppercase
            builder.append(letters);
        }

        return builder.toString();
    }



/*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("Podaj wyraz:");
            System.out.println(SqueakyClean.clean(reader.readLine()));
        }
    }
*/
}
