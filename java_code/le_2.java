/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LE
 */
public class le_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final int[] b = new int[2];
    private boolean c;
    private boolean d;
    private boolean e;
    private byte f;
    private int g = 1;
    private int h = 771;

    @Override
    public kj_1 b() {
        return this.a;
    }

    public int[] a() {
        return this.b;
    }

    public void a(int n, int n2) {
        this.b[0] = n;
        this.b[1] = n2;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean d() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public boolean e() {
        return this.e;
    }

    public void c(boolean bl) {
        this.e = bl;
    }

    public byte f() {
        return this.f;
    }

    public void a(byte by) {
        this.f = by;
    }

    public int g() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
    }

    public int h() {
        return this.h;
    }

    public void b(int n) {
        this.h = n;
    }

    public String toString() {
        return "EditableParticleSystem{" + this.a + ", m_duration=" + Arrays.toString(this.b) + ", m_geocentric=" + this.c + ", m_behindMobile=" + this.d + ", m_mustApplyNightColor=" + this.e + ", m_sortRadius=" + this.f + ", m_srcBlend=" + this.g + ", m_dstBlend=" + this.h + "}";
    }
}

