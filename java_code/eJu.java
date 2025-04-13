/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class eJu
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Jette la cible ", new eFu[0]), new eFv("Ignore les obstacles", new eFu("Ignore les obstacles (1 = oui, 0 = non [d\u00e9faut])", eFx.c)));
    private boolean w;
    private aff_1 x = null;

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public void M() {
        super.M();
    }

    public eJu aD() {
        eJu eJu2 = new eJu();
        return eJu2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        boolean bl2;
        if (!(this.e instanceof erb_2)) {
            this.ba();
            return;
        }
        erb_2 erb_22 = (erb_2)((Object)this.e);
        if (!erb_22.hg()) {
            this.ba();
            return;
        }
        erc_2 erc_22 = erb_22.he();
        int n = erc_22.G();
        int n2 = erc_22.H();
        short s2 = erc_22.I();
        if (!this.D()) {
            bl2 = erb_22.b(this.x);
            if (erc_22 instanceof Su && this.h.g() != null) {
                this.h.g().a(n, n2, s2, erc_22.G(), erc_22.H(), erc_22.I(), (Su)((Object)erc_22));
            }
        } else {
            tg_0 tg_02 = this.h.e();
            if (tg_02 == null) {
                a.warn((Object)("pas de fightmap sur le context " + this.h));
                this.ba();
                return;
            }
            bl2 = !erc_22.ab() || !tg_02.a(this.g.d(), this.g.e(), this.g.f()) || this.w ? this.a(sd_02, bl, erb_22, erc_22) : this.a(sd_02, bl, erb_22, erc_22, tg_02);
        }
        if (!bl2) {
            this.j(true);
        }
    }

    private boolean a(sd_0 sd_02, boolean bl, erb_2 erb_22, erc_2 erc_22) {
        int n = erc_22.G();
        int n2 = erc_22.H();
        short s2 = erc_22.I();
        if (!erb_22.b(this.g)) {
            return false;
        }
        this.x = this.g;
        this.c(sd_02, bl);
        if (erc_22 instanceof Su && this.h.g() != null) {
            ((Su)((Object)erc_22)).b(new aff_1(n, n2, s2).c(this.x));
            this.h.g().a(n, n2, s2, erc_22.G(), erc_22.H(), erc_22.I(), (Su)((Object)erc_22));
            ((Su)((Object)erc_22)).b((aej_2)null);
        }
        return true;
    }

    private boolean a(sd_0 sd_02, boolean bl, erb_2 erb_22, erc_2 erc_22, tg_0 tg_02) {
        int n = erc_22.G();
        int n2 = erc_22.H();
        short s2 = erc_22.I();
        if (this.c == null) {
            return false;
        }
        aqd_1 aqd_12 = ((efh_0)this.c).u();
        if (aqd_12 == null) {
            return false;
        }
        Iterable<int[]> iterable = aqd_12.a(this.g.d(), this.g.e(), this.g.f(), this.e.G(), this.e.H(), this.e.I(), this.e.F());
        if (iterable == null) {
            return false;
        }
        Iterator<int[]> iterator = iterable.iterator();
        aff_1 aff_12 = null;
        while (iterator.hasNext()) {
            short s3;
            int[] nArray = iterator.next();
            if (!tg_02.o(nArray[0], nArray[1]) || (s3 = tg_02.i(nArray[0], nArray[1])) == Short.MIN_VALUE || tg_02.a(nArray[0], nArray[1], s3)) continue;
            aff_12 = new aff_1(nArray[0], nArray[1], s3);
            break;
        }
        if (aff_12 == null) {
            return false;
        }
        if (!erb_22.b(aff_12)) {
            return false;
        }
        this.x = aff_12;
        this.c(sd_02, bl);
        if (erc_22 instanceof Su && this.h.g() != null) {
            this.h.g().a(n, n2, s2, erc_22.G(), erc_22.H(), erc_22.I(), (Su)((Object)erc_22));
        }
        return true;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() <= 0) {
            return;
        }
        this.w = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(ik_0.i().a(this.g.d()).b(this.g.e()).c(this.g.f())).a(this.w));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            ik_0 ik_02 = iq_02.o();
            this.x = new aff_1(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g()));
            this.w = iq_02.t();
        }
    }

    public aff_1 aE() {
        return this.x;
    }

    @Override
    public void z() {
        this.x = null;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

