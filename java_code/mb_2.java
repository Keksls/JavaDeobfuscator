/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Mb
 */
public class mb_2
implements lo_1 {
    private final ly_2 a;

    public mb_2(ly_2 ly_22) {
        this.a = ly_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        int[] nArray = this.a.c();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        int[] nArray2 = this.a.e();
        dataOutput.writeShort(nArray2[0]);
        dataOutput.writeShort(nArray2[1]);
        int[] nArray3 = this.a.f();
        dataOutput.writeShort(nArray3[0]);
        dataOutput.writeShort(nArray3[1]);
        int[] nArray4 = this.a.g();
        dataOutput.writeShort(nArray4[0]);
        dataOutput.writeShort(nArray4[1]);
        float[] fArray = this.a.i();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.a.j();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.a.k();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.a.l();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.a.m();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.a.n();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.a.o();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.a.p();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.a.q();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.a.r();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.a.s();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.a.t();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        int[] nArray5 = this.a.u();
        dataOutput.writeShort(nArray5[0]);
        dataOutput.writeShort(nArray5[1]);
        int[] nArray6 = this.a.v();
        dataOutput.writeShort(nArray6[0]);
        dataOutput.writeShort(nArray6[1]);
        dataOutput.writeBoolean(this.a.w());
        int[] nArray7 = this.a.d();
        dataOutput.writeShort(nArray7[0]);
        dataOutput.writeShort(nArray7[1]);
        int[] nArray8 = this.a.h();
        dataOutput.writeShort(nArray8[0]);
        dataOutput.writeShort(nArray8[1]);
        int[] nArray9 = this.a.a();
        dataOutput.writeByte(nArray9[0]);
        dataOutput.writeByte(nArray9[1]);
        List<lk_2> list = this.a.b().a();
        for (lk_2 lk_22 : list) {
            lq_1 lq_12 = new lq_1(lk_22);
            lq_12.a(dataOutput);
        }
    }
}

