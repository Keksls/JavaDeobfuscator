/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTX
 */
public class etx_1
implements TObjectProcedure<ese_1> {
    private final long a;
    private long b;

    public etx_1(long l) {
        this.a = l;
    }

    public long a() {
        return this.b;
    }

    public boolean a(ese_1 ese_12) {
        if (ese_12.a(this.a) == null) {
            return true;
        }
        this.b = ese_12.b();
        return false;
    }

    public String toString() {
        return "FindBuildingFromElementUid{m_elementUid=" + this.a + ", m_buildingUid=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

