/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from fdl
 */
class fdl_0
implements TLongObjectProcedure<fde> {
    final /* synthetic */ fdk_0 a;

    fdl_0(fdk_0 fdk_02) {
        this.a = fdk_02;
    }

    public boolean a(long l, fde fde2) {
        if (fde2.d()) {
            this.a.d.add(l);
        }
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (fde)object);
    }
}

