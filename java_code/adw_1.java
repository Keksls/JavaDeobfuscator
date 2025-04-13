/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aDW
 */
public final class adw_1 {
    public static final adw_1 a = new adw_1();
    protected static final Logger b = Logger.getLogger(adw_1.class);
    private final Object c = new Object();
    private final TIntObjectHashMap<ady_1> d = new TIntObjectHashMap();

    private adw_1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(adv_2 adv_22) {
        if (adv_22 == null) {
            return;
        }
        Object object = this.c;
        synchronized (object) {
            int n = adv_22.a();
            ady_1 ady_12 = (ady_1)this.d.get(n);
            if (ady_12 == null) {
                ady_12 = new ady_1(n);
                this.d.put(n, (Object)ady_12);
            } else {
                ++ady_12.b;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(adv_2 adv_22) {
        if (adv_22 == null) {
            return;
        }
        Object object = this.c;
        synchronized (object) {
            int n = adv_22.a();
            ady_1 ady_12 = (ady_1)this.d.get(n);
            if (ady_12 != null) {
                ArrayList<Runnable> arrayList = ady_12.a();
                if (ady_12.b <= 0) {
                    this.d.remove(n);
                    this.b(arrayList);
                    this.a(arrayList);
                } else {
                    --ady_12.b;
                }
            }
        }
    }

    private void a(ArrayList<Runnable> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Runnable runnable = arrayList.get(k);
            if (runnable == null) continue;
            ado_1.a().a(runnable);
        }
    }

    private void b(ArrayList<Runnable> arrayList) {
        if (!this.d.isEmpty()) {
            this.d.forEachEntry((TIntObjectProcedure)new adx_2(this, arrayList));
        }
    }

    public void a(Runnable runnable, adv_2 ... adv_2Array) {
        if (adv_2Array == null) {
            return;
        }
        if (runnable == null) {
            return;
        }
        boolean bl = false;
        for (adv_2 adv_22 : adv_2Array) {
            int n = adv_22.a();
            ady_1 ady_12 = (ady_1)this.d.get(n);
            if (ady_12 == null) continue;
            bl = true;
            ady_12.b(runnable);
        }
        if (!bl) {
            runnable.run();
        }
    }
}

