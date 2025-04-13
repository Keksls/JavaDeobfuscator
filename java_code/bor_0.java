/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bOR
 */
public abstract class bor_0
implements ajh_1 {
    private static final Logger e = Logger.getLogger(bor_0.class);
    public static final String a = "spells";
    public static final Pattern b = Pattern.compile("spell([0-9]+)");
    private fiz<bpl_0> f = null;
    public static final String[] d = new String[]{"spells"};

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.c();
        }
        Matcher matcher = b.matcher(string);
        if (matcher.matches()) {
            short s2 = Short.valueOf(matcher.group(1));
            return this.a(s2);
        }
        return null;
    }

    public bpl_0 a() {
        int n = Short.MAX_VALUE;
        bpl_0 bpl_02 = null;
        for (bpl_0 bpl_03 : this.c()) {
            if (((bph_0)bpl_03.r()).F() >= Short.MAX_VALUE) continue;
            bpl_02 = bpl_03;
        }
        return bpl_02;
    }

    public bpl_0 a(short s2) {
        for (bpl_0 bpl_02 : this.c()) {
            if (((bph_0)bpl_02.r()).F() != s2) continue;
            return bpl_02;
        }
        return null;
    }

    public void b() {
        fis_1.a().a((ajf_1)this, a);
    }

    public abstract Iterable<bpl_0> c();

    public fiz<bpl_0> e() {
        return this.f;
    }

    public boolean f() {
        return this.f != null;
    }

    public void a(List<bpl_0> list, epq_2 epq_22) {
        this.a(epq_22);
        for (bpl_0 bpl_02 : list) {
            try {
                ((uf_0)this.f).a(bpl_02);
            }
            catch (uz_0 uz_02) {
                e.error((Object)"Exception levee", (Throwable)uz_02);
            }
            catch (Uy uy) {
                e.error((Object)"Exception levee", (Throwable)uy);
            }
        }
    }

    public void a(epq_2 epq_22) {
        this.f = new fiz<bpl_0>(zq_22 -> new bpl_0(epq_22), 60, new bpn_0(epq_22), null, false, false, false);
    }

    public void g() {
        if (this.f == null) {
            return;
        }
        this.f.aO_();
        this.f = null;
    }
}

