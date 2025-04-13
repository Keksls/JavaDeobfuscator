/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bsE
 */
public class bse_1
implements ajh_1 {
    public static final String a = "time";
    public static final String b = "items";
    public static final String d = "playerName";
    public static final String e = "kamas";
    private final wu_0 g;
    private final String h;
    private final List<bwk_2> i = new ArrayList<bwk_2>();
    private final long j;
    public final String[] f = new String[]{"time", "items", "playerName", "kamas"};

    public bse_1(wu_0 wu_02, String string, long l) {
        this.g = wu_02;
        this.h = string;
        this.j = l;
    }

    public void a(int n, short s2) {
        this.i.add(new bwk_2(n, s2));
    }

    public int a() {
        return this.i.size();
    }

    @Override
    public String[] d() {
        return this.f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().b(this.g);
        }
        if (string.equals(b)) {
            return this.i;
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            return this.j;
        }
        return null;
    }

    public wu_0 b() {
        return this.g;
    }

    public long c() {
        return this.j;
    }
}

