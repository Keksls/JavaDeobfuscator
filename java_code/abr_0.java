/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Renamed from abR
 */
class abr_0
implements Runnable {
    final /* synthetic */ abq_0 a;

    abr_0(abq_0 abq_02) {
        this.a = abq_02;
    }

    @Override
    public void run() {
        this.a.c = new JFrame("Debug ANM");
        this.a.c.setContentPane(new JPanel());
        this.a.c.setDefaultCloseOperation(3);
        this.a.c.setSize(640, 480);
        this.a.c.setVisible(true);
    }
}

