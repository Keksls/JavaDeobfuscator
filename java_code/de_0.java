/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.JAXBContext
 *  jakarta.xml.bind.JAXBException
 *  jakarta.xml.bind.Unmarshaller
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlRootElement
 */
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.File;

/*
 * Renamed from DE
 */
@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
public class de_0 {
    @XmlElement(name="metadatas")
    public final du_0 a = new du_0();
    @XmlElement(name="export")
    public final do_0 b = new do_0();
    @XmlElement(name="extensions")
    public final dr_0 c = new dr_0();

    public static de_0 a(File file) {
        try {
            if (!file.exists()) {
                return new de_0();
            }
            JAXBContext jAXBContext = JAXBContext.newInstance((Class[])new Class[]{de_0.class});
            Unmarshaller unmarshaller = jAXBContext.createUnmarshaller();
            return (de_0)unmarshaller.unmarshal(file);
        }
        catch (JAXBException jAXBException) {
            throw new IllegalStateException("Unable to load " + file, jAXBException);
        }
    }
}

