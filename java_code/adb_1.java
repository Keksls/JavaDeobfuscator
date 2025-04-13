/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from aDb
 */
public final class adb_1 {
    private static final adb_1 a = new adb_1();
    private final ArrayList<adh_1> b = new ArrayList();
    private final Lock c = new ReentrantLock();

    public static adb_1 a() {
        return a;
    }

    private adb_1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(acx_1 acx_12, Object object, List list, Object ... objectArray) {
        byte[] byArray = acx_12.b(object, list, objectArray);
        long l = System.currentTimeMillis();
        if (byArray == null || byArray.length == 0) {
            return false;
        }
        this.c.lock();
        try {
            for (adh_1 adh_12 : this.b) {
                acx_1[] acx_1Array = adh_12.a();
                boolean bl = true;
                if (acx_1Array != null) {
                    for (acx_1 acx_13 : acx_1Array) {
                        if (acx_13 != acx_12) continue;
                        bl = false;
                        break;
                    }
                } else {
                    acx_1[] acx_1Array2 = adh_12.b();
                    if (acx_1Array2 != null) {
                        bl = false;
                        for (acx_1 acx_14 : acx_1Array2) {
                            if (acx_14 != acx_12) continue;
                            bl = true;
                            break;
                        }
                    }
                }
                if (!bl) continue;
                adh_12.a(l, byArray);
            }
        }
        finally {
            this.c.unlock();
        }
        return true;
    }

    public void a(adh_1 adh_12) {
        if (adh_12 != null) {
            this.c.lock();
            try {
                if (!this.b.contains(adh_12)) {
                    this.b.add(adh_12);
                }
            }
            finally {
                this.c.unlock();
            }
        }
    }

    public void b(adh_1 adh_12) {
        if (adh_12 != null) {
            this.c.lock();
            try {
                this.b.remove(adh_12);
            }
            finally {
                this.c.unlock();
            }
        }
    }
}

