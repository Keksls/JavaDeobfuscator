/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aiK
 */
public class aik_0<S extends ahg_0>
implements aeh_0,
ahk_0<S> {
    private static final Logger c = Logger.getLogger(aik_0.class);
    private static final int d = 54;
    private static final double e = 0.75;
    private static final double f = 1.25;
    private static final double g = 1.25;
    private static final double h = 0.75;
    private static final aik_0 i = new aik_0();
    protected aiH a;
    private final Map<Integer, IsoParticleSystem> j = new ConcurrentHashMap<Integer, IsoParticleSystem>();
    private byte k;
    private volatile boolean l = true;
    private final ArrayList<IsoParticleSystem> m = new ArrayList(50);

    public static aik_0 a() {
        return i;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public boolean b() {
        return this.l;
    }

    public void a(CellParticleSystem cellParticleSystem) {
        if (this.a((IsoParticleSystem)cellParticleSystem)) {
            return;
        }
        this.b(cellParticleSystem);
    }

    public boolean a(IsoParticleSystem isoParticleSystem) {
        for (IsoParticleSystem isoParticleSystem2 : this.j.values()) {
            if (isoParticleSystem2.ac() != isoParticleSystem.ac()) continue;
            return true;
        }
        return false;
    }

    public Iterator<IsoParticleSystem> c() {
        return this.j.values().iterator();
    }

    public IsoParticleSystem a(int n) {
        return this.j.get(n);
    }

    public void b(IsoParticleSystem isoParticleSystem) {
        if (!this.l) {
            return;
        }
        assert (!this.j.containsKey(isoParticleSystem.ac()));
        isoParticleSystem.k_();
        this.j.put(isoParticleSystem.ac(), isoParticleSystem);
        this.a(isoParticleSystem, (int)isoParticleSystem.e(), (int)isoParticleSystem.f(), (int)isoParticleSystem.g());
        aic_0.a.a(isoParticleSystem);
    }

    public void b(int n) {
        this.a(n, false);
    }

    public void a(int n, boolean bl) {
        IsoParticleSystem isoParticleSystem = this.j.get(n);
        if (isoParticleSystem == null) {
            return;
        }
        if (bl) {
            isoParticleSystem.Z();
        } else {
            isoParticleSystem.aa();
        }
    }

    public void b(int n, boolean bl) {
        IsoParticleSystem isoParticleSystem = this.j.get(n);
        if (isoParticleSystem != null) {
            isoParticleSystem.b(bl);
        }
    }

    public void d() {
        for (IsoParticleSystem isoParticleSystem : this.j.values()) {
            isoParticleSystem.z();
        }
        if (!this.l) {
            return;
        }
        Iterator<IsoParticleSystem> iterator = this.j.values().iterator();
        while (iterator.hasNext()) {
            IsoParticleSystem isoParticleSystem;
            isoParticleSystem = iterator.next();
            if (isoParticleSystem.aw() > 0) continue;
            isoParticleSystem.u();
            iterator.remove();
        }
    }

    @Override
    public void a(S s2, int n) {
        if (!this.l) {
            return;
        }
        float f2 = (float)n / 1000.0f;
        if (f2 > 0.066f) {
            f2 = 0.066f;
        }
        for (IsoParticleSystem isoParticleSystem : this.j.values()) {
            if (isoParticleSystem.aw() == 0 || isoParticleSystem.y() > this.k) continue;
            isoParticleSystem.a(f2);
        }
    }

    @Override
    public void a(S s2, float f2, float f3) {
        if (!this.l) {
            return;
        }
        this.m.clear();
        Iterator<IsoParticleSystem> iterator = this.j.values().iterator();
        int n = (int)f2;
        int n2 = (int)f3;
        afk_2 afk_22 = ((ahg_0)s2).s().n();
        while (iterator.hasNext()) {
            IsoParticleSystem isoParticleSystem = iterator.next();
            if (isoParticleSystem.aw() <= 0) {
                isoParticleSystem.u();
                iterator.remove();
                continue;
            }
            if (isoParticleSystem.y() > this.k) continue;
            boolean bl = true;
            switch (this.a(isoParticleSystem, s2, afk_22, n, n2)) {
                case a: {
                    if (isoParticleSystem.v()) {
                        bl = isoParticleSystem.a((ahg_0)s2);
                    }
                    this.m.add(isoParticleSystem);
                    isoParticleSystem.b((ahg_0)s2);
                    break;
                }
                case c: {
                    try {
                        isoParticleSystem.i(1);
                    }
                    catch (Exception exception) {
                        while (isoParticleSystem.aw() >= 0) {
                            isoParticleSystem.u();
                        }
                        iterator.remove();
                        c.error((Object)"probl\u00e8me lors de l'arr\u00eat d'un syst\u00e8me de particule", (Throwable)exception);
                    }
                    break;
                }
            }
            if (bl) continue;
            aiI.a(isoParticleSystem);
        }
    }

    private aim_0 a(IsoParticleSystem isoParticleSystem, S s2, afk_2 afk_22, int n, int n2) {
        float f2 = isoParticleSystem.e();
        float f3 = isoParticleSystem.f();
        float f4 = isoParticleSystem.g();
        float f5 = f2 - (float)n;
        float f6 = f3 - (float)n2;
        if (Math.abs(f5) > 54.0f || Math.abs(f6) > 54.0f) {
            return isoParticleSystem.B() ? aim_0.c : aim_0.b;
        }
        if (!isoParticleSystem.at()) {
            return aim_0.b;
        }
        afk_2 afk_23 = new afk_2(isoParticleSystem.A());
        float f7 = ((ahg_0)s2).c(f2, f3);
        float f8 = ((ahg_0)s2).a(f2, f3, f4);
        afk_23.a((int)f7, (int)f8);
        afk_2 afk_24 = new afk_2(aik_0.c(afk_22.a(), false), aik_0.c(afk_22.b(), true), aik_0.c(afk_22.c(), false), aik_0.c(afk_22.d(), true));
        if (afk_24.b(afk_23)) {
            return aim_0.a;
        }
        return aim_0.b;
    }

    @Override
    public void a(int n, int n2) {
        for (IsoParticleSystem isoParticleSystem : this.j.values()) {
            if ((int)isoParticleSystem.e() != n || (int)isoParticleSystem.f() != n2) continue;
            isoParticleSystem.aa();
        }
    }

    private void a(IsoParticleSystem isoParticleSystem, int n, int n2, int n3) {
        aiI.a(isoParticleSystem);
    }

    public void a(ahh_0 ahh_02) {
        for (IsoParticleSystem isoParticleSystem : this.j.values()) {
            FreeParticleSystem freeParticleSystem;
            if (!(isoParticleSystem instanceof FreeParticleSystem) || (freeParticleSystem = (FreeParticleSystem)isoParticleSystem).h() != ahh_02) continue;
            this.b(isoParticleSystem.ac());
        }
    }

    public void a(byte by) {
        this.k = by;
    }

    public int e() {
        int n = 0;
        for (IsoParticleSystem isoParticleSystem : this.j.values()) {
            n += isoParticleSystem.x();
        }
        return n;
    }

    @Override
    public void a(ahm_0 ahm_02, ArrayList<aek_0> arrayList) {
        arrayList.addAll(this.m);
    }

    private static int c(int n, boolean bl) {
        if (n > 0) {
            return bl ? (int)((double)n * 1.25) : (int)((double)n * 0.75);
        }
        return bl ? (int)((double)n * 0.75) : (int)((double)n * 1.25);
    }
}

