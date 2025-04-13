/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class eGf
extends ejh_0 {
    private static final Logger v = Logger.getLogger(eGf.class);
    private static final aqr_2 w = new eFw(new eFv("Shortcut to add", new eFu("barNumber", eFx.c), new eFu("barSlot (-1 for auto)", eFx.c), new eFu("spellId", eFx.c), new eFu("spellLevel (-1 for player level)", eFx.c)));
    private byte x = (byte)-1;
    private short y = (short)-1;
    private int z = -1;
    private short A = (short)-1;
    private fio_0<? extends fin_0> B;
    private fib C;

    @Override
    public aqr_2 c_() {
        return w;
    }

    public eGf aC() {
        return new eGf();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (!this.D()) {
            return;
        }
        if (this.f == null) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        this.x = (byte)((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.y = (short)((efh_0)this.c).a(1, this.aZ(), eFb.a);
        this.z = ((efh_0)this.c).a(2, this.aZ(), eFb.a);
        this.A = (short)((efh_0)this.c).a(3, this.aZ(), eFb.a);
        short s2 = this.A == -1 ? ((epq_2)this.f).dr() : this.A;
        this.B = (fio_0)fip_0.d().b(this.z, s2).aP_();
        if (this.B == null) {
            v.error((Object)("Impossible de cr\u00e9er le sort d'id " + this.z + " pour le level " + s2));
            return;
        }
        this.B.c(this.B.aT_());
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.aD();
    }

    public void aD() {
        if (this.f == null) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        if (this.B == null) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        if (fiz2 == null) {
            return;
        }
        try {
            if (!fiz2.e(this.B)) {
                ((uf_0)fiz2).a(this.B);
            }
        }
        catch (Exception exception) {
            v.error((Object)("Failed to add spell " + this.z + " with level " + this.A), (Throwable)exception);
            this.B = null;
        }
        fiO fiO2 = epq_22.dz();
        if (fiO2 != null) {
            fiO2.a((Integer)this.z);
        }
        this.C = epq_22.a(this.x, this.y, this.B);
    }

    @Override
    public void al() {
        if (this.B == null) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        if (fiz2 == null) {
            return;
        }
        ((uf_0)fiz2).b(this.B);
        fiO fiO2 = epq_22.dz();
        if (fiO2 != null) {
            fiO2.b((Integer)this.z);
        }
        epq_22.a(this.x, this.y, this.C);
        super.al();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.x = (byte)-1;
        this.y = (short)-1;
        this.z = -1;
        this.A = (short)-1;
        this.B = null;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.z).d(this.A).f(this.x).g(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (!iO2.q()) {
            return;
        }
        if (((epq_2)this.f).aZ() == null) {
            return;
        }
        iq_0 iq_02 = iO2.r();
        this.z = iq_02.e();
        this.A = Hw.c((long)iq_02.m());
        this.x = Hw.b((long)iq_02.x());
        this.y = Hw.c((long)iq_02.z());
        short s2 = this.A == -1 ? ((epq_2)this.f).dr() : this.A;
        this.B = (fio_0)fip_0.d().b(this.z, s2).aP_();
        this.B.c(this.B.aT_());
    }

    public byte aE() {
        return this.x;
    }

    public short aF() {
        return this.y;
    }

    public int aG() {
        return this.z;
    }

    public short aH() {
        return this.A;
    }

    public fio_0<? extends fin_0> aI() {
        return this.B;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

