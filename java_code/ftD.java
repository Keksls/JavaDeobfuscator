/*
 * Decompiled with CFR 0.152.
 */
class ftD
extends fig_2 {
    final /* synthetic */ ftv a;

    ftD(ftv ftv2) {
        this.a = ftv2;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return new fjf_2(0, 0);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return new fjf_2(0, 0);
    }

    @Override
    public void a(fso fso2) {
        if (this.a.G) {
            if (this.a.E != null) {
                while (this.a.E.length < this.a.F.size()) {
                    this.a.F.remove(this.a.E.length).destroySelfFromParent();
                }
                if (this.a.E.length > this.a.F.size()) {
                    fsk_0 fsk_02;
                    if (this.a.F.size() == 0) {
                        fsk_02 = new fsk_0();
                        fsk_02.onCheckOut();
                        fsk_02.setNonBlocking(true);
                        fsk_02.setModulationColor(this.a.getModulationColor());
                        fsk_02.add(this.a.H.cloneElementStructure());
                        this.add(fsk_02);
                        this.a.F.add(fsk_02);
                    }
                    while (this.a.E.length > this.a.F.size()) {
                        fsk_02 = (fsk_0)this.a.F.get(0).cloneElementStructure();
                        this.add(fsk_02);
                        this.a.F.add(fsk_02);
                    }
                }
            }
            this.b();
            this.a.G = false;
        }
    }

    private void b() {
        if (this.a.E == null || this.a.E.length == 0 || this.a.F == null || this.a.F.size() != this.a.E.length) {
            return;
        }
        if (this.a.s) {
            for (int k = 0; k < this.a.F.size(); ++k) {
                fsk_0 fsk_02 = this.a.F.get(k);
                float f2 = this.a.E[k];
                fsk_02.setPosition(Math.round((float)this.a.getAppearance().getContentWidth() * f2), this.a.getAppearance().getContentHeight() / 2 - fsk_02.getHeight() / 2);
            }
        } else {
            for (int k = 0; k < this.a.F.size(); ++k) {
                fsk_0 fsk_03 = this.a.F.get(k);
                float f3 = this.a.E[k];
                fsk_03.setPosition(this.a.getAppearance().getContentWidth() / 2 - fsk_03.getWidth() / 2, Math.round((float)this.a.getAppearance().getContentHeight() * f3));
            }
        }
        this.a.G = false;
        this.setNeedsToMiddleProcess();
    }
}

