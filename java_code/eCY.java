/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.procedure.TByteObjectProcedure;
import java.util.Iterator;

class eCY
implements TByteObjectProcedure<eCB> {
    private long a;

    eCY(long l) {
        this.a = l;
    }

    public boolean a(byte by, eCB eCB2) {
        Object r2 = eyo_1.g().d(eCB2.b());
        Iterator<efh_0> iterator = ((ezr_0)r2).u();
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            if (efh_02.j() == efc_0.a.a()) continue;
            float f2 = efh_02.a(0);
            this.a = (long)((float)this.a * f2);
        }
        return true;
    }

    public long a() {
        return this.a;
    }

    public /* synthetic */ boolean execute(byte by, Object object) {
        return this.a(by, (eCB)object);
    }
}

