/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eSh
 */
public class esh_1
implements ese_1 {
    private final etw_2 a;
    private final long b;
    private final long c;
    private short d;
    private short e;
    private int f;
    private final TLongObjectHashMap<esf_1> g;

    esh_1(etw_2 etw_22, long l, int n, long l2, short s2, short s3) {
        this.a = etw_22;
        this.b = l;
        this.f = n;
        this.c = l2;
        this.d = s2;
        this.e = s3;
        this.g = !this.a.i() ? new TLongObjectHashMap() : new TLongObjectHashMap(0);
    }

    public esh_1(etw_2 etw_22, vp_1 vp_12) {
        this(etw_22, vp_12.a, vp_12.f, vp_12.b, vp_12.d, vp_12.e);
    }

    @Override
    public etw_2 a() {
        return this.a;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public short d() {
        return this.d;
    }

    @Override
    public short e() {
        return this.e;
    }

    @Override
    public void a(short s2) {
        this.d = s2;
    }

    @Override
    public void b(short s2) {
        this.e = s2;
    }

    @Override
    public boolean f() {
        return !this.g.isEmpty();
    }

    @Override
    public esf_1 a(long l) {
        return (esf_1)this.g.get(l);
    }

    @Override
    public boolean a(TObjectProcedure<esf_1> tObjectProcedure) {
        return this.g.forEachValue(tObjectProcedure);
    }

    void a(esf_1 esf_12) {
        this.g.put(esf_12.a(), (Object)esf_12);
    }

    public void b(long l) {
        this.g.remove(l);
    }

    public List<esf_1> h() {
        return new ArrayList<esf_1>(this.g.valueCollection());
    }

    @Override
    public int g() {
        return this.f;
    }

    public void a(int n) {
        this.f = n;
    }

    public String toString() {
        return "BuildingModel{m_definition=" + this.a + ", m_uid=" + this.b + ", m_creationDate=" + this.c + ", m_x=" + this.d + ", m_y=" + this.e + ", m_equippedItemId=" + this.f + ", m_elements=" + this.g.size() + "}";
    }
}

