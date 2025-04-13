/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

/*
 * Renamed from bmq
 */
class bmq_2
implements FileFilter {
    final /* synthetic */ bmp_1 a;

    bmq_2(bmp_1 bmp_12) {
        this.a = bmp_12;
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }
}

