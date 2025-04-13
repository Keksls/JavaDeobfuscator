/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

public class fwP
extends axt_2 {
    private final fvE a;
    private boolean c = true;

    public fwP(fvE fvE2) {
        this.a = fvE2;
    }

    @Override
    public void a(GL2 gL2) {
        fso fso2 = this.a.getContainer();
        if (fso2 == null) {
            return;
        }
        if (this.c) {
            if (fso2.needsScissor()) {
                this.a.setScreenPosition(this.a.getScreenX(), this.a.getScreenY());
                fso2.setScreenPosition(fso2.getScreenX(), fso2.getScreenY());
                azt_1 azt_12 = fso2.getScissor(this.a);
                fpm_0.b().j().a(azt_12);
                fdn_2.a().a(azt_12);
                azt_1 azt_13 = this.a.getComputedScissor();
                if (azt_13 != null) {
                    fpm_0.b().j().a(azt_13);
                    fdn_2.a().a(azt_13);
                }
                this.a();
            }
        } else if (fso2.needsScissor()) {
            this.a.setScreenPosition(-1, -1);
            fso2.setScreenPosition(-1, -1);
            fdn_2.a().d();
            if (this.a.getScissor() != null) {
                fdn_2.a().d();
            }
            this.a();
        }
        this.c = !this.c;
    }

    private void a() {
        azt_1 azt_12 = fdn_2.a().c();
        if (azt_12 != null) {
            axr_2 axr_22 = axr_2.a();
            axr_22.e(true);
            axr_22.a(azt_12.d(), azt_12.e(), azt_12.c() + 1, azt_12.b() + 1);
        }
    }
}

