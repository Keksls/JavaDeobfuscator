/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEO
 */
public class ceo_0
implements cej_0 {
    public static final byte a = 2;
    private cep_0 b;
    private short c = (short)-1;
    private short d = (short)-1;

    public ceo_0() {
    }

    public ceo_0(cep_0 cep_02, short s2, short s3) {
        this.b = cep_02;
        this.c = s2;
        this.d = s3;
    }

    public cep_0 a() {
        return this.b;
    }

    public void a(cep_0 cep_02) {
        this.b = cep_02;
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
        if (cer_02.c() != 2) {
            return false;
        }
        ceq_0 ceq_02 = (ceq_0)cer_02;
        if (ceq_02.a() != this.b) {
            return false;
        }
        if (this.c != -1 && ceq_02.b() < this.c) {
            return false;
        }
        return this.d == -1 || ceq_02.b() <= this.d;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = cep_0.a(arf_12.a());
        this.c = arf_12.b();
        this.d = arf_12.b();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b.f);
        gk_02.a(this.c);
        gk_02.a(this.d);
    }

    @Override
    public byte d() {
        return 2;
    }

    @Override
    public cej_0 e() {
        return new ceo_0(this.b, this.c, this.d);
    }

    public /* synthetic */ Object clone() {
        return this.e();
    }
}

