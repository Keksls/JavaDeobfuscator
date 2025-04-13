/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bOP
 */
public class bop_0
extends eqy_1
implements ajf_1 {
    protected static final Logger a = Logger.getLogger(bop_0.class);
    public static final String b = "name";
    public static final String d = "level";
    public static final String e = "iconUrl";
    public static final String f = "breedName";
    public static final String g = "isAvailable";
    public static final String h = "unavailableReasons";
    public static final String i = "cooldown";
    public static final String j = "breedAndLevel";
    public static final String k = "actorDescriptorLibrary";
    public static final String l = "actorStandardScale";
    static final String[] m = new String[]{"name", "level", "iconUrl", "breedName", "isAvailable", "unavailableReasons", "cooldown", "breedAndLevel"};

    bop_0(short s2, String string, int n, short s3, long l) {
        super(s2, string, n, s3);
        this.b(l);
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            return this.r();
        }
        if (string.equals(e)) {
            try {
                bpb_1 bpb_12 = bpc_1.a().a(this.f());
                if (bpb_12 == null) {
                    return null;
                }
                epw_1 epw_12 = epx_1.b().a(bpb_12.t());
                if (epw_12 == null) {
                    return null;
                }
                int n = epw_12.e();
                if (n == 0) {
                    return null;
                }
                boi_2 boi_22 = boi_2.f;
                String string2 = boi_22.a(n);
                return cd_0.b(string2) ? string2 : boi_22.a(0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (string.equals(f)) {
            return Optional.ofNullable(bpc_1.a().a(this.f())).map(bpb_1::f).orElse(null);
        }
        if (string.equals(j)) {
            Optional<String> optional = Optional.ofNullable(bpc_1.a().a(this.f())).map(bpb_1::f);
            if (optional.isEmpty()) {
                return null;
            }
            String string3 = bae.h().a("spellDescription.levelShort", new Object[0]);
            return optional.get() + " " + string3 + this.r();
        }
        if (string.equals(g)) {
            blx_1 blx_12 = bzf_1.a(this.m());
            if (!(blx_12 instanceof erk_2)) {
                return false;
            }
            if (!blx_12.ak()) {
                return true;
            }
            erk_2 erk_22 = (erk_2)((Object)blx_12);
            byte by = erk_22.dQ().a(this);
            return erk_22.dQ().b(by);
        }
        if (string.equals(i)) {
            blx_1 blx_13 = bzf_1.a(this.m());
            if (!(blx_13 instanceof erk_2)) {
                return false;
            }
            erk_2 erk_23 = (erk_2)((Object)blx_13);
            byte by = erk_23.dQ().a(this);
            int n = erk_23.f(by);
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(h)) {
            return null;
        }
        if (string.equals(k)) {
            return this.s();
        }
        if (string.equals(l)) {
            short s2 = bpc_1.a().a(this.f()).d();
            float f2 = this.s().an().p();
            return Float.valueOf(6.0f / Math.max((float)s2, 6.0f) * 1.4f * f2);
        }
        return null;
    }

    private short r() {
        blx_1 blx_12 = bzf_1.a(this.m());
        return blx_12 != null ? blx_12.dr() : this.k();
    }

    private aby_0 s() {
        aby_0 aby_02 = new aby_0(abd_1.c(), 0.0f, 0.0f, 0.0f);
        int n = bpc_1.a().a(this.f()).b();
        try {
            aby_02.a(String.format(azs_0.a().a("npcGfxPath"), n), true);
        }
        catch (IOException iOException) {
            a.error((Object)"", (Throwable)iOException);
            return null;
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
            return null;
        }
        aby_02.a(String.valueOf(n));
        aby_02.a(aej_2.c);
        aby_02.e("AnimStatique");
        return aby_02;
    }

    @Override
    public boolean a_(String string) {
        return string.equals(b);
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(b)) {
            this.a(object.toString());
        }
    }

    @Override
    public void a(long l) {
        super.a(l);
        fis_1.a().a((ajf_1)this, g);
    }

    @Override
    public void a(String string) {
        super.a(string);
        fis_1.a().a((ajf_1)this, b);
    }

    public void a() {
        fis_1.a().a((ajf_1)this, g);
    }

    public String b() {
        return this.e();
    }
}

