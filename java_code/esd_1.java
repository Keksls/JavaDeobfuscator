/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eSd
 */
public abstract class esd_1<T extends fkn_0>
implements esy_2 {
    private static final Logger a = Logger.getLogger(esd_1.class);
    private final long b;
    private final int c;
    private final short d;
    private final short e;
    private final short f = 0;
    private int g;
    private final fko_0<T> h;
    private T i;

    protected esd_1(fko_0<T> fko_02, long l, int n, int n2, short s2, short s3) {
        this.h = fko_02;
        this.b = l;
        this.c = n;
        this.d = s2;
        this.e = s3;
        this.b(n2);
    }

    protected esd_1(fko_0<T> fko_02, vs_2 vs_22) {
        this(fko_02, vs_22.a.a, vs_22.a.c, vs_22.a.f, vs_22.a.d, vs_22.a.e);
    }

    protected esd_1(fko_0<T> fko_02, ese_1 ese_12) {
        this(fko_02, ese_12.b(), ese_12.a().a(), ese_12.g(), ese_12.d(), ese_12.e());
    }

    @Override
    public boolean b() {
        return this.b <= 0L;
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public int d() {
        return this.c;
    }

    @Override
    public int e() {
        return this.g;
    }

    @Override
    public void b(int n) {
        this.g = n;
        if (!this.h.a()) {
            return;
        }
        this.i = this.h.c(this.f());
        if (this.i == null) {
            a.error((Object)("pas de group d'id " + this.f() + " pour l'objet " + this));
        }
    }

    @Override
    public int f() {
        etw_2 etw_22 = this.g();
        if (etw_22 == null) {
            a.error((Object)("pas de d\u00e9finition de batiment " + this.c));
            return 0;
        }
        return etw_22.a(this.g);
    }

    @Override
    public etw_2 g() {
        return eti_2.a.a((short)this.c);
    }

    @Override
    public short h() {
        return this.d;
    }

    @Override
    public short i() {
        return this.e;
    }

    public String toString() {
        return "EditorGroupInstanceInfo{m_buildingUid=" + this.b + ", m_buildingDefinitionId=" + this.c + ", m_itemId=" + this.g + ", m_cellX=" + this.d + ", m_cellY=" + this.e + "}";
    }

    @Override
    public afk_2 j() {
        if (this.i == null) {
            return null;
        }
        return new afk_2(this.d, this.d + ((fkn_0)this.i).d(), this.e, this.e + ((fkn_0)this.i).e());
    }

    @Override
    public afk_2 k() {
        if (this.i == null) {
            return null;
        }
        return XY.a(this.d, this.e, ((fkn_0)this.i).d(), ((fkn_0)this.i).e());
    }

    public int l() {
        etk_2 etk_22 = this.n();
        if (etk_22 == null) {
            a.error((Object)("pas d' entr\u00e9e pour " + this));
            return -1;
        }
        return etk_22.h();
    }

    @Override
    public final int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        if (this.i == null) {
            return 0;
        }
        short s2 = this.d;
        short s3 = this.e;
        boolean bl = false;
        int n4 = ((fkn_0)this.i).a(n - s2, n2 - s3, ys_0Array, n3);
        for (int k = 0; k < n4; ++k) {
            ys_0Array[n3 + k].a += s2;
            ys_0Array[n3 + k].b += s3;
            ys_0Array[n3 + k].c = (short)(ys_0Array[n3 + k].c + 0);
        }
        return n4;
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        if (this.i == null) {
            return 0;
        }
        short s2 = this.d;
        short s3 = this.e;
        boolean bl = false;
        int n4 = ((fkn_0)this.i).a(n - s2, n2 - s3, yt_0Array, n3);
        for (int k = 0; k < n4; ++k) {
            yt_0Array[n3 + k].a += s2;
            yt_0Array[n3 + k].b += s3;
            yt_0Array[n3 + k].c = (short)(yt_0Array[n3 + k].c + 0);
        }
        return n4;
    }

    @Override
    public boolean a(int n, int n2) {
        if (this.i == null) {
            return false;
        }
        return ((fkn_0)this.i).b(n - this.d, n2 - this.e);
    }

    @Override
    public boolean b(int n, int n2) {
        if (this.i == null) {
            return false;
        }
        return ((fkn_0)this.i).a(n - this.d, n2 - this.e);
    }

    @Override
    public boolean c(int n, int n2) {
        if (this.i == null) {
            return true;
        }
        return ((fkn_0)this.i).d(n - this.d, n2 - this.e);
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (this.i == null) {
            return true;
        }
        return ((fkn_0)this.i).c(n - this.d, n2 - this.e);
    }

    public T m() {
        return this.i;
    }

    @Override
    public boolean d(int n, int n2) {
        if (this.i == null) {
            return false;
        }
        return ((fkn_0)this.i).e(n - this.d, n2 - this.e);
    }

    @Override
    public etk_2 n() {
        return eta_2.a((short)this.c);
    }

    @Override
    public void a(abx_2 abx_22) {
        abx_22.a(this.b);
        abx_22.a((short)this.c);
        abx_22.a(this.g);
        abx_22.a(this.d);
        abx_22.a(this.e);
    }
}

