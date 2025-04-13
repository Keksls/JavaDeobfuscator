/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.Logger;

/*
 * Renamed from eqx
 */
public abstract class eqx_2
implements abq_1,
gq_1<uv_1> {
    public static final int a = 48;
    protected static final Logger b = Logger.getLogger(eqx_2.class);
    protected long c;
    protected long d;
    protected String e;
    protected long f;
    protected aff_1 g;
    protected long h;
    protected Date i;
    private String j;
    private long k;

    public final long c() {
        return this.c;
    }

    public final void a(long l) {
        this.c = l;
    }

    public final long d() {
        return this.d;
    }

    public final void b(long l) {
        this.d = l;
    }

    public final String e() {
        return this.e;
    }

    public final void a(String string) {
        this.e = string;
    }

    public long f() {
        return this.f;
    }

    public void c(long l) {
        this.f = l;
    }

    public final aff_1 g() {
        return this.g;
    }

    public final void a(aff_1 aff_12) {
        this.g = aff_12;
    }

    public final long h() {
        return this.h;
    }

    public final void d(long l) {
        this.h = l;
    }

    public final String i() {
        return this.j;
    }

    public final void b(String string) {
        this.j = string;
    }

    public final long j() {
        return this.k;
    }

    public final void e(long l) {
        this.k = l;
    }

    public abstract void a(us_2 var1);

    public abstract void b(us_2 var1);

    public final Date k() {
        return this.i;
    }

    public final void a(Date date) {
        this.i = date;
    }

    @Override
    public final boolean a(uv_1 uv_12) {
        uv_12.a = this.c;
        uv_12.b = this.d;
        uv_12.c = this.e;
        uv_12.d = this.f;
        uv_12.e = this.g.d();
        uv_12.f = this.g.e();
        uv_12.g = this.g.f();
        uv_12.h = this.h;
        uv_12.j = this.i.getTime();
        uv_12.k = this.j;
        uv_12.l = this.k;
        this.b(uv_12.i);
        return true;
    }

    @Override
    public final boolean b(uv_1 uv_12) {
        this.c = uv_12.a;
        this.d = uv_12.b;
        this.e = uv_12.c;
        this.f = uv_12.d;
        this.g = new aff_1(uv_12.e, uv_12.f, uv_12.g);
        this.h = uv_12.h;
        this.i = new Date(uv_12.j);
        this.j = uv_12.k;
        this.k = uv_12.l;
        this.a(uv_12.i);
        return true;
    }

    @Override
    public void onCheckIn() {
        this.c = 0L;
        this.d = 0L;
        this.f = 0L;
        this.e = null;
        this.g = null;
        this.h = 0L;
        this.i = null;
        this.j = null;
        this.k = 0L;
    }

    @Override
    public void onCheckOut() {
    }

    public final boolean l() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.i);
        calendar.add(10, 48);
        return calendar.getTimeInMillis() < System.currentTimeMillis();
    }

    public final byte[] m() {
        ByteBuffer byteBuffer;
        uv_1 uv_12 = new uv_1();
        if (this.a(uv_12) && uv_12.a(byteBuffer = ByteBuffer.allocate(uv_12.b()))) {
            return byteBuffer.array();
        }
        return null;
    }
}

