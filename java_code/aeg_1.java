/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.awt.event.KeyEvent;

/*
 * Renamed from aEg
 */
public class aeg_1
implements aei_1 {
    private final Table<Integer, Integer, Runnable> a = HashBasedTable.create();

    public void a(int n, int n2, Runnable runnable) {
        this.a.put((Object)n, (Object)n2, (Object)runnable);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return this.a(401, keyEvent);
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return this.a(402, keyEvent);
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return this.a(400, keyEvent);
    }

    public boolean a(int n, KeyEvent keyEvent) {
        Runnable runnable = (Runnable)this.a.get((Object)n, (Object)keyEvent.getKeyCode());
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }
}

