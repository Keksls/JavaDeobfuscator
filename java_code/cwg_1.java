/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cwG
 */
public class cwg_1
extends ps_0 {
    private final ArrayList<fcf> a = new ArrayList();
    private int b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        while (byteBuffer.hasRemaining()) {
            this.a.add(fcf.c(byteBuffer));
        }
        return true;
    }

    public ArrayList<fcf> b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    @Override
    public int a() {
        return 15487;
    }
}

