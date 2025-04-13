/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcF
 */
class dcf_0
implements fac_2 {
    final /* synthetic */ dcD a;

    dcf_0(dcD dcD2) {
        this.a = dcD2;
    }

    @Override
    public void a() {
        bwj_0 bwj_02 = (bwj_0)fis_1.a().e("serverChoice.selectedServerReference");
        if (bwj_02 != null) {
            this.a.f.setListOffset(Hw.a(this.a.f.getOffsetByValue(bwj_02) - 3, 0, this.a.f.size() - 3));
        }
        this.a.f.removeListContentLoadListener(this);
    }
}

