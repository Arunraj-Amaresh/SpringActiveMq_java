package com.example.Integration;


import org.json.JSONObject;
import org.json.XML;
import org.springframework.integration.core.GenericTransformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class XmlToJsonTransformer implements GenericTransformer<Message<File>, String> {

    @Override
    public String transform(Message<File> message) {
        File xmlFile = message.getPayload();
        try {
            String xmlContent = new String(Files.readAllBytes(Paths.get(xmlFile.getPath())));

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlContent)));

             JSONObject json = XML.toJSONObject(xmlContent);

             return json.toString();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to transform XML to JSON", e);
        }
    }
}
