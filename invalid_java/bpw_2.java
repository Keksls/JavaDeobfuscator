/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpW
 */
public class bpw_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bpw_2.class);
    private long b;
    private final bEw c;
    private final short e;
    private final short f;

    public bpw_2(bEw bEw2, short s2) {
        this.c = bEw2;
        this.f = s2;
        this.e = this.c.B();
    }

    @Override
    public short ac_() {
        return this.f;
    }

    @Override
    public boolean g() {
        if (this.c == null) {
            a.error((Object)"[DISTRIBUTION] Impossible d'utiliser une machine de distribution null");
            return false;
        }
        if (this.d.ab_() || this.d.ak()) {
            a.info((Object)"[DISTRIBUTION] Un joueur mort ou en combat ne peut utiliser de machine de distribution");
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        this.d.a(false, true);
        this.d.a(this);
        this.d.a(this.d.P_().b(this.c.P_()));
        bOE.a(this.d.bv(), this.c.Z());
        if (this.c.ao() > 0) {
            this.c.a(this.c.ao());
        }
        this.c.aI_();
        if (this.b > 0L) {
            this.d.do().a(this.c.a_(), this.b);
        } else {
            this.d.dN();
        }
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        this.d.do().a();
        this.d.bv().e("AnimStatique");
        this.c.a(this.e);
        this.c.aI_();
        if (bl2) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)3);
            cpz_02.a(this.ac_());
            azu_0.j().K().c(cpz_02);
        }
        return true;
    }

    @Override
    public boolean b() {
        biI biI2 = this.d.bv();
        this.d.do().a();
        this.c.a(this.e);
        this.c.aI_();
        String string = aba_0.a(biI2.F(), true);
        biI2.e(string);
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)2);
        cpz_02.a(this.f);
        azu_0.j().K().c(cpz_02);
        return true;
    }

    public void a(long l) {
        this.b = l;
    }

    public String toString() {
        return "InteractiveElementUseOccupation{m_estimatedTime=" + this.b + ", m_machine=" + this.c + ", m_realMachineState=" + this.e + ", m_occupationTypeId=" + this.f + "}";
    }
}

