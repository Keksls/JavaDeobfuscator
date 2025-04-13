/*
 * Decompiled with CFR 0.152.
 */
class dbt
implements fjv_2 {
    final /* synthetic */ fso a;
    final /* synthetic */ fjg_2 b;
    final /* synthetic */ dbp c;

    dbt(dbp dbp2, fso fso2, fjg_2 fjg_22) {
        this.c = dbp2;
        this.a = fso2;
        this.b = fjg_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                dbp dbp2 = dbp.g;
                synchronized (dbp2) {
                    this.c.n = false;
                    this.a.setY(-200);
                    this.a.setVisible(false);
                    this.c.j.removeLast();
                    this.c.i();
                    if (!this.c.i.isEmpty()) {
                        bls_1 bls_12 = this.c.i.poll();
                        this.c.b(bls_12);
                    }
                    this.c.k();
                    if (this.c.d()) {
                        this.c.j();
                    }
                    this.b.b(this);
                    break;
                }
            }
        }
    }
}

