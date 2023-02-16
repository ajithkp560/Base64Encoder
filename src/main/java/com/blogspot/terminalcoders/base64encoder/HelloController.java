package com.blogspot.terminalcoders.base64encoder;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.commons.codec.binary.Base64;

public class HelloController {
    @FXML
    private TextField fileName;

    @FXML
    private TextArea base64data;

    @FXML
    protected void onOpenClick() {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(fileName.getScene().getWindow());
        fileName.setText(file.getAbsolutePath());

        // Read file
        try {
            byte[] encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
            String encodedStr = new String(encoded, StandardCharsets.US_ASCII);
            base64data.setText(encodedStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}