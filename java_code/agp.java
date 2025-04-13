/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

class agp
implements Runnable {
    final /* synthetic */ ago a;

    agp(ago ago2) {
        this.a = ago2;
    }

    @Override
    public void run() {
        this.a.c = new JFrame("RenderTree Debug");
        this.a.d = new agr();
        this.a.c.setContentPane(this.a.d.a());
        this.a.c.setDefaultCloseOperation(3);
        this.a.c.setSize(300, 600);
        this.a.c.setVisible(true);
        ado_1.a().a(new agq(this), 2000L, -1);
    }
}

