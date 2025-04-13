/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEu
 */
public class ceu_1
extends cev_1 {
    public static final byte a = 0;
    private wy_0 b;

    public wy_0 a() {
        return this.b;
    }

    public void a(wy_0 wy_02) {
        this.b = wy_02;
    }

    @Override
    public boolean c() {
        return ceq_1.a().b() == this.b;
    }

    @Override
    public byte d() {
        return 0;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = wy_0.values()[arf_12.a()];
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a((byte)this.b.ordinal());
    }

    @Override
    public String e() {
        return "Saison : " + this.b.toString();
    }

    @Override
    public ceo_1 f() {
        ceu_1 ceu_12 = new ceu_1();
        ceu_12.a(this.h());
        ceu_12.a(this.b);
        return ceu_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

