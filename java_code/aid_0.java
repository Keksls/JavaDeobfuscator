/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

/*
 * Renamed from aid
 */
class aid_0
implements Runnable {
    final /* synthetic */ aic_0 a;

    aid_0(aic_0 aic_02) {
        this.a = aic_02;
    }

    @Override
    public void run() {
        this.a.g = new JFrame("PSys Debug");
        this.a.h = new aib_0();
        this.a.g.setContentPane(this.a.h.b());
        this.a.g.setDefaultCloseOperation(3);
        this.a.g.setSize(300, 600);
        this.a.g.setVisible(true);
        ado_1.a().a(new aie_0(this), 1000L, -1);
    }
}

