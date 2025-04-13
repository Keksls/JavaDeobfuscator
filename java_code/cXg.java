/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class cXg
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "level";
    public static final String d = "loots";
    public final String[] e = new String[]{"name", "level", "loots"};
    private final List<bwk_2> f = new ArrayList<bwk_2>();

    cXg() {
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return azu_0.j().k().dp();
        }
        if (string.equals(b)) {
            return azu_0.j().k().dr();
        }
        if (string.equals(d)) {
            return this.f.isEmpty() ? null : Collections.unmodifiableCollection(this.f);
        }
        return null;
    }

    public void a(int n, short s2) {
        this.f.add(new bwk_2(n, s2));
    }

    public void a(bwk_2 bwk_22) {
        if (!this.f.contains(bwk_22)) {
            this.f.add(bwk_22);
        }
    }
}

