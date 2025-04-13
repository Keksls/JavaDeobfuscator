/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/*
 * Renamed from arW
 */
class arw_1
implements FilenameFilter {
    final /* synthetic */ Pattern a;
    final /* synthetic */ art_1 b;

    arw_1(art_1 art_12, Pattern pattern) {
        this.b = art_12;
        this.a = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.matcher(string).matches();
    }
}

