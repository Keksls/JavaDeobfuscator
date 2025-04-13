/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileFilter;

public final class Ix {
    public static FileFilter a(FileFilter ... fileFilterArray) {
        return new Iy(fileFilterArray);
    }

    public static FileFilter b(FileFilter ... fileFilterArray) {
        return new Iz(fileFilterArray);
    }

    public static FileFilter a(FileFilter fileFilter) {
        return new IA(fileFilter);
    }
}

