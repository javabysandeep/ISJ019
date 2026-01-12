package _6_java8_features;

public class Demo1 {
    public static void main(String[] args) {
        //till java 7 --> only abstract methods
        //from java 8 --->
            /*
            01. variables ---> public static final
            02. methods ---> public abstract, default, static methods
            03. nested classes --> public static
            * */

        /*
         * what is not allowed?
         * 01. instance variable,instance method, instance block, constructor, static block, non-static nested class are not allowed
         *
         * because of this multiple inheritance is supported through interfaces?
         * */
        //fully abstract

        interface MessageService {
            void sendMessage();

        }

        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage() {
                System.out.println("sending message ");
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

    }

}
