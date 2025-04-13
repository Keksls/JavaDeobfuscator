/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.THashSet;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class aPo {
    private static final float a = -0.09f;
    private static final float b = -0.18f;
    private static final float c = 0.3f;
    private static final Logger d = Logger.getLogger(aPo.class);
    private final aPB e;
    private final aPp f;
    private final TLongObjectHashMap<Entity> g = new TLongObjectHashMap();
    private final Set<Long> h = new HashSet<Long>();
    private final THashSet<Entity> i = new THashSet();
    private final TLongHashSet j = new TLongHashSet();
    private final float[] k = new float[4];
    private static boolean l = false;

    public static void a(boolean bl) {
        l = bl;
    }

    public aPo(tg_0 tg_02, aPp aPp2) {
        this.e = new aPB(tg_02);
        this.f = aPp2;
    }

    public void a() {
        this.i.clear();
        this.g.forEachValue(entity -> {
            if (entity != null) {
                entity.u();
            }
            return true;
        });
    }

    public void a(List<DisplayedScreenElement> list) {
        this.i.clear();
        this.j.clear();
        for (DisplayedScreenElement displayedScreenElement : list) {
            long l = aPo.a(displayedScreenElement);
            if (this.j.contains(l)) continue;
            Entity entity = (Entity)this.g.get(l);
            if (entity == null) {
                entity = this.d(displayedScreenElement);
                this.g.put(l, (Object)entity);
            }
            if (entity == null) continue;
            this.j.add(l);
            if (this.i.contains((Object)entity)) continue;
            this.i.add((Object)entity);
        }
    }

    public boolean a(DisplayedScreenElement displayedScreenElement) {
        long l = aPo.a(displayedScreenElement);
        return this.j.contains(l) && this.h.contains(l);
    }

    public boolean b(DisplayedScreenElement displayedScreenElement) {
        return this.j.contains(aPo.a(displayedScreenElement));
    }

    private static long a(aek_0 aek_02) {
        long l = aek_02.G();
        long l2 = aek_02.H();
        short s2 = aek_02.I();
        return (l2 & 0x3FFFFL) << 32 | (l & 0x3FFFFL) << 14 | (long)(s2 & 0x3FFF);
    }

    public Collection<Entity> b() {
        return this.i;
    }

    public Collection<Entity> c() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.h.forEach(l -> hashSet.add((Entity)this.g.get(l.longValue())));
        return hashSet;
    }

    private Entity d(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.k()) {
            return null;
        }
        aPz aPz2 = this.e.a(displayedScreenElement.G(), displayedScreenElement.H(), (int)displayedScreenElement.I());
        if (aPz2 == null) {
            return null;
        }
        if (aPz2.g()) {
            this.h.add(aPo.a(displayedScreenElement));
        }
        Entity3D entity3D = this.e(displayedScreenElement);
        this.a(entity3D, ave_1.g, this.a(aPz2));
        this.a(displayedScreenElement, entity3D, aPz2);
        return entity3D;
    }

    public Entity3D c(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.k()) {
            return null;
        }
        aPz aPz2 = this.e.a(displayedScreenElement.G(), displayedScreenElement.H(), (int)displayedScreenElement.I());
        if (aPz2 == null) {
            return null;
        }
        if (aPz2.g()) {
            this.h.add(aPo.a(displayedScreenElement));
        }
        Entity3D entity3D = this.e(displayedScreenElement);
        this.a(displayedScreenElement, entity3D, aPz2);
        return entity3D;
    }

    private void a(DisplayedScreenElement displayedScreenElement, Entity3D entity3D, aPz aPz2) {
        ys_0 ys_02;
        this.a(entity3D, ave_1.c, this.b(aPz2), 1.0f, false);
        if (aPz2.d != 0.0f || aPz2.e != 0.0f) {
            this.a(entity3D, ave_1.b, this.c(aPz2), 1.0f, false);
        }
        if (l && (int)entity3D.h != this.e.a()) {
            axr_2.a().a((short)-3856);
            this.a(entity3D, 0, 0);
            this.a(entity3D, 1, 0);
            this.a(entity3D, 0, 1);
        }
        if ((ys_02 = this.e.a(displayedScreenElement.G(), displayedScreenElement.H(), displayedScreenElement.I())) != null && ys_02.e() == 16) {
            int n = ys_02.a;
            int n2 = ys_02.b;
            short s2 = ys_02.c;
            this.a(n, n2, s2, this.e.a(n - 1, n2, s2), entity3D);
            this.a(n, n2, s2, this.e.a(n, n2 - 1, s2), entity3D);
            this.a(n, n2, s2, this.e.a(n + 1, n2, s2), entity3D);
            this.a(n, n2, s2, this.e.a(n, n2 + 1, s2), entity3D);
        }
    }

    private Entity3D e(DisplayedScreenElement displayedScreenElement) {
        Entity3D entity3D = (Entity3D)Entity3D.c.d();
        Entity entity = displayedScreenElement.e();
        entity3D.f = entity.f;
        entity3D.g = entity.g;
        entity3D.h = entity.h;
        entity3D.i = entity.i;
        entity3D.e = entity.e;
        entity3D.j = entity.j;
        entity3D.k = entity.k;
        return entity3D;
    }

    private void a(Entity3D entity3D, int n, int n2) {
        int n3;
        int n4;
        aPy aPy2;
        float f2 = 4.3f;
        int n5 = (int)entity3D.f;
        int n6 = (int)entity3D.g;
        int n7 = (int)entity3D.h;
        int n8 = 1;
        while ((aPy2 = this.e.a(n4 = n5 - n8 + n, n3 = n6 - n8 + n2)) != null) {
            aPx aPx2 = aPy2.b(Hw.d((float)n7 - (float)(n8 - 1) * 4.3f) - 1);
            if (aPx2 != null && aPx2.a() != n7) {
                aPz aPz2 = new aPz(true, aPx2.a(), 0, 0, n4, n3, aPx2.e);
                this.a(entity3D, ave_1.b, this.d(aPz2), 1.0f, true);
            }
            ++n8;
        }
    }

    private void a(int n, int n2, int n3, ys_0 ys_02, Entity3D entity3D) {
        if (ys_02 == null) {
            return;
        }
        if (ys_02.e() == 16 || ys_02.e() == 48) {
            return;
        }
        boolean bl = n == ys_02.a;
        boolean bl2 = n < ys_02.a;
        boolean bl3 = n2 < ys_02.b;
        float f2 = acm_0.b(n, n2);
        float f3 = acm_0.b(n, n2, n3);
        float f4 = 86.0f * (bl ? (bl3 ? -0.5f : 0.5f) : (bl2 ? 0.5f : -0.5f));
        float f5 = 43.0f * (bl ? (bl3 ? -0.5f : 0.5f) : (bl2 ? 0.05f : -0.05f));
        float f6 = 86.0f * (bl ? (bl3 ? 0.05f : -0.05f) : (bl2 ? -0.05f : 0.05f));
        float f7 = 43.0f * (bl ? (bl3 ? -0.45f : 0.45f) : (bl2 ? -0.45f : 0.45f));
        float f8 = 86.0f * (bl ? (bl3 ? -0.45f : 0.45f) : 0.0f);
        float f9 = 43.0f * (bl ? (bl3 ? 0.05f : -0.05f) : (bl2 ? -0.5f : 0.5f));
        float f10 = 86.0f * (bl ? 0.0f : (bl2 ? 0.45f : -0.45f));
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(5);
        vertexBufferPCT.n();
        float[] fArray = this.f.a().v();
        vertexBufferPCT.a(f2 + f4, f3, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f10, f3 + f5, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f6, f3 + f7, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f8, f3 + f9, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f4, f3, 0.0f, 0.0f, fArray);
        vertexBufferPCT.o();
        this.a(entity3D, ave_1.g, vertexBufferPCT);
    }

    private VertexBufferPCT a(aPz aPz2) {
        float[] fArray;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(12);
        vertexBufferPCT.n();
        float f2 = 0.3f * this.e.a(aPz2.c);
        float[] fArray2 = aPo.a(this.a(aPz2, this.k), f2);
        vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aPz2.a(), aPz2.e(), 0.0f, 0.0f, fArray2);
        if (aPz2.d != 0.0f) {
            fArray = aPo.a(this.a(aPz2, this.k), f2 + -0.09f);
            vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.c(), aPz2.b() - aPz2.d, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.a(), aPz2.f() - aPz2.d, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
        }
        if (aPz2.e != 0.0f) {
            fArray = aPo.a(this.a(aPz2, this.k), f2 + -0.18f);
            vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.a(), aPz2.f() - aPz2.e, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.d(), aPz2.b() - aPz2.e, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray);
        }
        vertexBufferPCT.o();
        return vertexBufferPCT;
    }

    private float[] a(aPz aPz2, float[] fArray) {
        azj_2 azj_22 = aPz2.g() ? this.f.a() : (aPz2.f ? this.f.f() : this.f.e());
        fArray[0] = azj_22.q();
        fArray[1] = azj_22.r();
        fArray[2] = azj_22.s();
        fArray[3] = azj_22.p();
        return fArray;
    }

    private static float[] a(float[] fArray, float f2) {
        fArray[0] = fArray[0] + f2;
        fArray[1] = fArray[1] + f2;
        fArray[2] = fArray[2] + f2;
        return fArray;
    }

    private VertexBufferPCT b(aPz aPz2) {
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(5);
        vertexBufferPCT.n();
        float[] fArray = this.a(aPz2, this.k);
        azj_2 azj_22 = this.f.b();
        fArray[0] = azj_22.q();
        fArray[1] = azj_22.r();
        fArray[2] = azj_22.s();
        fArray[3] = azj_22.p();
        vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.e(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.o();
        return vertexBufferPCT;
    }

    private VertexBufferPCT c(aPz aPz2) {
        float f2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(6);
        vertexBufferPCT.n();
        float[] fArray = this.a(aPz2, this.k);
        azj_2 azj_22 = this.f.b();
        fArray[0] = azj_22.q();
        fArray[1] = azj_22.r();
        fArray[2] = azj_22.s();
        fArray[3] = azj_22.p();
        if (aPz2.d != 0.0f) {
            vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.c(), aPz2.b() - aPz2.d, 0.0f, 0.0f, fArray);
        }
        if (aPz2.e != 0.0f) {
            vertexBufferPCT.a(aPz2.d(), aPz2.b() - aPz2.e, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray);
        }
        if ((f2 = Math.max(aPz2.d, aPz2.e)) != 0.0f) {
            vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aPz2.a(), aPz2.f() - f2, 0.0f, 0.0f, fArray);
        }
        vertexBufferPCT.o();
        return vertexBufferPCT;
    }

    private VertexBufferPCT d(aPz aPz2) {
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(8);
        vertexBufferPCT.n();
        float[] fArray = this.a(aPz2, this.k);
        azj_2 azj_22 = this.f.c();
        fArray[0] = azj_22.q();
        fArray[1] = azj_22.r();
        fArray[2] = azj_22.s();
        fArray[3] = azj_22.p();
        vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.f(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.d(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.e(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.a(), aPz2.e(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aPz2.c(), aPz2.b(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.o();
        return vertexBufferPCT;
    }

    private void a(Entity3D entity3D, ave_1 ave_12, VertexBufferPCT vertexBufferPCT) {
        this.a(entity3D, ave_12, vertexBufferPCT, 0.0f, false);
    }

    private void a(Entity3D entity3D, ave_1 ave_12, VertexBufferPCT vertexBufferPCT, float f2, boolean bl) {
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        gLGeometryMesh.a(ave_12, vertexBufferPCT, auf_2.b);
        gLGeometryMesh.b(f2);
        gLGeometryMesh.a(bl);
        entity3D.a(gLGeometryMesh);
        gLGeometryMesh.u();
    }

    boolean a(int n, int n2) {
        return this.e.a(n, n2) != null;
    }
}

