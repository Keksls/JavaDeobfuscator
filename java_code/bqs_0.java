/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;

/*
 * Renamed from bQS
 */
public class bqs_0
implements ajh_1,
bqo_0 {
    public static final String a = "name";
    public static final String b = "isActivated";
    public static final String d = "isEnabled";
    public static final String e = "isFavourite";
    public static final String f = "errorText";
    public static final String[] g = new String[]{"name"};
    public static final byte h = 1;
    private final long i;
    private final int j;
    private final boolean k;
    private boolean l;
    private final TByteHashSet m;
    private final fjF n;

    public bqs_0(fjF fjF2, long l, int n, boolean bl, TByteHashSet tByteHashSet) {
        this.n = fjF2;
        this.i = l;
        this.k = bl;
        this.j = n;
        this.m = tByteHashSet;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(e)) {
            return this.l;
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(f)) {
            if (this.k) {
                return null;
            }
            ani_2 ani_22 = new ani_2();
            if (this.m.contains((byte)1)) {
                ani_22.m();
                ani_22.a((CharSequence)bae.h().a("booster.pack.required", new Object[0]));
            }
            return ani_22.q() == 0 ? null : ani_22.r();
        }
        return null;
    }

    @Override
    public long a() {
        return (long)this.n.c() == this.i ? (long)this.n.b() : (long)this.n.c();
    }

    public String b() {
        return bae.h().a(36, (long)((int)this.a()), new Object[0]);
    }

    public boolean c() {
        return this.k;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.n.c();
    }
}

