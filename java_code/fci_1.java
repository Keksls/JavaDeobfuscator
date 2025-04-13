/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fCi
 */
public class fci_1
extends fcf_1 {
    private final ArrayList<azj_2> a = new ArrayList();
    private final float[] f = new float[4];
    private int g;
    private int h;
    private final fjw_2 i = fjw_2.b;

    public void c(azj_2 azj_22) {
        this.a.add(azj_22);
    }

    public void a(int n) {
        this.h = n;
    }

    public int d() {
        return this.h;
    }

    public void b(int n) {
        if (this.a.size() < 2) {
            return;
        }
        this.g += n;
        if (this.g >= this.h) {
            this.g = 0;
            this.a.add(this.a.remove(0));
        }
        azj_2 azj_22 = this.a.get(0);
        azj_2 azj_23 = this.a.get(1);
        this.f[0] = this.i.a(azj_22.q(), azj_23.q(), this.g, this.h);
        this.f[1] = this.i.a(azj_22.r(), azj_23.r(), this.g, this.h);
        this.f[2] = this.i.a(azj_22.s(), azj_23.s(), this.g, this.h);
        this.f[3] = this.i.a(azj_22.p(), azj_23.p(), this.g, this.h);
        this.a(this.f);
    }

    @Override
    public void h() {
        super.h();
        this.a.clear();
    }
}

