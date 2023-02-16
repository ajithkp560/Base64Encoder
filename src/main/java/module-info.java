module com.blogspot.terminalcoders.base64encoder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires org.apache.commons.codec;
    requires org.apache.commons.io;

    opens com.blogspot.terminalcoders.base64encoder to javafx.fxml;
    exports com.blogspot.terminalcoders.base64encoder;
}