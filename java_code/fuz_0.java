/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuZ
 */
public class fuz_0
extends fig_2 {
    final /* synthetic */ fuW a;

    public fuz_0(fuW fuW2) {
        this.a = fuW2;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        int n3 = this.a.d();
        int n4 = 1;
        if (this.a.P >= 0 || this.a.O >= 0) {
            n4 = Math.min(Math.max(this.a.P, this.a.O), n3);
        }
        if (n4 < n3) {
            fjf_2 fjf_22 = this.a.w.getPrefSize();
            n2 += fjf_22.width;
        }
        return new fjf_2(n2, n += this.a.N * n4);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        Object object;
        Object object2;
        int n;
        int n2;
        this.a.y = true;
        int n3 = fso2.getAppearance().getContentHeight();
        int n4 = fso2.getAppearance().getContentWidth();
        int n5 = Math.min(this.a.u.size(), n3 / this.a.N);
        if (n5 > (n2 = this.a.v.size())) {
            this.a.v.ensureCapacity(n5);
            this.a.F.ensureCapacity(n5);
            for (n = n2; n < n5; ++n) {
                fbz_2 fbz_22 = new fbz_2();
                fbz_22.i();
                this.a.F.add(fbz_22);
                ftj_0 ftj_02 = new ftj_0();
                ftj_02.onCheckOut();
                ftj_02.setNonBlocking(this.a.m_nonBlocking);
                ftj_02.setRendererManager(this.a.s);
                ftj_02.setEnableDND(this.a.Q);
                ftj_02.setEnabled(this.a.m_enabled);
                ftj_02.setNetEnabled(this.a.m_netEnabled);
                ftj_02.addEventListener(frd_0.C, new fva(this, ftj_02), false);
                this.a.v.add(ftj_02);
                this.add(ftj_02);
                ftj_02.setChildrenAdded(true);
                object2 = this.a.getStyle();
                object = new StringBuilder("tree");
                if (object2 != null) {
                    ((StringBuilder)object).append((String)object2);
                }
                ((StringBuilder)object).append("$").append("cell");
                ftj_02.setStyle(((StringBuilder)object).toString(), true);
            }
        } else if (n5 < n2) {
            n = n2 - n5;
            for (int k = n - 1; k >= 0; --k) {
                int n6 = this.a.v.size() - 1;
                object2 = this.a.v.remove(n6);
                this.a.destroy((fyb_0)object2);
                object = this.a.F.remove(n6);
                ((fcf_1)object).h();
            }
        }
        boolean bl = this.a.x = (n = this.a.d()) > this.a.v.size();
        if (this.a.x) {
            this.a.w.setVisible(true);
            int n7 = this.a.w.getPrefSize().width;
            this.a.w.setSize(n7, n3);
            this.a.w.setPosition(n4 -= n7, 0);
        } else {
            this.a.w.setVisible(false);
        }
        boolean bl2 = false;
        int n8 = n3 - this.a.N;
        for (int k = 0; k < n5; ++k) {
            object = this.a.v.get(k);
            if (object == null) {
                fuW.b().warn((Object)("Impossible de trouver un renderableContainer \u00e0 la ligne " + k));
                continue;
            }
            ((fvE)object).setSize(n4, this.a.N);
            ((fvE)object).setPosition(0, n8);
            this.a.F.get(k).a(0, n8, 0, this.a.N, 0, 0, 0, 0);
            n8 -= this.a.N;
        }
        this.a();
        this.a.y = false;
    }

    private void a() {
        if (this.a.x) {
            int n = this.a.d();
            int n2 = n - this.a.v.size();
            if (n2 > 0) {
                this.a.w.setEnabled(true);
                this.a.w.setButtonJump(1.0f / (float)n2);
                this.a.w.setSliderSize((float)this.a.v.size() / (float)n);
            } else {
                this.a.w.setButtonJump(0.0f);
                this.a.w.setEnabled(false);
            }
        }
    }
}

