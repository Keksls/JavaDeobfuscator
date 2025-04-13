/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

/*
 * Renamed from azw
 */
public class azw_1
implements FileFilter {
    public static final azw_1 a = new azw_1();

    @Override
    public boolean accept(File file) {
        return file.getAbsolutePath().endsWith(".crd");
    }
}

