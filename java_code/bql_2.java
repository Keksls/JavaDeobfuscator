/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bql
 */
public class bql_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bql_2.class);
    private static final boolean b = false;
    private static final int[] c = new int[]{"Stool".hashCode()};
    final blx_1 e;
    private bFi f;
    abb_0 g;
    abb_0 h;
    abb_0 i;

    public bql_2(blx_1 blx_12, bFi bFi2) {
        this.e = blx_12;
        this.f = bFi2;
    }

    public bql_2(blx_1 blx_12) {
        this.e = blx_12;
        this.f = null;
    }

    @Override
    public short ac_() {
        return 16;
    }

    @Override
    public boolean g() {
        return !this.e.bv().bs();
    }

    public void a(bFi bFi2) {
        if (this.f != null) {
            return;
        }
        this.f = bFi2;
        biI biI2 = this.e.bv();
        this.a(biI2);
        this.b(biI2);
    }

    @Override
    public void a() {
        if (this.e == this.d) {
            dan.a().d();
        }
        biI biI2 = this.e.bv();
        this.e.a(this);
        biI2.aW();
        this.a(biI2);
        this.h = new bqm_2(this, biI2);
        biI2.a(this.h);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        biI biI2 = this.e.bv();
        if (this.h != null) {
            if (!bl) {
                return false;
            }
            this.h.animationEnded(biI2);
            this.b();
        }
        if (this.i != null) {
            if (!bl) {
                return false;
            }
            this.i.animationEnded(biI2);
        }
        this.a(this.e.bv(), this.i());
        if (this.e == this.d) {
            this.a((byte)3);
        }
        return true;
    }

    public final void a(abb_0 abb_02) {
        if (this.e == this.d) {
            this.g = abb_02;
            this.a((byte)2);
        }
    }

    @Override
    public boolean b() {
        aej_2 aej_22;
        biI biI2 = this.e.bv();
        if (biI2.aZ() == agm.a()) {
            return true;
        }
        bfr_0 bfr_02 = this.i();
        if (bfr_02 != null) {
            bfr_02.c(false);
        }
        if (this.f != null) {
            biI2.e(this.f.ao() + "-Fin");
            aej_22 = this.f.ap() ? this.f.F() : this.f.F().g();
        } else {
            aej_22 = aej_2.b;
        }
        aff_1 aff_12 = this.f.P_();
        biI2.b((float)(aff_12.d() + aej_22.m), (float)(aff_12.e() + aej_22.n), (float)aff_12.f());
        this.i = new bqn_2(this, bfr_02, biI2, aej_22);
        biI2.a(new bqo_2(this, biI2));
        biI2.a(this.i);
        return false;
    }

    private void a(byte by) {
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a(by);
        cpz_02.a((short)16);
        azu_0.j().K().c(cpz_02);
    }

    private static void a(biI biI2, aej_2 aej_22, String string) {
        biI2.a(aej_22);
        biI2.f("-Assis");
        biI2.e(string + "-Debut");
        biI2.g(string);
    }

    public void a(biI biI2, bfr_0 bfr_02) {
        Object object;
        this.e.a((abz_0)null);
        aej_2 aej_22 = aej_2.b;
        if (bfr_02 != null) {
            object = bfr_02.am();
            if (object != null) {
                biI2.b((Anm)object, c);
            }
            bfr_02.c(true);
            aej_22 = this.f.ap() ? bfr_02.aC() : bfr_02.aC().g();
        }
        biI2.g("AnimStatique");
        biI2.f((String)null);
        biI2.a(agm.a());
        this.f.Z();
        object = this.f.P_();
        int n = ((aff_1)object).d() + aej_22.m;
        int n2 = ((aff_1)object).e() + aej_22.n;
        short s2 = ((aff_1)object).f();
        short s3 = yz_0.b(n, n2, s2);
        if (s3 == Short.MIN_VALUE) {
            s3 = s2;
        }
        biI2.b((float)n, (float)n2, (float)s3);
    }

    private bfr_0 i() {
        if (this.f == null) {
            a.error((Object)("pas de banc pour le player: " + this.e.toString()));
            return null;
        }
        Collection<ph_0> collection = this.f.av_();
        if (collection.isEmpty()) {
            return null;
        }
        return (bfr_0)collection.iterator().next();
    }

    public boolean a(bnh_1 bnh_12) {
        String string;
        String string2 = bnh_12.bv().F();
        return string2.equals((string = this.f.ao()) + "-Debut") || string2.equals(string + "-Fin");
    }

    private void a(biI biI2) {
        bfr_0 bfr_02 = this.i();
        this.e.a(bfr_02);
        aej_2 aej_22 = bfr_02.aC();
        String string = this.f.ao();
        aej_2 aej_23 = this.f.ap() ? aej_22.g() : aej_22;
        bql_2.a(biI2, aej_23, string);
        biI2.a(agk.a());
        aff_1 aff_12 = this.f.P_();
        int n = aej_23.m;
        int n2 = aej_23.n;
        biI2.b((float)(aff_12.d() - n), (float)(aff_12.e() - n2), (float)aff_12.f());
        this.h();
        bfr_02.c(false);
    }

    public final void h() {
        bfr_0 bfr_02 = this.i();
        if (bfr_02 == null) {
            a.error((Object)("pas de vue pour le banc pour assoir " + this.e.toString()));
            return;
        }
        biI biI2 = this.e.bv();
        biI2.a(bfr_02.am(), c);
    }

    void b(biI biI2) {
        biI2.a(this.f.F());
        biI2.b((float)this.f.P_().d(), (float)this.f.P_().e(), (float)this.f.P_().f());
        biI2.e(biI2.ab());
    }

    @Override
    public boolean f() {
        return this.h == null && this.i == null;
    }

    public void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        long l = byteBuffer.getLong();
        if (this.f != null && this.f.a_() != l) {
            a.error((Object)"stoolId diff\u00e9rent ");
            this.f = null;
        }
        if (this.f != null) {
            return;
        }
        try {
            bFi bFi2 = (bFi)ccm_1.g().a(l);
            if (bFi2 != null) {
                this.a(bFi2);
            }
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
    }
}

