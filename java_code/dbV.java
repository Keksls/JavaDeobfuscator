/*
 * Decompiled with CFR 0.152.
 */
class dbV
implements Runnable {
    final /* synthetic */ dbU a;

    dbV(dbU dbU2) {
        this.a = dbU2;
    }

    @Override
    public void run() {
        if (this.a.e == null) {
            return;
        }
        bMi bMi2 = (bMi)fis_1.a().d("pet", this.a.e);
        bMi2.a((wu_0)null);
        bMi2.c(-1);
        bMi bMi3 = (bMi)fis_1.a().d("pet", "inventoryDialog");
        if (bMi3 == null) {
            return;
        }
        bMi3.a((wu_0)null);
    }
}

