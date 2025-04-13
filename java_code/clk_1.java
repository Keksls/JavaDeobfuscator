/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from clk
 */
public class clk_1
extends Pw {
    protected static final Logger a = Logger.getLogger(clk_1.class);
    private final long b;
    private final fkd c;

    public clk_1(long l, fkd fkd2) {
        this.b = l;
        this.c = fkd2;
    }

    @Override
    public byte[] b() {
        int n = 9;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c.a());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13077;
    }
}

