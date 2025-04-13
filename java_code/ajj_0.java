/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from ajj
 */
class ajj_0
extends WindowAdapter {
    final /* synthetic */ ajh_0 a;

    ajj_0(ajh_0 ajh_02) {
        this.a = ajh_02;
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        if (this.a.n != null) {
            this.a.n.a(true);
        }
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        if (this.a.n != null) {
            this.a.n.a(false);
        }
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        if (this.a.n != null) {
            this.a.n.z();
        }
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        if (this.a.n != null) {
            this.a.n.b(false);
        }
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        if (this.a.n != null) {
            this.a.n.b(true);
        }
    }
}

