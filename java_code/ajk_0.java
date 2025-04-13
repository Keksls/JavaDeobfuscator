/*
 * Decompiled with CFR 0.152.
 */
import java.awt.desktop.AppForegroundEvent;
import java.awt.desktop.AppForegroundListener;

/*
 * Renamed from ajk
 */
class ajk_0
implements AppForegroundListener {
    final /* synthetic */ ajh_0 a;

    ajk_0(ajh_0 ajh_02) {
        this.a = ajh_02;
    }

    @Override
    public void appRaisedToForeground(AppForegroundEvent appForegroundEvent) {
        if (this.a.n != null) {
            this.a.n.b(true);
        }
    }

    @Override
    public void appMovedToBackground(AppForegroundEvent appForegroundEvent) {
        if (this.a.n != null) {
            this.a.n.b(false);
        }
    }
}

