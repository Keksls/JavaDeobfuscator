/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cdB
 */
class cdb_2
implements ItemListener {
    final /* synthetic */ cda_2 a;

    cdb_2(cda_2 cda_22) {
        this.a = cda_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        aik_0.a().a(itemEvent.getStateChange() == 1);
    }
}

