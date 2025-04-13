/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

class Iy
implements FileFilter {
    final /* synthetic */ FileFilter[] a;

    Iy(FileFilter[] fileFilterArray) {
        this.a = fileFilterArray;
    }

    @Override
    public boolean accept(File file) {
        for (FileFilter fileFilter : this.a) {
            if (fileFilter.accept(file)) continue;
            return false;
        }
        return true;
    }
}

