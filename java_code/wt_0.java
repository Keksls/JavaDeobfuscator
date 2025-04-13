/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Wt
 */
public class wt_0
implements wu_0 {
    private static final Logger e = Logger.getLogger(wt_0.class);
    public static final TimeZone a = TimeZone.getTimeZone("UTC");
    private static final GregorianCalendar f = new GregorianCalendar(a);
    public static final long b = 0L;
    public static final wu_0 c;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;

    private wt_0() {
    }

    public wt_0(wu_0 wu_02) {
        if (wu_02 != null) {
            this.a(wu_02);
        } else {
            this.a(c);
        }
    }

    public wt_0(int n, int n2, int n3) {
        this.a(0, 0, 0, n, n2, n3);
    }

    public wt_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a(n, n2, n3, n4, n5, n6);
    }

    public static wt_0 a(LocalDate localDate) {
        wt_0 wt_02 = new wt_0();
        wt_02.a(0, 0, 0, localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
        return wt_02;
    }

    public static wt_0 a(LocalDateTime localDateTime) {
        wt_0 wt_02 = new wt_0();
        wt_02.a(localDateTime.getSecond(), localDateTime.getMinute(), localDateTime.getHour(), localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear());
        return wt_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l) {
        if (l == 0L) {
            this.v();
            return;
        }
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.setTimeInMillis(l);
            this.g = f.get(13);
            this.h = f.get(12);
            this.i = f.get(11);
            this.j = f.get(5);
            this.k = f.get(2) + 1;
            this.l = f.get(0) == 1 ? f.get(1) : 1 - f.get(1);
            this.m = f.getTimeInMillis();
        }
    }

    public void a(@NotNull wu_0 wu_02) {
        if (wu_02.c()) {
            this.v();
        } else {
            this.a(wu_02.n(), wu_02.l(), wu_02.k(), wu_02.j(), wu_02.m(), wu_02.o());
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.l = n6;
        this.k = n5;
        this.j = n4;
        this.i = n3;
        this.h = n2;
        this.g = n;
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.set(this.l, this.k - 1, this.j, this.i, this.h, this.g);
            this.m = f.getTimeInMillis();
            this.g = f.get(13);
            this.h = f.get(12);
            this.i = f.get(11);
            this.j = f.get(5);
            this.k = f.get(2) + 1;
            this.l = f.get(0) == 1 ? f.get(1) : 1 - f.get(1);
        }
    }

    public static wt_0 b() {
        wt_0 wt_02 = new wt_0();
        wt_02.v();
        return wt_02;
    }

    public static void a(TimeZone timeZone) {
        f.setTimeZone(timeZone);
    }

    @Override
    public boolean c() {
        return this.m == 0L;
    }

    private void v() {
        this.m = 0L;
        this.l = c.o();
        this.k = c.m();
        this.j = c.j();
        this.i = c.k();
        this.h = c.l();
        this.g = c.n();
    }

    @Override
    public boolean b(@NotNull wu_0 wu_02) {
        return this.c() || this.f(wu_02) < 0;
    }

    @Override
    public boolean c(@NotNull wu_0 wu_02) {
        return this.c() || this.f(wu_02) <= 0;
    }

    @Override
    public boolean d(@NotNull wu_0 wu_02) {
        return !this.c() && this.f(wu_02) > 0;
    }

    @Override
    public boolean e(@NotNull wu_0 wu_02) {
        return !this.c() && this.f(wu_02) >= 0;
    }

    @Override
    public int f(@NotNull wu_0 wu_02) {
        if (this.c()) {
            return wu_02.c() ? 0 : -1;
        }
        if (wu_02.c()) {
            return 1;
        }
        if (this.l > wu_02.o()) {
            return 1;
        }
        if (this.l < wu_02.o()) {
            return -1;
        }
        if (this.k > wu_02.m()) {
            return 1;
        }
        if (this.k < wu_02.m()) {
            return -1;
        }
        if (this.j > wu_02.j()) {
            return 1;
        }
        if (this.j < wu_02.j()) {
            return -1;
        }
        if (this.i > wu_02.k()) {
            return 1;
        }
        if (this.i < wu_02.k()) {
            return -1;
        }
        if (this.h > wu_02.l()) {
            return 1;
        }
        if (this.h < wu_02.l()) {
            return -1;
        }
        if (this.g > wu_02.n()) {
            return 1;
        }
        if (this.g < wu_02.n()) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        wt_0 wt_02 = (wt_0)object;
        if (this.c()) {
            return wt_02.c();
        }
        if (this.j != wt_02.j) {
            return false;
        }
        if (this.i != wt_02.i) {
            return false;
        }
        if (this.h != wt_02.h) {
            return false;
        }
        if (this.k != wt_02.k) {
            return false;
        }
        if (this.g != wt_02.g) {
            return false;
        }
        return this.l == wt_02.l;
    }

    public wt_0 a(@NotNull wx_0 wx_02) {
        if (this.c()) {
            return this;
        }
        this.a(wx_02.a(), wx_02.b(), wx_02.c(), wx_02.d());
        return this;
    }

    public wt_0 b(@NotNull wx_0 wx_02) {
        if (this.c()) {
            return this;
        }
        this.b(wx_02.a(), wx_02.b(), wx_02.c(), wx_02.d());
        return this;
    }

    public wu_0 a(@NotNull wi_0 wi_02) {
        return this.b(wi_02.f(), wi_02.e(), wi_02.d(), wi_02.c(), wi_02.b(), wi_02.a());
    }

    public wu_0 b(@NotNull wi_0 wi_02) {
        return this.c(wi_02.f(), wi_02.e(), wi_02.d(), wi_02.c(), wi_02.b(), wi_02.a());
    }

    @Override
    @NotNull
    public wu_0 a(@NotNull TimeUnit timeUnit, int n) {
        wt_0 wt_02 = new wt_0();
        wt_02.a(this.h() - timeUnit.toMillis(n));
        return wt_02;
    }

    @Override
    @NotNull
    public wu_0 b(@NotNull TimeUnit timeUnit, int n) {
        wt_0 wt_02 = new wt_0();
        wt_02.a(this.h() + timeUnit.toMillis(n));
        return wt_02;
    }

    @Override
    public ww_0 g(wu_0 wu_02) {
        assert (!this.c()) : "Onessaye de calculer une diff\u00e9rence \u00e0 partir d'une date nulle.";
        assert (!wu_02.c()) : "On essaye de calculer une diff\u00e9rence avec une date nulle";
        long l = (wu_02.h() - this.h()) / 1000L;
        return new ww_0(l);
    }

    @Override
    public wu_0 a(wu_0 wu_02, wx_0 wx_02) {
        return this.a(wu_02, wx_02, false);
    }

    @Override
    public wu_0 a(wu_0 wu_02, wx_0 wx_02, boolean bl) {
        assert (!this.c()) : "On essaye de calculer une date \u00e0 partir d'une date nulle.";
        assert (!wu_02.c()) : "On essaye de calculer une date avec une date nulle";
        assert (!wx_02.f()) : "On essaye de calculer une date avec un interval nul";
        ww_0 ww_02 = wu_02.g(this);
        int n = ww_02.e() ? 0 : -1;
        int n2 = bl ? 1 : 0;
        ww_0 ww_03 = new ww_0(wx_02);
        int n3 = ww_02.d(wx_02) + n + n2;
        ww_03.a(n3);
        wt_0 wt_02 = new wt_0(wu_02);
        wt_02.a(ww_03);
        return wt_02;
    }

    public int h(wu_0 wu_02) {
        wt_0 wt_02 = new wt_0(0, 0, 0, this.j, this.k, this.l);
        wt_0 wt_03 = new wt_0(0, 0, 0, wu_02.j(), wu_02.m(), wu_02.o());
        ww_0 ww_02 = new ww_0((wt_03.h() - wt_02.h()) / 1000L);
        int n = ww_02.d();
        if (ww_02.c() > 12) {
            ++n;
        }
        return n;
    }

    public wt_0 b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.c()) {
            return this;
        }
        this.g += n;
        this.h += n2;
        this.i += n3;
        this.j += n4;
        this.k += n5;
        this.l += n6;
        this.a();
        return this;
    }

    public wt_0 a(int n, int n2, int n3, int n4) {
        return this.b(n, n2, n3, n4, 0, 0);
    }

    public wt_0 a(int n) {
        this.k += n;
        this.a();
        return this;
    }

    public wt_0 b(int n) {
        this.l += n;
        this.a();
        return this;
    }

    public wt_0 b(int n, int n2, int n3, int n4) {
        if (this.c()) {
            return this;
        }
        this.g -= n;
        this.h -= n2;
        this.i -= n3;
        this.j -= n4;
        this.a();
        return this;
    }

    public wt_0 c(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.c()) {
            return this;
        }
        this.g -= n;
        this.h -= n2;
        this.i -= n3;
        this.j -= n4;
        this.k -= n5;
        this.l -= n6;
        this.a();
        return this;
    }

    public void d() {
        if (this.c()) {
            return;
        }
        this.i = 0;
        this.h = 0;
        this.g = 0;
        this.a();
    }

    public void e() {
        if (this.c()) {
            return;
        }
        this.h = 0;
        this.g = 0;
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int c(int n) {
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.setTimeInMillis(this.m);
            return f.get(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static wt_0 a(Date date) {
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.setTime(date);
            int n = f.get(0) == 1 ? f.get(1) : 1 - f.get(1);
            return new wt_0(f.get(13), f.get(12), f.get(11), f.get(5), f.get(2) + 1, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static wt_0 b(long l) {
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.setTimeInMillis(l);
            int n = f.get(0) == 1 ? f.get(1) : 1 - f.get(1);
            return new wt_0(f.get(13), f.get(12), f.get(11), f.get(5), f.get(2) + 1, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long f() {
        assert (!this.c()) : "On essaye de calculer les heurs d'une date nulle";
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.set(this.l, this.k - 1, this.j, this.i, 0, 0);
            return f.getTimeInMillis();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long g() {
        assert (!this.c()) : "On essaye de calculer les jours d'une date nulle";
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.set(this.l, this.k - 1, this.j, 0, 0, 0);
            return f.getTimeInMillis();
        }
    }

    @Override
    public long h() {
        return this.m;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Date i() {
        assert (!this.c()) : "On essaye de convertir une date nulle";
        GregorianCalendar gregorianCalendar = f;
        synchronized (gregorianCalendar) {
            f.clear();
            f.setTimeZone(a);
            f.set(this.l, this.k - 1, this.j, this.i, this.h, this.g);
            return f.getTime();
        }
    }

    @Override
    public int j() {
        return this.j;
    }

    @Override
    public int k() {
        return this.i;
    }

    @Override
    public int l() {
        return this.h;
    }

    @Override
    public int m() {
        return this.k;
    }

    @Override
    public int n() {
        return this.g;
    }

    @Override
    public int o() {
        return this.l;
    }

    @Override
    public int p() {
        return this.c(3);
    }

    public void d(int n) {
        this.g = n;
        this.a();
    }

    public void e(int n) {
        this.h = n;
        this.a();
    }

    public void f(int n) {
        this.i = n;
        this.a();
    }

    public void g(int n) {
        this.j = n;
        this.a();
    }

    public void h(int n) {
        this.k = n;
        this.a();
    }

    public void i(int n) {
        this.l = n;
        this.a();
    }

    public void q() {
    }

    @Override
    public wu_0 r() {
        return new wt_0(this.j() + 1, this.m(), this.o());
    }

    @Override
    public String toString() {
        if (this.c()) {
            return "Date{ nulle }";
        }
        int n = f.getTimeZone().getRawOffset() / 3600000;
        if (n >= 0) {
            return WN.a("{Date : %d/%M/%Y %h:%m:%s UTC+" + n + "}", this);
        }
        return WN.a("{Date : %d/%M/%Y %h:%m:%s UTC" + n + "}", this);
    }

    @Override
    public String s() {
        if (this.c()) {
            return "null date";
        }
        return WN.a("%d/%M/%Y %hH%mmin", this);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.f((wu_0)object);
    }

    static {
        e.info((Object)("GameDate initialized. Timezone : " + f.getTimeZone()));
        c = wt_0.b(0L);
    }
}

