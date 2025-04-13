/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEM
 */
public class cem_0
implements cej_0 {
    public static final byte a = 1;
    private int b;
    private short c = (short)-1;
    private short d = (short)-1;

    public cem_0() {
    }

    public cem_0(int n, short s2, short s3) {
        this.b = n;
        this.c = s2;
        this.d = s3;
    }

    public void a(int n) {
        this.b = n;
    }

    public int a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    public void a(short s2) {
        this.c = s2;
    }

    public short c() {
        return this.d;
    }

    public void b(short s2) {
        this.d = s2;
    }

    @Override
    public boolean a(cer_0 cer_02) {
        if (cer_02.c() != 1) {
            return false;
        }
        cen_0 cen_02 = (cen_0)cer_02;
        if (cen_02.a() != this.b) {
            return false;
        }
        if (this.c != -1 && cen_02.b() < this.c) {
            return false;
        }
        return this.d == -1 || cen_02.b() <= this.d;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = arf_12.c();
        this.c = arf_12.b();
        this.d = arf_12.b();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
    }

    @Override
    public byte d() {
        return 1;
    }

    @Override
    public cej_0 e() {
        return new cem_0(this.b, this.c, this.d);
    }

    public /* synthetic */ Object clone() {
        return this.e();
    }
}

