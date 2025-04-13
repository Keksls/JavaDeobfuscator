/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTV
 */
public class etv_1
implements TObjectProcedure<ese_1> {
    final long a;
    long b;

    public etv_1(long l) {
        this.a = l;
    }

    public long a() {
        return this.b;
    }

    public boolean a(ese_1 ese_12) {
        ese_12.a(new etw_1(this, ese_12));
        return this.b == 0L;
    }

    public String toString() {
        return "FindBuildingFromElementId{m_elementId=" + this.a + ", m_buildingUid=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

