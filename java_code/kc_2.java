/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from KC
 */
public class kc_2
implements ki_2 {
    private final lf_2 a;

    public kc_2(lf_2 lf_22) {
        this.a = lf_22;
    }

    @Override
    public void a(DataInput dataInput) {
        this.a.a(lg_2.a(dataInput.readUnsignedShort()));
        this.a.a(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.a.a(dataInput.readBoolean());
    }
}

