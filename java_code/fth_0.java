/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftH
 */
class fth_0
extends fig_2 {
    final /* synthetic */ ftF a;

    fth_0(ftF ftF2) {
        this.a = ftF2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        if (this.a.t) {
            fjf_2 fjf_22;
            if (this.a.n != null) {
                fjf_22 = this.a.n.getMinSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
            if (this.a.o != null) {
                fjf_22 = this.a.o.getMinSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
            if (this.a.p != null) {
                fjf_22 = this.a.p.getMinSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
        } else {
            fjf_2 fjf_23;
            if (this.a.n != null) {
                fjf_23 = this.a.n.getMinSize();
                n2 = Math.max(n2, fjf_23.width);
                n += fjf_23.height;
            }
            if (this.a.p != null) {
                fjf_23 = this.a.p.getMinSize();
                n2 = Math.max(n2, fjf_23.width);
                n += fjf_23.height;
            }
        }
        return new fjf_2(n2, n);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        if (this.a.t) {
            fjf_2 fjf_22;
            if (this.a.n != null) {
                fjf_22 = this.a.n.getPrefSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
            if (this.a.o != null) {
                fjf_22 = this.a.o.getPrefSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
            if (this.a.p != null) {
                fjf_22 = this.a.p.getPrefSize();
                n = Math.max(n, fjf_22.height);
                n2 += fjf_22.width;
            }
        } else {
            fjf_2 fjf_23;
            if (this.a.n != null) {
                fjf_23 = this.a.n.getPrefSize();
                n2 = Math.max(n2, fjf_23.width);
                n += fjf_23.height;
            }
            if (this.a.p != null) {
                fjf_23 = this.a.p.getPrefSize();
                n2 = Math.max(n2, fjf_23.width);
                n += fjf_23.height;
            }
        }
        return new fjf_2(n2, n);
    }

    @Override
    public void a(fso fso2) {
        int n = fso2.getAppearance().getContentHeight();
        int n2 = fso2.getAppearance().getContentWidth();
        if (this.a.t) {
            int n3;
            fjf_2 fjf_22;
            int n4 = 0;
            if (this.a.n != null) {
                n4 += this.a.n.getPrefSize().width;
            }
            if (this.a.o != null) {
                n4 += this.a.o.getPrefSize().width;
            }
            if (this.a.p != null) {
                n4 += this.a.p.getPrefSize().width;
            }
            int n5 = frs_0.e.a(n4, n2);
            if (this.a.n != null) {
                fjf_22 = this.a.n.getPrefSize();
                n3 = frs_0.e.b(fjf_22.height, n);
                this.a.n.setPosition(n5, n3);
                this.a.n.setSizeToPrefSize();
                n5 += fjf_22.width;
            }
            if (this.a.o != null) {
                fjf_22 = this.a.o.getPrefSize();
                n3 = frs_0.e.b(fjf_22.height, n);
                this.a.o.setPosition(n5, n3);
                this.a.o.setSizeToPrefSize();
                n5 += fjf_22.width;
            }
            if (this.a.p != null) {
                fjf_22 = this.a.p.getPrefSize();
                n3 = frs_0.e.b(fjf_22.height, n);
                this.a.p.setPosition(n5, n3);
                this.a.p.setSizeToPrefSize();
            }
        } else {
            int n6;
            fjf_2 fjf_23;
            int n7 = 0;
            if (this.a.n != null) {
                n7 += this.a.n.getPrefSize().height;
            }
            if (this.a.p != null) {
                n7 += this.a.p.getPrefSize().height;
            }
            int n8 = frs_0.e.b(n7, n);
            if (this.a.p != null) {
                fjf_23 = this.a.p.getPrefSize();
                n6 = frs_0.e.a(fjf_23.width, n2);
                this.a.p.setPosition(n6, n8);
                this.a.p.setSizeToPrefSize();
                n8 += fjf_23.height;
            }
            if (this.a.n != null) {
                fjf_23 = this.a.n.getPrefSize();
                n6 = frs_0.e.a(fjf_23.width, n2);
                this.a.n.setPosition(n6, n8);
                this.a.n.setSizeToPrefSize();
            }
            if (this.a.o != null) {
                fjf_23 = this.a.o.getPrefSize();
                n6 = frs_0.e.a(fjf_23.width, n2);
                this.a.o.setPosition(n6, this.a.n.getY() - 2);
                this.a.o.setSizeToPrefSize();
            }
        }
    }
}

