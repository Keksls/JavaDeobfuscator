/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.map.hash.TLongIntHashMap;

/*
 * Renamed from eGt
 */
public class egt_0
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Porte la cible", new eFu[0]));
    public static final TLongIntHashMap v = new TLongIntHashMap();

    @Override
    public aqr_2 c_() {
        return w;
    }

    @Override
    public void M() {
        super.M();
        this.c(2224);
    }

    public egt_0 aD() {
        egt_0 egt_02 = new egt_0();
        return egt_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        short s2;
        int n;
        int n2;
        boolean bl2 = false;
        if (!(this.f instanceof erc_2) || !(this.e instanceof erb_2)) {
            this.j(true);
            return;
        }
        if (this.f.a(eoz_1.aq)) {
            this.j(true);
            return;
        }
        if (!this.a(eff_0.I)) {
            if (this.f.a(eoz_1.l)) {
                this.j(true);
                return;
            }
            if (this.e instanceof eqq_1 && this.f instanceof eqq_1) {
                boolean bl3;
                n2 = this.e.a(eoz_1.bd) || this.f.a(eoz_1.bd) ? 1 : 0;
                n = this.e.a(eoz_1.be) || this.f.a(eoz_1.be) ? 1 : 0;
                s2 = !this.f.a(eoz_1.aq) ? (short)1 : 0;
                boolean bl4 = bl3 = ((eqq_1)((Object)this.e)).Y() == ((eqq_1)((Object)this.f)).Y();
                if (!(bl3 || n2 == 0 && s2 != 0)) {
                    this.j(true);
                    return;
                }
                if (bl3 && (n != 0 || s2 == 0)) {
                    this.j(true);
                    return;
                }
            }
        }
        n2 = this.f.G();
        n = this.f.H();
        s2 = this.f.I();
        erb_2 erb_22 = (erb_2)((Object)this.e);
        erc_2 erc_22 = (erc_2)((Object)this.f);
        if (erb_22.a(erc_22)) {
            epq_2 epq_22;
            els_0 els_02;
            bl2 = true;
            v.put(this.e.a_(), this.o());
            this.c(sd_02, bl);
            if (this.h.g() != null) {
                this.h.g().a(n2, n, s2, this.f.G(), this.f.H(), this.f.I(), this.f);
            }
            if (this.f instanceof epq_2 && (els_02 = (epq_22 = (epq_2)this.f).ck()) != null) {
                els_02.n(epq_22);
            }
        }
        if (!bl2) {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public boolean Q() {
        return true;
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

