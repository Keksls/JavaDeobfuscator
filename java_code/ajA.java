/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ajA
implements ActionListener {
    final /* synthetic */ ajx_0 a;

    ajA(ajx_0 ajx_02) {
        this.a = ajx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.c != null) {
            this.a.c.o_();
        } else {
            System.exit(0);
        }
    }
}

