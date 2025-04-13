/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctb
 */
public class ctb_2
extends csy_2 {
    private aff_1 b;
    private Long c;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray == null || byArray.length != 22) {
            A.error((Object)"le message recu a une taille de donn\u00e9es incorrecte");
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = new aff_1();
        this.b.b(byteBuffer.getInt());
        this.b.c(byteBuffer.getInt());
        this.b.a(byteBuffer.getShort());
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12222;
    }

    public aff_1 b() {
        return this.b;
    }

    public Long c() {
        return this.c;
    }
}

