/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from cdf
 */
class cdf_1
implements cdh_1 {
    final /* synthetic */ cde_1 a;

    cdf_1(cde_1 cde_12) {
        this.a = cde_12;
    }

    @Override
    public void a(ScreenElement screenElement) {
        if (screenElement.r() > this.a.k) {
            this.a.k = screenElement.r();
        }
        if (screenElement.n() > this.a.l) {
            this.a.l = Math.abs(screenElement.n());
        }
        screenElement.c(0);
        screenElement.d(0);
    }
}

