/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.awt.event.KeyEvent;

public class fzK {
    private static final fzK a = new fzK();
    private final TIntObjectHashMap<KeyEvent> b = new TIntObjectHashMap();

    private fzK() {
    }

    public static fzK a() {
        return a;
    }

    public boolean a(int n) {
        return this.b.containsKey(n);
    }

    public void a(KeyEvent keyEvent) {
        this.b.put(keyEvent.getKeyCode(), (Object)keyEvent);
    }

    public void b(KeyEvent keyEvent) {
        this.b.remove(keyEvent.getKeyCode());
    }
}

