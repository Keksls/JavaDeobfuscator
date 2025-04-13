/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLU
 */
public class blu_0
implements ajh_1 {
    private static final Logger h = Logger.getLogger(blu_0.class);
    public static final String a = "notifications";
    public static final String b = "mustDisplay";
    private static final String[] i = new String[]{"notifications", "mustDisplay"};
    private final List<blv_0> j = new ArrayList<blv_0>();
    private final Map<blv_0, Long> k = new HashMap<blv_0, Long>();
    private final Map<blv_0, List<fjk_2<blv_0>>> l = new HashMap<blv_0, List<fjk_2<blv_0>>>();
    private static final float m = 0.9f;
    private static final float n = 1.0f;
    private static final float o = 1.0f;
    private static final long p = 30L;
    protected final Runnable d = () -> fpm_0.b().o("notificationDialog");
    public final Runnable e = this::e;
    public boolean f = false;
    public fvk_0 g;
    private boolean q = false;

    @Override
    public String[] d() {
        return i;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "notifications": {
                return this.h();
            }
            case "mustDisplay": {
                return this.a();
            }
        }
        return null;
    }

    public void a(blv_0 blv_02) {
        if (blv_02 == null) {
            return;
        }
        this.k.put(blv_02, System.currentTimeMillis());
        this.e(blv_02);
    }

    public boolean a() {
        return this.j.size() > 0;
    }

    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        ado_1.a().a(this.e, 30L);
    }

    public void c() {
        if (!this.f) {
            return;
        }
        this.f = false;
        ado_1.a().b(this.e);
    }

    public void b(blv_0 blv_02) {
        this.j.add(0, blv_02);
        this.a(blv_02);
    }

    private Collection<blv_0> h() {
        return this.j;
    }

    public boolean c(blv_0 blv_02) {
        if (blv_02 == null) {
            return false;
        }
        this.k.remove(blv_02);
        return this.j.removeIf(blv_03 -> blv_03.equals(blv_02));
    }

    public void e() {
        long l = System.currentTimeMillis();
        for (blv_0 blv_02 : new HashSet<blv_0>(this.k.keySet())) {
            Long l2 = this.k.get(blv_02);
            if (l2 + (long)blv_02.i() < l) {
                this.f(blv_02);
                continue;
            }
            if (l2 + (long)blv_02.g() >= l || this.d(blv_02)) continue;
            h.warn((Object)("[NOTIFICATION] Cannot start fade out on view " + blv_02.f()));
        }
        if (this.q) {
            fis_1.a().a((ajf_1)this, a, b);
            this.q = false;
        }
        if (!this.a()) {
            this.c();
        }
    }

    public void f() {
        if (!fpm_0.b().q("notificationDialog")) {
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("notificationDialog", cfi_0.a("notificationDialog"), 40977L, (short)30001);
            this.a(fvk_02);
        } else {
            fis_1.a().a((ajf_1)this, a, b);
        }
        fza_0.a().j();
        this.b();
        ado_1.a().b(this.d);
        fpm_0.b().a("wakfu.notification", cIf.class);
    }

    public void g() {
        if (this.a()) {
            this.q = true;
            this.b();
            return;
        }
        ado_1.a().a(this.d, 2000L, 1);
        this.c();
        fis_1.a().a((ajf_1)this, a, b);
    }

    private boolean d(blv_0 blv_02) {
        if (this.g == null) {
            return false;
        }
        if (this.l.containsKey(blv_02)) {
            return true;
        }
        fyy_0 fyy_02 = this.g.getElementMap();
        if (fyy_02 == null) {
            return false;
        }
        ArrayList<fyy_0> arrayList = fyy_02.d();
        if (arrayList == null) {
            return false;
        }
        for (fyy_0 fyy_03 : arrayList) {
            fyb_0 fyb_02 = fyy_03.a(blv_02.f());
            if (!(fyb_02 instanceof fso)) continue;
            fso fso2 = (fso)fyb_02;
            this.q = true;
            if (fso2.hasTweensOfType(fjk_2.class)) {
                return true;
            }
            this.a(blv_02, fso2, 3, fso2);
            return true;
        }
        return false;
    }

    private static float a(fvE fvE2) {
        if (fvE2 == null) {
            return 0.0f;
        }
        if (fvE2 instanceof fru_0) {
            return 1.0f;
        }
        if (fvE2 instanceof fso) {
            return 0.9f;
        }
        if (fvE2 instanceof fuk_0) {
            return 1.0f;
        }
        return 1.0f;
    }

    private void a(blv_0 blv_03, fvE fvE3, int n, fso fso2) {
        if (fvE3 == null || blv_03 == null) {
            return;
        }
        azj_2 azj_22 = fvE3.getAppearance().getModulationColor();
        float f2 = azj_22 != null ? azj_22.p() : blu_0.a(fvE3);
        fjk_2<blv_0> fjk_22 = new fjk_2<blv_0>(f2, fvE3, blv_03.h(), fso2, blv_03);
        if (fso2 != null) {
            fjk_22.a(this::f);
        }
        fvE3.addTween(fjk_22);
        this.l.computeIfAbsent(blv_03, blv_02 -> new ArrayList()).add(fjk_22);
        if (!(fvE3 instanceof fso) || n <= 0) {
            return;
        }
        ((fso)fvE3).getWidgetChildren().forEach(fvE2 -> this.a(blv_03, (fvE)fvE2, n - 1, null));
    }

    private void e(blv_0 blv_02) {
        if (!this.l.containsKey(blv_02)) {
            return;
        }
        this.l.get(blv_02).forEach(fjk_2::b);
        this.l.remove(blv_02);
    }

    private void f(blv_0 blv_02) {
        this.k.remove(blv_02);
        this.j.remove(blv_02);
        this.l.remove(blv_02);
        blv_02.c();
        blv_02.e();
        this.q = true;
        this.g();
    }

    public void a(fvk_0 fvk_02) {
        if (this.g != null) {
            this.g.removeTweensOfType(fjk_2.class);
        }
        this.g = fvk_02;
    }
}

