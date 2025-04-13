/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cWL
 */
class cwl_0
implements Runnable {
    final /* synthetic */ fso a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ cwk_0 c;

    cwl_0(cwk_0 cwk_02, fso fso2, ArrayList arrayList) {
        this.c = cwk_02;
        this.a = fso2;
        this.b = arrayList;
    }

    @Override
    public void run() {
        cdw_0.n().a(600012L, false, 600);
        if (this.c.m == Integer.MIN_VALUE) {
            this.c.m = this.a.getY() - 100;
        }
        this.a.setY(this.c.m);
        this.a.setVisible(true);
        fjq_2 fjq_22 = new fjq_2(this.a.getX(), this.a.getY(), this.a.getX(), this.a.getY() + 100, this.a, 0, 750, fjw_2.b);
        fjo_2 fjo_22 = new fjo_2(azf_2.b, azf_2.e, this.b, 0, 500, 1, fjw_2.b);
        fjo_22.a(new cwm_0(this, fjo_22));
        this.a.addTween(fjq_22);
        this.a.addTween(fjo_22);
        this.c.q();
        this.c.c(0L);
    }
}

