/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Optional;

/*
 * Renamed from ctr
 */
public class ctr_2
extends csy_2 {
    private aff_1 b;
    private Long c;
    private end_1 d;
    private boolean e;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray == null || byArray.length != 24) {
            A.error((Object)"Incorrect message size");
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = new aff_1();
        this.b.b(byteBuffer.getInt());
        this.b.c(byteBuffer.getInt());
        this.b.a(byteBuffer.getShort());
        this.c = byteBuffer.getLong();
        byte by = byteBuffer.get();
        Optional<end_1> optional = end_1.a(by);
        if (optional.isEmpty()) {
            A.error((Object)("Invalid id for FightMarkerType = " + by));
            return false;
        }
        this.d = optional.get();
        this.e = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13190;
    }

    public aff_1 b() {
        return this.b;
    }

    public Long c() {
        return this.c;
    }

    public end_1 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}

