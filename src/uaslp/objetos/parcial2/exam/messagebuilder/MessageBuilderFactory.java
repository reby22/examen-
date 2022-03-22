package uaslp.objetos.parcial2.exam.messagebuilder;
import uaslp.objetos.parcial2.exam.exporters.ExporterType;


public class MessageBuilderFactory extends MessageBuilder{

    private MessageType messageType;
    private static MessageBuilder messageBuilder;
    private String m;



    public static MessageBuilder getMessageBuilder(MessageType messageType){
        return null;
    }


    protected String getDescription() {
        return null;
    }
}