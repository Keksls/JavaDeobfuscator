/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimeZone;

/*
 * Renamed from bai
 */
public class bai_0
extends emy
implements ajh_1 {
    public static final String a = "nickname";
    public static final String b = "expirationDate";
    private static final String h = "expirationDateShort";
    public static final String[] d = new String[]{"nickname", "expirationDate", "expirationDateShort"};
    private BG i;
    private boolean j;

    @Override
    public long b() {
        long l = super.b();
        return bai_0.a(l);
    }

    public static long a(long l) {
        String string = enp_2.a.e(ens_2.c);
        long l2 = enp_2.a.c(ens_2.b);
        TimeZone timeZone = TimeZone.getTimeZone(string);
        return l + (long)timeZone.getRawOffset() + l2;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.r();
        }
        if (string.equals(b)) {
            long l = this.b();
            return this.c(l);
        }
        if (string.equals(h)) {
            long l = this.b();
            StringBuilder stringBuilder = new StringBuilder().append(bae.h().a("booster.pack", new Object[0])).append(" : ");
            if (l < wc_0.p().e()) {
                return stringBuilder.append(bae.h().a("booster.pack.inactive", new Object[0])).toString();
            }
            return stringBuilder.append(this.b(l)).toString();
        }
        return null;
    }

    public String b(long l) {
        if (l <= 0L) {
            return null;
        }
        return bai_0.a(wc_0.p().e(), l);
    }

    public String c(long l) {
        l = Math.max(l - wc_0.p().e(), 0L);
        short s2 = (short)(l / 31536000000L);
        short s3 = (short)((l -= (long)s2 * 31536000000L) / 2678400000L);
        short s4 = (short)((l -= (long)s3 * 2678400000L) / 86400000L);
        short s5 = (short)((l -= (long)s4 * 86400000L) / 3600000L);
        short s6 = (short)((l -= (long)s5 * 3600000L) / 60000L);
        return bae.h().a("dateFormat.yearMonthDayHourMin", s2, s3, s4, s5, s6);
    }

    public void a(BG bG) {
        this.i = bG;
        Object object = fis_1.a().e("rewardsView");
        if (object != null) {
            boh_0 boh_02 = (boh_0)object;
            fis_1.a().a((ajf_1)boh_02, "rewards");
        }
    }

    public BG c() {
        return this.i;
    }

    public static eyu_1 e() {
        return faf_0.a.a(azu_0.j().n().u());
    }

    public static String a(long l, long l2) {
        long l3 = Math.max(l2 - l, 0L);
        short s2 = (short)(l3 / 2592000000L);
        short s3 = (short)((l3 -= (long)s2 * 86400000L * 30L) / 86400000L);
        short s4 = (short)((l3 -= (long)s3 * 86400000L) / 3600000L);
        l3 -= (long)s4 * 3600000L;
        if (s2 <= 0 && s3 <= 0 && s4 <= 0) {
            short s5 = (short)(l3 / 60000L);
            return bae.h().a("remainingDurationMinutes", s5);
        }
        return bae.h().a("remainingDurationShortMonthDayHour", s2, s3, s2 > 0 ? (short)0 : s4).trim();
    }

    public boolean f() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public boolean a(int n) {
        if (this.j && cup_0.a().a(n)) {
            cbx_2.a();
            return true;
        }
        return false;
    }
}

