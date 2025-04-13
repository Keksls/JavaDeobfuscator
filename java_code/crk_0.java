/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from crk
 */
public class crk_0
extends ps_0 {
    private byte a;
    private short b;
    private List<Short> c;
    private String d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getShort();
        this.c = new ArrayList<Short>(this.a);
        for (byte by = 0; by < this.a; by = (byte)(by + 1)) {
            this.c.add(byteBuffer.getShort());
        }
        this.d = Cz.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 12824;
    }

    public byte b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public List<Short> d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }
}

