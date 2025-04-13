/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ahg
implements ItemListener {
    final /* synthetic */ ahf a;

    ahg(ahf ahf2) {
        this.a = ahf2;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (this.a.a == null) {
            return;
        }
        boolean bl = itemEvent.getStateChange() == 1;
        this.a.a.e().d(bl);
    }
}

