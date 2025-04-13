/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEs
 */
public class ces_1
extends cev_1 {
    public static final byte a = 7;
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
        int n = ceq_1.a().g();
        return this.b <= n && this.c >= n;
    }

    @Override
    public byte d() {
        return 7;
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
        return "Nombre de joueurs alentours - [" + this.b + " - " + this.c + "]";
    }

    @Override
    public ceo_1 f() {
        ces_1 ces_12 = new ces_1();
        ces_12.a(this.b);
        ces_12.b(this.c);
        ces_12.a(this.h());
        return ces_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

