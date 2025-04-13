/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from cZY
 */
class czy_0
implements aei_1 {
    final /* synthetic */ cZW a;

    czy_0(cZW cZW2) {
        this.a = cZW2;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 27) {
            if (this.a.i && this.a.e.h()) {
                cHv.selectChoice(null, this.a.e.e().get(0));
            } else {
                this.a.f();
            }
        }
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return false;
    }
}

