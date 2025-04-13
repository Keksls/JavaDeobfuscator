/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.TestOnly
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from eXK
 */
public class exk_2
implements ts_0,
UF,
abq_1,
ajf_1,
eAM,
efi_0,
ewu_2,
eza_0,
fac_0,
ffz,
gq_1<vf_2> {
    private static final Logger a = Logger.getLogger(exk_2.class);
    protected static final exo_1 d = new exo_1();
    public static final short e = 1;
    private static final short b = 0;
    private static final short i = 1;
    private long j;
    protected boolean f;
    private ezr_0 k;
    private int l;
    protected short g;
    @Nullable
    private ffu_0 m;
    @Nullable
    protected ezv_0 h;
    @Nullable
    private eZw n;
    @Nullable
    private eyi_1 o;
    @Nullable
    private eyc_2 p;
    @Nullable
    private eyj_1 q;
    @Nullable
    private eZo r;

    public exk_2() {
        this.f = true;
    }

    public exk_2(long l) {
        this.j = l;
        this.f = true;
        this.P();
    }

    public static exk_2 a(ezr_0 ezr_02) {
        return exk_2.a(abd_1.c(), ezr_02);
    }

    public static exk_2 a(long l, ezr_0 ezr_02) {
        try {
            ezy_0 ezy_02;
            exk_2 exk_22 = new exk_2();
            exk_22.j = l;
            exk_22.k = ezr_02;
            fge fge2 = fgh.a.b(ezr_02.n());
            if (fge2 != null) {
                exk_22.m = ffx.a.a(fge2);
            }
            if ((ezy_02 = ezz_0.a.a(ezr_02.W())) != null) {
                exk_22.h = fab_0.a(ezy_02);
            }
            if (ezr_02.N() != eyh_1.a) {
                exk_22.p = eye_1.a(ezr_02.N());
            }
            if (ezr_02.ag()) {
                exk_22.q = new eyj_1();
            }
            exk_22.f = true;
            exk_22.P();
            return exk_22;
        }
        catch (Exception exception) {
            a.error((Object)"Erreur lors d'un checkOut sur un Item : ", (Throwable)exception);
            return null;
        }
    }

    @Nullable
    public static exk_2 a(String string) {
        exk_2 exk_22 = new exk_2();
        boolean bl = exk_22.c(string);
        return bl ? exk_22 : null;
    }

    public void b(ezr_0 ezr_02) {
        ezy_0 ezy_02;
        this.k = ezr_02;
        fge fge2 = fgh.a.b(ezr_02.n());
        if (fge2 != null) {
            this.m = ffx.a.a(fge2);
        }
        if ((ezy_02 = ezz_0.a.a(ezr_02.W())) != null) {
            this.h = fab_0.a(ezy_02);
        }
        if (ezr_02.N() != eyh_1.a) {
            this.p = eye_1.a(ezr_02.N());
        }
        if (ezr_02.ag()) {
            this.q = new eyj_1();
        }
    }

    public exk_2 u() {
        return this.c(d.a().d());
    }

    public exk_2 t() {
        return this.b(d.a().d());
    }

    public exk_2 b(long l) {
        exj_2 exj_22 = new exj_2(l, this.k, this);
        exj_22.g = this.g;
        exj_22.l = this.l;
        exj_22.f = false;
        return exj_22;
    }

    public exk_2 c(long l) {
        exk_2 exk_22 = new exk_2(l);
        exk_22.k = this.k;
        this.b(exk_22);
        exk_22.a(this.g);
        return exk_22;
    }

    public void b(exk_2 exk_22) {
        exk_22.m = this.m != null ? ffx.a.a(this.m) : null;
        exk_22.h = this.h != null ? fab_0.a(this.h) : null;
        if (this.n != null) {
            exk_22.n = this.n.p();
        }
        exk_22.o = this.o != null ? new eyi_1(this.o.a()) : null;
        exk_22.p = this.p != null ? new eyf_2(this.p.a(), this.p.c()) : null;
        exk_22.q = this.q != null ? new eyj_1(this.q) : null;
        exk_22.r = this.r != null ? new eZo(this.r) : null;
        exk_22.l = this.l;
    }

    public exk_2 v() {
        return this.c(this.j);
    }

    @Override
    public void release() {
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        exp_2 exp_22 = d.b();
        if (exp_22 != null) {
            exp_22.n(this);
        }
        this.k = null;
        this.m = null;
        this.h = null;
        this.n = null;
        this.q = null;
        this.r = null;
        this.j = 0L;
        this.f = false;
        this.g = 0;
    }

    @Override
    public boolean aQ_() {
        return this.m != null;
    }

    public void a(ffu_0 ffu_02) {
        this.m = ffu_02;
    }

    @Override
    public ffu_0 f() {
        if (this.m == null) {
            throw new fgn("Aucun familier d\u00e9fini sur l'item " + this);
        }
        return this.m;
    }

    @Override
    public boolean w() {
        return this.h != null;
    }

    public void a(fad_0 fad_02) {
        this.h = fad_02;
    }

    @Override
    public ezv_0 x() {
        if (this.h == null) {
            throw new faa_0("Aucune xp d\u00e9finie sur l'item " + this);
        }
        return this.h;
    }

    @Override
    public boolean y() {
        return this.n != null;
    }

    @Override
    public boolean z() {
        return this.y() && this.C().e();
    }

    @Override
    public int A() {
        return this.y() ? this.C().b() : 0;
    }

    public boolean B() {
        return this.y() && (this.C().o() || this.C().m());
    }

    public void a(eZw eZw2) {
        this.n = eZw2;
    }

    @Override
    public eZw C() {
        if (this.n == null) {
            throw new eyp_1("Aucune gemme d\u00e9finie sur l'item " + this);
        }
        return this.n;
    }

    @Override
    public short e() {
        return this.g;
    }

    @Override
    public void a(short s2) {
        if (this.aQ_() && s2 > 1) {
            throw new fgn("Les stacks d'item ne sont pas autoris\u00e9s pour l'item " + this);
        }
        if (s2 == 0) {
            throw new IllegalArgumentException("Impossible de fixer la quantit\u00e9 de l'item " + this.aT_() + " \u00e0 0 : il doit \u00e9tre d\u00e9truit.");
        }
        if (s2 < 0) {
            throw new IllegalArgumentException("Impossible de fixer une quantit\u00e9 n\u00e9gative pour l'item " + this.aT_());
        }
        if (s2 > this.aR_()) {
            throw new IllegalArgumentException("Impossible de fixer la quantit\u00e9 de l'objet " + this.aT_() + " \u00e0 " + s2 + " : stackMaximumHeight=" + this.aR_());
        }
        this.g = s2;
        exv_2 exv_22 = d.c();
        if (exv_22 != null) {
            exv_22.a(this);
        }
    }

    @Override
    public void b(short s2) {
        this.a((short)(this.g + s2));
    }

    public short D() {
        return (short)(this.aR_() - this.g);
    }

    @Override
    public short aR_() {
        return this.k.o();
    }

    @Override
    public int G_() {
        return 12;
    }

    @Override
    public long aS_() {
        return this.k.n();
    }

    @Override
    public short c() {
        if (this.m != null) {
            return this.m.i();
        }
        if (this.h != null) {
            return this.h.c();
        }
        if (this.k != null) {
            return this.k.G();
        }
        return 0;
    }

    public short E() {
        if (this.m != null) {
            return this.m.j();
        }
        if (this.h != null) {
            return this.h.d();
        }
        if (this.k != null) {
            return this.k.G();
        }
        return 0;
    }

    @Nullable
    public Short F() {
        if (this.m != null) {
            return this.m.i();
        }
        if (this.h != null) {
            return this.h.c();
        }
        if (this.o != null) {
            return Oz.c.a(this.o.a());
        }
        return null;
    }

    @Override
    public exw_1 G() {
        return this.k.M();
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        if (!this.y()) {
            return this.k.u();
        }
        return this.H();
    }

    public Iterator<efh_0> H() {
        Object object;
        aca_1<efh_0> aca_12 = new aca_1<efh_0>();
        Iterator<efh_0> iterator = this.k.u();
        if (iterator != null) {
            aca_12.a(iterator);
        }
        if (!this.y()) {
            return aca_12;
        }
        Iterator<efh_0> iterator2 = this.k();
        if (iterator2 != null) {
            aca_12.a(iterator2);
        }
        eZw eZw2 = this.C();
        boolean bl = enp_2.a.d(ens_2.aL);
        if (bl) {
            object = eZw2.c().entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry entry;
                Map.Entry entry2 = (Map.Entry)object.next();
                if (entry2.getValue() == null || ((eze_0)entry2.getValue()).c() != tc_0.a || ((eze_0)entry2.getValue()).a() <= 0 || (entry = eyo_1.g().d(((eze_0)entry2.getValue()).a())) == null) continue;
                aca_12.a(((ezr_0)((Object)entry)).u());
            }
        }
        if ((object = eZw2.k()).isEmpty()) {
            return aca_12;
        }
        for (Map.Entry entry : object.entrySet()) {
            Integer n = (Integer)entry.getValue();
            if (n == null || n <= 0) continue;
            Object r2 = eyo_1.g().d(n);
            aca_12.a(((ezr_0)r2).u());
        }
        return aca_12;
    }

    private Iterator<efh_0> k() {
        Iterator<efh_0> iterator;
        if (!this.y()) {
            return null;
        }
        aca_1<efh_0> aca_12 = new aca_1<efh_0>();
        eZw eZw2 = this.C();
        if (eZw2.m() && (iterator = this.a(eZw2, eZw2.l())) != null) {
            aca_12.a(iterator);
        }
        if (eZw2.o() && (iterator = this.a(eZw2, eZw2.n())) != null) {
            aca_12.a(iterator);
        }
        return aca_12;
    }

    private Iterator<efh_0> a(eZw eZw2, int n) {
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return null;
        }
        ezf_0 ezf_02 = ((ezr_0)r2).aa();
        if (ezf_02 == null) {
            return null;
        }
        if (!eZy.a(eZw2, ezf_02)) {
            return null;
        }
        return ((ezr_0)r2).u();
    }

    @Override
    public short be_() {
        return 1;
    }

    @Override
    public short z_() {
        return 0;
    }

    @Override
    public short A_() {
        return 1;
    }

    public void a(int n) {
        this.l = n;
    }

    @Override
    public int l() {
        return this.l;
    }

    public int I() {
        Object r2 = eyo_1.g().d(this.l);
        return this.l == 0 || r2 == null ? this.J() : ((ezr_0)r2).C();
    }

    public int J() {
        return this.k.C();
    }

    public int K() {
        Object r2 = eyo_1.g().d(this.l);
        if (r2 == null) {
            return this.L();
        }
        return this.l == 0 ? this.L() : ((ezr_0)r2).D();
    }

    public int L() {
        return this.k.D();
    }

    public int M() {
        return this.k.E();
    }

    public String N() {
        exp_2 exp_22 = d.b();
        return exp_22 != null ? exp_22.l(this) : "<unknown>";
    }

    public String O() {
        exp_2 exp_22 = d.b();
        return exp_22 != null ? exp_22.g(this) : "<unknown>";
    }

    @Override
    public String[] d() {
        exp_2 exp_22 = d.b();
        return exp_22 != null ? exp_22.a() : null;
    }

    @Override
    public Object b(String string) {
        exp_2 exp_22 = d.b();
        return exp_22 != null ? exp_22.a(this, string) : null;
    }

    public void P() {
        exp_2 exp_22 = d.b();
        if (exp_22 != null) {
            exp_22.o(this);
        }
    }

    public void b(boolean bl) {
        exp_2 exp_22 = d.b();
        if (exp_22 != null) {
            exp_22.a(this, bl);
        }
    }

    @Override
    public void a(String string, Object object) {
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public boolean a_(String string) {
        return false;
    }

    @Nullable
    public byte[] Q() {
        byte[] byArray;
        vf_2 vf_22 = new vf_2();
        if (this.a(vf_22) && vf_22.a(ByteBuffer.wrap(byArray = new byte[vf_22.b()]))) {
            return byArray;
        }
        return null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        return this.a(Integer.MAX_VALUE, byteBuffer);
    }

    public boolean a(int n, ByteBuffer byteBuffer) {
        vf_2 vf_22 = new vf_2();
        vf_22.a(byteBuffer, n);
        return this.b(vf_22);
    }

    @Override
    public boolean a(vf_2 vf_22) {
        vf_22.a = this.j;
        vf_22.b = this.k.n();
        vf_22.c = this.g;
        if (this.m != null) {
            vf_22.d = new vr_2();
            this.m.a(vf_22.d.a);
        } else {
            vf_22.d = null;
        }
        if (this.h != null) {
            vf_22.e = new wa_2();
            this.h.a(vf_22.e.a);
        } else {
            vf_22.e = null;
        }
        if (this.n != null) {
            vf_22.f = new vw_1();
            this.n.a(vf_22.f.a);
        } else {
            vf_22.f = null;
        }
        if (this.o != null) {
            vf_22.g = new vi_1();
            this.o.a(vf_22.g.a);
        } else {
            vf_22.g = null;
        }
        if (this.p != null) {
            vf_22.h = new vg_2();
            this.p.a(vf_22.h.a);
        } else {
            vf_22.h = null;
        }
        if (this.q != null) {
            vf_22.i = new vk_1();
            this.q.a(vf_22.i.a);
        } else {
            vf_22.i = null;
        }
        if (this.r != null) {
            vf_22.j = new vo_2();
            this.r.a(vf_22.j.a);
        } else {
            vf_22.j = null;
        }
        if (this.l != 0) {
            vf_22.k = new vq_1();
            vf_22.k.a = this.l;
        } else {
            vf_22.k = null;
        }
        return true;
    }

    @Override
    public boolean b(vf_2 vf_22) {
        Object r2;
        int n;
        this.j = vf_22.a;
        int n2 = 24252;
        if (vf_22.b == 24252 && vf_22.h != null && eyg_1.a(vf_22.h.a).a() == eyh_1.e) {
            n = 24250;
            r2 = eyo_1.g().d(24250);
            a.warn((Object)"[BOSS SMASHER 9] Change Harmony to Vertox Haven Bag 24252 to 24250");
        } else {
            r2 = eyo_1.g().d(vf_22.b);
        }
        this.k = r2;
        if (this.k == null) {
            a.error((Object)("Item with refId " + vf_22.b + " isn't on ReferenceItemManager. Item UID : " + this.j));
            return false;
        }
        if (vf_22.c <= 0) {
            a.error((Object)("Item has a <= 0 qty : refId = " + vf_22.b + ", qty = " + vf_22.c + ", uid = " + vf_22.a));
            return false;
        }
        this.g = vf_22.c;
        if (vf_22.d != null) {
            this.a(vf_22.d.a);
        }
        if (vf_22.e != null) {
            this.a(vf_22.e.a);
        }
        if (vf_22.f != null) {
            yk_1 yk_12 = vf_22.f.a;
            this.a(yk_12);
        }
        this.o = vf_22.g != null ? new eyi_1(vf_22.g.a.a) : null;
        this.p = vf_22.h != null ? eyg_1.a(vf_22.h.a) : null;
        this.q = vf_22.i != null ? eyj_1.b(vf_22.i.a) : null;
        this.r = vf_22.j != null ? eZo.b(vf_22.j.a) : null;
        if (vf_22.k != null) {
            n = vf_22.k.a;
            Object r3 = eyo_1.g().d(n);
            this.l = r3 != null ? n : 0;
        }
        this.R();
        return true;
    }

    public void R() {
        if (this.p != null && (this.p.a().b() || this.p.c())) {
            this.p.b();
            return;
        }
        eyh_1 eyh_12 = this.k.N();
        if (eyh_12 == eyh_1.a) {
            this.p = null;
            return;
        }
        if (this.p == null || this.p.a() != eyh_12) {
            this.p = eye_1.a(eyh_12);
        }
    }

    @Override
    public boolean j() {
        return this.f;
    }

    public static exo_1 S() {
        return d;
    }

    public ezr_0<?> T() {
        return this.k;
    }

    @Override
    public long a() {
        return this.j;
    }

    @Override
    public int aT_() {
        return this.k.n();
    }

    public exq_1<exq_1> U() {
        return this.k.F();
    }

    public boolean V() {
        return this.k.J();
    }

    public boolean W() {
        return this.k.K();
    }

    public boolean aU_() {
        return this.f;
    }

    public boolean X() {
        return this.k.J() || this.k.K();
    }

    public boolean Y() {
        return this.a(this);
    }

    public boolean Z() {
        return true;
    }

    @Override
    public boolean a(ts_0 ts_02) {
        if (!(ts_02 instanceof exk_2)) {
            return false;
        }
        exk_2 exk_22 = (exk_2)ts_02;
        if (exk_22.aa() ^ this.aa()) {
            return false;
        }
        if (this.p != null && !this.p.a(exk_22.p)) {
            return false;
        }
        boolean bl = this.k.ag();
        if (bl) {
            if (this.ak() != exk_22.ak()) {
                return false;
            }
            if (!this.ai() || !exk_22.ai()) {
                return false;
            }
        }
        if (this.n != null || exk_22.n != null) {
            return false;
        }
        return this.aT_() == exk_22.aT_() && !this.w() && !exk_22.w() && !this.s() && !exk_22.s() && !this.aQ_() && !exk_22.aQ_() && !this.an() && !exk_22.an() && this.r == null && exk_22.r == null;
    }

    private boolean s() {
        return this.l != 0;
    }

    public void a(xn_1 xn_12) {
        if (xn_12 != null) {
            this.m = ffx.a.a(xn_12);
        }
    }

    public void a(wy_2 wy_22) {
        if (wy_22 != null) {
            this.h = fab_0.a(wy_22);
        }
    }

    public void a(yk_1 yk_12) {
        eZw eZw2 = this.n = yk_12 != null ? eZy.a(yk_12) : null;
        if (this.n == null) {
            return;
        }
        if (this.n.k().isEmpty()) {
            return;
        }
        int n = eZy.c(this);
        if (n <= 0) {
            return;
        }
        this.n.c(n);
        this.n.k().clear();
        yk_12.b.clear();
    }

    public void a(ua_2 ua_22) {
        if (ua_22 != null) {
            this.o = new eyi_1();
            this.o.a(ua_22.a);
        }
    }

    public HashSet<efa_0> b(int n) {
        return this.q.b(n);
    }

    public boolean aa() {
        return this.p != null;
    }

    public boolean ab() {
        return this.p != null && this.p.c();
    }

    @Override
    public int m() {
        return this.aT_();
    }

    @Override
    @Nullable
    public eyc_2 n() {
        return this.p;
    }

    public void a(@Nullable eyc_2 eyc_22) {
        this.p = eyc_22;
    }

    public void a(@Nullable eyj_1 eyj_12) {
        this.q = eyj_12;
    }

    public void ac() {
        if (!this.ak()) {
            return;
        }
        this.q.a(this);
    }

    public void ad() {
        if (!this.ai()) {
            return;
        }
        this.ac();
    }

    public boolean ae() {
        if (this.m != null) {
            return false;
        }
        return this.n == null || !this.n.i() && this.k.ac();
    }

    public boolean af() {
        return this.n != null && !this.n.i();
    }

    public boolean ag() {
        return this.af() && this.n.e();
    }

    public boolean ah() {
        Map<Byte, eze_0> map;
        if (this.m != null) {
            return false;
        }
        Map<Byte, eze_0> map2 = map = this.n != null ? this.n.c() : null;
        if (map == null && this.k.ac()) {
            return true;
        }
        return this.af() && (this.k.ac() || this.n.e());
    }

    public boolean ai() {
        return this.k.ag() && (!this.ak() || this.aj());
    }

    public boolean aj() {
        return this.q.b();
    }

    public boolean ak() {
        return this.q != null;
    }

    @Nullable
    public eyj_1 al() {
        return this.q;
    }

    @Nullable
    public eyi_1 am() {
        return this.o;
    }

    public void a(@Nullable eyi_1 eyi_12) {
        this.o = eyi_12;
    }

    public boolean an() {
        return this.o != null;
    }

    public String ao() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[').append(this.j).append(']');
        if (!this.f) {
            stringBuilder.append('i');
        }
        stringBuilder.append(this.aT_());
        if (this.g != 1) {
            stringBuilder.append('x').append(this.g);
        }
        return stringBuilder.toString();
    }

    public void c(exk_2 exk_22) {
        if (this.r == null) {
            this.r = new eZo();
        }
        this.r.a(exk_22);
    }

    public void a(@Nullable eZo eZo2) {
        this.r = eZo2;
    }

    @Nullable
    public eZo ap() {
        return this.r;
    }

    @Override
    public boolean a(ext_1 ext_12) {
        if (this.k == null) {
            return false;
        }
        return this.k.b(ext_12);
    }

    @Override
    public String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("uid=").append(this.j);
        stringBuilder.append(", refId=").append(this.aT_());
        stringBuilder.append(", qty=").append(this.g);
        stringBuilder.append(", opt=");
        if (this.y() && this.n != null) {
            stringBuilder.append(this.n.g());
        } else if (this.w() && this.h != null) {
            stringBuilder.append(this.h.g());
        } else if (this.aQ_() && this.m != null) {
            stringBuilder.append(this.m.g());
        } else {
            stringBuilder.append("none");
        }
        if (this.p != null) {
            stringBuilder.append("bind=").append(this.p);
        }
        if (this.o != null) {
            stringBuilder.append("companionInfo=").append(this.o);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public String toString() {
        return "Item{m_uniqueId=" + this.j + ", m_referenceItem=" + this.k + ", m_quantity=" + this.g + ", m_pet=" + this.m + ", m_xp=" + this.h + ", m_shards=" + this.n + ", m_companionInfo=" + this.o + ", m_mergedSetItems=" + this.r + "}";
    }

    public String aq() {
        short s2 = this.e();
        if (s2 <= 0) {
            this.g = 1;
        }
        String string = Cz.c(this.Q());
        this.g = s2;
        return string;
    }

    boolean c(@Nullable String string) {
        if (string == null) {
            return false;
        }
        return this.a(ByteBuffer.wrap(Cz.r(string)));
    }

    public ezf_0 ar() {
        return this.k.aa();
    }

    public void a(long l) {
        this.j = l;
    }

    @TestOnly
    public void c(ezr_0<?> ezr_02) {
        this.k = ezr_02;
    }

    @Override
    public eAN p() {
        return eAN.a;
    }

    @Override
    public Object q() {
        return this.j;
    }

    @Override
    public String r() {
        return this.N();
    }

    public boolean as() {
        return this.k != null && this.k.V();
    }

    @Override
    public /* synthetic */ ts_0 i() {
        return this.v();
    }

    @Override
    public /* synthetic */ ts_0 aP_() {
        return this.u();
    }
}

