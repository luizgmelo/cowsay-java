public class CowSayApplication {
  public static void main(String[] args) throws Exception {
    String formatUp = "_______".repeat(args.length);
    String message = " ";
    String formatDown = "-------".repeat(args.length);

    for (int i = 0; i < args.length; i++) {
      message += args[i] + " ";
    }

    String cowSay = """
         %s
        <%s>
         %s
                \\   ^__^
                 \\  (oo)\\_______
                    (__)\\       )\\/\\
                        ||----w |
                        ||     ||
        """.formatted(formatUp, message, formatDown);

    System.out.println(cowSay);
  }
}