/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTY
 */
public class ety_1
implements TObjectProcedure<ese_1> {
    private final afe_1 a;
    private long b = -1L;

    public ety_1(afe_1 afe_12) {
        this.a = afe_12;
    }

    public long a() {
        return this.b;
    }

    public boolean a(ese_1 ese_12) {
        if (ese_12.d() == this.a.a() && ese_12.e() == this.a.b()) {
            this.b = ese_12.b();
            return false;
        }
        return true;
    }

    public String toString() {
        return "FindBuildingFromLocation{m_location=" + this.a + ", m_buildingUid=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

