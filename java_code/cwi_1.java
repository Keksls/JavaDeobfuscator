/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwI
 */
public class cwi_1
extends ps_0 {
    private static final Logger a = Logger.getLogger(cwi_1.class);
    private int b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    @Override
    public int a() {
        return 15465;
    }
}

