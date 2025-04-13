/*
 * Decompiled with CFR 0.152.
 */
public class fuF
extends fig_2 {
    final /* synthetic */ fuc_0 a;

    public fuF(fuc_0 fuc_02) {
        this.a = fuc_02;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        int n3 = this.a.y == null ? 0 : this.a.y.size();
        int n4 = 1;
        if (this.a.X >= 0 || this.a.W >= 0) {
            n4 = Hw.a(n3, this.a.W, this.a.X);
        }
        for (int k = this.a.x.size() - 1; k >= 0; --k) {
            n2 += this.a.x.get(k).getCellWidth();
            fru_0 fru_02 = this.a.w.get(k);
            if (fru_02 != null) {
                n = Math.max(n, fru_02.getPrefSize().height);
                continue;
            }
            fuc_0.b().warn((Object)"Un bouton de colonne n'a pas \u00e9t\u00e9 initialis\u00e9 correctement");
        }
        fjf_2 fjf_22 = this.a.D.getPrefSize();
        switch (this.a.U) {
            case c: {
                break;
            }
            case b: {
                n2 += fjf_22.width;
                break;
            }
            case a: {
                if (n4 >= n3) break;
                n2 += fjf_22.width;
            }
        }
        return new fjf_2(n2, n += this.a.V * n4);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        int n;
        int n2;
        int n3;
        int n4;
        fxs_0 fxs_02;
        int n5;
        this.a.F = true;
        int n6 = fso2.getAppearance().getContentHeight();
        int n7 = this.a.x.size();
        if (n7 == 0) {
            return;
        }
        int n8 = n6 / this.a.V;
        int n9 = this.a.C.size() / n7;
        if (n8 > n9) {
            this.a.C.ensureCapacity(n7 * n8);
            this.a.Q.ensureCapacity(n8);
            for (n5 = n9; n5 < n8; ++n5) {
                fbz_2 fbz_22 = new fbz_2();
                fbz_22.i();
                this.a.Q.add(fbz_22);
                for (int k = 0; k < n7; ++k) {
                    fxs_02 = this.a.x.get(k);
                    ftj_0 ftj_02 = this.a.createRenderableElement();
                    ftj_02.setRendererManager(fxs_02.getRendererManager());
                    this.a.a(ftj_02);
                }
            }
        } else if (n8 < n9) {
            Object object;
            int n10;
            n5 = n7 * (n9 - n8);
            for (n10 = n5 - 1; n10 >= 0; --n10) {
                object = this.a.C.remove(this.a.C.size() - 1);
                if (object == this.a.K) {
                    this.a.K = null;
                }
                this.a.destroy((fyb_0)object);
            }
            for (n10 = n9 - n8 - 1; n10 >= 0; --n10) {
                object = this.a.Q.remove(this.a.Q.size() - 1);
                ((fcf_1)object).h();
            }
        }
        n5 = 0;
        for (n4 = this.a.x.size() - 1; n4 >= 0; --n4) {
            fru_0 fru_02 = this.a.w.get(n4);
            if (fru_02 != null) {
                n5 = Math.max(n5, fru_02.getPrefSize().height);
                continue;
            }
            fuc_0.c().warn((Object)"Un bouton de colonne n'a pas \u00e9t\u00e9 initialis\u00e9 correctement");
        }
        n4 = 0;
        for (n3 = 0; n3 < n7; ++n3) {
            fxs_02 = this.a.x.get(n3);
            int n11 = fxs_02.getCellWidth();
            int n12 = n6 - n5;
            fru_0 fru_03 = this.a.w.get(n3);
            fru_03.setSize(n11, n5);
            fru_03.setPosition(n4, n12);
            n12 -= this.a.V;
            for (int k = 0; k < n8; ++k) {
                ftj_0 ftj_03 = this.a.getRenderableByPosition(k, n3);
                if (ftj_03 == null) {
                    fuc_0.d().warn((Object)("Impossible de trouver un renderableContainer \u00e0 la ligne " + k + " et \u00e0 la colonne " + n3));
                    continue;
                }
                ftj_03.setSize(n11, this.a.V);
                ftj_03.setPosition(n4, n12);
                n12 -= this.a.V;
            }
            n4 += n11;
        }
        n3 = n6 - n5 - this.a.V;
        for (n2 = 0; n2 < n8; ++n2) {
            this.a.Q.get(n2).a(0, n3, n4, this.a.V, 0, 0, 0, 0);
            n3 -= this.a.V;
        }
        switch (this.a.U) {
            case c: {
                this.a.E = false;
                break;
            }
            case b: {
                this.a.E = true;
                break;
            }
            case a: {
                boolean bl = this.a.E = this.a.y.size() > this.a.C.size() / this.a.x.size();
            }
        }
        if (this.a.E) {
            this.a.D.setVisible(true);
            n2 = this.a.D.getPrefSize().width;
            this.a.D.setSize(n2, n6);
            this.a.D.setPosition(n4, 0);
        } else {
            this.a.D.setVisible(false);
        }
        this.a();
        n2 = this.a.y.size() - n8;
        int n13 = n = n2 < 0 ? 0 : Hw.a(this.a.G, 0, n2);
        if (n != this.a.G) {
            this.a.setOffset(n);
        }
        if (n8 != n9) {
            this.a.setValuesDirty();
        }
        this.a.F = false;
    }

    private void a() {
        if (this.a.E) {
            int n = this.a.y.size() - this.a.C.size() / this.a.x.size();
            if (n > 0) {
                this.a.D.setEnabled(true);
                this.a.D.setButtonJump(1.0f / (float)n);
                this.a.D.setSliderSize((float)(this.a.C.size() / this.a.x.size()) / (float)this.a.y.size());
            } else {
                this.a.D.setButtonJump(0.0f);
                this.a.D.setEnabled(false);
            }
        }
    }
}

