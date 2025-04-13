/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from fJM
 */
public class fjm_1 {
    private static final fjm_1 a = new fjm_1();
    private final ArrayList<fkb_1> b = new ArrayList();

    public static fjm_1 a() {
        return a;
    }

    public void a(fkb_1 fkb_12) {
        if (!this.b.contains(fkb_12)) {
            this.b.add(fkb_12);
        }
    }

    public void b(fkb_1 fkb_12) {
        if (this.b.contains(fkb_12)) {
            this.b.remove(fkb_12);
        }
    }

    public void b() {
        for (fkb_1 fkb_12 : this.b) {
            fkb_12.b();
        }
    }

    public void a(fyX fyX2, int n, int n2) {
        if (fyX2 == null || n == 0 && n2 == 0) {
            return;
        }
        fbf_2.a().a(fyX2, n, n2);
        float f2 = fyX2.E();
        float f3 = fyX2.F();
        float f4 = f2 - (float)n;
        float f5 = f3 - (float)n2;
        Iterator<fyb_0> iterator = fpm_0.b().t();
        while (iterator.hasNext()) {
            fvk_0 fvk_02;
            fid_1 fid_12;
            fvE fvE2;
            fyb_0 fyb_02 = iterator.next();
            if (!(fyb_02 instanceof fvE) || !((fvE2 = (fvE)fyb_02).getLayoutData() instanceof fid_1) || !(fid_12 = (fid_1)fvE2.getLayoutData()).isInitValue() || fvE2 instanceof fvk_0 && (fvk_02 = (fvk_0)fvE2).getStickData() != null) continue;
            int n3 = fvE2.getWidth();
            int n4 = fvE2.getHeight();
            int n5 = (int)((f2 - (float)n3) * fvE2.getXPercInParent());
            int n6 = (int)((f3 - (float)n4) * fvE2.getYPercInParent());
            n5 = Hw.a(n5, 0, (int)(f2 - (float)n3));
            n6 = Hw.a(n6, 0, (int)(f3 - (float)n4));
            fvE2.setPosition(n5, n6, 0, false, false);
        }
    }
}

