/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;

/*
 * Renamed from bQJ
 */
public class bqj_0
implements ajh_1,
bqo_0 {
    public static final String a = "name";
    public static final String b = "isActivated";
    public static final String d = "isEnabled";
    public static final String e = "errorText";
    public static final String[] f = new String[]{"name"};
    public static final byte g = 0;
    public static final byte h = 1;
    public static final byte i = 3;
    private final long j;
    private final fjx k;
    private final boolean l;
    private final TByteHashSet m;

    public bqj_0(fjx fjx2, long l, boolean bl, TByteHashSet tByteHashSet) {
        this.k = fjx2;
        this.j = l;
        this.l = bl;
        this.m = tByteHashSet;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.l;
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(e)) {
            Object object;
            ani_2 ani_22 = new ani_2();
            bmr_1 bmr_12 = azu_0.j().k();
            if (this.m.contains((byte)3)) {
                if (ani_22.q() > 0) {
                    ani_22.m();
                }
                ani_22.a((CharSequence)bae.h().a("error.playerNotInstanceAccessRight", new Object[0]));
            }
            apc_2 apc_22 = this.k.d();
            if (this.m.contains((byte)1)) {
                if (ani_22.q() > 0) {
                    ani_22.m();
                }
                object = cwn_0.a().c();
                ani_22.a((CharSequence)eDm.a((aot_2)apc_22, new edo_0(bmr_12, object, this.k, bmr_12.Q_(), true)));
            }
            if (ani_22.q() > 0) {
                object = ani_22.r();
                ani_22 = new ani_2();
                ani_22.i().a(azf_2.h.w());
                ani_22.a((CharSequence)object);
                ani_22.j();
            }
            return ani_22.q() == 0 ? null : ani_22.r();
        }
        return null;
    }

    @Override
    public long a() {
        return (long)this.k.c() == this.j ? (long)this.k.b() : (long)this.k.c();
    }

    public String b() {
        return bae.h().a(83, (long)((int)this.a()), new Object[0]);
    }

    public boolean c() {
        return true;
    }
}

