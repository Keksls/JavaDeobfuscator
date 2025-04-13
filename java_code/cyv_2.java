/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cyV
 */
public class cyv_2
extends cyu_2 {
    private int c;
    byte[] b;
    private boolean d;
    private boolean e = false;
    private final ArrayList<abp_2<Integer, Integer, Long>> f = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.e = byteBuffer.get() == 1;
        this.d = byteBuffer.get() == 1;
        this.c = byteBuffer.getInt();
        this.b = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.b);
        while (byteBuffer.hasRemaining()) {
            this.f.add(new abp_2<Integer, Integer, Long>(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getLong()));
        }
        return true;
    }

    @Override
    public int a() {
        return 12957;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public fke c() {
        return fke.a;
    }

    public int f() {
        return this.c;
    }

    public ArrayList<abp_2<Integer, Integer, Long>> g() {
        return this.f;
    }

    public byte[] h() {
        return this.b;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.d;
    }
}

