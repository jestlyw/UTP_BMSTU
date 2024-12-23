public class StringList {
    private String[] strings;
    private int size;

    public StringList() {
        strings = new String[10];
        size = 0;
    }

    public void addString(String str) {
        if (size == strings.length) {
            String[] newArray = new String[strings.length * 2];
            System.arraycopy(strings, 0, newArray, 0, strings.length);
            strings = newArray;
        }

        strings[size] = str;
        size++;

        for (int i = size - 1; i > 0; i--) {
            if (strings[i].length() < strings[i - 1].length()) {
                String temp = strings[i];
                strings[i] = strings[i - 1];
                strings[i - 1] = temp;
            } else {
                break;
            }
        }
    }

    public String getMaxLengthString() {
        if (size == 0) {
            return null;
        }
        return strings[size - 1];
    }

    public double getAverageLength() {
        if (size == 0) {
            return 0;
        }

        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += strings[i].length();
        }

        return (double) totalLength / size;
    }

    public void printStrings() {
        for (int i = 0; i < size; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main(String[] args) {
        StringList stringList = new StringList();

        stringList.addString("apple");
        stringList.addString("banana");
        stringList.addString("kiwi");
        stringList.addString("strawberry");

        System.out.println("All strings (sorted by length):");
        stringList.printStrings();

        System.out.println("\nMax length string: " + stringList.getMaxLengthString());

        System.out.println("\nAverage length: " + stringList.getAverageLength());
    }
}
