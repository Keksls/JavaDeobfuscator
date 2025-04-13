/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwO
 */
public class cwo_2
extends cwj_2 {
    protected static final Logger f = Logger.getLogger(cwo_2.class);

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        return true;
    }

    protected void a(ByteBuffer byteBuffer) {
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
    }

    @Override
    public int a() {
        return 13116;
    }
}

