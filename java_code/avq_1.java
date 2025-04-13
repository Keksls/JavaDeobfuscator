/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from avQ
 */
class avq_1
implements FilenameFilter {
    final /* synthetic */ avp_1 a;

    avq_1(avp_1 avp_12) {
        this.a = avp_12;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(this.a.c());
    }
}

