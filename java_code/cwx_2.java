/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from cwx
 */
public class cwx_2
extends ps_0 {
    private final ArrayList<fcq_0> a = new ArrayList();

    public Iterator<fcq_0> b() {
        return this.a.iterator();
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            fcu_0 fcu_02 = fcu_0.a(byteBuffer.getLong());
            long l = byteBuffer.getLong();
            byte[] byArray2 = new byte[byteBuffer.getShort()];
            byteBuffer.get(byArray2);
            String string = Cz.a(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 14283;
    }
}

