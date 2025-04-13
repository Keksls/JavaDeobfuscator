/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from aji
 */
class aji_0
extends ComponentAdapter {
    final /* synthetic */ ajh_0 a;

    aji_0(ajh_0 ajh_02) {
        this.a = ajh_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        if (this.a.n != null) {
            this.a.n.a(this.a.q());
        }
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        if (this.a.n != null) {
            this.a.n.b(this.a.q());
        }
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        if (this.a.n != null) {
            this.a.n.c(this.a.q());
        }
    }
}

