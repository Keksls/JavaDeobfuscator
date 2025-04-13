/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;
import java.nio.ByteBuffer;
import java.util.List;

class Wl
implements TShortObjectProcedure<List<vl_0>> {
    private final abx_2 a;

    Wl(abx_2 abx_22) {
        this.a = abx_22;
    }

    public boolean a(short s2, List<vl_0> list) {
        this.b(s2, list);
        return true;
    }

    private void b(short s2, List<vl_0> list) {
        this.a.a(s2);
        this.a.a(list.size());
        for (vl_0 vl_02 : list) {
            int n = vl_02.d();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n);
            vl_02.b(byteBuffer);
            this.a.a(n);
            this.a.b(byteBuffer.array());
        }
    }

    public /* synthetic */ boolean execute(short s2, Object object) {
        return this.a(s2, (List)object);
    }
}

