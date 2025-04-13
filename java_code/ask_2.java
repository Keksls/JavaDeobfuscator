/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from asK
 */
public class ask_2
implements FilenameFilter {
    private final String a;

    public ask_2(String string) {
        if (string == null) {
            throw new IllegalArgumentException("fileName null");
        }
        this.a = string;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.equals(string);
    }
}

