/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

/*
 * Renamed from blq
 */
public class blq_2
implements ajh_1 {
    public static final blq_2 a = new blq_2();
    public static final String b = "title";
    public static final String d = "isEmpty";
    public static final String e = "timeStateText";
    public static final String f = "remainingTime";
    private final Date g = new Date();

    public void a(long l, boolean bl) {
        if (l > 0L) {
            this.g.setTime(System.currentTimeMillis() + l);
            if (bl) {
                this.a();
            }
        }
    }

    public void a() {
        adi_2.a().a(cWF.a());
        adi_2.a().a(cWF.a(), 1000L, -1);
        this.c();
    }

    private short e() {
        long l = System.currentTimeMillis();
        return (short)Math.max(0L, (this.g.getTime() - l) / 1000L);
    }

    public void b() {
        fis_1.a().a((ajf_1)this, e, f);
    }

    public void c() {
        fis_1.a().a((ajf_1)this, b, d, e, f);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return bae.h().a("challenge.state.waitingNext", new Object[0]);
        }
        if (string.equals(d)) {
            return true;
        }
        if (string.equals(e)) {
            ani_2 ani_22 = new ani_2();
            ani_22.i().a((CharSequence)bae.h().a("challenge.remainingTime", blv_2.a(this.e()))).j();
            return ani_22.r();
        }
        if (string.equals(f)) {
            return blv_2.a(this.e());
        }
        if (string.equals("isChaos")) {
            return false;
        }
        return null;
    }
}

