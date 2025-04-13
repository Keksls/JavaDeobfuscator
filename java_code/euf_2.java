/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eUf
 */
public class euf_2
implements TObjectProcedure<esa_2> {
    private int a;
    private final abx_2 b = new abx_2();

    public boolean a(esa_2 esa_22) {
        this.b.b(esw_2.a(esa_22));
        ++this.a;
        return true;
    }

    public byte[] a() {
        return this.b.c();
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "SerializePartitions{m_bb=" + this.b + ", m_counter=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esa_2)object);
    }
}

