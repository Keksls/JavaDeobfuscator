/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cdW
 */
class cdw_2
implements ItemListener {
    final /* synthetic */ cdv_2 a;

    cdw_2(cdv_2 cdv_22) {
        this.a = cdv_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (fta_0.getInstance().isVisible() == this.a.a.isSelected()) {
            return;
        }
        fta_0.getInstance().setVisible(this.a.a.isSelected());
    }
}

