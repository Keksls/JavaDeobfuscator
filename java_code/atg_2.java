/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/*
 * Renamed from atg
 */
public class atg_2
implements aqu_2<ath_2> {
    protected static final Logger a = Logger.getLogger(atg_2.class);
    private DocumentBuilder b;
    private Document c;
    private OutputStream d = null;
    private static final atg_2 e = new atg_2();

    public static atg_2 a() {
        return e;
    }

    public atg_2() {
        try {
            this.b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            a.error((Object)"Exception during XMLDocumentAccessor construction", (Throwable)parserConfigurationException);
        }
    }

    @Override
    public void a(String string) {
        try {
            InputStream inputStream = gg_0.c(string);
            this.a(inputStream);
            inputStream.close();
        }
        catch (Exception exception) {
            File file = new File(string);
            if (file.exists()) {
                try {
                    this.c = this.b.parse(file);
                }
                catch (SAXException sAXException) {
                    this.b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    throw sAXException;
                }
                if (this.c == null) {
                    throw new Exception("Impossible de parser le document " + string);
                }
            }
            this.c = null;
            throw new FileNotFoundException("Fichier non trouv\u00e9 : " + string);
        }
    }

    @Override
    public void a(InputStream inputStream) {
        this.c = this.b.parse(inputStream);
    }

    @Override
    public boolean g(String string) {
        File file = new File(string);
        File file2 = file.getParentFile();
        boolean bl = file2.mkdirs() && file.createNewFile();
        this.d = new FileOutputStream(string);
        return bl;
    }

    @Override
    public void a(OutputStream outputStream) {
        this.d = outputStream;
    }

    @Override
    public void l() {
        this.c = null;
    }

    @Override
    public void a(ath_2 ath_22, aqy_2 ... aqy_2Array) {
        try {
            Node node;
            if (this.c == null) {
                a.error((Object)"read() invoqu\u00e9 sur un document non ouvert ( voir : open() )");
                return;
            }
            ath_22.o();
            for (node = this.c.getFirstChild(); node != null && node.getNodeType() != 1; node = node.getNextSibling()) {
            }
            ati_2 ati_22 = this.a(node, aqy_2Array);
            if (ati_22 != null) {
                ath_22.a(ati_22);
            }
            ath_22.r();
        }
        catch (Exception exception) {
            ath_22.e("Exception : " + exception.getMessage());
            a.error((Object)"Exception during read", (Throwable)exception);
        }
    }

    private static String a(String string, aqy_2[] aqy_2Array) {
        if (aqy_2Array != null && aqy_2Array.length > 0) {
            for (aqy_2 aqy_22 : aqy_2Array) {
                String string2 = aqy_22.a(string);
                if (string2 == null) continue;
                return string2;
            }
        }
        return string;
    }

    private ati_2 a(Node node, aqy_2[] aqy_2Array) {
        if (node == null) {
            return null;
        }
        String string = atg_2.a(node.getNodeName(), aqy_2Array);
        String string2 = atg_2.a(node.getNodeValue(), aqy_2Array);
        ati_2 ati_22 = new ati_2(string, string2);
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap != null) {
            for (int k = 0; k < namedNodeMap.getLength(); ++k) {
                Node node2 = namedNodeMap.item(k);
                string = atg_2.a(node2.getNodeName(), aqy_2Array);
                string2 = atg_2.a(node2.getNodeValue(), aqy_2Array);
                ati_22.c(new atj_2(string, string2));
            }
        }
        for (Node node3 = node.getFirstChild(); node3 != null; node3 = node3.getNextSibling()) {
            ati_22.a(this.a(node3, aqy_2Array));
        }
        return ati_22;
    }

    @Override
    public void a(ath_2 ath_22) {
        this.a(ath_22, true);
    }

    public void a(ath_2 ath_22, boolean bl) {
        this.a(ath_22, bl, true);
    }

    public void a(ath_2 ath_22, boolean bl, boolean bl2) {
        this.a(ath_22, bl, bl2, true);
    }

    public void a(ath_2 ath_22, boolean bl, boolean bl2, boolean bl3) {
        if (ath_22 == null) {
            return;
        }
        ath_22.p();
        try {
            if (bl) {
                this.b(ath_22, bl2, bl3);
            } else {
                this.b(ath_22);
            }
        }
        catch (TransformerException transformerException) {
            a.error((Object)"Probleme pendant la sauvegarde d'un fichier XML.", (Throwable)transformerException);
        }
        ath_22.q();
    }

    private void b(ath_2 ath_22) {
        Document document = this.b.newDocument();
        Node node = atg_2.a(ath_22.a(), document);
        document.appendChild(node);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(this.d);
        transformer.transform(dOMSource, streamResult);
    }

    private static Node a(aqx_2 aqx_22, Document document) {
        if (aqx_22 == null) {
            return null;
        }
        Node node = atg_2.b(aqx_22, document);
        for (aqx_2 aqx_23 : aqx_22.k()) {
            Node node2 = atg_2.a(aqx_23, document);
            node.appendChild(node2);
        }
        return node;
    }

    private static Node b(aqx_2 aqx_22, Document document) {
        String string = aqx_22.b();
        String string2 = aqx_22.c();
        if (string.equals("#text")) {
            return document.createTextNode(string2);
        }
        if (string.equals("#comment")) {
            return document.createComment(string2);
        }
        if (string.equals("#cdata-section")) {
            return document.createCDATASection(string2);
        }
        Element element = document.createElement(string);
        for (aqx_2 aqx_23 : aqx_22.l()) {
            Attr attr = document.createAttribute(aqx_23.b());
            attr.setValue(aqx_23.c());
            element.setAttributeNode(attr);
        }
        return element;
    }

    private void b(ath_2 ath_22, boolean bl, boolean bl2) {
        ati_2 ati_22 = ath_22.a();
        try {
            if (bl) {
                atg_2.a(this.d, "UTF-8");
            }
            if (ati_22 != null) {
                this.a(ati_22, this.d, "UTF-8", 0, bl2);
            }
            this.d.close();
            this.d = null;
        }
        catch (Exception exception) {
            ath_22.e("Exception : " + exception.getMessage());
            a.error((Object)"Exception during writeCustom", (Throwable)exception);
        }
    }

    private static void a(OutputStream outputStream, String string) {
        outputStream.write(("<?xml version=\"1.0\" encoding=\"" + string + "\"?>\r\n").getBytes(string));
    }

    private void a(aqx_2 aqx_22, OutputStream outputStream, String string, int n, boolean bl) {
        if (aqx_22 == null) {
            return;
        }
        if (bl) {
            atg_2.a(aqx_22);
        }
        String string2 = aqx_22.b();
        String string3 = aqx_22.c();
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            for (int k = 0; k < n; ++k) {
                stringBuilder.append('\t');
            }
        }
        String string4 = stringBuilder.toString();
        if (string2.equals("#text")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write(string3.getBytes(string));
            if (bl) {
                outputStream.write("\r\n".getBytes(string));
            }
        } else if (string2.equals("#comment")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write("<!--".getBytes(string));
            outputStream.write(string3.getBytes(string));
            outputStream.write("-->".getBytes(string));
        } else if (string2.equals("#cdata-section")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write("<![CDATA[".getBytes(string));
            outputStream.write(string3.getBytes(string));
            outputStream.write("]]>".getBytes(string));
            if (bl) {
                outputStream.write("\n".getBytes(string));
            }
        } else {
            boolean bl2;
            outputStream.write(string4.getBytes(string));
            outputStream.write("<".getBytes(string));
            outputStream.write(string2.getBytes(string));
            atg_2.a(aqx_22, outputStream, string);
            boolean bl3 = !aqx_22.k().isEmpty();
            boolean bl4 = bl2 = aqx_22.c() != null && !aqx_22.c().isEmpty();
            if (!bl3 && !bl2) {
                outputStream.write("/".getBytes(string));
            }
            if (!bl2) {
                outputStream.write(">".getBytes(string));
                if (bl) {
                    outputStream.write("\r\n".getBytes(string));
                }
            } else {
                outputStream.write(">".getBytes(string));
            }
            for (aqx_2 aqx_23 : aqx_22.k()) {
                this.a(aqx_23, outputStream, string, n + 1, bl);
            }
            if (aqx_22.c() != null) {
                outputStream.write(aqx_22.c().trim().getBytes(string));
            }
            if (bl3) {
                outputStream.write(string4.getBytes(string));
            }
            if (bl3 || bl2) {
                outputStream.write("</".getBytes(string));
                outputStream.write(string2.getBytes(string));
                outputStream.write(">".getBytes(string));
                if (bl) {
                    outputStream.write("\r\n".getBytes(string));
                }
            }
        }
    }

    private static void a(aqx_2 aqx_22) {
        String string = aqx_22.b();
        if (string.equals("#text")) {
            aqx_22.b(aqx_22.c().replaceAll("[\n\t]", ""));
        }
    }

    private static void a(aqx_2 aqx_22, OutputStream outputStream, String string) {
        if (aqx_22 == null) {
            return;
        }
        for (aqx_2 aqx_23 : aqx_22.l()) {
            String string2 = aqx_23.b();
            String string3 = aqx_23.c();
            outputStream.write(" ".getBytes(string));
            outputStream.write(string2.getBytes(string));
            outputStream.write("=\"".getBytes(string));
            outputStream.write(string3 != null ? Cz.i(string3).getBytes(string) : "".getBytes());
            outputStream.write("\"".getBytes(string));
        }
    }

    public ath_2 b() {
        return new ath_2();
    }

    public void a(ath_2 ath_22, String string) {
        this.a(ath_22, string, true);
    }

    public void a(ath_2 ath_22, String string, boolean bl) {
        if (ath_22 == null) {
            return;
        }
        ati_2 ati_22 = ath_22.a();
        ath_22.p();
        try {
            atg_2.a(this.d, "UTF-8");
            this.d.write(string.getBytes("UTF-8"));
            if (ati_22 != null) {
                this.a(ati_22, this.d, "UTF-8", 0, bl);
            }
            this.d.close();
            this.d = null;
        }
        catch (Exception exception) {
            ath_22.e("Exception : " + exception.getMessage());
            a.error((Object)"Exception during writeWithHeader", (Throwable)exception);
            return;
        }
        ath_22.q();
    }

    @Override
    public /* synthetic */ aqv_2 n() {
        return this.b();
    }
}

