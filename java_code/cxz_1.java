/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cxZ
 */
public class cxz_1
extends ps_0 {
    private byte a = 0;
    private long b = 0L;
    private byte c = 0;
    private int d;
    private int e;
    private byte f;
    private short g;
    private final ArrayList<abo_2<Long, exk_2>> h = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.a = byteBuffer.get();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.c = byteBuffer.get();
        this.f = byteBuffer.get();
        this.g = byteBuffer.getShort();
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getInt();
            byte by = byteBuffer.get();
            long l2 = byteBuffer.getLong();
            Object r2 = eyo_1.g().d(n2);
            if (r2 == null) continue;
            exk_2 exk_22 = new exk_2(l);
            exk_22.b((ezr_0)r2);
            exk_22.a(by);
            this.h.add(new abo_2<Long, exk_2>(l2, exk_22));
        }
        return true;
    }

    @Override
    public int a() {
        return 12831;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public byte f() {
        return this.c;
    }

    public ArrayList<abo_2<Long, exk_2>> g() {
        return this.h;
    }

    public byte h() {
        return this.f;
    }

    public short i() {
        return this.g;
    }

    public byte j() {
        return this.f;
    }
}

