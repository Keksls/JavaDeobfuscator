/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwc
 */
public class cwc_2
extends ps_0 {
    private final wh_2 a = new wh_2();
    private byte b;
    private int c;

    public wh_2 b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (!this.a.b(byteBuffer)) {
            A.error((Object)"Erreur durant la d\u00e9-serialisation d'un des inventaires marchands");
            return false;
        }
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13463;
    }
}

