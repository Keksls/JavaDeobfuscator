/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;

class Yh
implements TObjectProcedure<wy_0> {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ Yg b;

    Yh(Yg yg, ByteBuffer byteBuffer) {
        this.b = yg;
        this.a = byteBuffer;
    }

    public boolean a(wy_0 wy_02) {
        this.a.put((byte)wy_02.ordinal());
        Yb yb = this.b.a.a(wy_02);
        this.a.put((byte)yb.e());
        this.a.put((byte)yb.f());
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((wy_0)((Object)object));
    }
}

