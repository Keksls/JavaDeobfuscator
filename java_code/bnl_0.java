/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.DecimalFormat;
import org.apache.log4j.Logger;

/*
 * Renamed from bNl
 */
public abstract class bnl_0
implements ajh_1 {
    protected static final Logger d = Logger.getLogger(bnl_0.class);
    public static final String e = "name";
    public static final String f = "nameWithDuration";
    public static final String g = "nameWithRemainingTime";
    public static final String h = "description";
    public static final String i = "iconUrl";
    public static final String j = "price";
    public static final String k = "duration";
    public static final String l = "remainingTime";
    public static final String m = "buyEnabled";
    private final bni_0 a;

    protected bnl_0(bni_0 bni_02) {
        this.a = bni_02;
    }

    public abstract String a();

    public abstract fgo_0 b();

    @Override
    public Object b(String string) {
        if (string.equals(j)) {
            return DecimalFormat.getIntegerInstance().format(this.i().p()) + "\u00a7";
        }
        if (string.equals(m)) {
            fgP fgP2 = bwy_2.h().j().l();
            return fgP2 != null && fgP2.b(this.b()) >= this.i().p();
        }
        if (string.equals(k)) {
            return this.h();
        }
        if (string.equals(l)) {
            return this.g();
        }
        return null;
    }

    public void e() {
        fis_1.a().a((ajf_1)this, g, l);
    }

    public void f() {
        fis_1.a().a((ajf_1)this, m);
    }

    protected Object g() {
        long l = (this.a.m() + this.a.l() - wc_0.p().e()) / 1000L;
        if (this.a.m() == -1L || l <= 0L) {
            return null;
        }
        return new ani_2().a((CharSequence)bae.h().a("remaining.duration", new Object[0])).a((CharSequence)" ").a((CharSequence)wa_0.a(new ww_0(l))).r();
    }

    protected String h() {
        return new ani_2().a((CharSequence)bae.h().a(k, new Object[0])).a((CharSequence)" ").a((CharSequence)wa_0.a(ww_0.a(this.a.l() / 1000L))).r();
    }

    public bni_0 i() {
        return this.a;
    }

    @Override
    public String[] d() {
        return null;
    }
}

