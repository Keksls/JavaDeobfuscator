/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from LS
 */
public class ls_1
implements lo_1 {
    private final lp_2 a;

    public ls_1(lp_2 lp_22) {
        this.a = lp_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.a.a());
        float[] fArray = this.a.b();
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
        dataOutput.writeBoolean(this.a.h());
        float[] fArray7 = this.a.i();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.a.j();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.a.k();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.a.m();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.a.o();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.a.q();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        dataOutput.writeShort(0);
        dataOutput.writeFloat(this.a.v());
        dataOutput.writeFloat(this.a.w());
        dataOutput.writeFloat(this.a.x());
        dataOutput.writeFloat(this.a.y());
        dataOutput.writeInt(this.a.A());
        dataOutput.writeInt(this.a.z());
        float[] fArray13 = this.a.l();
        dataOutput.writeFloat(fArray13[0]);
        dataOutput.writeFloat(fArray13[1]);
        float[] fArray14 = this.a.n();
        dataOutput.writeFloat(fArray14[0]);
        dataOutput.writeFloat(fArray14[1]);
        float[] fArray15 = this.a.p();
        dataOutput.writeFloat(fArray15[0]);
        dataOutput.writeFloat(fArray15[1]);
        float[] fArray16 = this.a.r();
        dataOutput.writeFloat(fArray16[0]);
        dataOutput.writeFloat(fArray16[1]);
        float[] fArray17 = this.a.s();
        dataOutput.writeFloat(fArray17[0]);
        dataOutput.writeFloat(fArray17[1]);
        float[] fArray18 = this.a.t();
        dataOutput.writeFloat(fArray18[0]);
        dataOutput.writeFloat(fArray18[1]);
        float[] fArray19 = this.a.u();
        dataOutput.writeFloat(fArray19[0]);
        dataOutput.writeFloat(fArray19[1]);
    }
}

