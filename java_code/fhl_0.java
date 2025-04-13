/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fhL
 */
public final class fhl_0 {
    protected static final Logger a = Logger.getLogger(fhl_0.class);
    private short b;
    private short c;
    private ArrayList<fho_0> d;

    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        return this.a(byteBuffer);
    }

    public boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d = new ArrayList(n * 10);
        for (int k = 0; k < n; ++k) {
            short s2 = byteBuffer.getShort();
            int n2 = byteBuffer.getShort() & 0xFFFF;
            for (int i2 = 0; i2 < n2; ++i2) {
                fho_0 fho_02 = new fho_0(s2);
                fho_02.a(byteBuffer.getInt(), this.b, this.c);
                this.d.add(fho_02);
            }
        }
        return true;
    }

    public short a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    public ArrayList<fho_0> c() {
        return this.d;
    }
}

