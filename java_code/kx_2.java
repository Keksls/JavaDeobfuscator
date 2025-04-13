/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Kx
 */
public class kx_2
implements ki_2 {
    private final la_2 a;

    public kx_2(la_2 la_22) {
        this.a = la_22;
    }

    @Override
    public void a(DataInput dataInput) {
        this.a.a(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.a.b(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
    }
}

