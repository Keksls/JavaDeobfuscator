/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ahe
implements ItemListener {
    final /* synthetic */ ahd_0 a;

    ahe(ahd_0 ahd_02) {
        this.a = ahd_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        aed.a.a(itemEvent.getStateChange() == 1);
    }
}

