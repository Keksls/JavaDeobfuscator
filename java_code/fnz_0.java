/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

/*
 * Renamed from fnZ
 */
public class fnz_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected long d;
    protected Timestamp e;
    protected boolean f;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public long f() {
        return this.d;
    }

    public Timestamp g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0L;
        this.e = null;
        this.f = false;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.h();
        this.e = new Timestamp(asc_22.h());
        this.f = asc_22.c();
    }

    @Override
    public final int a() {
        return enK.bn.a();
    }
}

