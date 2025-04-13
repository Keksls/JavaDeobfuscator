/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEB
 */
public class ceb_0
implements cej_0 {
    public static final byte a = 3;
    private cdh_0 b;
    private short c = (short)-1;
    private short d = (short)-1;

    public ceb_0() {
    }

    public ceb_0(cdh_0 cdh_02, short s2, short s3) {
        this.b = cdh_02;
        this.c = s2;
        this.d = s3;
    }

    public cdh_0 a() {
        return this.b;
    }

    public void a(cdh_0 cdh_02) {
        this.b = cdh_02;
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
        if (cer_02.c() != 3) {
            return false;
        }
        cec_1 cec_12 = (cec_1)cer_02;
        if (cec_12.a() != this.b) {
            return false;
        }
        if (this.c != -1 && cec_12.b() < this.c) {
            return false;
        }
        return this.d == -1 || cec_12.b() <= this.d;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = cdh_0.a(arf_12.c());
        this.c = arf_12.b();
        this.d = arf_12.b();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b.a());
        gk_02.a(this.c);
        gk_02.a(this.d);
    }

    @Override
    public byte d() {
        return 3;
    }

    @Override
    public cej_0 e() {
        return new ceb_0(this.b, this.c, this.d);
    }

    public /* synthetic */ Object clone() {
        return this.e();
    }
}

