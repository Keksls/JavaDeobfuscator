/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bim
 */
public abstract class bim_2
implements ajh_1 {
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final String j = "name";
    public static final String k = "iconUrl";
    public static final String l = "style";
    public static final String m = "type";
    public static final String n = "remainingTime";
    public static final String o = "goals";
    public static final String p = "ranking";
    public static final String q = "isOpened";
    public static final String r = "backgroundText";
    public static final String s = "canBeUnfollowed";

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(j)) {
            return this.f();
        }
        if (string.equals(k)) {
            return this.g();
        }
        if (string.equals(l)) {
            return this.m();
        }
        if (string.equals(m)) {
            return this.h();
        }
        if (string.equals(n)) {
            return this.j();
        }
        if (string.equals(o)) {
            return this.k();
        }
        if (string.equals(p)) {
            return this.l();
        }
        if (string.equals(q)) {
            return this.o();
        }
        if (string.equals(r)) {
            return this.e();
        }
        if (string.equals(s)) {
            return azu_0.j().k().eK().z(this.i());
        }
        return null;
    }

    protected abstract String e();

    protected abstract String f();

    protected abstract String g();

    public abstract int h();

    public abstract int i();

    protected abstract String j();

    protected abstract ArrayList<bil_2> k();

    protected abstract String l();

    protected abstract String m();

    public boolean o() {
        return bhy_2.a.a(this.i());
    }

    public void a(boolean bl) {
        bhy_2.a.a(this.i(), bl);
        fis_1.a().a((ajf_1)this, q);
    }

    public void p() {
        fis_1.a().a((ajf_1)this, n);
    }

    public void q() {
        fis_1.a().a((ajf_1)this, o);
        fis_1.a().a((ajf_1)this, r);
    }

    public void r() {
        fis_1.a().a((ajf_1)this, p);
    }

    public void s() {
        for (bil_2 bil_22 : this.k()) {
            fis_1.a().a((ajf_1)bil_22, "canBeCompassedNow");
            fis_1.a().a((ajf_1)bil_22, "canBeCompassed");
        }
    }
}

