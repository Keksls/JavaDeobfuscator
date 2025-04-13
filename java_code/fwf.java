/*
 * Decompiled with CFR 0.152.
 */
class fwf
extends fig_2 {
    final /* synthetic */ fwd a;

    fwf(fwd fwd2) {
        this.a = fwd2;
    }

    private int getFirstConstraint() {
        if (this.a.k <= 0) {
            return (int)Math.round(Math.sqrt(this.a.h.size()));
        }
        return this.a.k;
    }

    private int getSecondConstraint(int n) {
        return (int)Math.ceil((double)this.a.h.size() / (double)n);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n;
        int n2;
        if (this.a.h.size() == 0) {
            return new fjf_2(0, 0);
        }
        if (this.a.j) {
            n2 = this.getFirstConstraint();
            n = this.getSecondConstraint(n2);
        } else {
            n = this.getFirstConstraint();
            n2 = this.getSecondConstraint(n);
        }
        fjf_2 fjf_22 = this.a.h.get(0).getMinSize();
        fjf_22.b(fjf_22.width * n2);
        fjf_22.a(fjf_22.height * n);
        return fjf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n;
        int n2;
        if (this.a.h.size() == 0) {
            return new fjf_2(0, 0);
        }
        if (this.a.j) {
            n2 = this.getFirstConstraint();
            n = this.getSecondConstraint(n2);
        } else {
            n = this.getFirstConstraint();
            n2 = this.getSecondConstraint(n);
        }
        fjf_2 fjf_22 = this.a.h.get(0).getPrefSize();
        fjf_22.b(fjf_22.width * n2);
        fjf_22.a(fjf_22.height * n);
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        block12: {
            int n;
            int n2;
            int n3;
            if (this.a.h.size() == 0) {
                return;
            }
            if (this.a.j) {
                n3 = this.getFirstConstraint();
                n2 = this.getSecondConstraint(n3);
            } else {
                n2 = this.getFirstConstraint();
                n3 = this.getSecondConstraint(n2);
            }
            int n4 = this.a.h.size();
            for (n = 0; n < n4; ++n) {
                this.a.h.get(n).setSizeToPrefSize();
            }
            n = this.a.h.size();
            n4 = this.a.h.get(0).getWidth();
            int n5 = this.a.h.get(0).getHeight();
            int n6 = 0;
            int n7 = fso2.getAppearance().getContentHeight() - n5;
            if (this.a.j) {
                for (int k = 0; k < n2; ++k) {
                    for (int i2 = 0; i2 < n3; ++i2) {
                        int n8 = i2 + k * n3;
                        if (n8 < n) {
                            fso fso3 = this.a.h.get(n8);
                            fso3.setPosition(n6, n7);
                            n6 += n4;
                            continue;
                        }
                        break block12;
                    }
                    n6 = 0;
                    n7 -= n5;
                }
            } else {
                for (int k = 0; k < n3; ++k) {
                    for (int i3 = 0; i3 < n2; ++i3) {
                        int n9 = k + i3 * n3;
                        if (n9 < n) {
                            fso fso4 = this.a.h.get(i3 + k * n2);
                            fso4.setPosition(n6, n7);
                            n7 -= n5;
                            continue;
                        }
                        break block12;
                    }
                    n7 = fso2.getAppearance().getContentHeight() - n5;
                    n6 += n4;
                }
            }
        }
    }
}

