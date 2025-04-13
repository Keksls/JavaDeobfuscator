/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Lx
 */
public class lx_2
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
    private String i = "Particles System";
    private String j = "";
    private byte k = (byte)100;
    private byte l = 1;

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

    public String i() {
        return this.i;
    }

    public void a(String string) {
        this.i = string;
    }

    public String j() {
        return this.j;
    }

    public void b(String string) {
        this.j = string;
    }

    public byte k() {
        return this.k;
    }

    public void b(byte by) {
        this.k = by;
    }

    public byte l() {
        return this.l;
    }

    public void c(byte by) {
        this.l = by;
    }

    public String toString() {
        return "EditableParticleSystem{" + this.a + ", m_duration=" + Arrays.toString(this.b) + ", m_geocentric=" + this.c + ", m_behindMobile=" + this.d + ", m_mustApplyNightColor=" + this.e + ", m_sortRadius=" + this.f + ", m_srcBlend=" + this.g + ", m_dstBlend=" + this.h + ", m_name='" + this.i + "', m_description='" + this.j + "', m_maxLevel=" + this.k + ", m_currentLevel=" + this.l + "}";
    }
}

