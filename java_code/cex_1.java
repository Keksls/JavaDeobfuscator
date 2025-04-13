/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEx
 */
public class cex_1
extends cev_1 {
    public static final byte a = 2;
    private float b;
    private float c;

    public float a() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public float b() {
        return this.c;
    }

    public void b(float f2) {
        this.c = f2;
    }

    @Override
    public boolean c() {
        float f2 = ceq_1.a().d();
        return this.b <= f2 && this.c > f2;
    }

    @Override
    public byte d() {
        return 2;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = arf_12.d();
        this.c = arf_12.d();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
    }

    @Override
    public String e() {
        return "Moment de la journ\u00e9e - D\u00e9but : " + (int)(this.b * 100.0f) + " - Fin : " + (int)(this.c * 100.0f);
    }

    @Override
    public ceo_1 f() {
        cex_1 cex_12 = new cex_1();
        cex_12.a(this.b);
        cex_12.b(this.c);
        cex_12.a(this.h());
        return cex_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

