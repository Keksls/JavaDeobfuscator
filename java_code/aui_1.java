/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/*
 * Renamed from auI
 */
public final class aui_1 {
    public static final boolean a = false;
    private aun_1 h = new auj_2(this);
    private final aum_1 i = new aum_1();
    private final auo_1 j = new auo_1();
    public int b;
    public int c;
    public final EntitySprite d;
    public final EntitySprite e;
    private static final aui_1 k = new aui_1();
    private final HashMap<String, aug_1> l;
    private THashMap<String, String> m;
    private final ArrayList<avc_1> n = new ArrayList();
    private final ArrayList<avc_1> o = new ArrayList();
    private final TIntObjectHashMap<auh_1> p;
    private final TIntObjectHashMap<auh_1> q;
    private final ArrayList<ays_2> r;
    private ays_2 s;
    private ays_2 t;
    private boolean u;
    public final GLGeometrySprite f;
    private boolean v;
    private String w = "transform";
    private String x = "gui";
    private int y;

    private aui_1() {
        this.l = new HashMap(16);
        this.m = new THashMap(16);
        this.p = new TIntObjectHashMap();
        this.q = new TIntObjectHashMap();
        this.r = new ArrayList();
        this.d = (EntitySprite)EntitySprite.a.c();
        this.d.p = this;
        this.f = (GLGeometrySprite)GLGeometrySprite.j.c();
        this.d.a(this.f);
        this.d.a(Material.a);
        this.d.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.d.b(1.0f, 0.0f, 0.0f, 1.0f);
        this.e = (EntitySprite)EntitySprite.a.c();
        this.e.p = this;
        this.e.a((GeometrySprite)GLGeometrySprite.j.c());
        this.e.a(Material.a);
        this.e.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.e.b(1.0f, 0.0f, 0.0f, 1.0f);
    }

    public static aui_1 a() {
        return k;
    }

    public void a(aun_1 aun_12) {
        this.h = aun_12;
    }

    public void a(String string, String string2, String string3) {
        this.m.put((Object)string, (Object)string2);
        aug_1 aug_12 = this.h.a(string3);
        aug_12.a(string);
        this.l.put(aug_12.b(), aug_12);
    }

    public void a(aug_1 aug_12) {
        this.l.put(aug_12.b(), aug_12);
    }

    public void a(String string) {
        this.l.remove(string);
    }

    public aug_1 b(String string) {
        return this.l.get(string);
    }

    public void c(String string) {
        this.w = string;
    }

    public aug_1 b() {
        return this.l.get(this.w);
    }

    public void d(String string) {
        this.x = string;
    }

    public aug_1 c() {
        return this.l.get(this.x);
    }

    public void d() {
        for (aug_1 aug_12 : this.l.values()) {
            aug_12.c();
        }
    }

    public void e() {
        this.m.forEachEntry((TObjectObjectProcedure)new auk_1(this));
        this.m = null;
    }

    public void a(int n) {
        this.b = n;
        this.c += n;
        for (int k = 0; k < this.n.size(); ++k) {
            this.n.get(k).a(n);
        }
        this.q.forEachEntry((TIntObjectProcedure)this.i);
        this.q.clear();
        this.j.a(n);
        this.p.forEachEntry((TIntObjectProcedure)this.j);
    }

    public void a(boolean bl) {
        this.v = bl;
        this.g();
    }

    public void a(avc_1 avc_12) {
        this.n.add(avc_12);
        this.g();
    }

    public void b(avc_1 avc_12) {
        this.n.remove(avc_12);
        this.g();
    }

    public void a(auh_1 auh_12) {
        assert (auh_12 != null);
        this.q.put(auh_12.f(), (Object)auh_12);
    }

    public void b(auh_1 auh_12) {
        this.p.remove(auh_12.f());
        this.q.remove(auh_12.f());
    }

    public auh_1 b(int n) {
        auh_1 auh_12 = (auh_1)this.p.get(n);
        if (auh_12 != null) {
            return auh_12;
        }
        return (auh_1)this.q.get(n);
    }

    public boolean a(aui_2 aui_22) {
        if (!aui_22.f() || this.u) {
            return false;
        }
        return this.h();
    }

    private void g() {
        this.o.clear();
        for (avc_1 avc_12 : this.n) {
            if (!this.v && !avc_12.e()) continue;
            this.o.add(avc_12);
        }
    }

    private boolean h() {
        for (avc_1 avc_12 : this.o) {
            if (!avc_12.b() || !avc_12.c().b(avc_12.d())) continue;
            return true;
        }
        return false;
    }

    public void a(int n, int n2) {
        avx_2 avx_22 = auj_1.a.a();
        if (!((aui_2)avx_22).f()) {
            return;
        }
        this.i();
        this.s = this.b(n, n2);
        this.t = this.b(n, n2);
        if (this.s == null || this.t == null) {
            this.i();
            this.u = true;
        }
        this.d.a((float)n2 / 2.0f, (float)(-n) / 2.0f, n, n2);
        this.e.a((float)n2 / 2.0f, (float)(-n) / 2.0f, n, n2);
    }

    public void a(aug_2 aug_22, aui_2 aui_22) {
        if (!this.a(aui_22)) {
            aug_22.a(aui_22);
            this.b(aui_22);
        } else {
            this.a(aug_22);
        }
    }

    private ays_2 b(int n, int n2) {
        int n3 = this.r.size();
        for (int k = 0; k < n3; ++k) {
            ays_2 ays_22 = this.r.get(k);
            azr_2 azr_22 = ays_22.a(0);
            if (azr_22.a() != n || azr_22.b() != n2 || ays_22.h() || ays_22 == this.s || ays_22 == this.t) continue;
            return ays_22;
        }
        return this.c(n, n2);
    }

    public void f() {
        this.p.forEachValue((TObjectProcedure)new aul_1(this));
        this.p.clear();
        this.n.clear();
        this.g();
    }

    private void b(aui_2 aui_22) {
        Collection collection = this.p.valueCollection();
        collection.stream().sorted(Comparator.comparingInt(auh_1::j)).forEachOrdered(auh_12 -> {
            if (auh_12.h()) {
                auh_12.a(aui_22);
            }
        });
    }

    private void a(aug_2 aug_22) {
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        axr_2 axr_22 = axr_2.a();
        avx_22.a(this.s);
        axu_2.a().a((GL)gL2);
        aug_22.a(avx_22);
        this.b(avx_22);
        Matrix44 matrix44 = avx_22.d();
        avx_22.b(Matrix44.b);
        assert (this.h());
        azr_2 azr_22 = this.s.a(0);
        axr_22.a((GL)gL2, 0, 0, azr_22.a(), azr_22.b());
        this.d.a(Material.b);
        this.f.a(axn_2.b, axn_2.a);
        ays_2 ays_22 = this.s;
        for (int k = 0; k < this.o.size(); ++k) {
            ays_2 ays_23 = k != this.o.size() - 1 ? (ays_22 == this.t ? this.s : this.t) : null;
            avx_22.a(ays_23);
            axu_2.a().a((GL)gL2);
            this.d.a(ays_22);
            this.o.get(k).a(this.d);
            ays_22 = ays_23;
            axu_2.a().a((GL)gL2);
            this.d.c(avx_22);
        }
        avx_22.b(matrix44);
    }

    private ays_2 c(int n, int n2) {
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        ays_2 ays_22 = ((aui_2)avx_22).a(auk_2.a(), n, n2, false);
        ays_22.a((GL)gL2);
        if (!ays_22.j()) {
            ays_22.u();
            ays_22.u();
            return null;
        }
        ays_22.k_();
        this.r.add(ays_22);
        return ays_22;
    }

    private void i() {
        int n = this.r.size();
        for (int k = 0; k < n; ++k) {
            ays_2 ays_22 = this.r.get(k);
            ays_22.u();
            ays_22.u();
        }
        this.r.clear();
    }

    void a(int n, auh_1 auh_12) {
        this.p.put(n, (Object)auh_12);
    }

    void c(int n) {
        this.p.remove(n);
    }
}

