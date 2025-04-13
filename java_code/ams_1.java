/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALCcontext
 *  org.lwjgl.openal.ALCdevice
 *  org.lwjgl.openal.EFX10
 *  org.lwjgl.openal.OpenALException
 */
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCcontext;
import org.lwjgl.openal.ALCdevice;
import org.lwjgl.openal.EFX10;
import org.lwjgl.openal.OpenALException;

/*
 * Renamed from aMs
 */
public abstract class ams_1
extends Thread
implements amp_1 {
    private static ams_1 a;
    protected static final Logger b;
    protected static final boolean c = true;
    protected static final boolean d = false;
    protected static final int e = 131072;
    public static final long f = 10L;
    private boolean m;
    protected static final int[] g;
    protected static final int[] h;
    private int n = -1;
    private int o = -1;
    private final ArrayList<all_1> p = new ArrayList();
    private final Object q = new Object();
    protected aln_1 i;
    private volatile boolean r;
    private volatile boolean s;
    private int t;
    private int u;
    protected final acy_2<amo_1> j = new acy_2();
    long k;
    int l;
    private static int v;
    private static int w;

    protected ams_1() {
        ams_1.a(this);
    }

    protected static void a(ams_1 ams_12) {
        a = ams_12;
    }

    public static ams_1 a() {
        return a;
    }

    public final boolean b() {
        return this.r;
    }

    public final aln_1 c() {
        return this.i;
    }

    public void a(aln_1 aln_12) {
        this.i = aln_12;
    }

    public void d() {
        this.b(false);
        try {
            this.join(500L);
        }
        catch (InterruptedException interruptedException) {
            b.debug((Object)"Thread interrupted while waiting for SoundManager to stop", (Throwable)interruptedException);
        }
        try {
            if (AL.isCreated()) {
                b.info((Object)"SoundManager thread not closed in maximum time. Destroying AL");
                AL.destroy();
            }
        }
        catch (OpenALException openALException) {
            b.error((Object)"Exception en detruisant OpenAL : ", (Throwable)openALException);
        }
    }

    public final void b(boolean bl) {
        this.m = bl;
    }

    public final boolean e() {
        return this.m;
    }

    public static void f() {
        int n = AL10.alGetError();
        if (n != 0) {
            String string;
            switch (n) {
                case 40961: {
                    string = "AL_INVALID_NAME";
                    break;
                }
                case 40962: {
                    string = "AL_INVALID_ENUM";
                    break;
                }
                case 40963: {
                    string = "AL_INVALID_VALUE";
                    break;
                }
                case 40964: {
                    string = "AL_INVALID_OPERATION";
                    break;
                }
                case 40965: {
                    string = "AL_OUT_OF_MEMORY";
                    break;
                }
                default: {
                    string = "unknown error";
                }
            }
            throw new OpenALException("OpenAL error : " + string);
        }
    }

    private void n() {
        ALCdevice aLCdevice = ALC10.alcGetContextsDevice((ALCcontext)ALC10.alcGetCurrentContext());
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        ALC10.alcGetInteger((ALCdevice)aLCdevice, (int)4112, (IntBuffer)intBuffer);
        this.t = intBuffer.get();
        b.info((Object)("Max available sources : " + this.t));
    }

    public final synchronized boolean g() {
        if (!this.r) {
            try {
                AL.create();
                this.n();
                AL10.alDistanceModel((int)53252);
                ams_1.f();
                this.r = true;
            }
            catch (LWJGLException | OpenALException throwable) {
                b.warn((Object)"Problem in SoundManager.initialize() -> Sound is disabled", throwable);
                this.r = false;
                this.s = true;
                return false;
            }
        }
        return !this.m && this.k();
    }

    @Override
    public final synchronized void start() {
        if (!this.m && this.r && !this.s) {
            this.setName("SoundManager");
            super.start();
            while (!this.m) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    b.error((Object)"Interrupted", (Throwable)interruptedException);
                }
            }
        } else if (this.m) {
            b.error((Object)"SoundManager is already running");
        } else if (this.s) {
            b.error((Object)"SoundManager failed to initialize");
        } else {
            b.error((Object)"Initialize SoundManager first");
        }
    }

    protected void a(long l) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void h() {
        Object object = this.q;
        synchronized (object) {
            int n = this.p.size();
            for (int k = 0; k < n; ++k) {
                this.p.get(k).s();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        this.m = true;
        b.info((Object)"SoundManager running");
        while (this.m) {
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
                b.error((Object)"InterruptedException during SoundManager run", (Throwable)interruptedException);
            }
            long l = System.currentTimeMillis();
            try {
                this.a(l);
            }
            catch (Throwable throwable) {
                b.error((Object)"Exception during SoundManager run", throwable);
            }
            Object object = this.q;
            synchronized (object) {
                int n = this.p.size();
                for (int k = 0; k < n; ++k) {
                    all_1 all_12 = this.p.get(k);
                    try {
                        if (all_12.n() && !all_12.p()) continue;
                        all_12.a(l);
                        continue;
                    }
                    catch (Throwable throwable) {
                        b.error((Object)"Exception during SoundManager run", throwable);
                    }
                }
            }
            for (int k = this.j.d() - 1; k >= 0; --k) {
                try {
                    this.j.h(k).a(l);
                    continue;
                }
                catch (Throwable throwable) {
                    b.error((Object)"Exception during SoundManager run", throwable);
                }
            }
        }
        try {
            this.l();
            AL.destroy();
        }
        catch (Throwable throwable) {
            b.error((Object)"Exception during SoundManager run", throwable);
        }
        b.info((Object)"SoundManager stopped");
    }

    protected abstract boolean i();

    private amv_1 a(amx_1 amx_12) {
        if (this.i()) {
            ama_2 ama_22 = (ama_2)amb_2.b.a(amx_12.g());
            if (ama_22 != null) {
                return new amd_2(ama_22);
            }
            amc_2 amc_22 = new amc_2();
            if (!amc_22.a(amx_12)) {
                return null;
            }
            try {
                if (amx_12.e() < 131072L && (ama_22 = new ama_2(amc_22)).a()) {
                    amb_2.b.a(amx_12.g(), ama_22);
                    return new amd_2(ama_22);
                }
            }
            catch (IOException iOException) {
                return null;
            }
            return amc_22;
        }
        amc_2 amc_23 = new amc_2();
        amc_23.a(amx_12);
        return amc_23;
    }

    public final amj_1 a(amx_1 amx_12, all_1 all_12, long l) {
        if (!this.r) {
            try {
                amx_12.c();
            }
            catch (IOException iOException) {
                b.error((Object)("Probl\u00e8me \u00e0 la fermeture " + amx_12.g()));
            }
            return null;
        }
        amv_1 amv_12 = this.a(amx_12);
        if (amv_12 != null) {
            amj_1 amj_12 = aml_1.a().a(l);
            if (amj_12 != null) {
                try {
                    if (amj_12.a(this, all_12, amv_12)) {
                        amv_12.n();
                        amv_12.a(true);
                        amu_1.a("Adding " + amj_12.K(), all_12.c());
                        return amj_12;
                    }
                    if (amj_12.f()) {
                        aml_1.a().a(amj_12);
                    }
                    amv_12.f();
                    return null;
                }
                catch (Exception exception) {
                    b.error((Object)("Erreur durant l'initialisation de la source : " + amx_12.g()));
                    if (amj_12.f()) {
                        aml_1.a().a(amj_12);
                    }
                    amv_12.o();
                }
            } else {
                b.error((Object)"error : source is null");
            }
        }
        try {
            amx_12.c();
        }
        catch (IOException iOException) {
            b.error((Object)("Probl\u00e8me \u00e0 la fermeture du stream de " + amx_12.g()));
        }
        return null;
    }

    public static void a(amj_1 amj_12) {
        if (amj_12 != null) {
            if (amj_12.p()) {
                amj_12.s();
            }
            amj_12.t();
            if (amj_12.f()) {
                aml_1.a().a(amj_12);
            }
        }
    }

    public boolean d(int n) {
        if (n > this.t - this.u) {
            return false;
        }
        this.u += n;
        b.debug((Object)("voices in use : " + this.u + "/" + this.t));
        return true;
    }

    public boolean e(int n) {
        if (this.u < n) {
            return false;
        }
        this.u -= n;
        b.debug((Object)("voices in use : " + this.u + "/" + this.t));
        return true;
    }

    protected int j() {
        return this.u;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(all_1 all_12) {
        if (all_12 == null) {
            return;
        }
        Object object = this.q;
        synchronized (object) {
            if (!this.p.contains(all_12)) {
                this.p.add(all_12);
                all_12.a(this);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(all_1 all_12) {
        if (all_12 == null) {
            return;
        }
        Object object = this.q;
        synchronized (object) {
            try {
                this.p.remove(all_12);
                all_12.t();
                all_12.a((ams_1)null);
            }
            catch (Exception exception) {
                b.error((Object)"Exception during removeGroup", (Throwable)exception);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final all_1 a(String string) {
        if (string == null) {
            return null;
        }
        Object object = this.q;
        synchronized (object) {
            for (all_1 all_12 : this.p) {
                if (!all_12.q().equals(string)) continue;
                return all_12;
            }
        }
        return null;
    }

    protected abstract boolean k();

    protected abstract void l();

    public static int m() {
        return h[0];
    }

    public abstract alw_1 a(ale_1 var1, int var2, int var3, int var4);

    public synchronized void f(int n) {
        if (!this.e()) {
            return;
        }
        if (!axy_2.b.a(axx_2.l)) {
            return;
        }
        if (h[0] == 0) {
            ams_1.h[0] = EFX10.alGenAuxiliaryEffectSlots();
            ams_1.f();
        }
        if (g[0] == 0) {
            ams_1.g[0] = EFX10.alGenEffects();
            ams_1.f();
        }
        if (this.n == n) {
            return;
        }
        this.n = n;
        alr_1 alr_12 = this.j(this.n);
        if (alr_12 != null) {
            try {
                EFX10.alEffecti((int)g[0], (int)32769, (int)1);
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)1, (float)alr_12.a());
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)3, (float)alr_12.b());
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)5, (float)alr_12.c());
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)6, (float)alr_12.d());
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)9, (float)alr_12.e());
                ams_1.f();
                EFX10.alEffectf((int)g[0], (int)10, (float)alr_12.f());
                ams_1.f();
                EFX10.alAuxiliaryEffectSloti((int)h[0], (int)1, (int)g[0]);
                ams_1.f();
                this.k(h[0]);
            }
            catch (Exception exception) {
                this.k(0);
            }
        } else {
            this.k(0);
        }
    }

    public void g(int n) {
        if (!this.e()) {
            return;
        }
        if (this.o == n) {
            return;
        }
        this.o = n;
    }

    public void a(int n, long l) {
        if (!axy_2.b.a(axx_2.m)) {
            return;
        }
        amo_1 amo_12 = this.j.g(n);
        if (amo_12 == null) {
            alq_1 alq_12 = this.i(this.o);
            if (alq_12 == null) {
                return;
            }
            amo_12 = new amo_1(alq_12.a(), alq_12.b(), n, this, this.b(n));
            try {
                amo_12.a();
            }
            catch (OpenALException openALException) {
                return;
            }
            this.j.a(n, amo_12);
        }
        amo_12.b(l);
    }

    protected boolean b(int n) {
        return true;
    }

    public void b(int n, long l) {
        if (!axy_2.b.a(axx_2.m)) {
            return;
        }
        amo_1 amo_12 = this.j.g(n);
        if (amo_12 != null) {
            amo_12.c(l);
        }
    }

    @Override
    public void c(int n) {
        amo_1 amo_12 = this.j.f(n);
        if (amo_12 != null) {
            amo_12.b();
        }
    }

    public abstract aly_1 h(int var1);

    protected abstract alq_1 i(int var1);

    protected abstract alr_1 j(int var1);

    protected abstract void k(int var1);

    public void c(boolean bl) {
    }

    static {
        b = Logger.getLogger(ams_1.class);
        g = new int[]{0};
        h = new int[]{0};
    }
}

