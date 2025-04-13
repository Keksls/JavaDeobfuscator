/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Je
 */
public class je_1
implements jg_1 {
    private final li_2 a;

    public je_1(li_2 li_22) {
        this.a = li_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(13);
        dataOutput.writeFloat(this.a.a()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.a()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.c()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.c()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.d()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.a.d()[1] * ((float)Math.PI / 180));
    }
}

