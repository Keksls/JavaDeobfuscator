/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ahU
 */
public class ahu_0
implements ahh_0 {
    private static final Logger a = Logger.getLogger(ahu_0.class);
    private final ahh_0 b;
    private final tg_0 c;
    private final ArrayList<ahh_0> d = new ArrayList();
    private final TIntArrayList e = new TIntArrayList();

    public ahu_0(ahh_0 ahh_02, tg_0 tg_02) {
        this.b = ahh_02;
        this.c = tg_02;
    }

    public void a() {
        this.d.clear();
        this.e.clear();
    }

    public void a(ahh_0 ahh_02, int n) {
        if (!this.d.contains(ahh_02)) {
            this.d.add(ahh_02);
            this.e.add(n);
        }
    }

    public int b() {
        return this.d.size();
    }

    @Override
    public float aj() {
        return 0.0f;
    }

    @Override
    public short I() {
        return (short)Hw.c(this.L());
    }

    @Override
    public float L() {
        int n = this.d.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int k = 0; k < n; ++k) {
            if (!this.a(this.d.get(k))) continue;
            int n3 = this.e.get(k);
            f2 += this.d.get(k).L() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            a.error((Object)"Aucune target d\u00e9finie");
            return this.b.L();
        }
        return f2 / (float)n2;
    }

    @Override
    public int G() {
        return Hw.b(this.J());
    }

    @Override
    public int H() {
        return Hw.b(this.K());
    }

    @Override
    public float J() {
        int n = this.d.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int k = 0; k < n; ++k) {
            if (!this.a(this.d.get(k))) continue;
            int n3 = this.e.get(k);
            f2 += this.d.get(k).J() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            a.error((Object)"Aucune target d\u00e9finie");
            return this.b.J();
        }
        return f2 / (float)n2;
    }

    @Override
    public float K() {
        int n = this.d.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int k = 0; k < n; ++k) {
            if (!this.a(this.d.get(k))) continue;
            int n3 = this.e.get(k);
            f2 += this.d.get(k).K() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            a.error((Object)"Aucune target d\u00e9finie");
            return this.b.K();
        }
        return f2 / (float)n2;
    }

    @Override
    public void b(float f2, float f3) {
    }

    @Override
    public void b(float f2, float f3, float f4) {
    }

    @Override
    public boolean at() {
        return true;
    }

    private boolean a(ahh_0 ahh_02) {
        return this.c == null || this.c.o(ahh_02.G(), ahh_02.H());
    }
}

