/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from aif
 */
public class aif_0 {
    private static final Logger e = Logger.getLogger(aif_0.class);
    String a;
    public int b;
    private Material f;
    private final TLongObjectHashMap<HighLightEntity> g = new TLongObjectHashMap();
    final TLongHashSet c = new TLongHashSet();
    private boolean h = true;
    private ays_2 i;
    private aim j;
    private static final TObjectProcedure<HighLightEntity> k = new aih_0();

    aif_0(String string, ays_2 ays_22, aim aim2) {
        assert (ays_22 != null);
        this.a = string;
        this.j = aim2;
        this.f = (Material)Material.d.d();
        this.i = ays_22;
        this.i.k_();
    }

    public void a(TObjectProcedure<aff_1> tObjectProcedure) {
        this.g.forEachKey((TLongProcedure)new aig_0(this, tObjectProcedure));
    }

    public aim a() {
        return this.j;
    }

    public void a(ays_2 ays_22, aim aim2) {
        boolean bl = ays_22 != this.i;
        ays_22.k_();
        this.i.u();
        this.i = ays_22;
        this.j = aim2;
        TLongObjectIterator tLongObjectIterator = this.g.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            HighLightEntity highLightEntity = (HighLightEntity)tLongObjectIterator.value();
            highLightEntity.a(0, this.i);
            if (!bl) continue;
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.b(0);
            this.a(geometryMesh);
            highLightEntity.b = false;
        }
    }

    public boolean b() {
        return this.g.isEmpty();
    }

    public float[] c() {
        return this.f.a();
    }

    public void a(float[] fArray) {
        this.a(new azf_2(fArray));
    }

    public void a(azj_2 azj_22) {
        this.f.d(azj_22.v());
        TLongObjectIterator tLongObjectIterator = this.g.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            HighLightEntity highLightEntity = (HighLightEntity)tLongObjectIterator.value();
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.b(0);
            geometryMesh.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
            highLightEntity.b = false;
        }
    }

    final afe_1 d() {
        return this.i.w();
    }

    public boolean e() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    boolean a(long l) {
        return this.g.contains(l);
    }

    public boolean a(int n, int n2, short s2) {
        return this.a(aii_0.a(n, n2, s2));
    }

    final HighLightEntity a(int n, int n2, int n3) {
        return this.b(aii_0.a(n, n2, n3));
    }

    HighLightEntity b(long l) {
        return (HighLightEntity)this.g.get(l);
    }

    public void f() {
        if (!this.g.isEmpty()) {
            this.g.forEachValue(k);
        }
        this.g.clear();
    }

    public void b(int n, int n2, short s2) {
        long l = aii_0.a(n, n2, s2);
        this.c(l);
    }

    public void c(int n, int n2, short s2) {
        long l = aii_0.a(n, n2, s2);
        this.d(l);
    }

    void c(long l) {
        if (this.g.get(l) != null) {
            return;
        }
        try {
            HighLightEntity highLightEntity = (HighLightEntity)HighLightEntity.a.d();
            GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
            assert (highLightEntity.aw() == 0);
            assert (geometryMesh.aw() == 0);
            geometryMesh.a(ave_1.g, 4, auf_2.a);
            this.a(geometryMesh);
            geometryMesh.a(0.5f, 0.5f, 0.5f, 1.0f);
            ayx_2 ayx_22 = new ayx_2();
            ayx_22.b();
            highLightEntity.D().a(ayx_22);
            Material material = Material.b;
            highLightEntity.a(geometryMesh, this.i, material);
            geometryMesh.u();
            highLightEntity.a(aui_1.a().b(), aup_1.d, aup_1.H);
            this.g.put(l, (Object)highLightEntity);
        }
        catch (Exception exception) {
            e.error((Object)("probl\u00e8me cr\u00e9ation highlight entity layer=" + this.a), (Throwable)exception);
        }
    }

    private void a(GeometryMesh geometryMesh) {
        VertexBufferPCT vertexBufferPCT = geometryMesh.c();
        vertexBufferPCT.a(4);
        float f2 = (float)this.i.w().a() / (float)this.i.x().a();
        float f3 = (float)this.i.w().b() / (float)this.i.x().b();
        vertexBufferPCT.a(0, 0.0f, 0.0f);
        vertexBufferPCT.a(1, 0.0f, f3);
        vertexBufferPCT.a(2, f2, f3);
        vertexBufferPCT.a(3, f2, 0.0f);
    }

    void d(long l) {
        if (this.g.isEmpty()) {
            return;
        }
        HighLightEntity highLightEntity = (HighLightEntity)this.g.remove(l);
        if (highLightEntity != null) {
            highLightEntity.u();
            highLightEntity.b = false;
        }
    }

    void b(TObjectProcedure<HighLightEntity> tObjectProcedure) {
        if (!this.g.isEmpty()) {
            this.g.forEachValue(tObjectProcedure);
        }
    }

    void g() {
        this.f();
        this.f.u();
        this.i.u();
        this.f = null;
        this.i = null;
    }

    public String toString() {
        return this.a + " cellCount=" + this.g.size();
    }
}

