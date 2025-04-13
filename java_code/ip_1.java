/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IP
 */
public class ip_1
implements jg_1 {
    private final lq_2 a;
    private final mp_2 b;

    public ip_1(lq_2 lq_22, mp_2 mp_22) {
        this.a = lq_22;
        this.b = mp_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeBoolean(this.a.h());
        dataOutput.writeInt(this.a.a());
        dataOutput.writeFloat(this.a.b()[0]);
        dataOutput.writeFloat(this.a.b()[1]);
        dataOutput.writeFloat(this.a.c()[0]);
        dataOutput.writeFloat(this.a.c()[1]);
        dataOutput.writeFloat(this.a.d()[0]);
        dataOutput.writeFloat(this.a.d()[1]);
        dataOutput.writeFloat(this.a.f()[0]);
        dataOutput.writeFloat(this.a.f()[1]);
        dataOutput.writeFloat(this.a.e()[0]);
        dataOutput.writeFloat(this.a.e()[1]);
        dataOutput.writeFloat(this.a.g()[0]);
        dataOutput.writeFloat(this.a.g()[1]);
        dataOutput.writeFloat(this.a.i()[0]);
        dataOutput.writeFloat(this.a.i()[1]);
        dataOutput.writeFloat(this.a.j()[0]);
        dataOutput.writeFloat(this.a.j()[1]);
        dataOutput.writeFloat(this.a.k()[0]);
        dataOutput.writeFloat(this.a.k()[1]);
        dataOutput.writeFloat(this.a.m()[0]);
        dataOutput.writeFloat(this.a.m()[1]);
        dataOutput.writeFloat(this.a.o()[0]);
        dataOutput.writeFloat(this.a.o()[1]);
        dataOutput.writeFloat(this.a.q()[0]);
        dataOutput.writeFloat(this.a.q()[1]);
        dataOutput.writeFloat(this.a.l()[0]);
        dataOutput.writeFloat(this.a.l()[1]);
        dataOutput.writeFloat(this.a.n()[0]);
        dataOutput.writeFloat(this.a.n()[1]);
        dataOutput.writeFloat(this.a.p()[0]);
        dataOutput.writeFloat(this.a.p()[1]);
        dataOutput.writeFloat(this.a.r()[0]);
        dataOutput.writeFloat(this.a.r()[1]);
        dataOutput.writeFloat((float)this.a.A() * 0.5f);
        dataOutput.writeFloat((float)this.a.A() * 0.5f);
        dataOutput.writeFloat((float)this.a.z() * 0.5f);
        dataOutput.writeFloat((float)this.a.z() * 0.5f);
        im_1 im_12 = new im_1(this.b);
        im_12.a(dataOutput);
        dataOutput.writeFloat(this.a.C()[0]);
        dataOutput.writeFloat(this.a.C()[1]);
        if (this.a.B()[0] == -1 || this.a.B()[1] == -1) {
            dataOutput.writeInt(-1);
            dataOutput.writeInt(-1);
        } else {
            dataOutput.writeInt(this.a.B()[0]);
            dataOutput.writeInt(this.a.B()[1]);
        }
        dataOutput.writeFloat(this.a.s()[0]);
        dataOutput.writeFloat(this.a.s()[1]);
        dataOutput.writeFloat(this.a.t()[0]);
        dataOutput.writeFloat(this.a.t()[1]);
        dataOutput.writeFloat(this.a.u()[0]);
        dataOutput.writeFloat(this.a.u()[1]);
    }
}

