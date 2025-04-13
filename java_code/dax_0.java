/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dax
 */
class dax_0
implements fwp_0 {
    final /* synthetic */ fyb_0 a;
    final /* synthetic */ daw b;

    dax_0(daw daw2, fyb_0 fyb_02) {
        this.b = daw2;
        this.a = fyb_02;
    }

    @Override
    public void onChildrenAdded() {
        fvE fvE2 = (fvE)fpm_0.b().h().d("marketDialog.createOfferView").a("offerUnitPriceTE");
        if (fvE2 != null) {
            fvE2.setFocused(true);
        }
        this.a.removeChildrenAddedListener(this);
    }
}

