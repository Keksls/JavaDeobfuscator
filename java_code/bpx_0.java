/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bPX
 */
public abstract class bpx_0
implements ajh_1,
bqd_1 {
    public static final String a = "compartments";
    public static final String b = "selectedCompartment";
    public static final String d = "name";
    public static final String e = "prefSize";
    public static final String f = "idealSizeMaxColumns";
    public static final String g = "idealSizeMaxRows";
    public static final String h = "moneyAmount";
    public static final String i = "canManageMoney";
    public static final String j = "canTakeMoney";
    public static final String k = "canPutMoney";
    public static final String l = "history";
    public static final String[] m = new String[]{"compartments", "selectedCompartment", "name", "prefSize", "idealSizeMaxColumns", "idealSizeMaxRows", "canManageMoney", "canTakeMoney", "canPutMoney", "moneyAmount"};
    protected final ArrayList<bpy_0> n = new ArrayList();
    protected bpy_0 o;
    protected long p;

    @Override
    public String[] d() {
        return m;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.n;
        }
        if (string.equals(b)) {
            return this.o;
        }
        if (string.equals(d)) {
            return this.f();
        }
        if (string.equals(e)) {
            return this.g();
        }
        if (string.equals(f)) {
            return this.h();
        }
        if (string.equals(g)) {
            return this.i();
        }
        if (string.equals(i)) {
            return this.j();
        }
        if (string.equals(j)) {
            return this.l();
        }
        if (string.equals(k)) {
            return this.k();
        }
        if (string.equals(l)) {
            return this.m();
        }
        if (string.equals(h)) {
            return bae.h().a(this.p);
        }
        return null;
    }

    @Override
    public void a(long l) {
        this.p = l;
        fis_1.a().a((ajf_1)this, h);
    }

    @Override
    public long e() {
        return this.p;
    }

    protected abstract String f();

    protected abstract fjf_2 g();

    protected abstract int h();

    protected abstract int i();

    protected abstract boolean j();

    protected abstract boolean k();

    protected abstract boolean l();

    protected abstract ajf_1 m();

    @Override
    public abstract int n();

    @Override
    public bpy_0 o() {
        return this.o;
    }

    @Override
    public bpy_0 a(byte by) {
        return this.n.get(by);
    }

    @Override
    public void a(bpy_0 bpy_02) {
        this.o = bpy_02;
    }

    @Override
    public void p() {
        fis_1.a().a((ajf_1)this, m);
    }

    public void e(int n) {
        this.p = n;
    }

    @Override
    public void q() {
    }
}

