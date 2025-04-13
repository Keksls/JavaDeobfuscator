/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

class cWl
implements aei_1 {
    final /* synthetic */ cwi_0 a;

    cWl(cwi_0 cwi_02) {
        this.a = cwi_02;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 32) {
            this.a.e();
            return true;
        }
        if (keyEvent.getKeyCode() == 27) {
            if (this.a.g.a()) {
                fpm_0.b().o("blindBoxDialog");
            } else {
                this.a.c();
            }
            return true;
        }
        return false;
    }
}

