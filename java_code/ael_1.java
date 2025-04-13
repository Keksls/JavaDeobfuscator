/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * Renamed from aEl
 */
class ael_1
implements ActionListener {
    private final KeyEvent c;
    private Timer d;
    static final /* synthetic */ boolean a;
    final /* synthetic */ aek_1 b;

    ael_1(aek_1 aek_12, KeyEvent keyEvent, Timer timer) {
        this.b = aek_12;
        this.d = timer;
        this.c = keyEvent;
    }

    void a() {
        if (!a && !aek_1.c()) {
            throw new AssertionError();
        }
        this.d.stop();
        this.d = null;
        this.b.c.remove(this.c.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!a && !aek_1.c()) {
            throw new AssertionError();
        }
        if (this.d == null) {
            return;
        }
        this.a();
        aen_1 aen_12 = new aen_1((Component)this.c.getSource(), this.c.getID(), this.c.getWhen(), this.c.getModifiers(), this.c.getKeyCode(), this.c.getKeyChar(), this.c.getKeyLocation());
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(aen_12);
    }

    static {
        a = !aek_1.class.desiredAssertionStatus();
    }
}

