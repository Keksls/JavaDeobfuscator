/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.io.OutputStream;

/*
 * Renamed from Ji
 */
public class ji_2
extends OutputStream {
    private final DataOutput a;

    public ji_2(DataOutput dataOutput) {
        this.a = dataOutput;
    }

    @Override
    public void write(int n) {
        this.a.write(n);
    }
}

