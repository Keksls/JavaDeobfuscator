/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

/*
 * Renamed from aJs
 */
public class ajs_1 {
    public static int a(String string, int n, File file, File file2) {
        ajj_2 ajj_22 = new ajj_2(file.getPath(), string, n, new ajr_1(), null);
        return ajj_22.b(file2);
    }

    public static int a(Integer n, File file, File file2) {
        ajj_2 ajj_22 = new ajj_2(file.getPath(), null, n != null ? n : -1, new ajr_1(), null);
        return ajj_22.a(file2);
    }

    public static int b(Integer n, File file, File file2) {
        ajj_2 ajj_22 = new ajj_2(file.getPath(), null, n != null ? n : -1, new ajr_1(), null);
        return ajj_22.a(file2);
    }
}

