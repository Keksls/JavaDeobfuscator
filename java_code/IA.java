/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

class IA
implements FileFilter {
    final /* synthetic */ FileFilter a;

    IA(FileFilter fileFilter) {
        this.a = fileFilter;
    }

    @Override
    public boolean accept(File file) {
        return !this.a.accept(file);
    }
}

