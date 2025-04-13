/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from cvz
 */
public class cvz_1
extends ps_0 {
    private eAW a;
    private String b;
    private int c;
    private final HashMap<le_0, Short> d = new HashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eAW.a(byteBuffer.get());
        if (this.a != eAW.a) {
            return true;
        }
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        for (int k = byteBuffer.getInt(); k != 0; --k) {
            int n2 = byteBuffer.getInt();
            if (n2 == 0) continue;
            byte[] byArray3 = new byte[n2];
            byteBuffer.get(byArray3);
            le_0 le_02 = le_0.a(byArray3);
            short s2 = byteBuffer.getShort();
            this.d.put(le_02, s2);
        }
        this.c = byteBuffer.getInt();
        return false;
    }

    @Override
    public int a() {
        return 12914;
    }

    public eAW b() {
        return this.a;
    }

    public HashMap<le_0, Short> c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public boolean f() {
        return this.d.isEmpty();
    }
}

