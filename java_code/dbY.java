/*
 * Decompiled with CFR 0.152.
 */
class dbY
implements ans_1 {
    final /* synthetic */ dbU a;

    dbY(dbU dbU2) {
        this.a = dbU2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!string.startsWith("petDialog")) {
            return;
        }
        if (string.equals(this.a.e)) {
            this.a.e = null;
        }
        this.a.e();
        bMi bMi2 = (bMi)fis_1.a().d("pet", string);
        bMi bMi3 = (bMi)fis_1.a().d("pet", "inventoryDialog");
        if (bMi3 == null || bMi2.j().a() != bMi3.j().a()) {
            bMi2.i();
        }
    }
}

