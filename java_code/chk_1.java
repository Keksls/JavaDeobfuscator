/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from chK
 */
final class chk_1
extends chd_1<ctb_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chk_1.class);
    private CellParticleSystem c;

    chk_1() {
    }

    @Override
    public boolean a(ctb_2 ctb_22) {
        aff_1 aff_12 = ctb_22.b();
        if (this.c != null && aik_0.a().a((IsoParticleSystem)this.c)) {
            this.c.Z();
            aik_0.a().b(this.c.ac());
        }
        CellParticleSystem cellParticleSystem = aij_0.a().b(78900);
        cellParticleSystem.a(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
        cellParticleSystem.j(2000);
        aik_0.a().b(cellParticleSystem);
        this.c = cellParticleSystem;
        Long l = ctb_22.c();
        if (l != null) {
            if (l.longValue() == azu_0.j().k().a_()) {
                b.info((Object)("<text color=\"" + aug_0.f + "\">" + bae.h().a("fight.reportCell", ctb_22.b().d(), ctb_22.b().e()) + "</text>"));
            } else {
                blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(ctb_22.c());
                Object object = blx_12 != null ? blx_12.gd() : "reporterId=" + ctb_22.c();
                b.info((Object)bae.h().a("fight.hasReceivedCellReport", "<b color=\"" + aug_0.f + "\">" + (String)object + "</b>", ctb_22.b().d(), ctb_22.b().e()));
            }
        }
        return false;
    }
}

