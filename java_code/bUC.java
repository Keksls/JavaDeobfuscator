/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bUC
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "slogan";
    public static final String e = "ballotCount";
    public static final String f = "guildName";
    public static final String g = "rankDescription";
    public static final String h = "wakfuValue";
    public static final String i = "wakfuStasisDescription";
    public static final String j = "wakfuStasisColor";
    public static final String k = "isEnabled";
    public static final String l = "actorDescriptorLibrary";
    public static final String m = "isGovernor";
    static final String[] n = new String[]{"id", "name", "guildName", "rankDescription", "wakfuValue", "wakfuStasisDescription", "wakfuStasisColor", "actorDescriptorLibrary", "isGovernor"};
    static final String[] o = new String[]{"slogan", "ballotCount", "isEnabled"};
    private static final String[] q = new String[o.length + n.length];
    protected static final Logger p;
    private fco_0 r;
    private biI s;
    private static final int t = 10;

    public bUC(fco_0 fco_02) {
        this.r = fco_02;
    }

    public fco_0 a() {
        return this.r;
    }

    public void b() {
        this.s.bI().cx();
        this.s = null;
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.r.f();
        }
        if (string.equals(a)) {
            return this.r.a();
        }
        if (string.equals(d)) {
            return ((fcf)this.r).b();
        }
        if (string.equals(e)) {
            faX faX2 = bUW.a().x();
            int n = faX2.C().b();
            short s2 = ((fcf)this.r).c();
            return n == 0 ? null : bae.h().a("election.ballotDescription", s2 * 100 / n, s2);
        }
        if (string.equals(i)) {
            float f2 = Math.abs(this.r.m());
            return String.format(" : %d ", (int)(f2 * 100.0f)) + "%";
        }
        if (string.equals(j)) {
            return this.r.m() < 0.0f ? anr_0.w : anr_0.v;
        }
        if (string.equals(h)) {
            return Float.valueOf(this.r.m());
        }
        if (string.equals(g)) {
            return bae.h().a(fbo_0.a().a(this.r.l()).a(), new Object[0]);
        }
        if (string.equals(f)) {
            return this.r.i() == 0L ? null : this.r.j();
        }
        if (string.equals(l)) {
            if (this.s == null) {
                this.s = biG.a(this.r);
            }
            return this.s;
        }
        if (string.equals(m)) {
            return false;
        }
        if (string.equals(k)) {
            return this.r != null && !((fcf)this.r).d();
        }
        return null;
    }

    static {
        System.arraycopy(o, 0, q, 0, o.length);
        System.arraycopy(n, 0, q, o.length, n.length);
        p = Logger.getLogger(bUC.class);
    }
}

