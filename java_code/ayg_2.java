/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;

/*
 * Renamed from ayG
 */
public class ayg_2
implements ayn_2 {
    private short f;
    private short g;
    private short h;
    private short i;
    private short j;
    private short k = 0;
    private short l = 0;
    private String m;
    private ays_2 n;
    private TShortObjectHashMap<ayh_1> o;

    @Override
    public ayn_2 a(int n, float f2, boolean bl) {
        String string = ayq_1.e(this.m);
        return ayq_1.a(string, n, (int)f2);
    }

    @Override
    public float a() {
        return ayq_1.d(this.m);
    }

    @Override
    public int b() {
        return ayq_1.c(this.m);
    }

    public void a(String string, String string2) {
        this.m = string;
        arf_1 arf_12 = arf_1.a(gg_0.b(string2 + string + ".tab"));
        boolean bl = string.contains("bordered");
        arf_12.f(10);
        if (bl) {
            this.f = (short)2;
        }
        int n = arf_12.b();
        this.g = arf_12.b();
        this.h = arf_12.b();
        this.i = arf_12.b();
        this.j = (short)(arf_12.b() + this.f);
        this.o = new TShortObjectHashMap(n);
        for (int k = 0; k < n; ++k) {
            ayh_1 ayh_12 = new ayh_1();
            ayh_12.a = arf_12.b();
            arf_12.b();
            ayh_12.b = (short)(arf_12.b() - this.f);
            ayh_12.c = (short)(arf_12.b() - this.f);
            ayh_12.d = (short)(arf_12.b() + 2 * this.f);
            ayh_12.e = (short)(arf_12.b() + 2 * this.f);
            ayh_12.f = arf_12.b();
            ayh_12.g = arf_12.b();
            this.o.put(ayh_12.a, (Object)ayh_12);
            if (ayh_12.d > this.k) {
                this.k = ayh_12.d;
            }
            if (ayh_12.e <= this.l) continue;
            this.l = ayh_12.e;
        }
        this.i();
        arf_12.close();
        long l = -6196766170285080576L + (long)auc_1.d(string);
        String string3 = string2 + string + "000.DDS";
        if (!cd_0.b(string3)) {
            string3 = string2 + string + "000.tga";
        }
        this.n = ayu_2.a().a((aui_2)auj_1.a.a(), l, string3, false);
        this.n.k_();
    }

    private void i() {
        this.o.put((short)160, (Object)((ayh_1)this.o.get((short)32)));
    }

    public final String d() {
        return this.m;
    }

    public final ayh_1 a(short s2) {
        if (s2 < this.h || s2 > (this.i & 0xFFFF)) {
            return null;
        }
        return (ayh_1)this.o.get(s2);
    }

    public final ays_2 e() {
        return this.n;
    }

    public final int f() {
        return this.j;
    }

    public short g() {
        return this.k;
    }

    public short h() {
        return this.l;
    }

    @Override
    public short c() {
        return this.f;
    }

    @Override
    public void a(int n, int n2) {
    }
}

