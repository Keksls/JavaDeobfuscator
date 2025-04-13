/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Jb
 */
public class jb_1
implements jg_1 {
    private final lf_2 a;

    public jb_1(lf_2 lf_22) {
        this.a = lf_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeBoolean(this.a.c());
        dataOutput.writeByte((byte)this.a.a().ordinal());
        dataOutput.writeShort((short)(this.a.b()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.a.b()[1] & 0xFFFF));
    }
}

