/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileFilter;

public class Iw {
    private final String a;
    private final FileFilter b;

    public Iw(String string, FileFilter fileFilter) {
        this.a = string;
        this.b = fileFilter;
    }

    public String toString() {
        return "Pack{m_name='" + this.a + "', m_filter=" + this.b + "}";
    }

    public String a() {
        return this.a;
    }

    public FileFilter b() {
        return this.b;
    }
}

