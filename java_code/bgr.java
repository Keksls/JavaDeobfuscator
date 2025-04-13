/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bgr
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "rewards";
    public static final String d = "description";
    public static final String[] e = new String[]{"name", "rewards", "description"};
    private final String f;
    private final String g;
    private final ArrayList<bjw_1> h = new ArrayList();

    public bgr(String string, String string2, int[] nArray) {
        this.f = string;
        this.g = string2;
        for (int n : nArray) {
            this.h.add((bjw_1)eyo_1.g().d(n));
        }
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.h.size() > 0 ? this.h : null;
        }
        if (string.equals(d)) {
            return this.g;
        }
        return null;
    }
}

