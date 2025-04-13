/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Timer;

/*
 * Renamed from aEk
 */
public class aek_1
implements AWTEventListener {
    private static aek_1 b;
    final Map<Integer, ael_1> c = new HashMap<Integer, ael_1>();

    public static void a() {
        b = new aek_1();
        Toolkit.getDefaultToolkit().addAWTEventListener(b, 8L);
    }

    public static void b() {
        Toolkit.getDefaultToolkit().removeAWTEventListener(b);
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        assert (aWTEvent instanceof KeyEvent) : "Shall only listen to KeyEvents, so no other events shall come here";
        assert (aek_1.c());
        if (aWTEvent instanceof aem_1) {
            return;
        }
        if (aWTEvent.getID() == 400) {
            return;
        }
        KeyEvent keyEvent = (KeyEvent)aWTEvent;
        if (keyEvent.isConsumed()) {
            return;
        }
        if (keyEvent.getID() == 402) {
            Timer timer = new Timer(2, null);
            ael_1 ael_12 = new ael_1(this, keyEvent, timer);
            timer.addActionListener(ael_12);
            timer.start();
            this.c.put(keyEvent.getKeyCode(), ael_12);
            keyEvent.consume();
        } else if (keyEvent.getID() == 401) {
            ael_1 ael_13 = this.c.remove(keyEvent.getKeyCode());
            if (ael_13 != null) {
                ael_13.a();
            }
        } else {
            throw new AssertionError((Object)"All IDs should be covered.");
        }
    }

    static boolean c() {
        if (!EventQueue.isDispatchThread()) {
            throw new AssertionError((Object)("Not EDT, but [" + Thread.currentThread() + "]."));
        }
        return true;
    }
}

