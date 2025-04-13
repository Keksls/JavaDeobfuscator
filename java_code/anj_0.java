/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from anj
 */
public class anj_0
implements anb_0,
anc_0 {
    private static final Logger b = Logger.getLogger(anj_0.class);
    private int c;
    private boolean d;
    private long e;
    private byte f = (byte)100;
    private short g = 1;
    private float h = 1.0f;
    private float i = 1.0f;

    public anj_0() {
    }

    public anj_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public anj_0(int n, boolean bl, long l, byte by, short s2) {
        this.c = n;
        this.d = bl;
        this.e = l;
        this.f = by;
        this.g = s2;
    }

    public anj_0(int n, boolean bl, long l, byte by, short s2, float f2, float f3) {
        this.c = n;
        this.d = bl;
        this.e = l;
        this.f = by;
        this.g = s2;
        this.h = f2;
        this.i = f3;
    }

    @Override
    public void a(aty_1 aty_12) {
        if (!ann_2.a(aty_12, this.e)) {
            return;
        }
        if (!ann_2.a(this.e)) {
            return;
        }
        ann_2.a(aty_12, this.e, this.f, this.i(), this.g, this.c, this.d);
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.e = arf_12.j();
        this.f = arf_12.a();
        this.c = arf_12.c();
        this.d = arf_12.l();
        this.g = arf_12.b();
        this.h = arf_12.d();
        this.i = arf_12.d();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.c(this.e);
        gk_02.a(this.f);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
    }

    public void a(int n) {
        this.c = n;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void a(long l) {
        this.e = l;
    }

    public void a(byte by) {
        this.f = by;
    }

    public void a(short s2) {
        this.g = s2;
    }

    public void a(float f2) {
        this.h = f2;
    }

    public void b(float f2) {
        this.i = f2;
    }

    @Override
    public float c() {
        return this.h;
    }

    @Override
    public float d() {
        return this.i;
    }
}

