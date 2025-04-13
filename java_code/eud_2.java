/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eUd
 */
public class eud_2
implements TObjectProcedure<ese_1> {
    private final abx_2 a = new abx_2();
    private int b;

    public boolean a(ese_1 ese_12) {
        this.a.b(esw_2.a(ese_12));
        ++this.b;
        return true;
    }

    public int a() {
        return this.b;
    }

    public byte[] b() {
        return this.a.c();
    }

    public String toString() {
        return "SerializeBuilding{m_bb=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

