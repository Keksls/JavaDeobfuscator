/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from aMT
 */
class amt_2
implements FilenameFilter {
    final /* synthetic */ ams_2 a;

    amt_2(ams_2 ams_22) {
        this.a = ams_22;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".xml");
    }
}

