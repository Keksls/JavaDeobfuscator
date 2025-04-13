/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eMY
 */
public class emy_2 {
    private final long a;
    private final short b;
    private final String c;
    private final long d;
    private short e;
    private long f;
    private boolean g;
    private boolean h;
    private long i = 0L;
    private long j = 0L;
    private long k = 0L;
    private final ArrayList<eZn> l = new ArrayList();
    private final ArrayList<eZn> m = new ArrayList();
    private final ArrayList<eZn> n = new ArrayList();
    private final ArrayList<eZn> o = new ArrayList();

    public emy_2(long l, String string, short s2, long l2) {
        this.a = l;
        this.c = string;
        this.b = s2;
        this.d = l2;
    }

    public emy_2(long l, String string, short s2) {
        this(l, string, s2, -1L);
    }

    public emy_2(long l, byte[] byArray, short s2, long l2) {
        this(l, Cz.a(byArray), s2, l2);
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public short d() {
        return this.b;
    }

    public short e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public void a(long l, short s2) {
        this.f = l;
        this.e = s2;
    }

    public boolean g() {
        return this.g;
    }

    public ArrayList<eZn> h() {
        return this.l;
    }

    public ArrayList<eZn> i() {
        return this.m;
    }

    public ArrayList<eZn> j() {
        return this.n;
    }

    public ArrayList<eZn> k() {
        return this.o;
    }

    public long l() {
        return this.i;
    }

    public void a(long l) {
        this.i = l;
    }

    public long m() {
        return this.j;
    }

    public void b(long l) {
        this.j = l;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public void a(eZn eZn2) {
        this.m.add(eZn2);
    }

    public void b(eZn eZn2) {
        this.n.add(eZn2);
    }

    public void c(eZn eZn2) {
        this.o.add(eZn2);
    }

    public void a(int n) {
        this.i += (long)n;
    }

    public void b(int n) {
        this.j += (long)n;
    }

    public boolean n() {
        return this.h;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public long o() {
        return this.k;
    }

    public void c(long l) {
        this.k = l;
    }

    public String toString() {
        return "PlayerFightHistory{m_characterId=" + this.a + ", m_breedId=" + this.b + ", m_name='" + this.c + "', m_companionId=" + this.d + ", m_endLevel=" + this.e + ", m_endXp=" + this.f + ", m_hasWon=" + this.g + ", m_hasFled=" + this.h + ", m_kamas=" + this.i + ", m_taxes=" + this.j + ", m_premiumXp=" + this.k + ", m_lootsDuringFight=" + this.l + ", m_lootsAtEndFight=" + this.m + ", m_canceledLootsAtEndFight=" + this.n + ", m_almostCanceledLoots=" + this.o + "}";
    }
}

