/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cAP
 */
public class cap_0
extends ps_0 {
    private final ArrayList<bya_1> a = new ArrayList();
    private int b;
    private short c;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getShort();
        this.b = byteBuffer.getInt();
        while (byteBuffer.remaining() > 0) {
            bya_1 bya_12 = new bya_1();
            bya_12.a(byteBuffer);
            this.a.add(bya_12);
        }
        return true;
    }

    public int b() {
        return this.b;
    }

    public ArrayList<bya_1> c() {
        return this.a;
    }

    @Override
    public int a() {
        return 15793;
    }

    public short d() {
        return this.c;
    }
}

