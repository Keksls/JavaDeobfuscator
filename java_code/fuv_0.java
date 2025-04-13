/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuV
 */
public class fuv_0
extends fig_2 {
    final /* synthetic */ fuS a;

    public fuv_0(fuS fuS2) {
        this.a = fuS2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = this.a.n.width * this.a.m + this.a.k * (this.a.m - 1);
        int n2 = this.a.n.height * this.a.l + this.a.j * (this.a.l - 1);
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return this.getContentMinSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        if (this.a.e != null) {
            for (int k = 0; k < this.a.e.size(); ++k) {
                ftj_0 ftj_02 = this.a.g.get(k);
                fxU fxU2 = this.a.e.get(k);
                float f2 = fxU2.b();
                float f3 = fxU2.c();
                int n = (int)((float)(this.a.n.width + this.a.k) * f2);
                int n2 = (int)((float)(this.a.n.height + this.a.j) * ((float)this.a.l - f3 - 1.0f));
                ftj_02.setPosition(n, n2);
                ftj_02.setSize(this.a.n.width, this.a.n.height);
            }
        }
    }
}

