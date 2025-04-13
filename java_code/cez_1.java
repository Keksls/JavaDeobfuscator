/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEz
 */
public class cez_1
extends cev_1 {
    public static final byte a = 4;
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

    public void a(float f2, float f3) {
        this.b = f2;
        this.c = f3;
    }

    @Override
    public boolean c() {
        float f2 = ceq_1.a().f();
        return this.b <= f2 && f2 <= this.c;
    }

    @Override
    public byte d() {
        return 4;
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
        return "Wakfu (Min : " + this.b + ", Max : " + this.c + ")";
    }

    @Override
    public ceo_1 f() {
        cez_1 cez_12 = new cez_1();
        cez_12.a(this.b);
        cez_12.b(this.c);
        cez_12.a(this.h());
        return cez_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

