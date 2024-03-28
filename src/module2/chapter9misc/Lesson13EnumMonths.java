package module2.chapter9misc;

enum Lesson13EnumMonths {
    JANUARY(31,"First month of a year"),FEBRUARY(29,"Second Month"),MARCH(31,"Third Month");

    int value = 0;
    String hint = null;

    Lesson13EnumMonths(int value, String hint) {
        this.value = value;
        this.hint = hint;
    }

    public static void main(String[] args) {
        System.out.println(Lesson13EnumMonths.valueOf("MARCH").value);
        System.out.println(Lesson13EnumMonths.JANUARY.hint);
        System.out.println(Lesson13EnumMonths.FEBRUARY.value);
    }
}
