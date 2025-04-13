/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuj
 */
class fuj_0
extends fig_2 {
    final /* synthetic */ fue_0 a;

    fuj_0(fue_0 fue_02) {
        this.a = fue_02;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        if (!this.a.u) {
            return new fjf_2(0, 0);
        }
        int n = 0;
        int n2 = 0;
        fjf_2 fjf_22 = this.a.n.getMinSize();
        fjf_2 fjf_23 = this.a.o.getMinSize();
        fjf_2 fjf_24 = this.a.F.getMinSize();
        if (!this.a.q.equals((Object)fra_0.c)) {
            n += fjf_23.height;
            n2 += fjf_23.width;
        } else {
            n2 += fjf_24.width;
        }
        if (!this.a.p.equals((Object)fra_0.c)) {
            n2 += fjf_22.width;
            n += fjf_22.height;
        } else {
            n += fjf_24.height;
        }
        return new fjf_2(n2, n);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        if (!this.a.u) {
            return new fjf_2(0, 0);
        }
        int n = 0;
        int n2 = 0;
        fjf_2 fjf_22 = this.a.n.getPrefSize();
        fjf_2 fjf_23 = this.a.o.getPrefSize();
        fjf_2 fjf_24 = this.a.F.getPrefSize();
        if (!this.a.q.equals((Object)fra_0.c)) {
            if (this.a.m_maxSize != null) {
                if (fjf_24.width <= this.a.m_maxSize.width) {
                    n2 += fjf_24.width;
                    if (this.a.q == fra_0.b) {
                        n += fjf_23.height;
                    }
                } else {
                    n2 += Math.max(this.a.m_maxSize.width, fjf_23.width);
                    n += fjf_23.height;
                }
            } else {
                n += fjf_23.height;
                n2 += fjf_23.width;
            }
        } else {
            n2 += fjf_24.width;
        }
        if (!this.a.p.equals((Object)fra_0.c)) {
            if (this.a.m_maxSize != null) {
                if (fjf_24.height <= this.a.m_maxSize.height) {
                    n += fjf_24.height;
                    if (this.a.p == fra_0.b) {
                        n2 += fjf_22.width;
                    }
                } else {
                    n += Math.max(this.a.m_maxSize.height, fjf_22.height);
                    n2 += fjf_22.width;
                }
            } else {
                n2 += fjf_22.width;
                n += fjf_22.height;
            }
        } else {
            n += fjf_24.height;
        }
        return new fjf_2(n2, n);
    }

    @Override
    public void a(fso fso2) {
        if (this.a.F != null) {
            float f2;
            int n;
            int n2;
            fqj fqj2 = this.a.getAppearance();
            int n3 = fqj2.getContentHeight();
            int n4 = fqj2.getContentWidth();
            if (this.a.F instanceof ful_0) {
                ((ful_0)this.a.F).setTextWidgetSize(n4, n3, true);
                ((ful_0)this.a.F).getTextBuilder().U();
            }
            if (!this.a.u || (double)n4 >= this.a.F.getPrefSize().getWidth() && !this.a.q.equals((Object)fra_0.b) || this.a.q.equals((Object)fra_0.c)) {
                this.a.s = false;
            } else {
                this.a.s = true;
                n3 = (int)((double)n3 - this.a.o.getPrefSize().getHeight());
            }
            if (!this.a.u || (double)n3 >= this.a.F.getPrefSize().getHeight() && !this.a.p.equals((Object)fra_0.b) || this.a.p.equals((Object)fra_0.c)) {
                this.a.r = false;
            } else {
                n4 = (int)((double)n4 - this.a.n.getPrefSize().getWidth());
                if (this.a.F instanceof ful_0) {
                    ((ful_0)this.a.F).setTextWidgetSize(n4, this.a.F.getHeight(), true);
                    ((ful_0)this.a.F).getTextBuilder().U();
                } else if (!this.a.r) {
                    this.a.n.setValue(1.0f);
                }
                this.a.r = true;
            }
            if (this.a.r && !this.a.s) {
                if ((double)n4 >= this.a.F.getPrefSize().getWidth() && !this.a.q.equals((Object)fra_0.b) || this.a.q.equals((Object)fra_0.c)) {
                    this.a.s = false;
                } else {
                    this.a.s = true;
                    n3 = (int)((double)n3 - this.a.o.getPrefSize().getHeight());
                }
            }
            int n5 = this.a.t != null && this.a.q != fra_0.c ? this.a.F.getPrefSize().width : (int)Math.max((double)n4, this.a.F.getPrefSize().getWidth());
            int n6 = this.a.t != null && this.a.p != fra_0.c ? this.a.F.getPrefSize().height : (int)Math.max((double)n3, this.a.F.getPrefSize().getHeight());
            this.a.F.setSize(n5, n6);
            this.a.e();
            if (this.a.s) {
                this.a.o.setSize(n4, (int)this.a.o.getPrefSize().getHeight());
            }
            if (this.a.r) {
                this.a.n.setSize((int)this.a.n.getPrefSize().getWidth(), n3);
            }
            if (this.a.s) {
                n2 = 0;
                n = 0;
                if (this.a.r && this.a.C.equals((Object)frm_0.d)) {
                    n2 += this.a.n.getWidth();
                }
                if (this.a.D.equals((Object)frm_0.a)) {
                    n += n3;
                }
                this.a.o.setPosition(n2, n);
                this.a.o.setSliderSize((float)n4 / (float)n5);
                f2 = ((float)n5 / (float)n4 - 1.0f) * this.a.G;
                this.a.o.setButtonJump(1.0f / Math.max(1.0f, f2));
            }
            if (this.a.r) {
                n2 = 0;
                n = 0;
                if (this.a.s && this.a.D.equals((Object)frm_0.b)) {
                    n += this.a.o.getHeight();
                }
                if (this.a.C.equals((Object)frm_0.c)) {
                    n2 += n4;
                }
                this.a.n.setPosition(n2, n);
                this.a.n.setSliderSize((float)n3 / (float)n6);
                f2 = 1.0f / Math.max(1.0f, (float)n6 / (float)n3 - 1.0f) * this.a.G;
                this.a.n.setButtonJump(f2);
            }
            this.a.o.setVisible(this.a.s);
            this.a.n.setVisible(this.a.r);
        }
    }
}

