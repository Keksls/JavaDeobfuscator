/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from fli
 */
class fli_0
implements TObjectProcedure<fld_0> {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ flf_0 b;

    fli_0(flf_0 flf_02, ByteBuffer byteBuffer) {
        this.b = flf_02;
        this.a = byteBuffer;
    }

    public boolean a(fld_0 fld_02) {
        fld_02.a(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fld_0)object);
    }
}

