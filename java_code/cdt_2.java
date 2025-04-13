/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from cdT
 */
class cdt_2
implements ItemListener {
    final /* synthetic */ cdr_2 a;

    cdt_2(cdr_2 cdr_22) {
        this.a = cdr_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl = itemEvent.getStateChange() == 1;
        cbt_1.a.a(bl ? this.a.b : null);
        if (bl) {
            if (this.a.c == null) {
                this.a.c = cdf_2.a(this.a.b, false);
            }
            this.a.c.addComponentListener(new cdu_2(this));
            this.a.c.setVisible(true);
            this.a.c.setLocation(this.a.a.getLocationOnScreen());
        } else {
            this.a.c.b();
        }
    }
}

