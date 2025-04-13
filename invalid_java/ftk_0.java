/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftk
 */
public class ftk_0
extends fjh_2<Boolean> {
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    final /* synthetic */ fte_0 a;

    public ftk_0(fte_0 fte_02, int n, int n2, int n3) {
        this.a = fte_02;
        super(true, false, fte_02, 0, n3, fjw_2.c);
        this.o = fte_02.g;
        this.q = fte_02.h;
        this.p = n;
        this.r = n2;
    }

    @Override
    public boolean a(int n) {
        super.a(n);
        if (this.c != null) {
            int n2 = (int)this.c.a(this.o, this.p, this.d, this.e);
            int n3 = (int)this.c.a(this.q, this.r, this.d, this.e);
            this.a.setDeltaX(n2);
            this.a.setDeltaY(n3);
        }
        return true;
    }

    @Override
    public void a() {
        super.a();
    }
}

