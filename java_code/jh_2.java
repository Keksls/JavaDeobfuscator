/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;

/*
 * Renamed from Jh
 */
public class jh_2
extends InputStream {
    private final DataInput a;

    public jh_2(DataInput dataInput) {
        this.a = dataInput;
    }

    @Override
    public int read() {
        try {
            return this.a.readUnsignedByte();
        }
        catch (EOFException eOFException) {
            return -1;
        }
    }
}

