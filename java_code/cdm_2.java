/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cdM
 */
class cdm_2
implements ItemListener {
    final /* synthetic */ cdf_2 a;

    cdm_2(cdf_2 cdf_22) {
        this.a = cdf_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl = itemEvent.getStateChange() == 1;
        this.a.p.b(!bl);
    }
}

