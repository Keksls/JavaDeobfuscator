/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from eqm
 */
public abstract class eqm_2 {
    protected static final Logger a = Logger.getLogger(eqm_2.class);
    private final qg_2 b = new qg_2();
    private final qi_1 c = new qi_1();
    private final re_1 d = new re_1();
    private final pj_1 e = new pj_1();
    private final sz_2 f = new sz_2();
    private final rr_2 g = new rr_2();
    private final qj_1 h = new qj_1();
    private final pt_1 i = new pt_1();
    private final pt_1 j = new pt_1();
    private final rx_2 k = new rx_2();
    private final rx_2 l = new rx_2();
    private final pw_1 m = new pw_1();
    private final pg_1 n = new pg_1();
    private final qc_2 o = new qc_2();
    private final px_1 p = new px_1();
    private final qk_1 q = new qk_1();

    public void a() {
        this.b.c();
        this.c.c();
        this.d.c();
        this.e.c();
        this.f.c();
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.l.c();
        this.m.c();
        this.n.c();
        this.o.c();
        this.q.c();
        this.p.c();
    }

    public final re_1 b() {
        return this.d;
    }

    public final qi_1 c() {
        return this.c;
    }

    public final qg_2 d() {
        return this.b;
    }

    public final pj_1 e() {
        return this.e;
    }

    public sz_2 f() {
        return this.f;
    }

    public final rr_2 g() {
        return this.g;
    }

    public final qj_1 h() {
        return this.h;
    }

    public final pt_1 i() {
        return this.i;
    }

    public final pt_1 j() {
        return this.j;
    }

    public final pg_1 k() {
        return this.n;
    }

    public final rx_2 l() {
        return this.k;
    }

    public final rx_2 m() {
        return this.l;
    }

    public final pw_1 n() {
        return this.m;
    }

    public final qc_2 o() {
        return this.o;
    }

    public qk_1 p() {
        return this.q;
    }

    public px_1 q() {
        return this.p;
    }

    final go_1 a(eqo_2 eqo_22) {
        switch (eqo_22) {
            case X: {
                return this.U();
            }
            case Y: {
                return this.V();
            }
            case f: {
                return this.r();
            }
            case g: {
                return this.s();
            }
            case n: {
                return this.z();
            }
            case o: {
                return this.A();
            }
            case p: {
                return this.C();
            }
            case d: {
                return this.e();
            }
            case e: {
                return this.f();
            }
            case y: {
                return this.w();
            }
            case ai: {
                return this.X();
            }
            case A: {
                return this.x();
            }
            case B: {
                return this.y();
            }
            case ag: {
                return this.n();
            }
            case m: {
                return this.Y();
            }
            case ah: {
                return this.k();
            }
            case q: {
                return this.H();
            }
            case r: {
                return this.I();
            }
            case an: {
                return this.J();
            }
            case V: {
                return this.R();
            }
            case ax: {
                return this.S();
            }
            case ay: {
                return this.T();
            }
            case Z: {
                return this.h();
            }
            case ab: {
                return this.m();
            }
            case ae: {
                return this.i();
            }
            case aw: {
                return this.j();
            }
            case W: {
                return this.W();
            }
            case aj: {
                return this.Z();
            }
            case C: {
                return this.ah();
            }
            case D: {
                return this.ai();
            }
            case E: {
                return this.aj();
            }
            case F: {
                return this.al();
            }
            case G: {
                return this.am();
            }
            case H: {
                return this.an();
            }
            case I: {
                return this.ak();
            }
            case J: {
                return this.ao();
            }
            case K: {
                return this.ap();
            }
            case L: {
                return this.aq();
            }
            case au: {
                return this.ar();
            }
            case av: {
                return this.as();
            }
            case M: {
                return this.at();
            }
            case N: {
                return this.au();
            }
            case al: {
                return this.aa();
            }
            case am: {
                return this.ab();
            }
            case j: {
                return this.O();
            }
            case a: {
                return this.d();
            }
            case b: {
                return this.c();
            }
            case c: {
                return this.b();
            }
            case ak: {
                return this.ae();
            }
            case h: {
                return this.g();
            }
            case i: {
                return this.af();
            }
            case ad: {
                return this.u();
            }
            case ac: {
                return this.t();
            }
            case z: {
                return this.D();
            }
            case af: {
                return this.K();
            }
            case w: {
                return this.L();
            }
            case ap: {
                return this.M();
            }
            case x: {
                return this.v();
            }
            case t: {
                return this.F();
            }
            case v: {
                return this.G();
            }
            case u: {
                return this.E();
            }
            case s: {
                return this.N();
            }
            case aa: {
                return this.l();
            }
            case k: {
                return this.P();
            }
            case l: {
                return this.Q();
            }
            case O: {
                return this.av();
            }
            case P: {
                return this.aw();
            }
            case ao: {
                return this.aA();
            }
            case Q: {
                return this.aB();
            }
            case R: {
                return this.aC();
            }
            case S: {
                return this.ax();
            }
            case aq: {
                return this.ay();
            }
            case ar: {
                return this.az();
            }
            case T: {
                return this.aD();
            }
            case as: {
                return this.ac();
            }
            case at: {
                return this.ad();
            }
            case az: {
                return this.o();
            }
            case aA: {
                return this.q();
            }
            case aB: {
                return this.B();
            }
            case U: {
                return this.p();
            }
        }
        return null;
    }

    public final byte[] a(eqp_1 eqp_12) {
        int n = 1;
        for (eqo_2 eqo_22 : eqp_12.a()) {
            go_1 object = this.a(eqo_22);
            if (object != null) {
                try {
                    object.a().e();
                }
                catch (Exception exception) {
                    a.error((Object)("Exception lors du callback de s\u00e9rialisation de la part " + eqo_22 + " : "), (Throwable)exception);
                }
                n += object.b();
                continue;
            }
            a.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la CharacterSerializedPart correspondant \u00e0 " + eqo_22 + " de la forme " + eqp_12));
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)eqp_12.ordinal());
        for (eqo_2 eqo_22 : eqp_12.a()) {
            go_1 go_12 = this.a(eqo_22);
            if (go_12 == null || go_12.a(byteBuffer)) continue;
            a.error((Object)("Erreur lors de la s\u00e9rialisation de la part " + eqo_22 + " de la forme " + eqp_12));
        }
        return byteBuffer.array();
    }

    public final void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eqp_1.values().length) {
            a.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        boolean bl = enp_2.a.d(ens_2.ag);
        eqp_1 eqp_12 = eqp_1.values()[n];
        for (eqo_2 eqo_22 : eqp_12.a()) {
            go_1 go_12 = this.a(eqo_22);
            if (bl && this.a(byteBuffer, eqo_22, go_12)) continue;
            if (go_12 != null) {
                go_12.b(byteBuffer);
                try {
                    go_12.a().f();
                }
                catch (Exception exception) {
                    a.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + eqo_22 + ": "), (Throwable)exception);
                }
                continue;
            }
            a.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + eqo_22));
        }
    }

    private boolean a(ByteBuffer byteBuffer, eqo_2 eqo_22, go_1 go_12) {
        byte[] byArray;
        byte[] byArray2;
        if (eqo_22 != eqo_2.P || go_12 == null) {
            return false;
        }
        byteBuffer.mark();
        ov_1 ov_12 = new ov_1();
        ov_12.b(byteBuffer);
        nb_0 nb_02 = new nb_0();
        try {
            byArray2 = ov_12.d ? flI.b(ov_12.c) : ov_12.c;
        }
        catch (IOException iOException) {
            a.warn((Object)"[SERIAL] Invalid achievement data received, skipping part", (Throwable)iOException);
            return true;
        }
        if (byArray2 == null) {
            a.warn((Object)("[SERIAL] Null achievement data received for " + eqo_22.name() + ", skipping part"));
            return true;
        }
        nc_0.a(nb_02).a(byArray2);
        ov_1 ov_13 = (ov_1)go_12;
        nb_0 nb_03 = new nb_0();
        try {
            byte[] byArray3 = byArray = ov_13.d ? flI.b(ov_13.c) : ov_13.c;
            if (byArray == null) {
                byteBuffer.reset();
                return false;
            }
        }
        catch (IOException iOException) {
            a.fatal((Object)"[SERIAL] Existing achievement data is invalid, replacing with the new part", (Throwable)iOException);
            byteBuffer.reset();
            return false;
        }
        nc_0.a(nb_03).a(byArray);
        Optional<Long> optional = nb_03.g();
        if (optional.isEmpty()) {
            byteBuffer.reset();
            return false;
        }
        if (nb_02.g().map(l -> l > (Long)optional.get()).orElse(true).booleanValue()) {
            a.fatal((Object)String.format("[SERIAL] Received achievement data but the earliest completion date is AFTER the one of the actual blob; It most probably means a data loss will occur ! Old blob: %s, new blob: %s", nb_03, nb_02));
            return true;
        }
        byteBuffer.reset();
        return false;
    }

    public final void a(go_1 go_12, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eqp_1.values().length) {
            a.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        eqp_1 eqp_12 = eqp_1.values()[n];
        try {
            for (eqo_2 eqo_22 : eqp_12.a()) {
                go_1 go_13 = this.a(eqo_22);
                if (go_13 != null) {
                    if (go_13 == go_12) {
                        go_13.b(byteBuffer);
                        try {
                            go_13.a().f();
                            return;
                        }
                        catch (Exception exception) {
                            a.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + eqo_22), (Throwable)exception);
                            continue;
                        }
                    }
                    go_13 = (go_1)go_13.getClass().newInstance();
                    go_13.b(byteBuffer);
                    continue;
                }
                a.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + eqo_22));
            }
        }
        catch (InstantiationException instantiationException) {
            a.error((Object)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.error((Object)illegalAccessException);
        }
    }

    public final void a(Set<go_1> set, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eqp_1.values().length) {
            a.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        eqp_1 eqp_12 = eqp_1.values()[n];
        try {
            for (eqo_2 eqo_22 : eqp_12.a()) {
                go_1 go_12 = this.a(eqo_22);
                if (go_12 != null) {
                    if (set.remove(go_12)) {
                        go_12.b(byteBuffer);
                        try {
                            go_12.a().f();
                            if (set.isEmpty()) {
                                return;
                            }
                        }
                        catch (Exception exception) {
                            a.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + eqo_22), (Throwable)exception);
                        }
                        continue;
                    }
                    go_12 = (go_1)go_12.getClass().newInstance();
                    go_12.b(byteBuffer);
                    continue;
                }
                a.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + eqo_22));
            }
        }
        catch (InstantiationException instantiationException) {
            a.error((Object)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.error((Object)illegalAccessException);
        }
    }

    public go_1 r() {
        return go_1.a;
    }

    public go_1 s() {
        return go_1.a;
    }

    public go_1 t() {
        return go_1.a;
    }

    public go_1 u() {
        return go_1.a;
    }

    public go_1 v() {
        return go_1.a;
    }

    public go_1 w() {
        return go_1.a;
    }

    public go_1 x() {
        return go_1.a;
    }

    public go_1 y() {
        return go_1.a;
    }

    public go_1 z() {
        return go_1.a;
    }

    public go_1 A() {
        return go_1.a;
    }

    public go_1 B() {
        return go_1.a;
    }

    public go_1 C() {
        return go_1.a;
    }

    public go_1 D() {
        return go_1.a;
    }

    public go_1 E() {
        return go_1.a;
    }

    public go_1 F() {
        return go_1.a;
    }

    public go_1 G() {
        return go_1.a;
    }

    public go_1 H() {
        return go_1.a;
    }

    public go_1 I() {
        return go_1.a;
    }

    public go_1 J() {
        return go_1.a;
    }

    public go_1 K() {
        return go_1.a;
    }

    public go_1 L() {
        return go_1.a;
    }

    public go_1 M() {
        return go_1.a;
    }

    public go_1 N() {
        return go_1.a;
    }

    public go_1 O() {
        return go_1.a;
    }

    public go_1 P() {
        return go_1.a;
    }

    public go_1 Q() {
        return go_1.a;
    }

    public go_1 R() {
        return go_1.a;
    }

    public go_1 S() {
        return go_1.a;
    }

    public go_1 T() {
        return go_1.a;
    }

    public go_1 U() {
        return go_1.a;
    }

    public go_1 V() {
        return go_1.a;
    }

    public go_1 W() {
        return go_1.a;
    }

    public go_1 X() {
        return go_1.a;
    }

    public go_1 Y() {
        return go_1.a;
    }

    public go_1 Z() {
        return go_1.a;
    }

    public go_1 aa() {
        return go_1.a;
    }

    public go_1 ab() {
        return go_1.a;
    }

    public go_1 ac() {
        return go_1.a;
    }

    public go_1 ad() {
        return go_1.a;
    }

    public go_1 ae() {
        return go_1.a;
    }

    public go_1 af() {
        return go_1.a;
    }

    public go_1 ag() {
        return go_1.a;
    }

    public go_1 ah() {
        return go_1.a;
    }

    public go_1 ai() {
        return go_1.a;
    }

    public go_1 aj() {
        return go_1.a;
    }

    public go_1 ak() {
        return go_1.a;
    }

    public go_1 al() {
        return go_1.a;
    }

    public go_1 am() {
        return go_1.a;
    }

    public go_1 an() {
        return go_1.a;
    }

    public go_1 ao() {
        return go_1.a;
    }

    public go_1 ap() {
        return go_1.a;
    }

    public go_1 aq() {
        return go_1.a;
    }

    public go_1 ar() {
        return go_1.a;
    }

    public go_1 as() {
        return go_1.a;
    }

    public go_1 at() {
        return go_1.a;
    }

    public go_1 au() {
        return go_1.a;
    }

    public go_1 av() {
        return go_1.a;
    }

    public go_1 aw() {
        return go_1.a;
    }

    public go_1 ax() {
        return go_1.a;
    }

    public go_1 ay() {
        return go_1.a;
    }

    public go_1 az() {
        return go_1.a;
    }

    public go_1 aA() {
        return go_1.a;
    }

    public go_1 aB() {
        return go_1.a;
    }

    public go_1 aC() {
        return go_1.a;
    }

    public go_1 aD() {
        return go_1.a;
    }

    public byte[] a(boolean bl) {
        return bl ? this.a(eqp_1.A) : this.a(eqp_1.B);
    }

    public byte[] aE() {
        return this.a(eqp_1.C);
    }

    public byte[] aF() {
        return this.a(eqp_1.E);
    }

    public byte[] aG() {
        return this.a(eqp_1.R);
    }

    public byte[] aH() {
        return this.a(eqp_1.l);
    }

    public byte[] aI() {
        return this.a(eqp_1.m);
    }

    public byte[] aJ() {
        return this.a(eqp_1.b);
    }

    public byte[] aK() {
        return this.a(eqp_1.a);
    }

    public byte[] aL() {
        return this.a(eqp_1.c);
    }

    public byte[] aM() {
        return this.a(eqp_1.d);
    }

    public byte[] aN() {
        return this.a(eqp_1.M);
    }

    public byte[] aO() {
        return this.a(eqp_1.N);
    }

    public byte[] aP() {
        return this.a(eqp_1.O);
    }

    public final byte[] aQ() {
        return this.a(eqp_1.e);
    }

    public final byte[] aR() {
        return this.a(eqp_1.y);
    }

    public final byte[] aS() {
        return this.a(eqp_1.H);
    }

    public final byte[] aT() {
        return this.a(eqp_1.z);
    }

    public final byte[] aU() {
        return this.a(eqp_1.D);
    }

    public byte[] aV() {
        return this.a(eqp_1.f);
    }

    public byte[] aW() {
        return this.a(eqp_1.k);
    }

    public byte[] aX() {
        return this.a(eqp_1.n);
    }

    public byte[] aY() {
        return this.a(eqp_1.i);
    }

    public byte[] aZ() {
        return this.a(eqp_1.h);
    }

    public byte[] ba() {
        return this.a(eqp_1.j);
    }

    public byte[] bb() {
        return this.a(eqp_1.s);
    }

    public byte[] bc() {
        return this.a(eqp_1.t);
    }

    public byte[] bd() {
        return this.a(eqp_1.u);
    }

    public byte[] be() {
        return this.a(eqp_1.v);
    }

    public byte[] bf() {
        return this.a(eqp_1.q);
    }

    public byte[] bg() {
        return this.a(eqp_1.r);
    }

    public byte[] bh() {
        return this.a(eqp_1.w);
    }

    public byte[] bi() {
        return this.a(eqp_1.x);
    }

    public byte[] bj() {
        return this.a(eqp_1.G);
    }

    public String b(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        stringBuilder.append(this.getClass().getSimpleName()).append(" serialization=").append(byArray.length).append(" byte(s) in ");
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eqp_1.values().length) {
            return "[ERROR: invalid serialization type: " + n + "]";
        }
        eqp_1 eqp_12 = eqp_1.values()[n];
        stringBuilder.append((Object)eqp_12).append(", parts=");
        for (eqo_2 eqo_22 : eqp_12.a()) {
            go_1 go_12 = this.a(eqo_22);
            if (go_12 != null) {
                stringBuilder.append("{").append((Object)eqo_22).append(" ");
                int n2 = byteBuffer.position();
                go_12.b(byteBuffer);
                for (int k = n2; k < byteBuffer.position(); ++k) {
                    stringBuilder.append(String.format("%02x", byArray[k]));
                    if ((k - n2) % 4 != 3 || k >= byteBuffer.position() - 1) continue;
                    stringBuilder.append(".");
                }
            } else {
                return "[ERROR: no character part for " + eqo_22 + "]";
            }
            stringBuilder.append("} ");
        }
        stringBuilder.append("] ").append(byteBuffer.remaining()).append(" byte(s) left.");
        return stringBuilder.toString();
    }
}

