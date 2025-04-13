/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eqY
 */
public class eqy_1
implements gq_1<wf_1> {
    private static final Logger a = Logger.getLogger(eqy_1.class);
    private short b;
    private epj_2 c = null;
    private String d = "";
    private int e;
    private long f;
    private short g;
    private byte h = (byte)-1;
    private byte i = (byte)-1;
    private long j = -1L;
    private aej_2 k = aej_2.k;
    private boolean l;

    public eqy_1() {
    }

    public eqy_1(short s2, String string, int n, short s3) {
        this.b = s2;
        this.d = string;
        this.e = n;
        this.f = -1L;
        this.g = s3;
    }

    public void a(long l) {
        this.f = l;
    }

    public int c() {
        return this.e;
    }

    public String e() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public short f() {
        return this.b;
    }

    public short g() {
        return this.g;
    }

    public void a(short s2) {
        this.g = s2;
    }

    public long h() {
        return this.f;
    }

    public void a(epj_2 epj_22) {
        this.c = epj_22;
    }

    @Nullable
    public epj_2 i() {
        return this.c;
    }

    public short j() {
        if (this.c != null) {
            return this.c.u();
        }
        return 0;
    }

    public short k() {
        if (this.c != null) {
            return this.c.v();
        }
        return 0;
    }

    public void a(byte by) {
        this.h = by;
    }

    public void a(aej_2 aej_22) {
        this.k = aej_22;
    }

    public aej_2 l() {
        return this.k;
    }

    public long m() {
        return this.j;
    }

    public final void b(long l) {
        this.j = l;
    }

    public byte n() {
        return 0;
    }

    public byte o() {
        return this.i;
    }

    public void b(byte by) {
        this.i = by;
    }

    public boolean p() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public void a(epq_2 epq_22, epq_2 epq_23) {
        epq_22.a(this);
        if (this.e > 0) {
            epq_22.a_(eps_0.b).b(this.e);
        }
        this.b(epq_22, epq_23);
        epq_22.c(this.d);
        epq_22.a(this.h);
        if (epq_23.a(erl_2.J)) {
            epq_22.c(erl_2.J);
        }
    }

    private void b(epq_2 epq_22, epq_2 epq_23) {
        boolean bl = ((epj_2)epq_22.Z_()).a(eoz_1.aB);
        if (bl && epq_23.a(eps_0.p)) {
            epq_22.a_(eps_0.p).c(epq_23.c(eps_0.p));
        }
    }

    @Override
    public boolean a(wf_1 wf_12) {
        wf_12.c();
        wf_12.a = this.b;
        wf_12.b = this.d;
        wf_12.c = this.e;
        wf_12.d = this.f;
        wf_12.f = this.h;
        wf_12.i = this.k.l;
        wf_12.j = this.j;
        wf_12.e = this.g;
        wf_12.k = this.l;
        return true;
    }

    @Override
    public boolean b(wf_1 wf_12) {
        this.b = wf_12.a;
        this.d = wf_12.b;
        this.e = wf_12.c;
        this.f = wf_12.d;
        this.h = wf_12.f;
        this.k = aej_2.a(wf_12.i);
        this.j = wf_12.j;
        this.g = wf_12.e;
        this.l = wf_12.k;
        return true;
    }

    public String toString() {
        return "BasicInvocationCharacteristics{m_breed=" + this.c + ", m_typeId=" + this.b + ", m_name='" + this.d + "', m_currentHp=" + this.e + ", m_summonId=" + this.f + ", m_level=" + this.g + "}";
    }

    public void q() {
    }
}

