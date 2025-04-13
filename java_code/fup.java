/*
 * Decompiled with CFR 0.152.
 */
class fup
extends fig_2 {
    final /* synthetic */ fum a;

    fup(fum fum2) {
        this.a = fum2;
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
        if (this.a.P) {
            this.a.P = false;
        }
        if (this.a.Q) {
            while (this.a.A < this.a.M.size()) {
                this.a.M.remove(this.a.A).destroySelfFromParent();
            }
            if (this.a.A > this.a.M.size()) {
                fsk_0 fsk_02;
                if (this.a.M.size() == 0) {
                    fsk_02 = new fsk_0();
                    fsk_02.onCheckOut();
                    fsk_02.setNonBlocking(true);
                    fsk_02.setModulationColor(this.a.O);
                    fsk_02.add(this.a.N.cloneElementStructure());
                    this.add(fsk_02);
                    this.a.M.add(fsk_02);
                }
                while (this.a.A > this.a.M.size()) {
                    fsk_02 = (fsk_0)this.a.M.get(0).cloneElementStructure();
                    this.add(fsk_02);
                    this.a.M.add(fsk_02);
                }
                this.a.remove(this.a.G);
                this.add(this.a.G);
            }
            this.a.d();
            this.a.Q = false;
        }
        if (this.a.y) {
            this.a.a();
        }
        if (this.a.x) {
            this.a.b();
            this.a.d();
        }
    }
}

