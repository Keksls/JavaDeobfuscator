/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEw
 */
public class cew_2
extends cev_1 {
    public static final byte a = 1;
    private int b;
    private int c;

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int b() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public void a(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    @Override
    public boolean c() {
        float f2 = ceq_1.a().c();
        return (float)this.b <= f2 && f2 <= (float)this.c;
    }

    @Override
    public byte d() {
        return 1;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = arf_12.c();
        this.c = arf_12.c();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
    }

    @Override
    public String e() {
        return "Temp\u00e9rature (Min : " + this.b + ", Max : " + this.c + ")";
    }

    @Override
    public ceo_1 f() {
        cew_2 cew_22 = new cew_2();
        cew_22.a(this.b);
        cew_22.b(this.c);
        cew_22.a(this.h());
        return cew_22;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

