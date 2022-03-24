package uaslp.objetos.parcial2.exam.messagebuilder;
import uaslp.objetos.parcial2.exam.exporters.ExporterFactory;


public class MessageBuilderFactory extends MessageBuilder{


    public static MessageBuilder getMessageBuilder(MessageType messageType){
        return new MessageBuilder() {
            @Override
            protected String getDescription() {
                final String name = messageType.name();
                return name;
            }
        };
    }


    protected String getDescription() {
        return null;
    }
}