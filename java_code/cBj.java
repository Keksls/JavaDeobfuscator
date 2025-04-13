/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class cBj
extends ps_0 {
    private int a;
    private int b;
    private final List<fgZ> c = new ArrayList<fgZ>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.c.add(new fgZ(byteBuffer));
        }
        return true;
    }

    @Override
    public int a() {
        return 14501;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public List<fgZ> d() {
        return this.c;
    }
}

