/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class btk
implements ajh_1 {
    private static final Logger o = Logger.getLogger(btk.class);
    public static final String a = "name";
    public static final String b = "smiley";
    public static final String d = "guildBlazon";
    public static final String e = "team";
    public static final String f = "hasRecord";
    public static final String g = "blazonId";
    public static final String h = "breedIconUrl";
    public static final String i = "laurel";
    public static final String j = "shards";
    public static final String k = "shardsQuantity";
    public static final String l = "mysteryBoxQuantity";
    public static final String m = "guildName";
    public static final String n = "mysteryBox";
    private final long p;
    private String q;
    private short r;
    private byte s;
    private final long t;
    private final String u;
    private btm v;

    public btk(long l, hr_0 hr_02, btm btm2) {
        this.p = l;
        this.q = hr_02.g();
        this.r = (short)hr_02.c();
        this.t = hr_02.l();
        this.u = hr_02.n();
        this.s = (byte)hr_02.j();
        this.v = btm2;
    }

    public btk(bnh_1 bnh_12) {
        this.p = bnh_12.a_();
        this.q = bnh_12.dp();
        this.r = bnh_12.gO();
        this.t = bnh_12.cX() ? bnh_12.fa() : bnh_12.eV().b();
        this.u = bnh_12.cX() ? null : bnh_12.eV().a();
        this.s = bnh_12.gX();
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            Object object;
            if (this.p < 0L && (object = bpc_1.a().a(this.r)) != null) {
                return ((bpb_1)object).f();
            }
            if (this.q == null || this.q.isEmpty()) {
                object = bae.h().a("dungeon.ladder.empty.name", new Object[0]);
                if (emp_0.b(azu_0.j().n().v(), emq_0.aJ)) {
                    return (String)object + " - " + this.p;
                }
                return object;
            }
            return this.q;
        }
        if (string.equals(b)) {
            if (this.v == null) {
                return bxj_1.a(this.r, this.s, xg_0.h.a());
            }
            int n = this.v.f();
            return n == 0 ? bxj_1.a(this.r, this.s, xg_0.d.a()) : bxj_1.a(this.r, this.s, xg_0.a.a());
        }
        if (string.equals(d)) {
            eqd_2 eqd_22 = new eqd_2(this.t);
            bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
            ays_2 ays_22 = bxp_1.a().a(bxo_12);
            bxo_12.e();
            return ays_22;
        }
        if (string.equals(e)) {
            return this.v;
        }
        if (string.equals(f)) {
            return this.v != null;
        }
        if (string.equals(g)) {
            return this.t;
        }
        if (string.equals(h)) {
            try {
                return this.p < 0L ? String.format(azs_0.a().a("companionIconsPath"), this.r) : String.format(azs_0.a().a("breedPortraitIllustrationPath"), this.r + String.valueOf(this.s));
            }
            catch (gm_0 gm_02) {
                o.error((Object)"PropertyException during getFieldValue for BREED_ICON_URL", (Throwable)gm_02);
            }
        }
        if (string.equals(i)) {
            if (this.v == null) {
                return azs_0.a().t(String.valueOf(0));
            }
            return this.v.b();
        }
        if (string.equals(j)) {
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(27083);
            return new bht_1(bjw_12);
        }
        if (string.equals(k)) {
            if (this.v == null) {
                return "0";
            }
            btb btb2 = cYb.a().c().k();
            short s2 = ezi_1.a(btb2.o());
            int n = eEE.a((int)s2, this.v.f());
            return "x" + n;
        }
        if (string.equals(l)) {
            if (this.v == null) {
                return "0";
            }
            btb btb3 = cYb.a().c().k();
            return "x" + btb3.a(this.v);
        }
        if (string.equals(m)) {
            return this.u;
        }
        if (n.equals(string)) {
            short s3 = this.v == null ? (short)1 : this.v.g();
            btb btb4 = cYb.a().c().k();
            return btb4.a(s3);
        }
        return null;
    }

    public String a() {
        return this.q;
    }

    public long b() {
        return this.p;
    }

    public void a(String string) {
        this.q = string;
    }

    public short c() {
        return this.r;
    }

    public void a(short s2) {
        this.r = s2;
    }

    public byte e() {
        return this.s;
    }

    public void a(byte by) {
        this.s = by;
    }

    public btm f() {
        return this.v;
    }

    public void a(btm btm2) {
        this.v = btm2;
    }
}

