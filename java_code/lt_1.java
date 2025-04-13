/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from LT
 */
public class lt_1
implements lo_1 {
    private final lq_2 a;

    public lt_1(lq_2 lq_22) {
        this.a = lq_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        float[] fArray = this.a.C();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        int[] nArray = this.a.B();
        dataOutput.writeFloat(nArray[0]);
        dataOutput.writeFloat(nArray[1]);
        dataOutput.writeShort(this.a.a());
        float[] fArray2 = this.a.b();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.a.c();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.a.d();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.a.e();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.a.f();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.a.g();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        dataOutput.writeBoolean(this.a.h());
        float[] fArray8 = this.a.i();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.a.j();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.a.k();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.a.m();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.a.o();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        float[] fArray13 = this.a.q();
        dataOutput.writeFloat(fArray13[0]);
        dataOutput.writeFloat(fArray13[1]);
        dataOutput.writeShort(0);
        dataOutput.writeFloat(this.a.v());
        dataOutput.writeFloat(this.a.w());
        dataOutput.writeFloat(this.a.x());
        dataOutput.writeFloat(this.a.y());
        dataOutput.writeInt(this.a.A());
        dataOutput.writeInt(this.a.z());
        float[] fArray14 = this.a.l();
        dataOutput.writeFloat(fArray14[0]);
        dataOutput.writeFloat(fArray14[1]);
        float[] fArray15 = this.a.n();
        dataOutput.writeFloat(fArray15[0]);
        dataOutput.writeFloat(fArray15[1]);
        float[] fArray16 = this.a.p();
        dataOutput.writeFloat(fArray16[0]);
        dataOutput.writeFloat(fArray16[1]);
        float[] fArray17 = this.a.r();
        dataOutput.writeFloat(fArray17[0]);
        dataOutput.writeFloat(fArray17[1]);
        float[] fArray18 = this.a.s();
        dataOutput.writeFloat(fArray18[0]);
        dataOutput.writeFloat(fArray18[1]);
        float[] fArray19 = this.a.t();
        dataOutput.writeFloat(fArray19[0]);
        dataOutput.writeFloat(fArray19[1]);
        float[] fArray20 = this.a.u();
        dataOutput.writeFloat(fArray20[0]);
        dataOutput.writeFloat(fArray20[1]);
    }
}

