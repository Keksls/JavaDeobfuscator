/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from avO
 */
public class avo_1 {
    protected final TIntObjectHashMap<aza_1> a = new TIntObjectHashMap();
    protected final TIntObjectHashMap<ays_2> b = new TIntObjectHashMap();
    static final /* synthetic */ boolean c;
    final /* synthetic */ ParticleSystem d;

    public avo_1(ParticleSystem particleSystem) {
        this.d = particleSystem;
    }

    public final aza_1 a(int n) {
        return (aza_1)this.a.get(n);
    }

    public final void a(int n, aza_1 aza_12, boolean bl) {
        this.a.put(n, (Object)aza_12);
        this.b(n, aza_12, bl);
    }

    public final void b(int n) {
        this.a.remove(n);
    }

    private void b(int n, aza_1 aza_12, boolean bl) {
        long l = this.d.k(n);
        ays_2 ays_22 = ayu_2.a().a(l);
        if (ays_22 != null) {
            ays_22.k_();
            this.b.put(n, (Object)ays_22);
            return;
        }
        azr_2 azr_22 = azk_2.a(aza_12.b(), aza_12.d(), aza_12.c(), 32);
        azk_2 azk_22 = new azk_2(abc_1.a, azr_22);
        ays_22 = ayu_2.a().a((aui_2)auj_1.a.a(), l, azk_22, bl);
        ays_22.k_();
        this.b.put(n, (Object)ays_22);
        azr_22.u();
        azk_22.u();
    }

    public void a(Emitter emitter) {
        ays_2 ays_22;
        Geometry geometry;
        int n;
        if (!c && !this.d.ab()) {
            throw new AssertionError();
        }
        int n2 = emitter.j.a.c() * 4;
        ArrayList<avn_1> arrayList = emitter.j.c;
        int n3 = arrayList.size();
        if (emitter.g == null) {
            emitter.g = new ArrayList(n3);
        }
        for (n = 0; n < n3; ++n) {
            avn_1 avn_12 = arrayList.get(n);
            geometry = (GLGeometryMesh)GLGeometryMesh.k.d();
            ((GeometryMesh)geometry).a(ave_1.g, n2, auf_2.b);
            geometry.a(axn_2.b, axn_2.f);
            ays_22 = (ays_2)this.d.Y.b.get(avn_12.c());
            this.d.a(geometry, ays_22, ParticleSystem.z);
            ((GLGeometryMesh)geometry).u();
            geometry.a(this.d.E, this.d.F);
            emitter.g.add((GeometryMesh)geometry);
        }
        int n4 = this.d.V();
        for (n = 0; n < n4; ++n) {
            geometry = this.d.b(n);
            geometry.k_();
            ays_22 = this.d.c(n);
            ays_22.k_();
        }
        ParticleSystem.a(this.d);
        if (this.d.H.N != null) {
            Emitter[] emitterArray = this.d.H.N;
            int n5 = emitterArray.length;
            for (n4 = 0; n4 < n5; ++n4) {
                this.b(emitterArray[n4]);
            }
        }
        n4 = this.d.V();
        for (int k = 0; k < n4; ++k) {
            this.d.c(k).u();
        }
    }

    private void b(Emitter emitter) {
        Emitter[] emitterArray;
        abp_1 abp_12;
        int n;
        if (emitter == null) {
            return;
        }
        ArrayList<avn_1> arrayList = emitter.j.c;
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            avn_1 avn_12 = arrayList.get(n);
            abp_12 = (ays_2)this.d.Y.b.get(avn_12.c());
            emitterArray = emitter.g.get(n);
            this.d.a((Geometry)emitterArray, (ays_2)abp_12, ParticleSystem.z);
            emitterArray.u();
        }
        if (emitter.h != null) {
            n = emitter.h.a();
            for (int k = 0; k < n; ++k) {
                abp_12 = emitter.h.b(k);
                if (!((Particle)abp_12).c()) continue;
                emitterArray = ((Particle)abp_12).N;
                int n3 = emitterArray.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    this.b(emitterArray[i2]);
                }
            }
        }
    }

    static {
        c = !ParticleSystem.class.desiredAssertionStatus();
    }
}

