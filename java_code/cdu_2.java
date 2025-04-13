/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from cdU
 */
class cdu_2
extends ComponentAdapter {
    final /* synthetic */ cdt_2 a;

    cdu_2(cdt_2 cdt_22) {
        this.a = cdt_22;
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        this.a.a.a.setSelected(false);
    }
}

