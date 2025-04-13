/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from SD
 */
public abstract class sd_0<FX extends Sl, EC extends Sm>
implements si_0<FX, EC>,
aqs_2 {
    private static final byte v = 3;
    protected static final Logger a = Logger.getLogger(sd_0.class);
    protected boolean b = false;
    protected FX c = null;
    protected EC d = null;
    protected Su e = null;
    protected Su f = null;
    protected final aff_1 g = new aff_1();
    private Sr w;
    private se_0 x = null;
    protected So<FX> h = null;
    protected int i;
    protected long j = -1L;
    protected long k = -1L;
    protected sf_0 l;
    protected int m = 0;
    private final HashSet<Integer> y = new HashSet();
    protected int n = -1;
    private sd_0<FX, EC> z;
    protected boolean o = true;
    private boolean A = false;
    private static short B;
    private static final short C = 400;
    protected static final short p = 2000;
    protected vk_0 q = vk_0.a();
    private static final boolean D = false;
    private boolean E = false;
    private Wa F;
    protected byte[] r;
    private static long G;
    private static sh_0 H;
    protected boolean s = false;
    protected Ss t = null;
    private boolean I = false;
    protected boolean u = false;
    private boolean J = false;

    public static void bs_() {
        B = 0;
    }

    public static void a(sh_0 sh_02) {
        H = sh_02;
    }

    private static long aC() {
        if (G < Long.MAX_VALUE) {
            return G++;
        }
        G = 0L;
        return G;
    }

    @Override
    public int bt_() {
        return this.i;
    }

    @Override
    public void a(int n) {
        this.i = n;
    }

    public long c() {
        return this.j;
    }

    public long d() {
        return this.k;
    }

    public void a(long l) {
        this.j = l;
    }

    @Override
    public sf_0 e() {
        return this.l;
    }

    @Override
    public void a(sf_0 sf_02) {
        this.l = sf_02;
    }

    public FX f() {
        return this.c;
    }

    public void a(FX FX) {
        this.c = FX;
    }

    public void g() {
        this.t = new Ss();
        this.u = true;
    }

    public Su h() {
        return this.e;
    }

    public void a(Su su) {
        this.e = su;
    }

    public Su i() {
        return this.f;
    }

    public aff_1 j() {
        return this.g;
    }

    public EC k() {
        return this.d;
    }

    public void b(Su su) {
        this.f = su;
    }

    public void a(int n, int n2, short s2) {
        this.g.c(n, n2, s2);
    }

    public Sr l() {
        return this.w;
    }

    public void a(EC EC) {
        this.d = EC;
    }

    public void a(So so) {
        this.h = so;
    }

    public So m() {
        return this.h;
    }

    public int n() {
        return this.m;
    }

    public void b(int n) {
        this.m = n;
    }

    public int o() {
        if (this.c == null) {
            return -1;
        }
        return this.c.i();
    }

    public boolean p() {
        return false;
    }

    public void q() {
        this.z();
        this.b = true;
    }

    public boolean r() {
        return this.b;
    }

    public List<List<Su>> s() {
        return this.a(this.c, this.e, this.h, this.g.d(), this.g.e(), this.g.f());
    }

    @Override
    public Ss a(FX FX, EC EC, So so, Su su, int n, int n2, short s2, Su su2, Sr sr) {
        Object object;
        if (this.t != null) {
            this.t.f();
        } else {
            this.t = Ss.a();
            this.I = true;
        }
        if (sr == null || sr.c()) {
            sd_0.bs_();
        }
        this.a(FX, EC, so, su, null, n, n2, s2, sr);
        if (this.S() && !this.R() && (object = this.w()) != null) {
            if (((sd_0)object).as() && !((sd_0)object).at()) {
                ((sd_0)object).an();
            }
            if (((sd_0)object).D()) {
                if (((sd_0)object).R() && this.f == null) {
                    a.warn((Object)(" on veut calculer un effet qui a besoin d'une cible, sans cible : " + this.ag()));
                }
                if (((sd_0)object).Q() && this.e == null) {
                    a.warn((Object)("on veut calculer un effet qui a besoin d'un caster, sans caster : " + this.ag()));
                }
                if (((sd_0)object).S() && this.g == null) {
                    a.warn((Object)("on veut calculer un effet qui a besoin d'une cellule cible, sans cellule cible : " + this.ag()));
                }
                ((sd_0)object).h(null);
            }
            if (this.e != null && this.e.x_() != null) {
                if (((sd_0)object).at() || ((sd_0)object).as()) {
                    this.e.x_().a((sd_0)object);
                }
            } else {
                ((sd_0)object).af();
            }
            if (!((sd_0)object).P()) {
                ((sd_0)object).ad();
            }
        }
        if (this.R()) {
            if (su2 == null || FX != null && FX.C()) {
                object = this.a(FX, su, so, n, n2, s2);
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    List list = (List)iterator.next();
                    this.b(list);
                    if (this.t == null) continue;
                    this.t.a(list);
                }
            } else {
                this.c(su2);
                if (this.t != null) {
                    this.t.a(su2);
                }
            }
        }
        if (this.u) {
            this.u();
        }
        return this.t;
    }

    public void a(FX FX, EC EC, So so, Su su, Su su2, int n, int n2, short s2, Sr sr) {
        this.c = FX;
        this.d = EC;
        this.e = su;
        this.h = so;
        this.f = su2;
        this.a(n, n2, s2);
        if (this.w != null) {
            this.w.a();
        }
        this.w = sr != null ? sr.b() : null;
        this.t();
    }

    public void a(Sr sr) {
        if (this.w != null) {
            this.w.a();
        }
        this.w = sr;
    }

    protected void t() {
        if (this.c != null) {
            this.n = this.c.x();
        }
    }

    protected void u() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.f = null;
        if (this.w != null) {
            this.w.a();
        }
        this.w = null;
    }

    public sd_0 v() {
        return this.z;
    }

    public void a(sd_0<FX, EC> sd_02) {
        this.z = sd_02;
    }

    @Override
    public sd_0 a(So so, Si<FX> si) {
        sd_0<FX, EC> sd_02 = this.w();
        sd_02.a(this.bt_());
        sd_02.a(so);
        sd_02.a(this.e());
        return sd_02;
    }

    public sd_0<FX, EC> w() {
        sd_0<FX, EC> sd_02 = this.x();
        sd_02.j = H != null ? H.a(sd_02) : sd_0.aC();
        sd_02.b(this);
        sd_02.k = sd_02.j;
        return sd_02;
    }

    public abstract sd_0<FX, EC> x();

    protected void y() {
        this.x = null;
        this.n = -1;
        this.e = null;
        this.f = null;
        this.h = null;
        this.c = null;
        this.d = null;
        this.o = true;
        this.y.clear();
        this.u = false;
        this.t = null;
        this.j = -1L;
        this.k = -1L;
        this.I = false;
        this.q = null;
        this.E = false;
    }

    public void z() {
        this.J = false;
        this.y();
        this.g.c(Integer.MIN_VALUE, Integer.MIN_VALUE, (short)Short.MIN_VALUE);
        if (this.w != null) {
            this.w.a();
        }
        this.w = null;
        this.m = 0;
        this.z = null;
        this.s = false;
        if (this.F != null) {
            this.F.h();
        }
        this.F = null;
        if (this.t != null && this.I) {
            this.t.g();
        }
    }

    protected void b(sd_0<FX, EC> sd_02) {
        this.J = sd_02.J;
        this.c = sd_02.c;
        this.d = sd_02.d;
        this.e = sd_02.e;
        this.f = sd_02.f;
        this.g.g(sd_02.g);
        if (this.w != null) {
            this.w.a();
        }
        this.w = sd_02.w != null ? sd_02.w.b() : null;
        this.h = sd_02.h;
        this.i = sd_02.i;
        this.l = sd_02.l;
        this.m = sd_02.m;
        this.M();
        this.y.addAll(sd_02.y);
        this.O();
        this.n = sd_02.n;
        this.z = sd_02.z;
        this.s = false;
        this.t = sd_02.t;
        this.o = sd_02.o;
    }

    public void c(int n) {
        this.y.add(n);
    }

    public void a(Collection<Integer> collection) {
        this.y.addAll(collection);
    }

    public void d(int n) {
        this.y.remove(n);
    }

    public boolean e(int n) {
        return this.y.contains(n);
    }

    public se_0 A() {
        return this.x;
    }

    public void a(se_0 se_02) {
        this.x = se_02;
    }

    public void B() {
        this.o = false;
    }

    public void C() {
        this.o = true;
    }

    public boolean D() {
        return this.o;
    }

    public Ss E() {
        return this.t;
    }

    public BitSet F() {
        if (this.c == null) {
            return null;
        }
        return this.c.l();
    }

    public BitSet G() {
        if (this.c == null) {
            return null;
        }
        return this.c.m();
    }

    public BitSet H() {
        if (this.c == null) {
            return null;
        }
        return this.c.o();
    }

    public BitSet I() {
        if (this.c == null) {
            return null;
        }
        return this.c.p();
    }

    public BitSet J() {
        if (this.c == null) {
            return null;
        }
        return this.c.q();
    }

    public boolean f(int n) {
        if (n < 0) {
            return false;
        }
        if (this.G() != null && this.G().get(n)) {
            return true;
        }
        if (this.F() != null && this.F().get(n)) {
            return true;
        }
        if (this.H() != null && this.H().get(n)) {
            return true;
        }
        if (this.I() != null && this.I().get(n)) {
            return true;
        }
        return this.J() != null && this.J().get(n);
    }

    public BitSet K() {
        if (this.c == null) {
            return null;
        }
        return this.c.n();
    }

    @Override
    public BitSet L() {
        if (this.c != null && this.c.t() != null) {
            this.c.t().stream().forEach(this.y::add);
        }
        return sd_0.a(this.y);
    }

    @NotNull
    private static BitSet a(Set<Integer> set) {
        BitSet bitSet = new BitSet();
        set.forEach(bitSet::set);
        return bitSet;
    }

    public void M() {
        this.y.clear();
        this.y.add(0);
    }

    public int N() {
        if (this.c == null) {
            return Integer.MIN_VALUE;
        }
        return this.c.r();
    }

    protected void O() {
    }

    public boolean P() {
        if (this.G() != null && !this.G().isEmpty()) {
            return true;
        }
        if (this.F() != null && !this.F().isEmpty()) {
            return true;
        }
        if (this.H() != null && !this.H().isEmpty()) {
            return true;
        }
        if (this.I() != null && !this.I().isEmpty()) {
            return true;
        }
        return this.J() != null && !this.J().isEmpty();
    }

    public abstract boolean Q();

    public abstract boolean R();

    public abstract boolean S();

    public void a(int n, float f2, boolean bl) {
    }

    public boolean T() {
        return this.c != null && this.c.a();
    }

    public boolean U() {
        return this.c != null && this.c.c();
    }

    public void a(byte ... byArray) {
        if (this.L() == null) {
            return;
        }
        for (byte by : byArray) {
            this.a(by);
        }
    }

    public void V() {
        this.J = true;
    }

    public boolean W() {
        return this.J || this.c != null && this.c.f();
    }

    public boolean X() {
        return this.J;
    }

    public boolean a(byte by) {
        if (this.L() == null) {
            return false;
        }
        boolean bl = false;
        switch (by) {
            case 1: {
                ArrayList<Su> arrayList = new ArrayList<Su>();
                while (this.h() != null && !arrayList.contains(this.h())) {
                    arrayList.add(this.h());
                    bl |= this.h().a(this.L(), this, (byte)10);
                }
                arrayList.clear();
                while (this.i() != null && !arrayList.contains(this.i())) {
                    arrayList.add(this.i());
                    bl |= this.i().a(this.L(), this, (byte)1);
                }
                break;
            }
            case 2: {
                if (this.h() != null) {
                    bl |= this.h().a(this.L(), this, (byte)20);
                }
                if (this.i() == null) break;
                bl |= this.i().a(this.L(), this, (byte)2);
                break;
            }
            case 3: {
                if (this.h() != null) {
                    bl |= this.h().a(this.L(), this, (byte)30);
                }
                if (this.i() == null) break;
                bl |= this.i().a(this.L(), this, (byte)3);
                break;
            }
            case 4: {
                if (this.h() != null) {
                    bl |= this.h().a(this.L(), this, (byte)40);
                }
                if (this.i() == null) break;
                bl |= this.i().a(this.L(), this, (byte)4);
                break;
            }
            case 6: {
                if (this.h() != null) {
                    bl |= this.h().a(this.L(), this, (byte)60);
                }
                if (this.i() == null) break;
                bl |= this.i().a(this.L(), this, (byte)6);
                break;
            }
        }
        return bl;
    }

    public void Y() {
        if (this.h != null && this.h.b() != null) {
            this.h.b().c(this);
        }
    }

    public void Z() {
        if (this.h != null && this.h.b() != null) {
            this.h.b().d(this);
        }
    }

    public void c(Su su) {
        if (su == null) {
            return;
        }
        this.b(Collections.singletonList(su));
    }

    public boolean b(Collection<Su> collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        boolean bl = false;
        if ((B = (short)(B + 1)) >= this.aa()) {
            if (B == this.aa()) {
                StringBuilder stringBuilder = new StringBuilder().append("infinite loop on RunningEffect ? action id=").append(this.bt_()).append(", effect Id ").append(this.o()).append(", context ").append(this.m());
                if (this.m() != null && this.m().i() != null) {
                    stringBuilder.append(", Casted Spell ").append(this.m().i().c());
                }
                stringBuilder.append(", Trigger history ").append(SK.a);
                a.error((Object)stringBuilder.toString(), (Throwable)new NullPointerException("Error for stack analysis"));
            }
            return false;
        }
        ArrayList<sd_0<FX, EC>> arrayList = new ArrayList<sd_0<FX, EC>>();
        ArrayList<sd_0<FX, EC>> arrayList2 = new ArrayList<sd_0<FX, EC>>();
        for (Su object : collection) {
            sd_0<FX, EC> sd_02 = this.w();
            sd_02.b(object);
            if (this.h != null && this.h.d() != null) {
                sd_02.q = this.h.d().A();
            }
            if (!sd_02.P()) {
                if (object != null) {
                    sd_02.a((byte)1);
                }
                if (sd_02.E) {
                    sd_02.q();
                    continue;
                }
                if (this.D() && sd_02.D()) {
                    if (this.Q() && sd_02.h() == null) {
                        a.warn((Object)("Needing caster effect has no caster " + this.bt_() + (String)(this.c != null ? " generic effect " + this.c.i() + "action " + this.c.j() : "")));
                    }
                    if (this.S() && sd_02.j() == null) {
                        a.warn((Object)("Needing target cell effect has no target cell " + this.bt_() + (String)(this.c != null ? " generic effect" + this.c.i() + " action " + this.c.j() : "")));
                    }
                    sd_02.h(null);
                }
                bl = true;
                arrayList.add(sd_02);
            } else if (sd_02.as() && !sd_02.at()) {
                bl = true;
                sd_02.an();
            }
            if (sd_02.as() || sd_02.aq()) {
                if (this.ar()) {
                    if (sd_02.h() != null && sd_02.h().x_() != null) {
                        sd_02.h().x_().a((sd_0)sd_02);
                        sd_02.Y();
                    } else {
                        arrayList2.add(sd_02);
                    }
                } else if (sd_02.i() != null && sd_02.i().x_() != null) {
                    sd_02.i().x_().a((sd_0)sd_02);
                    sd_02.Y();
                } else {
                    arrayList2.add(sd_02);
                }
            }
            if (arrayList.contains(sd_02) || arrayList2.contains(sd_02) || sd_02.x != null) continue;
            sd_02.q();
        }
        for (sd_0 sd_03 : arrayList) {
            if (sd_03.as() && !sd_03.at()) {
                sd_03.an();
            }
            if (!sd_03.aq()) {
                sd_03.ad();
                continue;
            }
            sd_03.am();
        }
        for (sd_0 sd_04 : arrayList2) {
            sd_04.q();
        }
        return bl;
    }

    public short aa() {
        return 400;
    }

    public void a(boolean bl) {
        this.E = bl;
    }

    public abstract boolean ab();

    protected abstract boolean ac();

    public boolean c(sd_0 sd_02) {
        return true;
    }

    public void ad() {
        if (this.ab()) {
            if (this.i() != null && this.i().t() && !this.aA()) {
                this.c(false);
                return;
            }
            this.a((byte)2);
            if (this.i() != null && this.i().t() && !this.aA()) {
                this.c(false);
                return;
            }
            if (this.ac()) {
                this.c(false);
                return;
            }
            this.a(this.v(), false);
            return;
        }
        this.c(false);
    }

    protected void ae() {
    }

    public void af() {
        this.s = true;
    }

    protected void d(sd_0 sd_02) {
        sd_02.af();
    }

    public void e(sd_0 sd_02) {
        Object object;
        long l;
        Su su = this.g(sd_02);
        long l2 = su != null ? su.a_() : 0L;
        Su su2 = this.f(sd_02);
        long l3 = l = su2 != null ? su2.a_() : 0L;
        if (SK.a.b(this.o(), l2, l)) {
            return;
        }
        if (!this.c(sd_02)) {
            return;
        }
        sd_0<FX, EC> sd_03 = this.w();
        sd_03.a(this);
        sd_03.k = this.c();
        this.d(sd_03);
        if (sd_02 != null) {
            sd_03.a(this.g(sd_02));
            sd_03.b(this.f(sd_02));
            if (sd_03.i() != null) {
                object = sd_03.i();
                sd_03.a(object.G(), object.H(), object.I());
            } else {
                object = sd_02.j();
                sd_03.a(((aff_1)object).d(), ((aff_1)object).e(), ((aff_1)object).f());
            }
        }
        if (sd_03.R() && sd_03.i() == null || sd_03.Q() && sd_03.h() == null || sd_03.i() != null && sd_03.i().t() && !this.aA() || sd_03.S() && sd_03.j() == null) {
            if (sd_03.R() && sd_03.i() == null) {
                a.error((Object)("on veut executer un effet qui a besoin d'une cible, sans cible (action=" + sd_03.ag() + ")"));
            }
            if (sd_03.Q() && sd_03.h() == null) {
                a.error((Object)("on veut executer un effet qui a besoin d'un caster, sans caster\t(action = " + sd_03.ag() + ")"));
            }
            if (sd_03.S() && sd_03.j() == null) {
                a.error((Object)("on veut executer un effet qui a besoin d'une cellule cible, sans cellule cible (action=" + sd_03.ag() + ")"));
            }
            sd_03.q();
            return;
        }
        object = SK.a.a(this.o(), l2, l);
        boolean bl = ((sm_0)object).b() == null;
        try {
            if (sd_03.D()) {
                sd_03.h(sd_02);
            }
            sd_03.a(1, 2);
            long l4 = this.c();
            sd_03.a(sd_02, true);
            if (this.c() == l4) {
                this.c(true);
            }
        }
        catch (Exception exception) {
            a.error((Object)("[RE] An error occurred while executing running effect " + sd_03 + ", current effect = " + this), (Throwable)exception);
        }
        SK.a.a();
        if (bl) {
            SK.a.c();
        }
    }

    public String ag() {
        return this.c == null ? this.getClass().getSimpleName() : "Act#" + this.c.j() + "@Eff#" + this.c.i();
    }

    protected Su f(sd_0 sd_02) {
        if (sd_02 == null || this.c == null || this.U()) {
            return this.f;
        }
        if (this.T()) {
            if (this.c.d()) {
                return sd_02.h();
            }
            return sd_02.i();
        }
        if (this.c.d()) {
            return sd_02.i();
        }
        return sd_02.h();
    }

    protected Su g(sd_0 sd_02) {
        return this.e;
    }

    public void ah() {
        if (this.x != null) {
            this.x.b(this);
        } else {
            this.ak();
        }
    }

    public void ai() {
        this.ah();
    }

    public boolean aj() {
        return this.A;
    }

    public void ak() {
        this.b(true);
    }

    public void al() {
    }

    public void b(boolean bl) {
        this.al();
        if (bl) {
            this.au();
        }
        this.Z();
        this.A = true;
        if (!this.u) {
            this.q();
        }
    }

    public abstract void am();

    public abstract void an();

    public vk_0 ao() {
        return this.q;
    }

    public abstract VW ap();

    public abstract boolean aq();

    public boolean ar() {
        return this.c != null && this.c.e();
    }

    public abstract boolean as();

    public abstract boolean at();

    public void a(sd_0 sd_02, boolean bl) {
        this.au();
        if (this.t != null) {
            this.t.a(this.L());
            this.t.b();
        }
        this.a(3, 4);
        this.ae();
        this.c(true);
    }

    public void c(boolean bl) {
        boolean bl2 = false;
        if (bl && this.n >= 0) {
            if (this.n > 0) {
                --this.n;
            }
            if (this.n == 0) {
                bl2 = true;
            }
        }
        if (!(this.aj() || this.as() && !bl2)) {
            this.ah();
        }
    }

    protected void au() {
        try {
            for (int n = 0; this.av() && n < 3; n = (int)((byte)(n + 1))) {
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception catch\u00e9e : ", (Throwable)exception);
        }
    }

    protected boolean av() {
        boolean bl = false;
        if (this.f != null && !this.f.p() && this.f.m() && this.f.u()) {
            this.f.a(true);
            bl = true;
            this.f.a(this.e);
            if (this.f != null) {
                this.f.a(false);
            }
        }
        if (this.e != null && !this.e.p() && this.e.m() && this.e.u()) {
            this.e.a(true);
            bl = true;
            this.e.a(this.e);
            if (this.e != null) {
                this.e.a(false);
            }
        }
        return bl;
    }

    public abstract void h(sd_0 var1);

    public boolean i(sd_0 sd_02) {
        return false;
    }

    public byte[] aw() {
        iQ iQ2 = iO.E().a(this.c()).b(this.d()).a(this.c == null ? this.az().i() : this.c.i()).b(this.m);
        if (this.g != null) {
            iQ2.a(iu_1.i().a(this.g.d()).b(this.g.e()).c(this.g.f()));
        }
        if (this.e != null) {
            iQ2.c(this.e.a_());
        }
        if (this.f != null) {
            iQ2.d(this.f.a_());
        }
        if (this.d != null) {
            iQ2.c(this.d.G_()).e(this.d.aS_());
        }
        iQ2.a(this.ay());
        this.a(iQ2);
        this.b(iQ2);
        return iQ2.F().toByteArray();
    }

    public iO b(byte[] byArray) {
        try {
            iO iO2 = iO.a(byArray);
            this.a(iO2);
            return iO2;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"Error trying to unserialize a RE", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    public void a(iO iO2) {
        long l;
        this.a(iO2.c());
        this.k = iO2.e();
        if (this.h != null && this.h.a() != null && iO2.f()) {
            this.c = this.h.a().a(iO2.g());
            if (this.c == null) {
                a.error((Object)("Unable to unserialize RunningEffect : generic effect unknown : " + iO2.g()));
            }
        }
        if (iO2.j()) {
            this.g.c(iO2.k().c(), iO2.k().e(), Hw.c((long)iO2.k().g()));
        }
        this.m = iO2.i();
        if (iO2.m()) {
            l = iO2.n();
            this.c(l);
        } else {
            this.e = null;
        }
        if (iO2.o()) {
            l = iO2.p();
            this.b(l);
        } else {
            this.f = null;
        }
        if (iO2.t() && iO2.v()) {
            this.a(iO2.u(), iO2.w());
        }
        if (iO2.x()) {
            this.a(iO2.y());
        }
        this.b(iO2);
        this.c(iO2);
    }

    public void b(long l) {
        if (this.h != null && this.h.f() != null) {
            this.f = this.h.f().f_(l);
            if (this.f == null) {
                // empty if block
            }
        }
    }

    public void c(long l) {
        if (this.h != null && this.h.f() != null) {
            this.a(this.h.f().f_(l));
            if (this.e == null) {
                // empty if block
            }
        } else {
            a.error((Object)("No context, unable to get caster for RE : " + this.i));
        }
    }

    protected abstract void a(ic_1 var1);

    protected abstract void a(int var1, long var2);

    public fo_1 ax() {
        return fo_1.c;
    }

    public abstract ic_1 ay();

    protected void a(iQ iQ2) {
    }

    protected void b(iO iO2) {
    }

    protected void b(iQ iQ2) {
        fo_1 fo_12 = this.ax();
        if (fo_12 == null || fo_12 == fo_1.c) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(fo_12.j());
        fo_12.a(byteBuffer);
        iQ2.a(iq_0.ai().a(ByteString.copyFrom((byte[])byteBuffer.array())).aj());
    }

    protected void c(iO iO2) {
        if (iO2.q()) {
            ByteString byteString = iO2.r().c();
            this.ax().a(ByteBuffer.wrap(byteString.toByteArray()), 0);
        }
    }

    public abstract Sl az();

    public void d(long l) {
        this.k = l;
    }

    public void a(Wa wa) {
        this.F = wa;
    }

    protected abstract boolean aA();

    public void c(byte[] byArray) {
        this.r = byArray;
    }

    public byte[] aB() {
        return this.r;
    }

    public String toString() {
        return "RunningEffect{m_genericEffect=" + this.c + ", m_caster=" + this.e + ", m_target=" + this.f + ", m_targetCell=" + this.g + ", m_id=" + this.i + ", m_uid=" + this.j + ", m_value=" + this.m + "}";
    }

    static {
        G = 0L;
        H = null;
    }
}

