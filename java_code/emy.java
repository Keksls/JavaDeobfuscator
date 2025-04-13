/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class emy
extends fl_1 {
    private static final Logger a = Logger.getLogger(emy.class);
    public static final int c = 150;
    public static boolean e;
    long b;
    long d;
    String h;
    String i;
    xz_0 j = xz_0.a;
    int k;
    int l;
    private byte m;
    long n;
    private long o;
    private final byte[][] p = new byte[3][];
    final long[] q = new long[3];
    private long r;
    List<emf_0> s;
    private long t;
    private final long u;
    final emr_0 v;
    int[] w = new int[emp_0.a()];
    private final Collection<emB> x = new ArrayList<emB>();
    byte y;
    protected final fo_1 f = new emz(this);
    protected final fo_1 g = new emA(this);

    public emy() {
        this.v = new emr_0();
        this.u = System.currentTimeMillis();
    }

    public int g() {
        return this.k;
    }

    public List<emf_0> h() {
        return this.s;
    }

    public void b(int n) {
        this.k = n;
    }

    public int i() {
        return this.l;
    }

    public byte j() {
        return this.y;
    }

    public void a(byte by) {
        this.y = by;
    }

    public byte k() {
        return this.m;
    }

    public long b() {
        return this.n;
    }

    public void d(long l) {
        this.n = l;
        this.c();
    }

    private void c() {
        for (emB emB2 : this.x) {
            try {
                emB2.a(this);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
    }

    public long l() {
        long l = 0L;
        for (emf_0 emf_02 : this.s) {
            long l2 = emf_02.c().getTime();
            if (l >= l2) continue;
            l = l2;
        }
        return l;
    }

    public long m() {
        long l = 0L;
        for (emf_0 emf_02 : this.s) {
            long l2 = emf_02.b().getTime();
            if (emf_02.a() != this.k || l <= l2) continue;
            l = l2;
        }
        return l;
    }

    public long n() {
        return this.o;
    }

    public void e(long l) {
        this.o = l;
    }

    public long o() {
        return this.r;
    }

    public void f(long l) {
        this.r = l;
    }

    public final void a(int n, byte[] byArray, long l) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        this.p[n] = byArray;
        this.q[n] = l;
    }

    public byte[] c(int n) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        return this.p[n];
    }

    public long d(int n) {
        if (n < 0 || n >= 3) {
            throw new IllegalArgumentException("On ne conserve que 3 derni\u00e9res IP utilis\u00e9es");
        }
        return this.q[n];
    }

    public void a(byte[] byArray, long l) {
        this.p[2] = this.p[1];
        this.p[1] = this.p[0];
        this.p[0] = byArray;
        this.q[2] = this.q[1];
        this.q[1] = this.q[0];
        this.q[0] = l;
    }

    public long p() {
        return this.t + this.q();
    }

    public long q() {
        return System.currentTimeMillis() - this.u;
    }

    public void g(long l) {
        this.t = l;
    }

    public String r() {
        return this.h;
    }

    public void a(String string) {
        this.h = string;
    }

    public String s() {
        return this.i;
    }

    public void c(String string) {
        this.i = string;
    }

    public xz_0 t() {
        return this.j;
    }

    public void a(xz_0 xz_02) {
        this.j = xz_02;
    }

    public long u() {
        return this.b;
    }

    public void h(long l) {
        this.b = l;
    }

    public int[] v() {
        return this.w;
    }

    public void b(int[] nArray) {
        this.w = nArray;
    }

    public void a(Map<String, Long> map) {
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            emt_0 emt_02 = emt_0.a(entry.getKey());
            if (emt_02 == null) continue;
            this.v.a(new ems_0(emt_02, entry.getValue()));
            if (e && emt_02 == emt_0.b) {
                this.l = Hw.e(entry.getValue());
                continue;
            }
            if (emt_02 != emt_0.c) continue;
            this.m = Hw.b(entry.getValue());
        }
    }

    public emr_0 w() {
        return this.v;
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.f, this.g};
    }

    public byte[] x() {
        return this.a(new fo_1[]{this.f});
    }

    public byte[] y() {
        return this.a(new fo_1[]{this.g});
    }

    public void a(emB emB2) {
        if (this.x.contains(emB2)) {
            return;
        }
        this.x.add(emB2);
    }

    public void b(emB emB2) {
        this.x.remove(emB2);
    }

    public String toString() {
        return "AccountInformations{m_account_id=" + this.b + ", m_accountNickName='" + this.h + "', m_tag='" + this.i + "', m_accountCommunity=" + this.j + ", m_subscriptionLevel=" + this.k + ", m_antiAddictionLevel=" + this.l + ", m_additionalSlots=" + this.m + ", m_accountExpirationDate=" + this.n + ", m_banEndDate=" + this.o + ", m_accountConnectedIp=" + Arrays.toString((Object[])this.p) + ", m_accountConnectedDate=" + Arrays.toString(this.q) + ", m_baseTimeElapsed=" + this.t + ", m_sessionStartTime=" + this.u + "}";
    }

    public void a(List<emf_0> list) {
        this.s = list;
    }
}

