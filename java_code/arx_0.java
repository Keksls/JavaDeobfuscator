/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRx
 */
public class arx_0
implements asu_2 {
    protected int a;
    protected String b;
    protected byte c;

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public byte e() {
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
        this.b = asc_22.i().intern();
        this.c = asc_22.b();
    }

    @Override
    public final int a() {
        return enK.ba.a();
    }
}

