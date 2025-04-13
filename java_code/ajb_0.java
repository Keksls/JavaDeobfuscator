/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from ajB
 */
class ajb_0
extends MouseAdapter {
    final /* synthetic */ ajx_0 a;

    ajb_0(ajx_0 ajx_02) {
        this.a = ajx_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.a.c.b();
        }
    }
}

