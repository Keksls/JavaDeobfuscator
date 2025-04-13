/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezV
 */
public abstract class ezv_1
implements Tw {
    private static final Logger e = Logger.getLogger(ezv_1.class);
    public static final short a = -1;
    public static final short b = 0;
    public static final ezv_1 c = new ezw_1();
    private boolean f = false;
    protected final ezz_1 d;

    protected ezv_1(@Nullable ezz_1 ezz_12) {
        this.d = ezz_12;
    }

    public abstract int d();

    public abstract byte[] e();

    public abstract void a(byte[] var1);

    @Override
    public boolean a(Tv tv, TF tF) {
        boolean bl = this.b(tv, tF);
        if (!bl) {
            e.warn((Object)("L'action " + tv.toString() + " n'a pas \u00e9t\u00e9 trait\u00e9e. (user = " + tF.toString() + ")"));
        }
        return bl;
    }

    public ezy_1 g() {
        return this.d.ay_().b();
    }

    public void a(short s2) {
        if (this.d != null) {
            this.d.a(s2);
            this.d.T();
        }
        this.f = s2 == -1;
    }

    public boolean h() {
        return this.f;
    }
}

