/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aii
 */
public final class aii_0
implements ahk_0 {
    private static final Logger b = Logger.getLogger(aii_0.class);
    private static final aii_0 c = new aii_0();
    private final HashMap<String, aif_0> d;
    private ays_2 e;
    private final ArrayList<aif_0> f = new ArrayList();
    private static final boolean g = true;
    private static final aik h = new aij();

    private aii_0() {
        this.d = new HashMap(18);
    }

    public static aii_0 a() {
        return c;
    }

    public void a(String string) {
        if (this.e != null) {
            this.e.u();
        }
        String string2 = gi_0.k(string);
        long l = auc_1.d(string2);
        this.e = ayu_2.a().b((aui_2)auj_1.a.a(), l, string, false);
        this.e.k_();
    }

    public aif_0 a(String string, aim aim2) {
        return this.a(string, this.e, aim2);
    }

    public aif_0 b(String string) {
        assert (this.e != null) : "Aucune texture par d\u00e9faut n'est d\u00e9finie !";
        return this.a(string, this.e);
    }

    public aif_0 a(String string, ays_2 ays_22) {
        return this.a(string, ays_22, aim.b);
    }

    public aif_0 a(String string, ays_2 ays_22, aim aim2) {
        this.c(string);
        aif_0 aif_02 = new aif_0(string, ays_22, aim2);
        this.d.put(string, aif_02);
        return aif_02;
    }

    public void c(String string) {
        aif_0 aif_02 = this.d.remove(string);
        if (aif_02 != null) {
            aif_02.g();
        }
    }

    public aif_0 d(String string) {
        return this.d.get(string);
    }

    private static void a(aif_0 aif_02) {
        assert (aif_02 != null);
        aif_02.f();
    }

    public void e(String string) {
        aif_0 aif_02 = this.d(string);
        if (aif_02 != null) {
            aii_0.a(aif_02);
        }
    }

    public void b() {
        for (aif_0 aif_02 : this.d.values()) {
            aii_0.a(aif_02);
        }
    }

    public final void a(ahg_0 ahg_02, aiq_0 aiq_02, float f2) {
        int n = this.f.size();
        if (n == 0) {
            return;
        }
        int n2 = (int)Math.floor(ahg_02.y());
        float f3 = 43.0f;
        long l = aiq_02.j();
        for (int k = 0; k < n; ++k) {
            aif_0 aif_02 = this.f.get(k);
            HighLightEntity highLightEntity = aif_02.b(l);
            if (highLightEntity == null) continue;
            if (!aif_02.c.add(l)) {
                aiq_02.a(highLightEntity);
                continue;
            }
            if (highLightEntity.V() == 0) {
                b.error((Object)("probl\u00e8me d'hightlight " + aiq_02.toString()));
                highLightEntity.b = true;
                return;
            }
            float[] fArray = aif_02.c();
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.b(0);
            geometryMesh.a(fArray[0] * 0.5f, fArray[1] * 0.5f, fArray[2] * 0.5f, fArray[3] * f2);
            aiq_02.a(ahg_02, highLightEntity, 43.0f, aif_02.d(), n2, aif_02.a(), 0);
            highLightEntity.b = true;
            assert (highLightEntity.aw() >= 0);
            ahg_02.a(highLightEntity, true);
        }
    }

    public void a(ahg_0 ahg_02, int n) {
        h.a(ahg_02);
        this.f.clear();
        for (aif_0 aif_02 : this.d.values()) {
            aif_02.b(h);
            if (!aif_02.e() || aif_02.b()) continue;
            aif_02.c.clear();
            this.b(aif_02);
        }
    }

    private void b(aif_0 aif_02) {
        int n = this.f.size();
        if (n == 0) {
            this.f.add(aif_02);
            return;
        }
        if (aif_02.b >= this.f.get((int)(n - 1)).b) {
            this.f.add(aif_02);
            return;
        }
        for (int k = 0; k < n; ++k) {
            if (aif_02.b >= this.f.get((int)k).b) continue;
            this.f.add(k, aif_02);
            break;
        }
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
    }

    public boolean a(long l, String string) {
        aif_0 aif_02 = this.d(string);
        if (aif_02 == null) {
            b.error((Object)("le layer " + string + " n'exsite pas"));
            return false;
        }
        aif_02.c(l);
        return true;
    }

    public boolean a(aff_1 aff_12) {
        long l = aii_0.b(aff_12);
        for (aif_0 aif_02 : this.d.values()) {
            if (!aif_02.a(l)) continue;
            return true;
        }
        return false;
    }

    public void b(long l, String string) {
        aif_0 aif_02 = this.d(string);
        if (aif_02 == null) {
            b.error((Object)("le layer " + string + " n'exsite pas"));
            return;
        }
        aif_02.d(l);
    }

    public static long a(int n, int n2, int n3) {
        return apb_2.a(n, n2, (short)n3);
    }

    public static long b(aff_1 aff_12) {
        return aii_0.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public static aff_1 a(long l) {
        return apb_2.a(l);
    }
}

