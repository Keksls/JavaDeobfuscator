/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bHh
 */
public class bhh_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "lootList";
    public static final String d = "finished";
    public static final String e = "selectedItem";
    public static final String f = "maxColumns";
    public static final String g = "iconUrl";
    public static final String h = "quantity";
    public static final String i = "key";
    public static final String[] j = new String[]{"name", "lootList", "finished", "selectedItem"};
    private boolean k = true;
    private bjw_1 l;
    private final int m;
    private final ArrayList<exi_2> n;
    private final String o;
    private final String p;
    private int q;

    public boolean a() {
        return this.k;
    }

    @Override
    public String[] d() {
        return j;
    }

    public bhh_0(exk_2 exk_22, ArrayList<exi_2> arrayList) {
        this.n = arrayList;
        this.o = exk_22.N();
        this.p = exk_22.O();
        this.q = exk_22.e();
        int n = this.n.size();
        float f2 = Hw.k(n);
        int n2 = Math.round(f2);
        int n3 = -1;
        if (n % 10 == 0 && n / 10 > 1) {
            n3 = 10;
        } else if (n % 5 == 0 && n / 5 > 1) {
            n3 = 5;
        } else if (n % 3 == 0 && n / 3 > 1) {
            n3 = 3;
        }
        if (n3 == -1 || Math.abs(n3 - n2) > 2) {
            n3 = n2;
        }
        this.m = n3;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.o;
        }
        if (string.equals(b)) {
            return this.n;
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(e)) {
            return this.l;
        }
        if (string.equals(f)) {
            return this.m;
        }
        if (string.equals(g)) {
            return this.p;
        }
        if (string.equals(h)) {
            return this.q;
        }
        if (string.equals(i)) {
            return aZF.a(32);
        }
        return null;
    }

    public void a(boolean bl) {
        this.k = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public int a(int n) {
        for (exi_2 exi_22 : this.n) {
            if (exi_22.aT_() != n) continue;
            return this.n.indexOf(exi_22);
        }
        return -1;
    }

    public int b() {
        return this.n.size();
    }

    public void a(float f2) {
        fis_1.a().a((ajf_1)this, e);
    }

    public void c() {
        if (this.q > 0) {
            --this.q;
        }
        fis_1.a().a((ajf_1)this, h);
    }

    public int e() {
        return this.q;
    }
}

