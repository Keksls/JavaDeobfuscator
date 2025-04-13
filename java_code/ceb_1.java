/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEb
 */
public class ceb_1
extends cev_1 {
    public static final byte a = 8;
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

    @Override
    public boolean c() {
        int n = ceq_1.a().h();
        return this.b <= n && this.c >= n;
    }

    @Override
    public byte d() {
        return 8;
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
        return "Altitude - [" + this.b + " - " + this.c + "]";
    }

    @Override
    public ceo_1 f() {
        ceb_1 ceb_12 = new ceb_1();
        ceb_12.a(this.b);
        ceb_12.b(this.c);
        ceb_12.a(this.h());
        return ceb_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

