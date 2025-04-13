/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.Threading
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.jogamp.opengl.Threading;
import com.jogamp.opengl.util.texture.TextureCoords;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class abu
implements YQ,
alo_1,
acy,
aeg,
aek_0,
ahh_0,
aiG,
ain_0,
aoc_2,
aty_1 {
    private static final Logger W = Logger.getLogger(abu.class);
    private static boolean X = true;
    private String Y = "AnimStatique";
    private String Z = "AnimCourse";
    private String aa = "AnimHit";
    private final aft_2 ab;
    protected boolean b;
    protected String c = "AnimStatique";
    protected boolean d = false;
    protected float e = 1.0f;
    protected boolean f = true;
    protected String g = "AnimStatique";
    protected boolean h = true;
    protected boolean i = false;
    protected boolean j = false;
    protected static final float k = 500.0f;
    protected float l = 1.0f;
    protected boolean m = false;
    protected boolean n = false;
    protected final acg_2 o = new acg_2(5);
    protected alh_1 p = ali_1.a;
    private String ac = null;
    protected float q = 1.0f;
    protected EntityGroup r;
    protected String s;
    protected String t;
    protected int u = -1;
    protected int v = -1;
    protected int w = 0;
    protected int x = 0;
    protected boolean y = false;
    private boolean ad = true;
    atd_2 ae;
    private final afk_2 af = new afk_2();
    private static final afk_2 ag = new afk_2(-256, 256, -256, 256);
    protected Material z;
    private axn_2 ah = axn_2.b;
    private axn_2 ai = axn_2.f;
    private static final ArrayList<Fz> aj = new ArrayList(5);
    private byte ak = ahi_0.j.a();
    private final ArrayList<abb_0> al = new ArrayList(1);
    private final ArrayList<abb_0> am = new ArrayList(1);
    private boolean an = false;
    private boolean ao = false;
    private final abd_0 ap = aex.c().b();
    public static boolean A = false;
    private boolean aq = false;
    protected long B;
    protected float C;
    protected float D;
    protected float E = 0.0f;
    protected final aff_1 F = new aff_1();
    protected int G;
    protected short H;
    protected int I = Integer.MIN_VALUE;
    protected int J = Integer.MIN_VALUE;
    protected int K;
    protected ArrayList<YR> L = null;
    protected boolean M = true;
    protected boolean N = true;
    protected ArrayList<YT> O = null;
    private boolean ar = true;
    protected boolean P = true;
    private boolean as = true;
    protected final float[] Q = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    private boolean at = false;
    protected float R = 1.0f;
    protected float S = 1.0f;
    private byte au = (byte)3;
    private static final float[] av = new float[4];
    protected float T = 1.0f;
    protected short U = (short)6;
    private boolean aw = false;
    private ArrayList<FreeParticleSystem> ax;
    private ArrayList<adS> ay;
    private boolean az;
    atd_2 aA;
    final ArrayList<ats_2> aB = new ArrayList();
    private static final afk_2 aC = new afk_2();

    protected void m() {
        int n = this.aB.size();
        for (int k = 0; k < n; ++k) {
            this.aB.get(k).a();
        }
        this.aB.clear();
        this.q = 1.0f;
        this.l = 1.0f;
        this.Q[3] = 1.0f;
        this.Q[2] = 1.0f;
        this.Q[1] = 1.0f;
        this.Q[0] = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.aw = false;
        this.m = false;
        this.n = false;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.d = true;
        this.h = true;
        this.au = (byte)3;
        this.ak();
        if (this.ae != null) {
            this.ae.e();
            this.ae = null;
        }
        if (this.aA != null) {
            this.aA.e();
            this.aA = null;
        }
        if (this.r != null) {
            this.r.u();
            this.r = null;
            this.ap.b();
            assert (this.z != null);
            this.z.u();
            this.z = null;
        }
        this.aB();
    }

    Entity3D n() {
        Entity3D entity3D = (Entity3D)Entity3D.c.d();
        this.a(entity3D);
        return entity3D;
    }

    private void a(Entity entity) {
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.b();
        ayx_22.b(this.as(), this.as(), 1.0f);
        entity.D().a(ayx_22);
        entity.a(aui_1.a().b(), aup_1.d, aup_1.H);
        entity.k = this.aq ? (entity.k |= 2) : (entity.k &= 0xFFFFFFFD);
        entity.p = this;
    }

    @Override
    public byte X() {
        return 0;
    }

    @Override
    public boolean l() {
        return this.I != Integer.MIN_VALUE && this.J != Integer.MIN_VALUE;
    }

    @Override
    public float o() {
        return this.C - this.D;
    }

    @Override
    public float p() {
        return -(this.C + this.D);
    }

    @Override
    public float q() {
        return this.E / 4.8f;
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public int s() {
        return this.aq();
    }

    public final Entity t() {
        return this.r;
    }

    public final Entity3D u() {
        return this.ap.a();
    }

    public boolean v() {
        return A;
    }

    public final Material w() {
        return this.z;
    }

    public final void a(Material material) {
        this.z.a(material);
    }

    public String x() {
        return this.t;
    }

    public final byte y() {
        return this.ak;
    }

    public final void g(int n) {
        if (n < 0 || n >= ahi_0.n) {
            W.error((Object)("DeltaZ incorrect " + n));
            return;
        }
        this.ak = (byte)n;
    }

    public void a(float f2) {
        this.T = f2;
    }

    public void a(String string) {
        String string2 = this.s;
        this.s = string;
        if (string2 != this.s) {
            this.E();
        }
    }

    public String z() {
        return this.s;
    }

    protected String b(String string) {
        String string2 = this.N();
        if (string2 != null) {
            return string + string2;
        }
        return string;
    }

    public void a(alh_1 alh_12) {
        this.p = alh_12;
    }

    @Override
    public alh_1 A() {
        return this.p;
    }

    public final void B() {
        this.z.a(atd_2.n());
    }

    public void a(abu abu2) {
        if (abu2 == null) {
            return;
        }
        this.y = true;
        this.f = true;
        this.at = true;
        if (abu2.u() == null) {
            abu2.aE();
        }
        Entity entity = abu2.t();
        ava_1 ava_12 = ava_1.a(entity.O());
        this.r.a(entity.N(), entity.P(), ava_12);
        this.z.a(abu2.z);
        this.ah = abu2.ah;
        this.ai = abu2.ai;
        this.az = abu2.az;
        this.t = abu2.t;
        this.s = abu2.s;
        this.q = abu2.q;
        this.e = abu2.e;
        if (abu2.ae != null) {
            if (this.ae != null) {
                this.ae.e();
            }
            this.ae = new atd_2(abu2.ae);
        }
        if (abu2.aA != null) {
            if (this.aA != null) {
                this.aA.e();
            }
            this.aA = new atd_2(abu2.aA);
            this.aD();
        }
    }

    public final void a(axn_2 axn_22, axn_2 axn_23) {
        this.ah = axn_22;
        this.ai = axn_23;
    }

    private static Anm c(String string, boolean bl) {
        Object object;
        Object object2;
        try {
            object2 = gg_0.d(string);
            String string2 = ((URL)object2).getPath();
            object = ((URL)object2).getProtocol() + ":" + string2;
        }
        catch (MalformedURLException malformedURLException) {
            if (bl) {
                W.error((Object)"Exception during loadEquipment", (Throwable)malformedURLException);
                return null;
            }
            object = string;
        }
        try {
            object2 = atf_2.a().b((String)object, bl);
        }
        catch (IOException iOException) {
            W.error((Object)"Unable to load equipment", (Throwable)iOException);
            return null;
        }
        return object2;
    }

    public static Anm c(String string) {
        return abu.c(string, true);
    }

    public void a(String string, String ... stringArray) {
        if (string == null) {
            W.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return;
        }
        Anm anm = abu.c(string);
        if (anm == null) {
            return;
        }
        this.a(anm, auc_1.a(stringArray));
    }

    public Anm d(String string) {
        if (string == null) {
            W.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return null;
        }
        Anm anm = abu.c(string);
        if (anm == null) {
            return anm;
        }
        this.a(anm, new int[0]);
        return anm;
    }

    public Anm h(int n) {
        String string = this.i(n);
        if (string == null) {
            W.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return null;
        }
        return this.d(string);
    }

    protected String i(int n) {
        return null;
    }

    public void a(Anm anm) {
        if (anm == null) {
            return;
        }
        this.b(anm, new int[0]);
    }

    public void a(@NotNull Anm anm, int ... nArray) {
        if (this.an() == null) {
            return;
        }
        this.an().a(anm, nArray);
        this.C();
    }

    public void a(@NotNull Anm anm, int[] nArray, TIntHashSet tIntHashSet) {
        if (this.an() == null) {
            return;
        }
        this.an().a(anm, tIntHashSet, nArray);
        this.C();
    }

    public void a(@NotNull Anm anm, String[] stringArray, TIntHashSet tIntHashSet) {
        if (tIntHashSet == null || tIntHashSet.size() == 0) {
            this.a(anm, auc_1.a(stringArray));
        } else {
            this.a(anm, auc_1.a(stringArray), tIntHashSet);
        }
    }

    public void C() {
        this.y = true;
    }

    public void b(@NotNull Anm anm, int ... nArray) {
        if (this.an() != null) {
            this.an().b(anm, nArray);
        }
        this.C();
    }

    private void d(String string, boolean bl) {
        this.t = string;
        if (this.aA != null) {
            this.aA.e();
        }
        this.aA = atf_2.a().a(string, bl);
        this.aD();
    }

    private void aD() {
        this.a(this.aA, (Runnable)new abv(this));
        if (this.ae == null) {
            this.ae = this.aA;
            this.aA = null;
        } else {
            this.a(this.aA, (Runnable)new abw(this));
        }
    }

    public final void a(Runnable runnable) {
        atd_2 atd_22 = this.an();
        if (atd_22 == null) {
            return;
        }
        this.a(atd_22, runnable);
    }

    private void a(atd_2 atd_22, Runnable runnable) {
        this.a(atd_22.a(), runnable);
    }

    public final void a(Anm anm, Runnable runnable) {
        if (anm.f()) {
            runnable.run();
        } else {
            abx abx2 = new abx(this, anm, runnable);
            this.aB.add(abx2);
        }
    }

    protected void D() {
        if (this.an() == null) {
            return;
        }
        this.c(this.an().z());
    }

    public void a(String string, boolean bl) {
        assert (string.endsWith("anm") || string.endsWith("ANM"));
        this.d(string, bl);
    }

    public abu() {
        this(0L);
    }

    public abu(long l) {
        this(l, 0.0f, 0.0f);
    }

    public abu(long l, float f2, float f3) {
        this(l, f2, f3, 0.0f);
    }

    public abu(long l, float f2, float f3, float f4) {
        this.a(l);
        this.C = f2;
        this.D = f3;
        this.E = f4;
        this.ab = new aft_2();
        this.b = true;
        this.W();
        if (Threading.isOpenGLThread()) {
            this.aE();
        }
        aiI.a(this);
        this.Q();
    }

    private void aE() {
        assert (this.r == null);
        assert (this.z == null);
        this.z = (Material)Material.d.d();
        this.z.a(atd_2.n());
        this.r = this.ap.a(this);
        this.a(this.r);
    }

    public void E() {
        this.d = true;
    }

    public String F() {
        return this.c;
    }

    @Override
    public boolean e(String string) {
        if (this.c.equals(string)) {
            return false;
        }
        this.D();
        this.m(false);
        this.g = this.c;
        this.c = string;
        this.E();
        return true;
    }

    public void b(boolean bl) {
        this.h = bl;
        if (!this.h) {
            this.ae();
        }
    }

    @Override
    public boolean M() {
        return this.h && this.at();
    }

    public String N() {
        return this.ac;
    }

    @Override
    public String O() {
        return this.g;
    }

    public void f(String string) {
        boolean bl;
        boolean bl2 = bl = string != this.ac || string != null && !string.equals(this.ac);
        if (bl) {
            this.ac = string;
            this.E();
        }
    }

    public void b(float f2) {
        this.e = f2;
    }

    public String P() {
        Object object = this.c;
        String string = this.N();
        if (string != null) {
            object = (String)object + string;
        }
        return object;
    }

    public final void Q() {
        this.m = true;
    }

    protected final boolean a(float f2, float f3, float f4) {
        boolean bl;
        boolean bl2 = bl = this.ae != null && this.af.b((int)f2, (int)f3);
        if (bl) {
            float f5 = f2 - (float)this.af.a();
            float f6 = f3 - (float)this.af.c();
            bl = this.a(this.r, f5, f6, f4);
        }
        return bl;
    }

    public boolean a(float f2, float f3) {
        return this.a(f2, f3, 1.0f);
    }

    private boolean a(Entity entity, float f2, float f3, float f4) {
        if (entity == null) {
            return false;
        }
        ArrayList<Entity> arrayList = entity.U();
        if (arrayList == null) {
            return false;
        }
        aft_2 aft_22 = new aft_2();
        aft_2 aft_23 = new aft_2();
        aft_2 aft_24 = new aft_2();
        afq_2 afq_22 = new afq_2();
        afq_2 afq_23 = new afq_2();
        aft_2 aft_25 = new aft_2(f2, f3, 0.0f, 0.0f);
        boolean bl = this.ae.q() && f4 == 1.0f;
        float f5 = this.ae.B();
        float f6 = this.ae.C();
        for (Entity entity2 : arrayList) {
            int n = ((Entity3D)entity2).V();
            for (int k = 0; k < n; ++k) {
                Geometry geometry = ((Entity3D)entity2).b(k);
                if (!(geometry instanceof GLGeometryMesh)) continue;
                GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)geometry;
                VertexBufferPCT vertexBufferPCT = gLGeometryMesh.c();
                int n2 = vertexBufferPCT.j();
                FloatBuffer floatBuffer = vertexBufferPCT.b();
                for (int i2 = 0; i2 < n2; i2 += 4) {
                    float f7;
                    float f8;
                    float f9;
                    int n3 = i2 * 2;
                    aft_22.a(floatBuffer.get(n3 + 0), floatBuffer.get(n3 + 1), 0.0f, 1.0f);
                    aft_23.a(floatBuffer.get(n3 + 2), floatBuffer.get(n3 + 3), 0.0f, 1.0f);
                    aft_24.a(floatBuffer.get(n3 + 4), floatBuffer.get(n3 + 5), 0.0f, 1.0f);
                    afq_22.a(aft_24.a() - aft_23.a(), aft_24.b() - aft_23.b());
                    afq_23.a(aft_22.a() - aft_23.a(), aft_22.b() - aft_23.b());
                    float f10 = f5 - aft_23.a();
                    float f11 = f6 - aft_23.b();
                    aft_25.a(f2 + f10, f3 + f11, 0.0f, 0.0f);
                    if (f4 != 1.0f) {
                        f9 = (f4 - 1.0f) * 0.5f;
                        aft_23.a(aft_23.a - f9 * (afq_22.a + afq_23.a), aft_23.b - f9 * (afq_22.b + afq_23.b), aft_23.c, aft_23.d);
                        afq_22.d(f4);
                        afq_23.d(f4);
                    }
                    if ((f9 = afq_23.b() * afq_22.a() - afq_23.a() * afq_22.b()) == 0.0f) continue;
                    if (afq_22.a() == 0.0f) {
                        assert (afq_23.a() != 0.0f);
                        f8 = afq_23.b() * aft_25.a() - afq_23.a() * aft_25.b();
                        if ((f8 /= f9) < 0.0f || f8 > 1.0f || (f7 = (aft_25.a() - f8 * afq_22.a()) / afq_23.a()) < 0.0f || f7 > 1.0f) {
                            continue;
                        }
                    } else {
                        f7 = aft_25.b() * afq_22.a() - aft_25.a() * afq_22.b();
                        if ((f7 /= f9) < 0.0f || f7 > 1.0f || (f8 = (aft_25.a() - f7 * afq_23.a()) / afq_22.a()) < 0.0f || f8 > 1.0f) continue;
                    }
                    assert (f8 >= 0.0f && f8 <= 1.0f && f7 >= 0.0f && f7 <= 1.0f) : "et hop, du code tout bugg\u00e9";
                    FloatBuffer floatBuffer2 = vertexBufferPCT.d();
                    TextureCoords textureCoords = new TextureCoords(floatBuffer2.get(n3), floatBuffer2.get(n3 + 1), floatBuffer2.get(n3 + 4), floatBuffer2.get(n3 + 5));
                    if (bl && !this.a(f8, f7, textureCoords, ((Entity3D)entity2).c(k))) continue;
                    return true;
                }
            }
            if (!this.a(entity2, f2, f3, f4)) continue;
            return true;
        }
        return false;
    }

    private void a(aft_2 aft_22, afq_2 afq_22, afq_2 afq_23, aft_2 aft_23, Entity entity, TextureCoords textureCoords) {
        abq_0.a.a(aft_22.a(), aft_22.b(), afq_22, afq_23, aft_23);
        abq_0.a.a(((Entity3D)entity).c(0), textureCoords);
        abq_0.a.a(-1, -1, false);
        abq_0.a.b();
    }

    private void a(aft_2 aft_22, afq_2 afq_22, afq_2 afq_23, aft_2 aft_23) {
        abq_0.a.a(aft_22.a(), aft_22.b(), afq_22, afq_23, aft_23);
        abq_0.a.b();
    }

    private void a(int n, FloatBuffer floatBuffer, float f2) {
        aft_2 aft_22 = new aft_2();
        aft_2 aft_23 = new aft_2();
        aft_2 aft_24 = new aft_2();
        afq_2 afq_22 = new afq_2();
        afq_2 afq_23 = new afq_2();
        abq_0.a.c();
        for (int k = 0; k < n; k += 4) {
            int n2 = k * 2;
            aft_22.a(floatBuffer.get(n2 + 0), floatBuffer.get(n2 + 1), 0.0f, 1.0f);
            aft_23.a(floatBuffer.get(n2 + 2), floatBuffer.get(n2 + 3), 0.0f, 1.0f);
            aft_24.a(floatBuffer.get(n2 + 4), floatBuffer.get(n2 + 5), 0.0f, 1.0f);
            afq_22.a(aft_24.a() - aft_23.a(), aft_24.b() - aft_23.b());
            afq_23.a(aft_22.a() - aft_23.a(), aft_22.b() - aft_23.b());
            if (f2 != 1.0f) {
                float f3 = (f2 - 1.0f) * 0.5f;
                aft_23.a(aft_23.a - f3 * (afq_22.a + afq_23.a), aft_23.b - f3 * (afq_22.b + afq_23.b), aft_23.c, aft_23.d);
                afq_22.d(f2);
                afq_23.d(f2);
            }
            abq_0.a.a(new aft_2[]{new aft_2(aft_23.a(), aft_23.b(), 0.0f, 0.0f), new aft_2(aft_23.a() + afq_22.a(), aft_23.b() + afq_22.b(), 0.0f, 0.0f), new aft_2(aft_23.a() + afq_22.a() + afq_23.a(), aft_23.b() + afq_22.b() + afq_23.b(), 0.0f, 0.0f), new aft_2(aft_23.a() + afq_23.a(), aft_23.b() + afq_23.b(), 0.0f, 0.0f)});
        }
    }

    private void a(azc_2 azc_22, int n, int n2) {
        abq_0.a.a(n, n2, azc_22.a(n, n2));
        abq_0.a.b();
    }

    private boolean a(float f2, float f3, TextureCoords textureCoords, ays_2 ays_22) {
        if (ays_22 == null) {
            return false;
        }
        try {
            azr_2 azr_22 = ays_22.a(0);
            azc_2 azc_22 = azr_22.l();
            int n = azr_22.a();
            int n2 = azr_22.b();
            float f4 = Hw.a(textureCoords.left(), textureCoords.right(), f2);
            float f5 = Hw.a(textureCoords.top(), textureCoords.bottom(), f3);
            int n3 = Math.round(f4 * (float)n);
            int n4 = n2 - Math.round(f5 * (float)n2);
            return azc_22.a(n3, n4);
        }
        catch (Throwable throwable) {
            W.error((Object)"", throwable);
            return false;
        }
    }

    public void R() {
        zd_0.a().b(this);
        this.m();
    }

    protected boolean S() {
        return this.d || this.f || this.P || this.at || this.y;
    }

    protected void T() {
        this.d = false;
        this.f = false;
        this.at = false;
        this.y = false;
    }

    private void aF() {
        String string = this.ab();
        this.an().a(this.b(string), this.j);
    }

    public boolean a(ahg_0 ahg_02, int n) {
        return this.a(ahg_02, n, 0);
    }

    private boolean a(ahg_0 ahg_02, int n, int n2) {
        int n3;
        gc_0 gc_02;
        boolean bl;
        if (n2 > 5) {
            W.info((Object)("Boucle infinie dans le process de l'anm " + this.ae.D() + " animation courante=" + this.c + " (probl\u00e9me dans l'enchainement des goto ?)"));
            return false;
        }
        boolean bl2 = ahg_02 == null || this.b(ahg_02);
        boolean bl3 = bl = this.ad && bl2;
        if (this.an) {
            this.al.removeAll(this.am);
            this.am.clear();
            this.an = false;
        }
        if (this.aA != null) {
            return true;
        }
        if (this.ae == null) {
            return false;
        }
        boolean bl4 = this.ae.v();
        if (this.m) {
            this.m = false;
            if (bl2) {
                if (!bl4) {
                    this.n = true;
                } else {
                    this.l = 0.0f;
                }
            }
        }
        if (this.n && bl4) {
            this.l = 0.0f;
            this.n = false;
        }
        if (this.u() == null) {
            this.aE();
            this.g(this.ao);
            this.at = true;
        }
        assert (n < 1000000) : "DeltaTime is very high (" + n + "), did you use realTime instead ?";
        if (this.s == null) {
            return false;
        }
        this.x = (int)((float)this.x + (float)n * this.e * abc_0.a());
        assert (this.ae != null);
        if (!bl4) {
            return false;
        }
        this.ae.x();
        if (this.l < this.S) {
            this.l += (float)n / 500.0f;
            if (this.l > this.S) {
                this.l = this.S;
            }
            if (this.Q[3] != this.l) {
                this.Q[3] = this.l;
                this.at = true;
            }
        }
        boolean bl5 = false;
        this.y |= this.ae.E();
        if (this.S() && bl) {
            bl5 = true;
            this.P = false;
            gc_02 = this.ae.i();
            this.ae.a(this.b(this.c), this.i);
            n3 = this.ae.j();
            if (this.ae.i() == null) {
                if (n3 != 0 && gc_02 != null) {
                    this.ae.a(gc_02.b(), this.i);
                } else {
                    this.ae.a(this.b("AnimStatique"), this.i);
                }
            }
            if (this.ae.i() != null || n3 != 0) {
                if (this.d && this.ae.k()) {
                    this.x = 0;
                    if (this.o.d() > 0) {
                        this.ae();
                    }
                }
                this.w = this.x;
                this.d = false;
                this.u = -1;
                this.v = -1;
            } else {
                this.aF();
                if (this.ae.i() != gc_02) {
                    this.x = 0;
                    this.u = -1;
                    this.v = -1;
                    this.w = 0;
                }
            }
            this.T();
            if (n3 != 0) {
                this.d = true;
                return true;
            }
        }
        if ((gc_02 = this.ae.i()) != null && gc_02.f()) {
            this.aG();
            this.a(ahg_02, n, n2 + 1);
            return true;
        }
        if (this.ae.h()) {
            bl5 = true;
        }
        if (this.ae.l()) {
            bl5 = true;
        }
        if (this.ae.i() == null) {
            return false;
        }
        n3 = this.ae.e(this.x);
        if (n3 != this.v || n3 != this.u) {
            bl5 = true;
        }
        boolean bl6 = false;
        if (this.ae.m()) {
            bl6 = true;
        }
        if ((!this.az || this.ae.w()) && (bl6 || bl5 || this.ae.w())) {
            boolean bl7;
            boolean bl8 = this.v != n3 || bl6;
            boolean bl9 = bl7 = ahg_02 == null || this.at() && bl2;
            if (bl && bl8 && bl7) {
                this.ae.a(this.z);
                this.ae.a(this.ah, this.ai);
                this.ae.a(this.x, this.u(), n);
                this.v = n3;
            }
            if (this.u != n3) {
                this.u = n3;
                this.aG();
                if (n3 == this.ae.r() - 1) {
                    this.aH();
                    if (this.ae == null) {
                        return false;
                    }
                }
            }
            this.w = this.x;
        }
        this.ae.a((float)n);
        return true;
    }

    protected boolean U() {
        return this.ad || this.d;
    }

    private void aG() {
        this.ae.a(aj, this.x, this.w);
        this.a(aj);
        aj.clear();
    }

    public aft_2 a(ahg_0 ahg_02) {
        if (this.b) {
            float f2 = ahg_02.c(this.C, this.D);
            float f3 = ahg_02.a(this.C, this.D, this.E);
            this.ab.a(f2, f3, -1.0f);
            this.b = false;
        }
        return this.ab;
    }

    public void c(boolean bl) {
        if (bl != this.ar) {
            this.q(bl);
            this.ar = bl;
            this.P = true;
            this.a(bl, YU.b);
            this.j(bl);
        }
        if (this.P && bl) {
            this.b = true;
        }
    }

    private void q(boolean bl) {
        if (this.ad == bl) {
            return;
        }
        this.ad = bl;
        this.f = true;
    }

    public boolean V() {
        return this.az;
    }

    public void d(boolean bl) {
        this.az = bl;
        this.U();
    }

    public void W() {
        this.b = true;
    }

    public boolean b(ahg_0 ahg_02) {
        aft_2 aft_22 = this.a(ahg_02);
        ahq_0 ahq_02 = ahg_02.s();
        int n = (int)aft_22.a();
        int n2 = (int)aft_22.b();
        aC.a(n + ag.a(), n + ag.b(), n2 + ag.c(), n2 + ag.d());
        return ahq_02.a(abu.aC.e, abu.aC.b, abu.aC.d, abu.aC.c);
    }

    public boolean a(acb_0 acb_02) {
        float[] fArray;
        boolean bl;
        if (!this.at() || !this.b((ahg_0)acb_02) || this.ae == null) {
            return false;
        }
        if (this.ae.i() == null) {
            this.af.a(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
            this.b(acb_02);
            return false;
        }
        aft_2 aft_22 = this.a((ahg_0)acb_02);
        abY abY2 = acb_02.b();
        afk_2 afk_22 = this.ae.o();
        int n = Hw.b(aft_22.a());
        int n2 = Hw.b(aft_22.b());
        this.r.l = n + afk_22.b;
        this.r.m = n + afk_22.c;
        this.r.n = n2 + afk_22.d;
        this.r.o = n2 + afk_22.e;
        int n3 = n - abY2.o();
        int n4 = n2 - abY2.p();
        this.af.a(n3 + afk_22.b, n3 + afk_22.c, n4 + afk_22.d, n4 + afk_22.e);
        if (!abY2.a(this.r.o, this.r.l, this.r.n, this.r.m)) {
            return false;
        }
        float f2 = this.J();
        float f3 = this.K();
        float f4 = this.L();
        float f5 = f2;
        float f6 = f3;
        int n5 = Hw.b(f5);
        int n6 = Hw.b(f6);
        int n7 = Hw.b(f4);
        if (aiI.b(this)) {
            acb_02.a(this, this.r, n5, n6, n7, this.ak, false);
        }
        boolean bl2 = bl = (fArray = ((ahq_0)abY2).a(this))[3] != 0.0f;
        if (this.as != bl) {
            this.a(bl, YU.a);
            this.as = bl;
        }
        if (!bl) {
            return false;
        }
        System.arraycopy(fArray, 0, av, 0, fArray.length);
        byte by = acd_0.a(this.au, av);
        if (by != this.au) {
            this.au = by;
        }
        this.a(av);
        this.u().a(this.z);
        this.r.D().b(0, this.as(), this.as());
        this.r.D().a(0, aft_22.a(), aft_22.b());
        this.r.i = this.q;
        if (X && this.q >= 1.0f && this.ad && (f2 != (float)n5 || (float)n6 != f3)) {
            this.r.i = this.q + 1.0f;
        }
        this.r.f = f5;
        this.r.g = f6;
        this.r.h = f4;
        this.r.j = this.ag();
        if (!acb_02.a(this)) {
            return false;
        }
        acb_02.a(this.r, this.q > 0.0f);
        return true;
    }

    private void b(acb_0 acb_02) {
        if (this.r == null) {
            return;
        }
        if (!aiI.b(this)) {
            return;
        }
        float f2 = this.J();
        float f3 = this.K();
        float f4 = this.L();
        float f5 = f2;
        float f6 = f3;
        int n = Hw.b(f5);
        int n2 = Hw.b(f6);
        int n3 = Hw.b(f4);
        acb_02.a(this, this.r, n, n2, n3, this.ak, false);
    }

    protected float Y() {
        return 0.0f;
    }

    protected float Z() {
        return 0.0f;
    }

    public void a(acb_0 acb_02, int n) {
        this.P = false;
        this.b = true;
    }

    public long aa() {
        return this.r.e;
    }

    public boolean a(Fz fz) {
        return false;
    }

    @Override
    public String ab() {
        return this.Y;
    }

    public void g(String string) {
        assert (string != null);
        this.Y = string;
    }

    @Override
    public String ac() {
        return this.Z;
    }

    public void h(String string) {
        assert (string != null);
        this.Z = string;
    }

    public void a(ArrayList<Fz> arrayList) {
        boolean bl = false;
        int n = -1;
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            Fz fz = arrayList.get(k);
            int n3 = fz.a();
            if (bl && n != n3) break;
            Object r2 = abo_0.a(fz.getClass());
            bl |= r2.a(this, (Fz)fz);
            n = n3;
        }
    }

    public final void b(Material material) {
        if (this.z == null) {
            return;
        }
        this.z.a(material);
    }

    public void ad() {
        if (this.z == null) {
            return;
        }
        this.z.b(0.0f, 0.0f, 0.0f);
        ArrayList<Entity> arrayList = this.r.U();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            arrayList.get(k).Q();
        }
    }

    public void a(long l, long l2) {
        this.o.a(l, l2);
    }

    protected void ae() {
        for (int k = this.o.d() - 1; k >= 0; --k) {
            amj_1 amj_12 = aml_1.a().b(this.o.d(k));
            if (amj_12 == null) continue;
            amj_12.f(true);
            amj_12.a(0.0f, 0.7f);
        }
        this.o.c();
    }

    public short af() {
        return this.U;
    }

    public short ag() {
        Anm anm = this.am();
        if (anm == null) {
            return this.af();
        }
        String string = this.N();
        Object object = string == null ? this.c : this.c + string;
        int n = anm.a((String)object);
        if (n == -1) {
            return this.af();
        }
        return (short)n;
    }

    public void a(short s2) {
        this.U = s2;
    }

    public void e(boolean bl) {
    }

    public String ah() {
        return this.aa;
    }

    public void i(String string) {
        this.aa = string;
    }

    public void a(float[] fArray) {
        assert (fArray.length == 4);
        float f2 = this.Q[3];
        float f3 = f2 * this.Q[0] * fArray[0];
        float f4 = f2 * this.Q[1] * fArray[1];
        float f5 = f2 * this.Q[2] * fArray[2];
        float f6 = f2 * fArray[3];
        this.z.a(f3, f4, f5, f6);
    }

    @Override
    public void c(float f2) {
        this.q = f2;
    }

    public float ai() {
        return this.q;
    }

    @Override
    public float aj() {
        return this.r.i;
    }

    public boolean a(abb_0 abb_02) {
        if (!this.al.contains(abb_02)) {
            return this.al.add(abb_02);
        }
        return false;
    }

    public void ak() {
        this.al.clear();
    }

    public void b(abb_0 abb_02) {
        this.am.add(abb_02);
        this.an = true;
    }

    public void al() {
        this.aH();
        this.am.addAll(this.al);
        this.an = true;
    }

    @Nullable
    public Anm am() {
        atd_2 atd_22 = this.an();
        return atd_22 == null ? null : atd_22.a();
    }

    public atd_2 an() {
        return this.aA == null ? this.ae : this.aA;
    }

    public int j(String string) {
        if (this.an() == null || string == null) {
            return 0;
        }
        return this.an().b(string);
    }

    public final void f(boolean bl) {
        if (this.ao == bl) {
            return;
        }
        this.g(bl);
    }

    public final void g(boolean bl) {
        this.ao = bl;
        if (this.u() == null) {
            return;
        }
        this.r.k = this.ao ? (this.r.k |= 1) : (this.r.k &= 0xFFFFFFFE);
        this.ap.a(this.ao);
    }

    public final boolean ao() {
        return this.ao;
    }

    public final void h(boolean bl) {
        this.aq = bl;
        if (this.r != null) {
            this.r.k = this.aq ? (this.r.k |= 2) : (this.r.k &= 0xFFFFFFFD);
        }
    }

    private void aH() {
        int n = this.al.size();
        for (int k = 0; k < n; ++k) {
            this.al.get(k).animationEnded(this);
        }
    }

    public void i(boolean bl) {
        this.at = bl;
    }

    @Override
    public void b(float[] fArray) {
        if (fArray[0] == 1.0f && fArray[1] == 1.0f && fArray[2] == 1.0f) {
            return;
        }
        this.z.a(fArray[0], fArray[1], fArray[2]);
    }

    public void a(String[] stringArray, boolean bl) {
        for (String string : stringArray) {
            this.b(string, bl);
        }
    }

    public void b(String string, boolean bl) {
        int n = string.hashCode();
        if (bl) {
            this.an().b(n);
        } else {
            this.an().a(n);
        }
    }

    protected void a(long l) {
        this.B = l;
    }

    public long a() {
        return this.B;
    }

    @Override
    public float L() {
        return this.E;
    }

    @Override
    public float J() {
        return this.C;
    }

    @Override
    public float K() {
        return this.D;
    }

    @Override
    public int G() {
        return Hw.b(this.C);
    }

    @Override
    public int H() {
        return Hw.b(this.D);
    }

    @Override
    public short I() {
        return (short)Hw.b(this.E);
    }

    @Override
    public void b(float f2, float f3) {
        this.C = f2;
        this.D = f3;
        this.W();
        aiI.a(this);
    }

    @Override
    public void b(float f2, float f3, float f4) {
        this.C = f2;
        this.D = f3;
        if (f4 == -32768.0f) {
            abz_0.Y.error((Object)"", (Throwable)new Exception("on vient de setter une altitude anormale"));
        }
        this.E = f4;
        this.W();
        aiI.a(this);
    }

    public aff_1 ap() {
        this.F.c(this.G(), this.H(), (short)this.E);
        return this.F;
    }

    @Override
    public final int aq() {
        return this.G;
    }

    @Override
    public final short ar() {
        return this.H;
    }

    @Override
    public void a(int n, short s2) {
        this.G = n;
        this.H = s2;
    }

    @Override
    public int i() {
        return this.I;
    }

    @Override
    public int j() {
        return this.J;
    }

    @Override
    public void d(int n) {
        this.I = n;
    }

    @Override
    public void e(int n) {
        this.J = n;
    }

    @Override
    public void f(int n) {
        this.K = n;
    }

    @Override
    public int k() {
        return this.K;
    }

    public float as() {
        return this.T;
    }

    @Override
    public boolean at() {
        return this.ar;
    }

    public float au() {
        return this.Q[3];
    }

    public void d(float f2) {
        this.Q[3] = f2;
    }

    public void e(float f2) {
        this.Q[3] = this.S = f2;
    }

    public void av() {
        this.Q[3] = this.S;
    }

    public float aw() {
        return this.R;
    }

    public boolean ax() {
        return this.L != null;
    }

    @Override
    public void a(YR yR) {
        if (this.L == null) {
            this.L = new ArrayList();
        }
        this.L.add(yR);
        yR.setTargetIsVisible(this.M);
    }

    @Override
    public void b(YR yR) {
        if (this.L == null) {
            return;
        }
        this.L.remove(yR);
        if (this.L.size() == 0) {
            this.L = null;
            this.I = Integer.MIN_VALUE;
            this.J = Integer.MIN_VALUE;
        }
    }

    public void ay() {
        if (this.L != null) {
            for (int k = 0; k < this.L.size(); ++k) {
                this.L.get(k).a(this, this.I, this.J, this.K);
            }
        }
    }

    public void j(boolean bl) {
        if (bl == this.M) {
            return;
        }
        this.M = bl;
        this.aI();
    }

    public void k(boolean bl) {
        if (bl == this.N) {
            return;
        }
        this.N = bl;
        this.aI();
    }

    private void aI() {
        if (this.L == null) {
            return;
        }
        for (int k = 0; k < this.L.size(); ++k) {
            this.L.get(k).setTargetIsVisible(!this.N && this.M);
        }
    }

    public void a(boolean bl, YU yU) {
        if (this.O != null) {
            for (int k = 0; k < this.O.size(); ++k) {
                this.O.get(k).a(bl, yU);
            }
        }
    }

    public void a(YT yT) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(yT);
    }

    public void b(YT yT) {
        if (this.O != null) {
            this.O.remove(yT);
        }
    }

    @Override
    public int az() {
        return -1;
    }

    public boolean aA() {
        return this.au == 1 || this.au == 0;
    }

    @Override
    public final void l(boolean bl) {
        this.au = (byte)(bl ? 0 : 2);
    }

    public void m(boolean bl) {
        this.aw = bl;
        this.aw = false;
    }

    public static void n(boolean bl) {
        X = bl;
    }

    @Override
    public void a(FreeParticleSystem freeParticleSystem) {
        if (this.ax == null) {
            this.ax = new ArrayList();
        }
        this.ax.add(freeParticleSystem);
    }

    @Override
    public void b(FreeParticleSystem freeParticleSystem) {
        if (this.ax != null) {
            this.ax.remove(freeParticleSystem);
        }
    }

    @Override
    public void a(adS adS2) {
        if (this.ay == null) {
            this.ay = new ArrayList();
        }
        this.ay.add(adS2);
    }

    @Override
    public void b(adS adS2) {
        if (this.ay != null) {
            this.ay.remove(adS2);
        }
    }

    @Override
    public void aB() {
        int n;
        if (this.ax != null) {
            for (n = 0; n < this.ax.size(); ++n) {
                this.ax.get(n).aa();
            }
        }
        if (this.ay != null) {
            for (n = 0; n < this.ay.size(); ++n) {
                this.ay.get(n).b(100);
            }
        }
    }

    public float[] j(int n) {
        if (this.an() == null) {
            return null;
        }
        return this.an().f(n);
    }

    public void a(atm_1 atm_12, float[] fArray) {
        this.a(atm_12.b(), fArray);
    }

    public void a(int n, float[] fArray) {
        this.a(n, fArray, true);
    }

    public void a(int n, float[] fArray, boolean bl) {
        assert (fArray == null || fArray.length == 4);
        atd_2 atd_22 = this.an();
        if (atd_22 == null) {
            return;
        }
        if (fArray == null) {
            atd_22.g(n);
        }
        if (!bl && atd_22.f(n) != null) {
            return;
        }
        atd_22.a(n, fArray);
    }
}

