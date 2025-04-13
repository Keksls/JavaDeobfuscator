/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from anm
 */
public class anm_1
implements anb_0,
anc_0 {
    private static final Logger b = Logger.getLogger(anm_1.class);
    private boolean c;
    private long d;
    private byte e = (byte)100;
    private short f = 1;
    private float g = 1.0f;
    private float h = 1.0f;

    public anm_1() {
    }

    public anm_1(arf_1 arf_12) {
        this.a(arf_12);
    }

    public anm_1(boolean bl, long l, byte by, short s2) {
        this(bl, l, by, s2, 1.0f, 1.0f);
    }

    public anm_1(boolean bl, long l, byte by, short s2, float f2, float f3) {
        this.c = bl;
        this.d = l;
        this.e = by;
        this.f = s2;
        this.g = f2;
        this.h = f3;
    }

    @Override
    public void a(aty_1 aty_12) {
        if (!ann_2.a(aty_12, this.d)) {
            return;
        }
        if (!ann_2.a(this.d)) {
            return;
        }
        ann_2.a(aty_12, this.d, (float)this.e, this.i(), this.f, this.c);
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.d = arf_12.j();
        this.e = arf_12.a();
        this.c = arf_12.l();
        this.f = arf_12.b();
        this.g = arf_12.d();
        this.h = arf_12.d();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.c(this.d);
        gk_02.a(this.e);
        gk_02.a(this.c);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void a(long l) {
        this.d = l;
    }

    public void a(byte by) {
        this.e = by;
    }

    public void a(short s2) {
        this.f = s2;
    }

    public void a(float f2) {
        this.g = f2;
    }

    public void b(float f2) {
        this.h = f2;
    }

    @Override
    public float c() {
        return this.g;
    }

    @Override
    public float d() {
        return this.h;
    }
}

