/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

/*
 * Renamed from aAp
 */
class aap_1
implements Runnable {
    final /* synthetic */ aao_1 a;

    aap_1(aao_1 aao_12) {
        this.a = aao_12;
    }

    @Override
    public void run() {
        this.a.b = new JFrame("GL Debug view");
        this.a.b.setSize(400, 600);
        this.a.b.setDefaultCloseOperation(3);
        this.a.c.c();
        this.a.b.setContentPane(this.a.c.b());
        this.a.b.setVisible(true);
    }
}

