import sndlib.core.io.SNDlibParseException;
import sndlib.core.io.sndnative.SNDlibNativeParser;
import sndlib.core.io.xml.SNDlibXmlParser;
import sndlib.core.network.Network;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SNDlibParseException {


        SNDlibXmlParser xmlParser = new SNDlibXmlParser();
        SNDlibNativeParser nativeParser = new SNDlibNativeParser();

        Network network = nativeParser.parseNetwork(new FileReader("sndlib-instances-native/polska/polska.txt"));


//        xmlParser.parseNetwork()
//        Network network = null;
//
//        network = xmlParser.parseNetwork(new FileReader("sndlib-instances-xml/polska/polska.xml"));


    }

}
