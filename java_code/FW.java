/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class FW
implements gc_0 {
    private short a;
    private String b;
    private int c;
    private int d;
    private byte e;
    private boolean f;
    private int g = -1;
    private fy_0 h;
    private int[] i;
    private Ft j;
    private short[] k;
    private short[] l;
    private int m = -1;

    @Override
    public short a() {
        return this.a;
    }

    public void a(short s2) {
        this.a = s2;
    }

    @Override
    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public int c() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    @Override
    public int d() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    @Override
    public byte e() {
        return this.e;
    }

    public void a(byte by) {
        this.e = by;
    }

    @Override
    public boolean f() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Override
    public int g() {
        return this.g;
    }

    public void c(int n) {
        this.g = n;
    }

    @Override
    public fy_0 h() {
        return this.h;
    }

    @Override
    public void a(fy_0 fy_02) {
        this.h = fy_02;
    }

    @Override
    public int i() {
        return this.i.length / (this.l == null ? 2 : 3);
    }

    @Override
    public List<Fz> d(int n) {
        return this.a(n, new ArrayList<Fz>());
    }

    @Override
    public List<Fz> a(int n, ArrayList<Fz> arrayList) {
        if (this.l == null) {
            return arrayList;
        }
        int n2 = this.i[n * 3 + 2];
        short s2 = this.l[n2];
        if (s2 == 0) {
            return arrayList;
        }
        int n3 = ++n2 + s2;
        for (int k = n2; k < n3; ++k) {
            Fz fz = this.h.d()[this.l[k]];
            fz.a(n);
            arrayList.add(fz);
        }
        return arrayList;
    }

    public int[] j() {
        return this.i;
    }

    public void a(int[] nArray) {
        this.i = nArray;
    }

    @Override
    public Ft k() {
        return this.j;
    }

    public void a(Ft ft) {
        this.j = ft;
    }

    public short[] l() {
        return this.k;
    }

    public void a(short[] sArray) {
        this.k = sArray;
    }

    public short[] m() {
        return this.l;
    }

    public void b(short[] sArray) {
        this.l = sArray;
    }

    public int n() {
        return this.m;
    }

    public void e(int n) {
        this.m = n;
    }

    @Override
    public gd_1 o() {
        return gd_1.d;
    }

    @Override
    public int p() {
        int n = 0;
        short[] sArray = this.k;
        for (int k = 0; k < sArray.length; ++k) {
            n += sArray[k];
            k += sArray[k];
        }
        return n;
    }

    @Override
    public int q() {
        return 0;
    }

    @Override
    public short[] f(int n) {
        int n2 = this.i[n * 2 + 1];
        short[] sArray = new short[this.k[n2]];
        int n3 = n2 + 1;
        System.arraycopy(this.k, n3, sArray, 0, sArray.length);
        return sArray;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final short s() {
        throw new UnsupportedOperationException("devrait etre du type AnmSpriteDefinitionSingle");
    }

    @Override
    public final void t() {
        ++this.m;
    }

    @Override
    public final int g(int n) {
        int n2 = n * (this.l == null ? 2 : 3);
        this.j.a(this.i[n2]);
        this.m = this.i[n2 + 1];
        return this.k[this.m];
    }

    @Override
    public short u() {
        return this.k[this.m];
    }

    @Override
    public final short a(Fx fx, Fx fx2) {
        int n = this.j.a();
        co_0.a(n).a(this.j, this.h, fx, fx2);
        return this.k[this.m];
    }
}

