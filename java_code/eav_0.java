/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eAv
 */
public class eav_0 {
    public static final eav_0 a = new eav_0();
    private final ArrayList<eat_0> b = new ArrayList();
    private final ArrayList<eat_0> c = new ArrayList();

    public void a(eat_0 eat_02) {
        this.b.add(eat_02);
    }

    public void b(eat_0 eat_02) {
        this.c.add(eat_02);
    }

    public eak_0 a(String string) {
        if (string == null) {
            return eai_0.a(eaj_0.b);
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            eak_0 eak_02 = this.b.get(k).a(string);
            if (eak_02.b() == eaj_0.d && k != n - 1) continue;
            return eak_02;
        }
        return eai_0.a(eaj_0.d);
    }

    public eak_0 b(String string) {
        if (string == null) {
            return eai_0.a(eaj_0.b);
        }
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            eak_0 eak_02 = this.c.get(k).a(string);
            if (eak_02.b() == eaj_0.d && k != n - 1) continue;
            return eak_02;
        }
        return eai_0.a(eaj_0.d);
    }
}

