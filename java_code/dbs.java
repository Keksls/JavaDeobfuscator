/*
 * Decompiled with CFR 0.152.
 */
class dbs
implements fjv_2 {
    final /* synthetic */ fjg_2 a;
    final /* synthetic */ dbp b;

    dbs(dbp dbp2, fjg_2 fjg_22) {
        this.b = dbp2;
        this.a = fjg_22;
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
                    this.b.n = false;
                    if (this.b.o) {
                        this.b.run();
                    } else if (!this.b.i.isEmpty() && this.b.l() < 9) {
                        this.b.b(this.b.i.poll());
                    }
                    this.a.b(this);
                    break;
                }
            }
        }
    }
}

