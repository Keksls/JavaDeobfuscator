/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

class bgv
implements asb_2<aQr> {
    final /* synthetic */ bgx a;
    final /* synthetic */ bgt b;

    bgv(bgt bgt2, bgx bgx2) {
        this.b = bgt2;
        this.a = bgx2;
    }

    public void a(aQr aQr2) {
        this.a.a(aQr2.h(), aQr2.i());
        for (aQs object : aQr2.e()) {
            this.a.a(this.b.a(object.a(), object.b()));
        }
        for (aqt_0 aqt_02 : aQr2.g()) {
            this.a.a(aqt_02, ArrayUtils.isEmpty((Object[])aQr2.e()));
        }
        for (aqv_0 aqv_02 : aQr2.f()) {
            this.a.a(aqv_02);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQr)asu_22);
    }
}

