/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.io.Files
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Strings;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Iv {
    private static final Logger a = LoggerFactory.getLogger(Iv.class);
    private final ArrayList<Iw> b;
    private final String c;
    private final String d;
    private final Iu e;

    public Iv(String string, String string2, String string3, boolean bl) {
        this.c = string2 + "/" + string3 + ".jar";
        this.d = string;
        this.b = new ArrayList();
        a.info("Multipacking setup");
        this.e = new Iu(bl);
    }

    public Iv(String string, String string2, boolean bl) {
        this(string, string2, string2, bl);
    }

    public void a(FileFilter fileFilter) {
        this.b.add(new Iw(null, fileFilter));
    }

    public void a(Iterable<String> iterable) {
        for (String string : iterable) {
            this.b.add(new Iw(string, new IB(".*_" + string + ".*")));
        }
    }

    public void a() {
        for (Iw iw : this.b) {
            this.a(iw.a(), iw.b());
        }
    }

    private void a(String string, FileFilter fileFilter) {
        Object object = Strings.isNullOrEmpty((String)string) ? "" : "_" + string;
        String string2 = Iv.a(this.c, (String)object);
        this.e.a(string2, new File(this.d), fileFilter, (String)object);
        a.info("Pack done : " + string2);
    }

    public static String a(String string, String string2) {
        String string3 = Files.getFileExtension((String)string);
        return string.replace("." + string3, string2 + "." + string3);
    }

    public String toString() {
        return "MultiPackingHandler{m_packs=" + this.b + ", m_destDir='" + this.c + "', m_srcDir='" + this.d + "'}";
    }
}

