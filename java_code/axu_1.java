/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from axU
 */
public class axu_1
implements ayn_2 {
    private byte f;
    private short g;
    private short h;
    private short i;
    private short j;
    short k;
    private short l;
    private String m;
    private ays_2 n;
    private TIntObjectHashMap<axx_1> o;

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

    private void l() {
        this.o.put(160, (Object)((axx_1)this.o.get(32)));
    }

    private void a(arf_1 arf_12) {
        byte by = arf_12.a();
        int n = arf_12.c();
        int n2 = arf_12.m() + n;
        arf_12.f(n2);
    }

    private void b(arf_1 arf_12) {
        byte by = arf_12.a();
        int n = arf_12.c();
        int n2 = arf_12.m() + n;
        this.i = arf_12.b();
        this.j = arf_12.b();
        arf_12.f(n2);
    }

    private void c(arf_1 arf_12) {
        byte by = arf_12.a();
        int n = arf_12.c();
        int n2 = arf_12.m() + n;
        arf_12.f(n2);
    }

    private void d(arf_1 arf_12) {
        byte by = arf_12.a();
        int n = arf_12.c();
        this.g = (short)(n / 20);
        this.o = new TIntObjectHashMap((int)this.g, 1.0f);
        for (int k = 0; k < this.g; ++k) {
            axx_1 axx_12 = new axx_1();
            char[] cArray = Character.toChars(arf_12.c());
            axx_12.a = cArray[0];
            axx_12.b = arf_12.b();
            axx_12.c = arf_12.b();
            axx_12.d = arf_12.b();
            axx_12.e = arf_12.b();
            axx_12.f = arf_12.b();
            axx_12.g = arf_12.b();
            axx_12.h = arf_12.b();
            arf_12.a();
            arf_12.a();
            this.o.put((int)axx_12.a, (Object)axx_12);
            this.k = (short)Math.max(this.k, axx_12.d);
            this.l = (short)Math.max(this.l, axx_12.e);
        }
    }

    private void e(arf_1 arf_12) {
        if (arf_12.g() <= 0) {
            return;
        }
        byte by = arf_12.a();
        int n = arf_12.c();
        int n2 = n / 10;
        for (int k = 0; k < n2; ++k) {
            char[] cArray = Character.toChars(arf_12.c());
            char[] cArray2 = Character.toChars(arf_12.c());
            short s2 = arf_12.b();
            axx_1 axx_12 = (axx_1)this.o.get((int)cArray[0]);
            if (axx_12 == null) continue;
            if (axx_12.i == null) {
                axx_12.i = new acz_2();
            }
            axx_12.i.a(cArray2[0], s2);
        }
        this.m();
    }

    private void m() {
        this.o.forEachValue((TObjectProcedure)new axv_1(this));
    }

    public void a(String string, String string2) {
        this.m = string;
        arf_1 arf_12 = arf_1.a(gg_0.b(string2 + string + ".fnt"));
        if (arf_12.a() != 66 || arf_12.a() != 77 || arf_12.a() != 70) {
            return;
        }
        this.f = arf_12.a();
        this.a(arf_12);
        this.b(arf_12);
        this.c(arf_12);
        this.d(arf_12);
        this.e(arf_12);
        this.l();
        arf_12.close();
        long l = -6196766170285080576L + (long)auc_1.d(string);
        String string3 = string2 + string + "_0.dds";
        if (!cd_0.b(string3)) {
            string3 = string2 + string + "_0.DDS";
        }
        this.n = ayu_2.a().a((aui_2)auj_1.a.a(), l, string3, false);
        this.n.k_();
    }

    public final String d() {
        return this.m;
    }

    public final axx_1 a(char c2) {
        return (axx_1)this.o.get((int)c2);
    }

    public final ays_2 e() {
        return this.n;
    }

    public final int f() {
        return this.i;
    }

    public short g() {
        return this.k;
    }

    public short h() {
        return this.l;
    }

    @Override
    public short c() {
        return 0;
    }

    public short i() {
        return this.j;
    }

    @Override
    public void a(int n, int n2) {
    }

    public short j() {
        return (short)(this.i - this.j);
    }

    public void k() {
        this.o.forEachValue((TObjectProcedure)new axw_1(this));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        axu_1 axu_12 = (axu_1)object;
        return this.m.equals(axu_12.m);
    }

    public int hashCode() {
        return this.m.hashCode();
    }
}

