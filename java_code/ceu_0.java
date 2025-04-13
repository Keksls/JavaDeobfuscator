/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEU
 */
public class ceu_0
implements cej_0 {
    public static final byte a = 0;
    private cev_0 b;

    public ceu_0() {
    }

    public ceu_0(cev_0 cev_02) {
        this.b = cev_02;
    }

    public void a(cev_0 cev_02) {
        this.b = cev_02;
    }

    public cev_0 a() {
        return this.b;
    }

    @Override
    public boolean a(cer_0 cer_02) {
        if (cer_02.c() != 0) {
            return false;
        }
        cew_1 cew_12 = (cew_1)cer_02;
        return cew_12.a() == this.b;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = cev_0.a(arf_12.a());
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b.b());
    }

    @Override
    public byte d() {
        return 0;
    }

    @Override
    public cej_0 e() {
        return new ceu_0(this.b);
    }

    public /* synthetic */ Object clone() {
        return this.e();
    }
}

