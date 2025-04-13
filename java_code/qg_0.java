/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qg
 */
public class qg_0
extends PO {
    private String a;
    private long b;

    public String b() {
        return this.a;
    }

    public long i() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        this.b = byteBuffer.getLong();
        return this.a(byArray, byteBuffer.position());
    }

    @Override
    public int a() {
        return 658;
    }
}

