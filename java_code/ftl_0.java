/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftl
 */
public class ftl_0
extends fjh_2<Boolean> {
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private float s;
    private float t;
    final /* synthetic */ fte_0 a;

    public ftl_0(fte_0 fte_02, float f2, float f3, float f4, float f5, fvE fvE2, int n, int n2, fjw_2 fjw_22) {
        this.a = fte_02;
        super(true, false, fvE2, n, n2, fjw_22);
        this.o = f2;
        this.q = f4;
        this.p = f3;
        this.r = f5;
        int n3 = -(fte_02.x - fte_02.m_appearance.getContentWidth());
        this.s = (float)fte_02.g / (float)(n3 == 0 ? 1 : n3);
        int n4 = fte_02.y - fte_02.m_appearance.getContentHeight();
        this.t = (float)fte_02.h / (float)(n4 == 0 ? 1 : n4);
    }

    @Override
    public boolean a(int n) {
        super.a(n);
        if (this.c != null) {
            boolean bl = (Boolean)this.j;
            if (!bl) {
                this.s = this.o;
                this.t = this.q;
            }
            float f2 = bl ? this.s : this.p;
            float f3 = bl ? this.p : this.s;
            float f4 = bl ? this.t : this.r;
            float f5 = bl ? this.r : this.t;
            float f6 = this.c.a(f2, f3, this.d, this.e);
            float f7 = this.c.a(f4, f5, this.d, this.e);
            this.a.setDeltaX((int)((float)(-(this.a.x - this.a.m_appearance.getContentWidth())) * f6));
            this.a.setDeltaY((int)((float)(this.a.y - this.a.m_appearance.getContentHeight()) * f7));
        }
        return true;
    }

    @Override
    public void a() {
        super.a();
        this.a.L = null;
    }
}

