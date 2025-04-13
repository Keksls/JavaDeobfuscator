/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class Ch {
    private Ch() {
    }

    public static void a(File file) {
        String[] stringArray;
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        for (String string : stringArray = file.list()) {
            Ch.a(new File(file.getPath(), string));
        }
    }
}

