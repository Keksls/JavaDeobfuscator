/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eSx
 */
class esx_1
implements TObjectProcedure<esf_1> {
    private final abx_2 a = new abx_2();
    private int b;

    esx_1() {
    }

    public boolean a(esf_1 esf_12) {
        ++this.b;
        this.a.b(esw_2.a(esf_12));
        return true;
    }

    public abx_2 a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "SerializeBuildingElements{m_number=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esf_1)object);
    }
}

