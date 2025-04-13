/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class btZ {
    private static final String a = "event.client.";
    private final int b;
    private final int c;
    private final String[] d;
    private final apc_2 e;
    private final int f;
    private final int g;
    private final boolean h;
    private boolean i;
    private final fat<bui_1> j;

    public btZ(int n, int n2, String[] stringArray, apc_2 apc_22, int n3, int n4, boolean bl) {
        this.b = n;
        this.c = n2;
        this.d = stringArray;
        this.e = apc_22;
        this.f = n3;
        this.g = n4;
        this.i = bl;
        this.h = bl;
        this.j = new fat();
    }

    public void a(bvi_2 bvi_22) {
        int n;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        Object CPS = ((bvx_0)ans_0.D().h()).f();
        if (this.g > 0 && CPS != null && (n = CPS.q(a + this.b)) >= this.g) {
            return;
        }
        if (this.e != null && !this.e.b(bmr_12, null, bvi_22, bmr_12.Q_())) {
            return;
        }
        n = xc_0.a(100);
        if (n > this.f) {
            return;
        }
        bui_1 bui_12 = this.j.a(bmr_12, null, (Object)bvi_22, bmr_12.Q_());
        if (bui_12 != null) {
            ArrayList<bue_0> arrayList = bui_12.b();
            int n2 = arrayList.size();
            for (int k = 0; k < n2; ++k) {
                arrayList.get(k).a();
            }
        }
        if (this.g > 0 && CPS != null) {
            int n3 = CPS.q(a + this.b);
            CPS.a(a + this.b, n3 + 1);
        }
    }

    public fat<bui_1> a() {
        return this.j;
    }

    public void a(bui_1 bui_12) {
        this.j.a(bui_12);
    }

    public int b() {
        return this.c;
    }

    public String[] c() {
        return this.d;
    }

    public apc_2 d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public int f() {
        return this.b;
    }

    public boolean g() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public void h() {
        this.i = this.h;
    }
}

