/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from fdm
 */
class fdm_0
implements TLongProcedure {
    final /* synthetic */ fdk_0 a;

    fdm_0(fdk_0 fdk_02) {
        this.a = fdk_02;
    }

    public boolean execute(long l) {
        this.a.d.add(l);
        return true;
    }
}

