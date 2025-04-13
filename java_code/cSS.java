/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class cSS {
    protected static final Logger b = Logger.getLogger(cSS.class);
    public static final String c = "mru";
    protected boolean d = true;
    protected boolean e = true;
    public static final String f = azf_2.e.w();
    public static final String g = azf_2.j.w();
    public static final String h = azf_2.h.w();
    public static final String i = "9ed34b";
    public static final String j = "f48140";
    public static final cSS[] k = new cSS[0];
    protected Object l;

    public abstract cSY n();

    public abstract void o();

    public abstract boolean c();

    public boolean p() {
        return this.e;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public void a(Object object) {
        this.l = object instanceof aov_0 ? ((aov_0)object).aH() : object;
    }

    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        ani_22.a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0]));
        ani_22.b();
        return ani_22.r();
    }

    public abstract String r();

    public String s() {
        return c + this.t();
    }

    protected int t() {
        return this.n().b();
    }

    public String u() {
        return this.q();
    }

    @Nullable
    public String h() {
        return null;
    }

    protected static boolean a(bmr_1 bmr_12) {
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 instanceof bqi_2) {
            return true;
        }
        return bmr_12.a(false, true);
    }

    public boolean d() {
        return this.d;
    }

    public void c(boolean bl) {
        this.d = bl;
    }

    public Iterable<fbx_1> m() {
        return Collections.emptyList();
    }

    public abstract cSS v();

    protected final void a(Tv tv) {
        boolean bl;
        bmr_1 bmr_12 = azu_0.j().k();
        bFZ bFZ2 = (bFZ)this.l;
        ArrayList<Tx> arrayList = Tx.b(bFZ2.x());
        boolean bl2 = bl = bFZ2.aK_().isEmpty() && arrayList.isEmpty();
        if (bl || bFZ2.c(bmr_12.bv().ap())) {
            this.a(tv, bmr_12, bFZ2);
        } else {
            aUh.a("too.far.to.interact", new Object[0]);
        }
    }

    protected void a(Tv tv, TF tF, pj_0 pj_02) {
        pj_02.a(tv, tF);
    }
}

