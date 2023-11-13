class ExitCode {
    public static void main(String[] args) {
    System.out.println("Exiting with code " + args[0]);
    System.exit(Integer.parseInt(args[0]));
}
}