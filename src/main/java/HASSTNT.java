public class HASSTNT{
    private static final String welcome_message = "____________________________________________________________\n" +
            "Hello! I'm HASSTNT\n" +
            "What can I do for you?\n" +
            "____________________________________________________________\n";

    public static void main(String[] args) {
        System.out.println(welcome_message);
        ChatbotFunctionality c = new ChatbotFunctionality();
        c.startConversation();
    }
    }