/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from aiX
 */
public class aix_0
implements ahk_0 {
    private static final aix_0 a = new aix_0();
    private final ArrayList<aiv_0> b = new ArrayList();

    public static aix_0 a() {
        return a;
    }

    public void a(aiv_0 aiv_02) {
        this.b.add(aiv_02);
    }

    public void a(ahg_0 ahg_02, int n) {
        int n2 = this.b.size();
        for (int k = 0; k < n2; ++k) {
            this.b.get(k).a(n);
        }
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
        Iterator<aiv_0> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            aiv_0 aiv_02 = iterator.next();
            if (!aiv_02.g()) continue;
            iterator.remove();
        }
    }
}

