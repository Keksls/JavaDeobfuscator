/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from arV
 */
class arv_1
implements FilenameFilter {
    final /* synthetic */ art_1 a;

    arv_1(art_1 art_12) {
        this.a = art_12;
    }

    @Override
    public boolean accept(File file, String string) {
        int n = string.lastIndexOf(".");
        if (n == -1) {
            return false;
        }
        String string2 = string.substring(n);
        if (".bdat".equalsIgnoreCase(string2)) {
            return true;
        }
        return ".bdat".equalsIgnoreCase(string2);
    }
}

