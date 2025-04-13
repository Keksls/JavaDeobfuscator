/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEA
 */
public class cea_0
extends cev_1 {
    public static final byte a = 3;
    private cdg_0 b;

    public cdg_0 a() {
        return this.b;
    }

    public void a(cdg_0 cdg_02) {
        this.b = cdg_02;
    }

    @Override
    public boolean c() {
        return ceq_1.a().e() == this.b.a();
    }

    @Override
    public byte d() {
        return 3;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = cdg_0.a(arf_12.a());
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b.a());
    }

    @Override
    public String e() {
        return "Type de zone : " + this.b.toString();
    }

    @Override
    public ceo_1 f() {
        cea_0 cea_02 = new cea_0();
        cea_02.a(this.b);
        cea_02.a(this.h());
        return cea_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

