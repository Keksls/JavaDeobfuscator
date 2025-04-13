/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class bre
implements TLongObjectProcedure<bmk_1> {
    bre() {
    }

    public boolean a(long l, bmk_1 bmk_12) {
        fis_1.a().a((ajf_1)bmk_12, "addRemovePartyEnabled");
        fis_1.a().a((ajf_1)bmk_12, "isInCompanyGuild");
        fis_1.a().a((ajf_1)bmk_12, "isInCompanyNation");
        fis_1.a().a((ajf_1)bmk_12, "canAddToParty");
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bmk_1)object);
    }
}

