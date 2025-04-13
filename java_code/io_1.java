/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from IO
 */
public class io_1
implements jg_1 {
    private final lp_2 a;

    public io_1(lp_2 lp_22) {
        this.a = lp_22;
    }

    @Override
    public void a(DataOutput dataOutput) {
        dataOutput.writeByte(1);
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
        dataOutput.writeFloat(this.a.v());
        dataOutput.writeFloat(this.a.v());
        dataOutput.writeFloat(this.a.w());
        dataOutput.writeFloat(this.a.w());
        dataOutput.writeFloat(this.a.x());
        dataOutput.writeFloat(this.a.x());
        dataOutput.writeFloat(this.a.y());
        dataOutput.writeFloat(this.a.y());
        dataOutput.writeFloat(this.a.A());
        dataOutput.writeFloat(this.a.A());
        dataOutput.writeFloat(this.a.z());
        dataOutput.writeFloat(this.a.z());
        dataOutput.writeFloat(this.a.s()[0]);
        dataOutput.writeFloat(this.a.s()[1]);
        dataOutput.writeFloat(this.a.t()[0]);
        dataOutput.writeFloat(this.a.t()[1]);
        dataOutput.writeFloat(this.a.u()[0]);
        dataOutput.writeFloat(this.a.u()[1]);
    }
}

