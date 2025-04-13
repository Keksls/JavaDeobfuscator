/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from flf
 */
public class flf_0
implements Iterable<fld_0> {
    private static final Logger a = Logger.getLogger(flf_0.class);
    final TLongObjectHashMap<fld_0> b = new TLongObjectHashMap();

    public flf_0() {
    }

    public flf_0(fld_0 ... fld_0Array) {
        this();
        for (fld_0 fld_02 : fld_0Array) {
            this.b.put(fld_02.a(), (Object)fld_02);
        }
    }

    public void a(long l, flk_0 flk_02) {
        this.b.put(l, (Object)new fld_0(l, flk_02));
    }

    public int a() {
        return this.b.size();
    }

    public fld_0 a(long l) {
        return (fld_0)this.b.get(l);
    }

    @Override
    @NotNull
    public Iterator<fld_0> iterator() {
        return new flg_0(this);
    }

    public int b() {
        int[] nArray = new int[]{1};
        this.b.forEachValue((TObjectProcedure)new flh(this, nArray));
        return nArray[0];
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)this.b.size());
        this.b.forEachValue((TObjectProcedure)new fli_0(this, byteBuffer));
    }

    public static flf_0 b(ByteBuffer byteBuffer) {
        return new flf_0().d(byteBuffer);
    }

    private flf_0 d(ByteBuffer byteBuffer) {
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            fld_0 fld_02 = fld_0.b(byteBuffer);
            this.b.put(fld_02.a(), (Object)fld_02);
        }
        return this;
    }

    static flk_0 c(ByteBuffer byteBuffer) {
        flk_0 flk_02 = new flk_0(byteBuffer.getLong(), byteBuffer.getShort());
        return flk_02;
    }

    static void a(flk_0 flk_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(flk_02.b());
        byteBuffer.putShort(flk_02.a());
    }
}

