/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from cXH
 */
class cxh_0
implements FilenameFilter {
    final /* synthetic */ cXF a;

    cxh_0(cXF cXF2) {
        this.a = cXF2;
    }

    @Override
    public boolean accept(File file, String string) {
        return cXF.c.matcher(string).matches();
    }
}

