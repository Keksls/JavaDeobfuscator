/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fxj
 */
public class fxj_0
extends axt_2 {
    private final fvE a;
    private boolean c = true;

    public fxj_0(fvE fvE2) {
        this.a = fvE2;
    }

    @Override
    public void a(GL2 gL2) {
        if (this.a.getContainer() == null) {
            return;
        }
        if (this.c) {
            azt_1 azt_12 = azt_1.a(this.a.getScreenX() + this.a.getAppearance().getLeftInset(), this.a.getScreenY() + this.a.getAppearance().getBottomInset(), this.a.getAppearance().getContentWidth(), this.a.getAppearance().getContentHeight());
            fpm_0.b().j().a(azt_12);
            fdn_2.a().a(azt_12);
            azt_1 azt_13 = fdn_2.a().c();
            axr_2.a().e(true);
            axr_2.a().a(azt_13.d(), azt_13.e(), azt_13.c() + 1, azt_13.b() + 1);
            axr_2.a().a(gL2);
        } else {
            fdn_2.a().d();
            azt_1 azt_14 = fdn_2.a().c();
            if (azt_14 != null) {
                axr_2.a().e(true);
                axr_2.a().a(azt_14.d(), azt_14.e(), azt_14.c() + 1, azt_14.b() + 1);
                axr_2.a().a(gL2);
            }
        }
        this.c = !this.c;
    }
}

