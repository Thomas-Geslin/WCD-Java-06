class Classroom {
    public static void main(String[] args) {
        Wilder firstWilder = new Wilder("Alain", true);
        Wilder secondWilder = new Wilder("Louis", false);
        Wilder thirdWilder = new Wilder("Julie", true);
        Wilder fourthWilder = new Wilder("Alain", true);

        System.out.println(firstWilder.whoAmI());
        System.out.println(secondWilder.whoAmI());
        System.out.println(thirdWilder.whoAmI());
        System.out.println(fourthWilder.whoAmI());
    }
}