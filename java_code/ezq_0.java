/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eZQ
 */
public class ezq_0
extends eZR
implements eZS {
    private int d;
    private short e;
    private long f;
    private short g;
    private boolean h;
    private int i;
    @Nullable
    private xn_1 j;
    @Nullable
    private wy_2 k;
    @Nullable
    private yk_1 l;
    @Nullable
    private ua_2 m;
    @Nullable
    private eyc_2 n;
    @Nullable
    private eyj_1 o;
    @Nullable
    private eZo p;

    public ezq_0(exk_2 exk_22, long l, short s2) {
        this.d = exk_22.aT_();
        this.e = exk_22.e();
        this.f = l;
        this.g = s2;
        if (exk_22.aQ_()) {
            this.j = new xn_1();
            exk_22.f().a(this.j);
        }
        if (exk_22.w()) {
            this.k = new wy_2();
            exk_22.x().a(this.k);
        }
        if (exk_22.y()) {
            this.l = new yk_1();
            exk_22.C().a(this.l);
        }
        if (exk_22.an()) {
            this.m = new ua_2();
            exk_22.am().a(this.m);
        }
        this.n = exk_22.n();
        this.o = exk_22.al();
        this.p = exk_22.ap();
        this.i = exk_22.l();
    }

    public ezq_0() {
    }

    public int a() {
        return this.d;
    }

    public short b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public short d() {
        return this.g;
    }

    @Override
    public byte e() {
        return 0;
    }

    @Override
    public void a(short s2) {
        this.e = s2;
    }

    public boolean f() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    @Nullable
    public xn_1 g() {
        return this.j;
    }

    @Nullable
    public wy_2 h() {
        return this.k;
    }

    @Nullable
    public yk_1 i() {
        return this.l;
    }

    @Nullable
    public ua_2 j() {
        return this.m;
    }

    public eyc_2 k() {
        return this.n;
    }

    public eyj_1 l() {
        return this.o;
    }

    @Nullable
    public eZo m() {
        return this.p;
    }

    public int n() {
        return this.i;
    }

    @Override
    public void a(abx_2 abx_22) {
        ByteBuffer byteBuffer;
        Object object;
        abx_22.a(this.d);
        abx_22.a(this.e);
        abx_22.a(this.f);
        abx_22.a(this.g);
        abx_22.a(this.h);
        abx_22.a((byte)(this.j != null ? 1 : 0));
        if (this.j != null) {
            object = ByteBuffer.allocate(this.j.b());
            this.j.a((ByteBuffer)object);
            abx_22.b(((ByteBuffer)object).array());
        }
        abx_22.a((byte)(this.k != null ? 1 : 0));
        if (this.k != null) {
            object = ByteBuffer.allocate(this.k.b());
            this.k.a((ByteBuffer)object);
            abx_22.b(((ByteBuffer)object).array());
        }
        abx_22.a((byte)(this.l != null ? 1 : 0));
        if (this.l != null) {
            object = ByteBuffer.allocate(this.l.b());
            this.l.a((ByteBuffer)object);
            abx_22.b(((ByteBuffer)object).array());
        }
        abx_22.a((byte)(this.m != null ? 1 : 0));
        if (this.m != null) {
            object = ByteBuffer.allocate(this.m.b());
            this.m.a((ByteBuffer)object);
            abx_22.b(((ByteBuffer)object).array());
        }
        abx_22.a((byte)(this.n != null ? 1 : 0));
        if (this.n != null) {
            object = new wl_2();
            this.n.a((wl_2)object);
            byteBuffer = ByteBuffer.allocate(((wl_2)object).b());
            ((wl_2)object).a(byteBuffer);
            abx_22.b(byteBuffer.array());
        }
        abx_22.a((byte)(this.o != null ? 1 : 0));
        if (this.o != null) {
            object = new wn_2();
            this.o.a((wn_2)object);
            byteBuffer = ByteBuffer.allocate(((wn_2)object).b());
            ((wn_2)object).a(byteBuffer);
            abx_22.b(byteBuffer.array());
        }
        abx_22.a((byte)(this.p != null ? 1 : 0));
        if (this.p != null) {
            object = new wl_1();
            this.p.a((wl_1)object);
            byteBuffer = ByteBuffer.allocate(((wl_1)object).b());
            ((wl_1)object).a(byteBuffer);
            abx_22.b(byteBuffer.array());
        }
        abx_22.a(this.i);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        gs_0 gs_02;
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getShort();
        boolean bl = this.h = byteBuffer.get() != 0;
        if (byteBuffer.get() == 1) {
            this.j = new xn_1();
            this.j.b(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.k = new wy_2();
            this.k.b(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.l = new yk_1();
            this.l.b(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            this.m = new ua_2();
            this.m.b(byteBuffer);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new wl_2();
            ((wl_2)gs_02).b(byteBuffer);
            this.n = eyg_1.a((wl_2)gs_02);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new wn_2();
            ((wn_2)gs_02).b(byteBuffer);
            this.o = eyj_1.b((wn_2)gs_02);
        }
        if (byteBuffer.get() == 1) {
            gs_02 = new wl_1();
            ((wl_1)gs_02).b(byteBuffer);
            this.p = eZo.b((wl_1)gs_02);
        }
        this.i = byteBuffer.getInt();
    }

    public String toString() {
        return "AddItemOperation{m_refId=" + this.d + ", m_qty=" + this.e + ", m_bind=" + this.n + ", m_bagId=" + this.f + ", m_posInBag=" + this.g + ", m_insideMove=" + this.h + ", m_multiElementsEffects=" + this.o + ", m_mergedSetInfo=" + this.p + "}";
    }
}

