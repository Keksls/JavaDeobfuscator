/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from ZE
 */
public class ze_0
implements adv_1 {
    private static final ze_0 b = new ze_0();
    private final HashMap<ahh_0, ArrayList<zu_0>> c = new HashMap();
    public static final int a = 500;

    private ze_0() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(zu_0 zu_02) {
        boolean bl;
        HashMap<ahh_0, ArrayList<zu_0>> hashMap = this.c;
        synchronized (hashMap) {
            ArrayList<zu_0> arrayList;
            ArrayList<zu_0> arrayList2 = arrayList = this.c.get(zu_02.a());
            synchronized (arrayList2) {
                bl = arrayList.isEmpty();
                arrayList.add(zu_02);
            }
        }
        if (bl) {
            zd_0.a().a(zu_02);
            adi_2.a().a(this, 500L, -1, 1L);
        }
    }

    public static ze_0 a() {
        return b;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(adt_1 adt_12) {
        HashMap<ahh_0, ArrayList<zu_0>> hashMap = this.c;
        synchronized (hashMap) {
            for (Map.Entry<ahh_0, ArrayList<zu_0>> entry : this.c.entrySet()) {
                ArrayList<zu_0> arrayList;
                zu_0 zu_02 = null;
                ArrayList<zu_0> arrayList2 = arrayList = entry.getValue();
                synchronized (arrayList2) {
                    if (!arrayList.isEmpty()) {
                        zu_02 = arrayList.remove(0);
                    }
                    if (!arrayList.isEmpty()) {
                        adi_2.a().a(this, 500L, -1, 1L);
                    } else {
                        this.c.remove(entry.getKey());
                    }
                }
                if (zu_02 == null) continue;
                zd_0.a().a(zu_02);
            }
        }
        return false;
    }
}

