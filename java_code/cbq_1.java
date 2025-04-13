/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbQ
 */
public class cbq_1
extends adn_0 {
    public static final azf_2 f = new azf_2(0.8f, 0.8f, 0.8f, 0.8f);
    public static final int g = 5000;
    public static final int h = 20000;
    private int a;
    private final int i;
    private final int j;
    private final azf_2 k = new azf_2(f);

    public cbq_1() {
        this(5000, 20000);
    }

    public cbq_1(int n, int n2) {
        this.i = n;
        this.j = n2;
    }

    public void a(azj_2 azj_22) {
        this.k.a(azj_22);
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
        super.i();
        this.a = Hw.b(this.i, this.j);
    }

    @Override
    public void a(int n) {
        super.a(n);
        this.a -= n;
        if (this.a < 0) {
            this.a = Hw.b(this.i, this.j);
            cbt_1.a(this.e, (azj_2)this.k);
        }
    }

    @Override
    public void a(aui_2 aui_22) {
    }

    public azj_2 b() {
        return this.k;
    }
}

