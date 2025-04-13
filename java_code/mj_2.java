/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Mj
 */
public class mj_2
implements lo_1 {
    private final lh_2 a;

    public mj_2(lh_2 lh_22) {
        this.a = lh_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.a();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.a.c();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.a.d();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.a.e();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.a.f();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.a.g();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.a.h();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.a.i();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.a.j();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.a.k();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.a.l();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.a.m();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

