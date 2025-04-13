/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public enum WQ {
    a('%', ""),
    b('y', "0*[0-9]{2}"),
    c('Y', "0*[0-9]{4}"),
    d('M', "0*[0-9]{1,2}"),
    e('d', "0*[0-9]{1,2}"),
    f('h', "0*[0-9]{1,2}"),
    g('m', "0*[0-9]{1,2}"),
    h('s', "0*[0-9]{1,2}");

    public static final HashMap<Character, WQ> i;
    public static String j;
    private final char k;
    private final String l;

    private WQ(char c2, String string2) {
        this.k = c2;
        this.l = string2;
    }

    public char a() {
        return this.k;
    }

    public String b() {
        return this.l;
    }

    static {
        i = new HashMap();
        j = "";
        for (int k = 0; k < WQ.values().length; ++k) {
            WQ wQ = WQ.values()[k];
            char c2 = wQ.k;
            i.put(Character.valueOf(c2), wQ);
            if (wQ == a) continue;
            j = j + c2;
        }
    }
}

