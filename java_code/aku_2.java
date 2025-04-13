/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from aKu
 */
class aku_2
implements FilenameFilter {
    aku_2() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".lua");
    }
}

