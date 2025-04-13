/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eId
 */
public class eid_0
extends eHV {
    private static final aqr_2 D = new eFw(new eFv("D\u00e9faut", new eFu[0]), new eFv("Transmet le niveau de difficult\u00e9 de l'instance dans laquelle se trouve le lanceur ou la cible", new eFu("Sur la cible (1= oui, 0=non, 0 valeur par d\u00e9faut)", eFx.c)), new eFv("Transmet le niveau de difficult\u00e9 de l'instance dans laquelle se trouve le lanceur ou la cible avec valeur de base et incr\u00e9ment", new eFu("Sur la cible (1= oui, 0=non, 0 valeur par d\u00e9faut)", eFx.c), new eFu("Niveau : Base", eFx.b), new eFu("Niveau : Incr\u00e9ment par niveau de difficult\u00e9", eFx.b)));
    protected float v;
    protected float C;

    @Override
    public aqr_2 c_() {
        return D;
    }

    public eid_0() {
        this.M();
    }

    public eid_0 aD() {
        return new eid_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        Su su;
        if (this.c == null) {
            return;
        }
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 != null) {
            this.B = fil_02.b(this.aZ());
        }
        boolean bl = true;
        if (((efh_0)this.c).F() >= 1) {
            boolean bl2 = bl = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 0;
        }
        if (((efh_0)this.c).F() >= 2) {
            this.v = ((efh_0)this.c).a(1, this.aZ());
            this.C = ((efh_0)this.c).a(2, this.aZ());
        } else {
            this.C = 1.0f;
        }
        Su su2 = su = bl ? this.e : this.f;
        if (su instanceof fkV) {
            Optional<fkU> optional = ((fkV)((Object)su)).dP();
            this.m = optional.map(fkU::d).orElse(0);
        } else {
            this.m = 0;
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        efn_02.a(Math.round(this.v + this.C * (float)this.m));
        return efn_02;
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
    public void z() {
        super.z();
        this.m = 0;
        this.v = 0.0f;
        this.C = 1.0f;
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

