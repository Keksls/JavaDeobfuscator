/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.openal.EFX10
 */
import gnu.trove.list.array.TLongArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.openal.EFX10;

/*
 * Renamed from aMo
 */
public class amo_1 {
    private static final Logger a = Logger.getLogger(amo_1.class);
    private static final int b = 500;
    private final ams_1 c;
    private final int d;
    private final int[] e = new int[]{0};
    private final float f;
    private final float g;
    private final TLongArrayList h = new TLongArrayList();
    float i;
    float j;
    private boolean k;
    private amq_1 l;

    public amo_1(float f2, float f3, int n, @NotNull ams_1 ams_12, boolean bl) {
        this.c = ams_12;
        this.d = n;
        this.k = bl;
        this.f = f2;
        this.g = f3;
        this.i = this.k ? 1.0f : f2;
        this.j = this.k ? 1.0f : f3;
    }

    public void a() {
        this.e[0] = EFX10.alGenFilters();
        amo_1 amo_12 = this;
        amo_12.c.f();
        EFX10.alFilteri((int)this.e[0], (int)32769, (int)1);
        amo_1 amo_13 = this;
        amo_13.c.f();
        this.a(this.i, this.j);
    }

    public void b() {
        if (this.e[0] != 0) {
            amo_1 amo_12 = this;
            amo_12.c.f();
            EFX10.alDeleteFilters((int)this.e[0]);
            amo_1 amo_13 = this;
            amo_13.c.f();
            this.e[0] = 0;
        }
    }

    public void a(boolean bl) {
        if (this.k == bl) {
            return;
        }
        this.k = bl;
        this.l = this.k ? new amq_1(this, 1.0f, 1.0f, 500) : new amq_1(this, this.f, this.g, 500);
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e[0];
    }

    public void a(long l) {
        if (this.l != null && !this.l.a(l)) {
            this.l = null;
        }
    }

    void a(float f2, float f3) {
        EFX10.alFilterf((int)this.e[0], (int)1, (float)f2);
        amo_1 amo_12 = this;
        amo_12.c.f();
        EFX10.alFilterf((int)this.e[0], (int)2, (float)f3);
        amo_1 amo_13 = this;
        amo_13.c.f();
        for (int k = this.h.size() - 1; k >= 0; --k) {
            this.d(this.h.get(k));
        }
    }

    private void d(long l) {
        amj_1 amj_12 = aml_1.a().b(l);
        if (amj_12 != null) {
            amj_12.c(this.e[0]);
        }
    }

    public void b(long l) {
        if (!this.h.contains(l)) {
            this.h.add(l);
            this.d(l);
        }
    }

    public void c(long l) {
        ahx_2.a(this.h, l);
        if (this.h.isEmpty()) {
            this.e();
        }
    }

    private void e() {
        if (this.c != null) {
            this.c.c(this.d);
        }
    }
}

