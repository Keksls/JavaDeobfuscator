/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from cdG
 */
class cdg_2
extends WindowAdapter {
    final /* synthetic */ cdf_2 a;

    cdg_2(cdf_2 cdf_22) {
        this.a = cdf_22;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.a.d();
    }
}

