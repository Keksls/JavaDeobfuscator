/*
 * Decompiled with CFR 0.152.
 */
public class fsR
extends fsS<fxd_0> {
    public static final String TAG = "MapNavigator";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    protected void setMeshCenter() {
        ((fxd_0)this.v).b(this.q, this.r);
    }

    @Override
    protected void a() {
        super.a();
        this.D = true;
    }

    @Override
    protected void b() {
        this.w.a(this.h, this.q, this.r);
        this.D = true;
        this.E = false;
    }

    @Override
    public void setMapRect(int n, int n2, int n3, int n4) {
        super.setMapRect(n, n2, n3, n4);
        this.setMeshCenter();
    }

    @Override
    protected void c() {
        ((fxd_0)this.v).a(this.m_size.width, this.m_size.height);
        super.c();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqs fqs2 = new fqs();
        fqs2.onCheckOut();
        fqs2.setWidget(this);
        this.add(fqs2);
        this.v = new fxd_0();
        ((fxd_0)this.v).d();
        ((fxd_0)this.v).a(new azf_2(azf_2.e));
        this.w = new fwu<fxd_0>((fxd_0)this.v);
        this.F = false;
        this.G = false;
        this.g = false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.I.clear();
        this.w.b();
        this.w = null;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.G) {
            return bl;
        }
        if (this.F) {
            this.e();
        }
        this.w.b(n);
        if (this.E) {
            this.b();
        }
        if (this.D) {
            this.j();
        }
        float f2 = this.getIsoCenterX();
        float f3 = this.getIsoCenterY();
        float f4 = this.getIsoCenterZ();
        float f5 = (f2 - f3) * 86.0f / 2.0f;
        float f6 = -(f2 + f3) * 43.0f / 2.0f + f4 * 10.0f;
        ((fxd_0)this.v).a(f5, f6);
        return true;
    }
}

