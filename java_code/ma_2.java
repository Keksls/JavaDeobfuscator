/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Ma
 */
public class ma_2
implements lo_1 {
    private final lx_2 a;

    public ma_2(lx_2 lx_22) {
        this.a = lx_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeBoolean(this.a.c());
        dataOutput.writeBoolean(this.a.d());
        dataOutput.writeBoolean(this.a.e());
        int[] nArray = this.a.a();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        dataOutput.writeByte(this.a.f());
        dataOutput.writeInt(this.a.g());
        dataOutput.writeInt(this.a.h());
        jj_1.a(dataOutput, this.a.i());
        jj_1.a(dataOutput, this.a.j());
        dataOutput.writeByte(this.a.k());
        dataOutput.writeByte(this.a.l());
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

