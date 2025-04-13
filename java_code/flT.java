/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

public class flT
implements asu_2 {
    protected int a;
    protected Timestamp b;
    protected int c;

    public int c() {
        return this.a;
    }

    public Timestamp d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = new Timestamp(asc_22.h());
        this.c = asc_22.f();
    }

    @Override
    public final int a() {
        return enK.aT.a();
    }
}

