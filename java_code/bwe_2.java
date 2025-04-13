/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bWE
 */
public class bwe_2
implements ajh_1 {
    public static final String a = "categories";
    public static final String b = "selectedCategory";
    private final ArrayList<bwc_2> d = new ArrayList();
    private boolean e = true;

    public bwe_2(fgy_0 fgy_02) {
        this.d.add(new bwc_2(fgy_02, true));
        this.d.add(new bwc_2(fgy_02, false));
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return this.e ? this.d.get(0) : this.d.get(1);
        }
        return null;
    }

    public void a(boolean bl) {
        this.e = bl;
        fis_1.a().a((ajf_1)this, b);
    }

    public bwd_2 a(int n, boolean bl) {
        return this.d.get(bl ? 0 : 1).a(n);
    }
}

